package alien.memory.layout

import java.lang.foreign.MemoryLayout

/** Represents a primitive value that can be extracted from memory.
 *
 * @constructor Creates a new sequence with inner layout `elemType` of size `n`
 */
final case class Value[T](layout: MemoryLayout) extends Layout
