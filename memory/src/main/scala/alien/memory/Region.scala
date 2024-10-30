package alien.memory

import alien.memory.layout.*
import jdk.internal.foreign.SlicingAllocator

import java.lang.foreign.{Arena, MemorySegment}
import scala.language.experimental.macros
import scala.reflect.macros.whitebox

class Global

class NonGlobal extends Global

class Region[R <: Global] private[alien] (val arena: Arena) extends AnyVal {

  private[alien] def allocate[L <: Layout](layout: L): MemorySegment =
    arena.allocate(layout.toLayout)

  /**
   * this is a fictive changes that won't be really merged
   */
  def deallocate(): Unit = {
    arena.close()
  }

}

object Region {

  /** Default global region that would be used in every `Memory.allocateGlobal` invocations.
   * Uses java.lang.foreign.Arena.global, so allocations can not be freed.
   * Another `Global` region can be constructed using `newGlobal` function.
   */
  implicit val defaultGlobalRegion: Region[Global] =
    new Region[Global](Arena.global())

  /** Constructs new region with global mark.
   *
   * @return Global region that can be used in `Memory.allocateGlobal` invocations.
   */
  def newGlobal(arena: Arena): Region[Global] = new Region(arena)

  case class NamedMark[Name <: String & Singleton]() extends NonGlobal
  case class IdMark[Id <: Long & Singleton]()        extends NonGlobal

  /** Constructs new region with named mark. All named marks is subtypes of Global mark. Named marks can be repeatable.
   */
  def named[M <: String & Singleton]: RegionPartiallyApplied[NamedMark[M]] =
    new RegionPartiallyApplied[NamedMark[M]] {}

  /** Constructs new region with fresh mark. New region would be marked with `IdMark[`R`]`, where R is a compile-time randomly generated Long.
   */
  def fresh: RegionPartiallyApplied[?] = macro RegionMacro.freshImpl

}

private class RegionMacro(val c: whitebox.Context) {

  def freshImpl: c.Tree = {
    import c.universe.*
    val number = c.freshName().hashCode.toLong
    q"""new RegionPartiallyApplied[IdMark[$number]] {}"""
  }

}

trait RegionPartiallyApplied[T <: NonGlobal] {

  /** Region based on shared `Arena`. Memory allocated by shared arena can be accessed from any `Thread`.
   */
  def newShared(): Region[T] = new Region(Arena.ofShared())

  /** Region based on confined `Arena`. Memory allocated by confined arena can be accessed only by the `Thread` that created arena.
   */
  def newConfined(): Region[T] = new Region(Arena.ofConfined())

  /** Region based on confined `Arena`. Every allocation is sequentially placed after each other. Allocations are not thread safe.
   */
  def createConfinedSlicing(arenaSize: Long, byteAlignment: Long): Region[T] = {
    val arena = Arena.ofConfined()
    new Region(SlicingArena(arena, arenaSize, byteAlignment))
  }

  /** Region based on shared `Arena`. Every allocation is sequentially placed after each other. Allocations are not thread safe.
   */
  def createSharedSlicing(arenaSize: Long, byteAlignment: Long): Region[T] = {
    val arena = Arena.ofShared()
    new Region(SlicingArena(arena, arenaSize, byteAlignment))
  }

  /** Region based on any custom `java.lang.foreign.Arena`. Would close arena after lambda completeness or any error caught.
   */
  def custom[R](arena: Arena)(f: Region[T] => R): R = {
    implicit val region: Region[T] = new Region(arena)
    try {
      f(region)
    } finally {
      region.deallocate()
    }
  }

  /** Region based on shared Arena. Would close arena after lambda has finished or any error caught.
   */
  def shared[R](f: Region[T] => R): R = {
    implicit val region: Region[T] = this.newShared()
    try {
      f(region)
    } finally {
      region.deallocate()
    }
  }

  /** Region based on confined Arena. Would close arena after lambda has finished or any error caught.
   */
  def confined[R](f: Region[T] => R): R = {
    implicit val region: Region[T] = this.newConfined()
    try {
      f(region)
    } finally {
      region.deallocate()
    }
  }

  /** Region based on confined slicing Arena. Would close arena after lambda has finished or any error caught.
   */
  def confinedSlicing[R](arenaSize: Long, byteAlignment: Long)(
    f: Region[T] => R,
  ): R = {
    val region: Region[T] = createConfinedSlicing(arenaSize, byteAlignment)
    try {
      f(region)
    } finally {
      region.deallocate()
    }
  }

  /** Region based on shared slicing Arena. Would close arena after lambda has finished or any error caught.
   */
  def sharedSlicing[R](arenaSize: Long, byteAlignment: Long)(
    f: Region[T] => R,
  ): R = {
    val region: Region[T] = createSharedSlicing(arenaSize, byteAlignment)
    try {
      f(region)
    } finally {
      region.deallocate()
    }
  }

}

case class SlicingArena(arena: Arena, arenaSize: Long, byteAlignment: Long)
    extends Arena {

  private val memory    = arena.allocate(arenaSize, byteAlignment)
  private val allocator = new SlicingAllocator(memory)

  override def allocate(byteSize: Long, byteAlignment: Long): MemorySegment =
    allocator.allocate(byteSize, byteAlignment)

  override def scope(): MemorySegment.Scope = arena.scope()

  override def close(): Unit = arena.close()
}
