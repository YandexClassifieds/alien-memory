package alien.memory.layout

import alien.memory.layout

import java.lang.foreign.MemoryLayout
import scala.annotation.tailrec

sealed trait DynamicHead[+H <: ? := ?] extends Layout {
  def head: H
}

sealed trait DynamicStruct extends Any {
  self =>

  def >>:[O <: ? := ?](another: O): O >>: self.type = layout.>>:(another, self)
}

sealed trait DynamicUnion extends Any {
  self =>

  def <>:[O <: ? := ?](another: O): O <>: self.type = layout.<>:(another, self)
}

sealed trait DynamicTail[+T] {
  def tail: T
}

/** Base wrapper around ? := ?. Can be used both as a union and a structure.
 *
 * @constructor Creates a layout with one field.
 * @param head Layout that would be named and wrapped.
 */
case class >>[Named <: ? := ?](head: Named)
    extends DynamicHead[Named]
       with DynamicStruct
       with DynamicUnion
       with Layout {

  override protected[alien] def layout: MemoryLayout =
    MemoryLayout.structLayout(head.layout)

  def asElementLayout: MemoryLayout = head.layout
}

/** Represents a struct layout.
 *
 * @constructor Constructs a new layout that contains `head` *and* `tail`.
 * @param head Named field that will be added to struct layout.
 * @param tail Other fields in struct.
 */
case class >>:[+H <: ? := ?, +T <: DynamicStruct](head: H, tail: T)
    extends DynamicHead[H]
       with DynamicStruct
       with DynamicTail[T] {

  override protected[alien] def layout: MemoryLayout = {
    @tailrec
    def recurse(
      x: DynamicStruct,
      acc: Vector[MemoryLayout] = Vector.empty,
    ): Vector[MemoryLayout] = {
      x match {
        case end @ >>(_) =>
          acc :+ end.asElementLayout
        case >>:(head, tail) =>
          recurse(tail, acc :+ head.layout)
      }
    }

    MemoryLayout.structLayout(recurse(this)*)
  }

}

/** Represents a union layout.
 *
 * @constructor Creates a new layout that contains `head` *or* `tail`.
 * @param head Named variant that will be new added of union layout.
 * @param tail Other variants in union.
 */
case class <>:[+H <: ? := ?, +T <: DynamicUnion](head: H, tail: T)
    extends DynamicHead[H]
       with DynamicUnion
       with DynamicTail[T] {

  override protected[alien] def layout: MemoryLayout = {
    @tailrec
    def recurse(
      x: DynamicUnion,
      acc: Vector[MemoryLayout] = Vector.empty,
    ): Vector[MemoryLayout] = {
      x match {
        case end @ >>(_) =>
          acc :+ end.asElementLayout
        case <>:(head, tail) =>
          recurse(tail, acc :+ head.layout)
      }
    }

    MemoryLayout.unionLayout(recurse(this)*)
  }

}

/** Represents a name and layout. Can be wrapped to layout using >>.
 *
 * @constructor Creates a new named field that can be added to union or structure.
 * @param head Layout that will be named.
 * @param n Layout name.
 */
case class :=[Name <: String & Singleton, L <: Layout](head: L, n: Name) {

  def nested: L = head

  def layout: MemoryLayout = nested.toLayout.withName(name)

  def name: String = n

  override def toString: String = s""""$name" := $nested"""
}
