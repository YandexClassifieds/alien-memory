package alien.memory.layout

import alien.memory.typelevel.pow2.*

import java.lang.foreign.MemoryLayout

/** Base class to all layouts. Layout represents typed schema, how byte-data would be placed in memory.
 *
 */
trait Layout {
  self =>

  protected[alien] def layout: MemoryLayout

  /** Sets alignment in bytes to a layout. Alignment must be a power of two.
   *
   * @return new layout, which is a current layout wrapped in `Aligned`
   */
  final def align[B <: Pow2](
    implicit
    bytes: B,
  ): Aligned[self.type, B] = Aligned(self, bytes)

  /** Unwraps layout to java.lang.foreign.MemoryLayout.
   *
   * @return java.lang.foreign.MemoryLayout that represents the same layout as this `Layout` object.
   */
  final def toLayout: MemoryLayout = layout
}
