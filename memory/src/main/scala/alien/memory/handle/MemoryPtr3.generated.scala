package alien.memory.handle

import alien.memory.*

import scala.Specializable.AllNumeric

case class MemoryPtr3[L <: Layout, @specialized(AllNumeric) T] private[alien] (
    private[alien] val offset0: Long,
    private[alien] val step1: Long,
    private[alien] val offset1: Long,
    private[alien] val step2: Long,
    private[alien] val offset2: Long,
    private[alien] val step3: Long,
    private[alien] val offset3: Long,
)
