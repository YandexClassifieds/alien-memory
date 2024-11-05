package alien.memory.handle

import alien.memory.*

import scala.Specializable.AllNumeric

case class MemoryPtr7[L <: Layout, @specialized(AllNumeric) T] private[alien] (
    private[alien] val offset0: Long,
    private[alien] val step1: Long,
    private[alien] val offset1: Long,
    private[alien] val step2: Long,
    private[alien] val offset2: Long,
    private[alien] val step3: Long,
    private[alien] val offset3: Long,
    private[alien] val step4: Long,
    private[alien] val offset4: Long,
    private[alien] val step5: Long,
    private[alien] val offset5: Long,
    private[alien] val step6: Long,
    private[alien] val offset6: Long,
    private[alien] val step7: Long,
    private[alien] val offset7: Long,
)
