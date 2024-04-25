package alien.memory.layout

import alien.memory.typelevel.pow2.*

import java.lang.foreign.MemoryLayout

/** Represents a layout with alignment.
 *
 * @constructor Create a layout with a `inner` layout and `bytes` alignment.
 * @param inner Inner layout that will be aligned.
 * @param bytes Alignment of layout in bytes. Must be a power of two.
 */
case class Aligned[+L <: Layout, B <: Pow2](inner: L, bytes: B) extends Layout {

  override protected[alien] val layout: MemoryLayout = inner
    .toLayout
    .withByteAlignment(bytes.value)

}
