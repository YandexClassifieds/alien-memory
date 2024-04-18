package alien.memory

import alien.memory.handle.*
import alien.memory.layout.*
import alien.memory.typelevel.nat.*

import java.lang.foreign.MemoryLayout.PathElement
import scala.annotation.nowarn
import scala.collection.mutable.ArrayBuffer

sealed trait Path {
  def asElement: PathElement
}

object Path {

  case object Sequenced extends Path {
    override def asElement: PathElement = PathElement.sequenceElement()
  }

  case class Index(index: Long) extends Path {

    override def asElement: PathElement = PathElement.sequenceElement(index)
  }

  case class Step(offset: Long, step: Long) extends Path {

    override def asElement: PathElement =
      PathElement.sequenceElement(offset, step)

  }

  case class Named(name: String) extends Path {

    override def asElement: PathElement = PathElement.groupElement(name)
  }

}

case object %
case object $

trait Unwrap[-L, +L1] {
  def apply(l: L): L1
}

object Unwrap extends LowLevelImplicits

final case class MemoryHandleComposer[Base <: Layout, L <: Layout, D <: Nat](
    base: Base,
    path: Vector[Path],
    rest: L,
)(
    implicit
    val depth: D,
) {

  def offset: Long = base.toLayout.byteOffset(path.map(_.asElement)*)

  def size: Long = rest.toLayout.byteSize()

  def /[N <: String & Singleton, L1 <: Layout](ev: N)(
    implicit
    unwrap0: Unwrap[L, N := L1],
  ): MemoryHandleComposer[Base, L1, D] =
    MemoryHandleComposer(base, path :+ Path.Named(ev), unwrap0(rest).head)

  def /[L1 <: Layout](index: Long)(
    implicit
    ev1: Unwrap[L, Sequence[L1]],
  ): MemoryHandleComposer[Base, L1, D] =
    MemoryHandleComposer(base, path :+ Path.Index(index), ev1(rest).nested)

  def /[L1 <: Layout](
    @nowarn
    ev: %,
  )(
    implicit
    ev1: Unwrap[L, Sequence[L1]],
  ): MemoryHandleComposer[Base, L1, ++[D]] =
    MemoryHandleComposer(base, path :+ Path.Sequenced, ev1(rest).nested)(
      ++(depth): ++[D],
    )

  def /[L1 <: Layout](offset: Long, step: Long)(
    implicit
    ev1: Unwrap[L, Sequence[L1]],
  ): MemoryHandleComposer[Base, L1, ++[D]] =
    MemoryHandleComposer(
      base,
      path :+ Path.Step(offset, step),
      ev1(rest).nested,
    )(++(depth): ++[D])

  def to[N <: String & Singleton, L1 <: Layout](
    implicit
    unwrap0: Unwrap[L, N := L1],
    v: ValueOf[N],
  ): MemoryHandleComposer[Base, L1, D] = this./[N, L1](v.value)

}

object MemoryHandleComposer {

  private def calculateOffsets[Base <: Layout, L <: Layout, D <: Nat](
    memoryHandleComposer: MemoryHandleComposer[Base, L, D],
  ): (ArrayBuffer[Long], ArrayBuffer[Long]) = {
    val offsets       = ArrayBuffer.empty[Long]
    val steps         = ArrayBuffer.empty[Long]
    var currentLayout = memoryHandleComposer.base.toLayout
    var currentPath   = Vector.empty[PathElement]
    for (p <- memoryHandleComposer.path) {
      p match {
        case Path.Sequenced =>
          val newOffset = currentLayout.byteOffset(currentPath*)
          offsets.append(newOffset)
          currentLayout = currentLayout
            .select((currentPath :+ PathElement.sequenceElement())*)
          currentPath = Vector.empty[PathElement]
          steps.append(currentLayout.byteSize())
        case Path.Step(begin, step) =>
          val newOffset = currentLayout
            .byteOffset((currentPath :+ PathElement.sequenceElement(begin))*)
          offsets.append(newOffset)
          currentLayout = currentLayout
            .select((currentPath :+ PathElement.sequenceElement())*)
          currentPath = Vector.empty[PathElement]
          steps.append(currentLayout.byteSize() * step)
        case _ =>
          currentPath = currentPath.appended(p.asElement)
      }
    }
    offsets.append(currentLayout.byteOffset(currentPath*))
    (offsets, steps)
  }

  implicit class MemoryHandleComposer0[Base <: Layout, L <: Layout](
      private val memoryHandleComposer: MemoryHandleComposer[Base, L, `0`],
  ) extends AnyVal {

    def /[T](
      @nowarn
      ev: $,
    )(
      implicit
      ev1: L <:< Value[T],
    ): MemoryPtr0[Base, T] = {
      val (offsets, steps) = calculateOffsets(memoryHandleComposer)
      MemoryPtr0(offsets(0))
    }

  }

  implicit class MemoryHandleComposer1[Base <: Layout, L <: Layout](
      private val memoryHandleComposer: MemoryHandleComposer[Base, L, `1`],
  ) extends AnyVal {

    def /[T](
      @nowarn
      ev: $,
    )(
      implicit
      ev1: L <:< Value[T],
    ): MemoryPtr1[Base, T] = {
      val (offsets, steps) = calculateOffsets(memoryHandleComposer)
      MemoryPtr1(offsets(0), steps(0), offsets(1))
    }

  }

  implicit class MemoryHandleComposer2[Base <: Layout, L <: Layout](
      private val memoryHandleComposer: MemoryHandleComposer[Base, L, `2`],
  ) extends AnyVal {

    def /[T](
      @nowarn
      ev: $,
    )(
      implicit
      ev1: L <:< Value[T],
    ): MemoryPtr2[Base, T] = {

      val (offsets, steps) = calculateOffsets(memoryHandleComposer)
      MemoryPtr2(offsets(0), steps(0), offsets(1), steps(1), offsets(2))
    }

  }

  implicit class MemoryHandleComposer3[Base <: Layout, L <: Layout](
      private val memoryHandleComposer: MemoryHandleComposer[Base, L, `3`],
  ) extends AnyVal {

    def /[T](
      @nowarn
      ev: $,
    )(
      implicit
      ev1: L <:< Value[T],
    ): MemoryPtr3[Base, T] = {
      val (offsets, steps) = calculateOffsets(memoryHandleComposer)
      MemoryPtr3(
        offsets(0),
        steps(0),
        offsets(1),
        steps(1),
        offsets(2),
        steps(2),
        offsets(3),
      )
    }

  }

  implicit class MemoryHandleComposer4[Base <: Layout, L <: Layout](
      private val memoryHandleComposer: MemoryHandleComposer[Base, L, `4`],
  ) extends AnyVal {

    def /[T](
      @nowarn
      ev: $,
    )(
      implicit
      ev1: L <:< Value[T],
    ): MemoryPtr4[Base, T] = {
      val (offsets, steps) = calculateOffsets(memoryHandleComposer)
      MemoryPtr4(
        offsets(0),
        steps(0),
        offsets(1),
        steps(1),
        offsets(2),
        steps(2),
        offsets(3),
        steps(3),
        offsets(4),
      )
    }

  }

  implicit class MemoryHandleComposer5[Base <: Layout, L <: Layout](
      private val memoryHandleComposer: MemoryHandleComposer[Base, L, `5`],
  ) extends AnyVal {

    def /[T](
      @nowarn
      ev: $,
    )(
      implicit
      ev1: L <:< Value[T],
    ): MemoryPtr5[Base, T] = {

      val (offsets, steps) = calculateOffsets(memoryHandleComposer)
      MemoryPtr5(
        offsets(0),
        steps(0),
        offsets(1),
        steps(1),
        offsets(2),
        steps(2),
        offsets(3),
        steps(3),
        offsets(4),
        steps(4),
        offsets(5),
      )
    }

  }

  implicit class MemoryHandleComposer6[Base <: Layout, L <: Layout](
      private val memoryHandleComposer: MemoryHandleComposer[Base, L, `6`],
  ) extends AnyVal {

    def /[T](
      @nowarn
      ev: $,
    )(
      implicit
      ev1: L <:< Value[T],
    ): MemoryPtr6[Base, T] = {
      val (offsets, steps) = calculateOffsets(memoryHandleComposer)
      MemoryPtr6(
        offsets(0),
        steps(0),
        offsets(1),
        steps(1),
        offsets(2),
        steps(2),
        offsets(3),
        steps(3),
        offsets(4),
        steps(4),
        offsets(5),
        steps(5),
        offsets(6),
      )
    }

  }

  implicit class MemoryHandleComposer7[Base <: Layout, L <: Layout](
      private val memoryHandleComposer: MemoryHandleComposer[Base, L, `7`],
  ) extends AnyVal {

    def /[T](
      @nowarn
      ev: $,
    )(
      implicit
      ev1: L <:< Value[T],
    ): MemoryPtr7[Base, T] = {

      val (offsets, steps) = calculateOffsets(memoryHandleComposer)
      MemoryPtr7(
        offsets(0),
        steps(0),
        offsets(1),
        steps(1),
        offsets(2),
        steps(2),
        offsets(3),
        steps(3),
        offsets(4),
        steps(4),
        offsets(5),
        steps(5),
        offsets(6),
        steps(6),
        offsets(7),
      )
    }

  }

  implicit class MemoryHandleComposer8[Base <: Layout, L <: Layout](
      private val memoryHandleComposer: MemoryHandleComposer[Base, L, `8`],
  ) extends AnyVal {

    def /[T](
      @nowarn
      ev: $,
    )(
      implicit
      ev1: L <:< Value[T],
    ): MemoryPtr8[Base, T] = {
      val (offsets, steps) = calculateOffsets(memoryHandleComposer)
      MemoryPtr8(
        offsets(0),
        steps(0),
        offsets(1),
        steps(1),
        offsets(2),
        steps(2),
        offsets(3),
        steps(3),
        offsets(4),
        steps(4),
        offsets(5),
        steps(5),
        offsets(6),
        steps(6),
        offsets(7),
        steps(7),
        offsets(8),
      )
    }

  }

  implicit class MemoryHandleComposer9[Base <: Layout, L <: Layout](
      private val memoryHandleComposer: MemoryHandleComposer[Base, L, `9`],
  ) extends AnyVal {

    def /[T](
      @nowarn
      ev: $,
    )(
      implicit
      ev1: L <:< Value[T],
    ): MemoryPtr9[Base, T] = {

      val (offsets, steps) = calculateOffsets(memoryHandleComposer)
      MemoryPtr9(
        offsets(0),
        steps(0),
        offsets(1),
        steps(1),
        offsets(2),
        steps(2),
        offsets(3),
        steps(3),
        offsets(4),
        steps(4),
        offsets(5),
        steps(5),
        offsets(6),
        steps(6),
        offsets(7),
        steps(7),
        offsets(8),
        steps(8),
        offsets(9),
      )
    }

  }

}
