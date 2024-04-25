package alien

import alien.memory.handle.MemoryHandle.MemoryHandleSyntax
import alien.memory.layout.{BoundedSequence, DynamicStruct, DynamicUnion}
import alien.memory.typelevel.nat.*
import alien.memory.typelevel.pow2.{Pow2, Pow2Constants}

import scala.language.implicitConversions

package object memory
    extends Pow2Constants
       with NatConstants
       with MemoryHandleSyntax {

  type Memory[L <: Layout, R <: Global] = Memory.Type[L, R]

  type NamedMark[R <: String & Singleton] = Region.NamedMark[R]
  type IdMark[T <: Singleton & Long]      = Region.IdMark[T]

  type MemoryPtr0[L <: Layout, T] = handle.MemoryPtr0[L, T]
  type MemoryPtr1[L <: Layout, T] = handle.MemoryPtr1[L, T]
  type MemoryPtr2[L <: Layout, T] = handle.MemoryPtr2[L, T]
  type MemoryPtr3[L <: Layout, T] = handle.MemoryPtr3[L, T]
  type MemoryPtr4[L <: Layout, T] = handle.MemoryPtr4[L, T]
  type MemoryPtr5[L <: Layout, T] = handle.MemoryPtr5[L, T]
  type MemoryPtr6[L <: Layout, T] = handle.MemoryPtr6[L, T]
  type MemoryPtr7[L <: Layout, T] = handle.MemoryPtr7[L, T]
  type MemoryPtr8[L <: Layout, T] = handle.MemoryPtr8[L, T]
  type MemoryPtr9[L <: Layout, T] = handle.MemoryPtr9[L, T]

  val Values: layout.Values.type = layout.Values

  def Padding(bytes: Int): Padding = layout.Padding(bytes)

  type Value[T]                                 = layout.Value[T]
  type Layout                                   = layout.Layout
  type BoundedSequence[L <: Layout]             = layout.BoundedSequence[L]
  type :=[N <: String & Singleton, L <: Layout] = layout.:=[N, L]
  type >>[L <: ? := ?]                          = layout.>>[L]
  type >>:[+H <: ? := ?, +L <: DynamicStruct]   = layout.>>:[H, L]
  type <>:[+H <: ? := ?, +L <: DynamicUnion]    = layout.<>:[H, L]
  type Aligned[+L <: Layout, B <: Pow2]         = layout.Aligned[L, B]
  type Padding                                  = layout.Padding
  def >>[L <: ? := ?](l: L): >>[L] = layout.>>(l)

  type % = %.type
  type $ = $.type

  implicit final class LayoutOps[L <: Layout](private val layout: L)
      extends AnyVal {
    def *(n: Int): BoundedSequence[L] = BoundedSequence(n.toLong, layout)

    def *(n: Long): BoundedSequence[L] = BoundedSequence(n, layout)
  }

  implicit final class SingletonStringOps[S <: String & Singleton](
      private val s: S,
  ) extends AnyVal {

    def :=[L <: Layout](layout: L): S := L = memory.layout.:=(layout, s)

  }

  implicit def layoutAsMemoryHandleComposer[L <: Layout](
    layout: L,
  ): MemoryHandleComposer[L, L, `0`] =
    MemoryHandleComposer(layout, Vector.empty, layout)(`0`)

  implicit def namedAsMemoryHandleComposer[N <: ? := ?](
    named: N,
  ): MemoryHandleComposer[>>[N], >>[N], `0`] =
    MemoryHandleComposer(>>(named), Vector.empty, >>(named))(`0`)

  implicit def namedAsEnd[K <: String & Singleton, L <: Layout](
    named: K := L,
  ): >>[K := L] = >>(named)

}
