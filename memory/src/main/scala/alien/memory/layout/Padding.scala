package alien.memory.layout

import java.lang.foreign.MemoryLayout

/** Layout that adds filler-bytes between structure fields.
 *
 * @constructor Creates new padding-bytes that can be added to structure.
 * @param bytes Number of bytes.
 */
final case class Padding(bytes: Long) extends Layout {

  override protected[alien] val layout: MemoryLayout = MemoryLayout
    .paddingLayout(bytes)

}
