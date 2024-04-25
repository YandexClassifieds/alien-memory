package alien.memory.layout

import java.lang.foreign.{MemoryLayout, SequenceLayout}

sealed abstract class Sequence[L <: Layout](protected[alien] val nested: L)
    extends Layout

/** Represents a sequence with size, similar to array.
 *
 * @constructor Creates a new sequence with inner layout `elemType` of size `n`.
 * @param n Sequence size.
 * @param elemType Inner layout.
 */
case class BoundedSequence[L <: Layout](n: Long, elemType: L)
    extends Sequence[L](elemType) {

  override protected[alien] lazy val layout: SequenceLayout = MemoryLayout
    .sequenceLayout(n, nested.toLayout)

}
