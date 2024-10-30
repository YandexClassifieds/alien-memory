package alien.memory.handle

import alien.memory.{Global, Layout, Memory, Region}
import jdk.internal.vm.annotation.IntrinsicCandidate

import java.lang.foreign.MemoryLayout.PathElement
import java.lang.foreign.{MemoryLayout, ValueLayout}

object MemoryHandle {

  val byteVh = MemoryLayout
    .sequenceLayout(ValueLayout.JAVA_BYTE)
    .varHandle(PathElement.sequenceElement())

  val shortVh = MemoryLayout
    .sequenceLayout(ValueLayout.JAVA_SHORT)
    .varHandle(PathElement.sequenceElement())

  val intVh = MemoryLayout
    .sequenceLayout(ValueLayout.JAVA_INT)
    .varHandle(PathElement.sequenceElement())

  val longVh = MemoryLayout
    .sequenceLayout(ValueLayout.JAVA_LONG)
    .varHandle(PathElement.sequenceElement())

  val floatVh = MemoryLayout
    .sequenceLayout(ValueLayout.JAVA_FLOAT)
    .varHandle(PathElement.sequenceElement())

  val doubleVh = MemoryLayout
    .sequenceLayout(ValueLayout.JAVA_DOUBLE)
    .varHandle(PathElement.sequenceElement())

  val charVh = MemoryLayout
    .sequenceLayout(ValueLayout.JAVA_CHAR)
    .varHandle(PathElement.sequenceElement())

  val boolVh = MemoryLayout
    .sequenceLayout(ValueLayout.JAVA_BOOLEAN)
    .varHandle(PathElement.sequenceElement())

  trait MemoryHandleSyntax {

    implicit def byte0Ops[L <: Layout](vh: MemoryPtr0[L, Byte]): Byte0Ops[L] =
      Byte0Ops(vh)

    implicit def byte1Ops[L <: Layout](vh: MemoryPtr1[L, Byte]): Byte1Ops[L] =
      Byte1Ops(vh)

    implicit def byte2Ops[L <: Layout](vh: MemoryPtr2[L, Byte]): Byte2Ops[L] =
      Byte2Ops(vh)

    implicit def byte3Ops[L <: Layout](vh: MemoryPtr3[L, Byte]): Byte3Ops[L] =
      Byte3Ops(vh)

    implicit def byte4Ops[L <: Layout](vh: MemoryPtr4[L, Byte]): Byte4Ops[L] =
      Byte4Ops(vh)

    implicit def byte5Ops[L <: Layout](vh: MemoryPtr5[L, Byte]): Byte5Ops[L] =
      Byte5Ops(vh)

    implicit def byte6Ops[L <: Layout](vh: MemoryPtr6[L, Byte]): Byte6Ops[L] =
      Byte6Ops(vh)

    implicit def short0Ops[L <: Layout](
      vh: MemoryPtr0[L, Short],
    ): Short0Ops[L] = Short0Ops(vh)

    implicit def short1Ops[L <: Layout](
      vh: MemoryPtr1[L, Short],
    ): Short1Ops[L] = Short1Ops(vh)

    implicit def short2Ops[L <: Layout](
      vh: MemoryPtr2[L, Short],
    ): Short2Ops[L] = Short2Ops(vh)

    implicit def short3Ops[L <: Layout](
      vh: MemoryPtr3[L, Short],
    ): Short3Ops[L] = Short3Ops(vh)

    implicit def short4Ops[L <: Layout](
      vh: MemoryPtr4[L, Short],
    ): Short4Ops[L] = Short4Ops(vh)

    implicit def short5Ops[L <: Layout](
      vh: MemoryPtr5[L, Short],
    ): Short5Ops[L] = Short5Ops(vh)

    implicit def short6Ops[L <: Layout](
      vh: MemoryPtr6[L, Short],
    ): Short6Ops[L] = Short6Ops(vh)

    implicit def char0Ops[L <: Layout](vh: MemoryPtr0[L, Char]): Char0Ops[L] =
      Char0Ops(vh)

    implicit def char1Ops[L <: Layout](vh: MemoryPtr1[L, Char]): Char1Ops[L] =
      Char1Ops(vh)

    implicit def char2Ops[L <: Layout](vh: MemoryPtr2[L, Char]): Char2Ops[L] =
      Char2Ops(vh)

    implicit def char3Ops[L <: Layout](vh: MemoryPtr3[L, Char]): Char3Ops[L] =
      Char3Ops(vh)

    implicit def char4Ops[L <: Layout](vh: MemoryPtr4[L, Char]): Char4Ops[L] =
      Char4Ops(vh)

    implicit def char5Ops[L <: Layout](vh: MemoryPtr5[L, Char]): Char5Ops[L] =
      Char5Ops(vh)

    implicit def char6Ops[L <: Layout](vh: MemoryPtr6[L, Char]): Char6Ops[L] =
      Char6Ops(vh)

    implicit def int0Ops[L <: Layout](vh: MemoryPtr0[L, Int]): Int0Ops[L] =
      Int0Ops(vh)

    implicit def int1Ops[L <: Layout](vh: MemoryPtr1[L, Int]): Int1Ops[L] =
      Int1Ops(vh)

    implicit def int2Ops[L <: Layout](vh: MemoryPtr2[L, Int]): Int2Ops[L] =
      Int2Ops(vh)

    implicit def int3Ops[L <: Layout](vh: MemoryPtr3[L, Int]): Int3Ops[L] =
      Int3Ops(vh)

    implicit def int4Ops[L <: Layout](vh: MemoryPtr4[L, Int]): Int4Ops[L] =
      Int4Ops(vh)

    implicit def int5Ops[L <: Layout](vh: MemoryPtr5[L, Int]): Int5Ops[L] =
      Int5Ops(vh)

    implicit def int6Ops[L <: Layout](vh: MemoryPtr6[L, Int]): Int6Ops[L] =
      Int6Ops(vh)

    implicit def long0Ops[L <: Layout](vh: MemoryPtr0[L, Long]): Long0Ops[L] =
      Long0Ops(vh)

    implicit def long1Ops[L <: Layout](vh: MemoryPtr1[L, Long]): Long1Ops[L] =
      Long1Ops(vh)

    implicit def long2Ops[L <: Layout](vh: MemoryPtr2[L, Long]): Long2Ops[L] =
      Long2Ops(vh)

    implicit def long3Ops[L <: Layout](vh: MemoryPtr3[L, Long]): Long3Ops[L] =
      Long3Ops(vh)

    implicit def long4Ops[L <: Layout](vh: MemoryPtr4[L, Long]): Long4Ops[L] =
      Long4Ops(vh)

    implicit def long5Ops[L <: Layout](vh: MemoryPtr5[L, Long]): Long5Ops[L] =
      Long5Ops(vh)

    implicit def long6Ops[L <: Layout](vh: MemoryPtr6[L, Long]): Long6Ops[L] =
      Long6Ops(vh)

    implicit def float0Ops[L <: Layout](
      vh: MemoryPtr0[L, Float],
    ): Float0Ops[L] = Float0Ops(vh)

    implicit def float1Ops[L <: Layout](
      vh: MemoryPtr1[L, Float],
    ): Float1Ops[L] = Float1Ops(vh)

    implicit def float2Ops[L <: Layout](
      vh: MemoryPtr2[L, Float],
    ): Float2Ops[L] = Float2Ops(vh)

    implicit def float3Ops[L <: Layout](
      vh: MemoryPtr3[L, Float],
    ): Float3Ops[L] = Float3Ops(vh)

    implicit def float4Ops[L <: Layout](
      vh: MemoryPtr4[L, Float],
    ): Float4Ops[L] = Float4Ops(vh)

    implicit def float5Ops[L <: Layout](
      vh: MemoryPtr5[L, Float],
    ): Float5Ops[L] = Float5Ops(vh)

    implicit def float6Ops[L <: Layout](
      vh: MemoryPtr6[L, Float],
    ): Float6Ops[L] = Float6Ops(vh)

    implicit def double0Ops[L <: Layout](
      vh: MemoryPtr0[L, Double],
    ): Double0Ops[L] = Double0Ops(vh)

    implicit def double1Ops[L <: Layout](
      vh: MemoryPtr1[L, Double],
    ): Double1Ops[L] = Double1Ops(vh)

    implicit def double2Ops[L <: Layout](
      vh: MemoryPtr2[L, Double],
    ): Double2Ops[L] = Double2Ops(vh)

    implicit def double3Ops[L <: Layout](
      vh: MemoryPtr3[L, Double],
    ): Double3Ops[L] = Double3Ops(vh)

    implicit def double4Ops[L <: Layout](
      vh: MemoryPtr4[L, Double],
    ): Double4Ops[L] = Double4Ops(vh)

    implicit def double5Ops[L <: Layout](
      vh: MemoryPtr5[L, Double],
    ): Double5Ops[L] = Double5Ops(vh)

    implicit def double6Ops[L <: Layout](
      vh: MemoryPtr6[L, Double],
    ): Double6Ops[L] = Double6Ops(vh)

  }

  implicit final class Byte0Ops[L <: Layout](
      protected val vh: MemoryPtr0[L, Byte],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R])(
      implicit
      region: Region[R],
    ): Byte = byteVh.get(mem.asJava, (vh.offset0) >> 0)

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](mem: Memory[L, R])(
      implicit
      region: Region[R],
    ): Byte = byteVh.getVolatile(mem.asJava, (vh.offset0) >> 0)

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](mem: Memory[L, R])(
      implicit
      region: Region[R],
    ): Byte = byteVh.getOpaque(mem.asJava, (vh.offset0) >> 0)

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](mem: Memory[L, R])(
      implicit
      region: Region[R],
    ): Byte = byteVh.getAcquire(mem.asJava, (vh.offset0) >> 0)

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Byte)(
      implicit
      region: Region[R],
    ): Unit = byteVh.set(mem.asJava, (vh.offset0) >> 0, value)

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](mem: Memory[L, R], value: Byte)(
      implicit
      region: Region[R],
    ): Unit = byteVh.setVolatile(mem.asJava, (vh.offset0) >> 0, value)

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](mem: Memory[L, R], value: Byte)(
      implicit
      region: Region[R],
    ): Unit = byteVh.setOpaque(mem.asJava, (vh.offset0) >> 0, value)

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](mem: Memory[L, R], value: Byte)(
      implicit
      region: Region[R],
    ): Unit = byteVh.setRelease(mem.asJava, (vh.offset0) >> 0, value)

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh
        .compareAndSet(mem.asJava, (vh.offset0) >> 0, expectedValue, newValue)

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0) >> 0,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0) >> 0,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0) >> 0,
        expectedValue,
        newValue,
      )

  }

  implicit final class Byte1Ops[L <: Layout](
      protected val vh: MemoryPtr1[L, Byte],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Long)(
      implicit
      region: Region[R],
    ): Byte =
      byteVh.get(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 0)

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int)(
      implicit
      region: Region[R],
    ): Byte =
      byteVh.get(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 0)

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](mem: Memory[L, R], x1: Long)(
      implicit
      region: Region[R],
    ): Byte =
      byteVh
        .getVolatile(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 0)

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](mem: Memory[L, R], x1: Int)(
      implicit
      region: Region[R],
    ): Byte =
      byteVh
        .getVolatile(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 0)

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](mem: Memory[L, R], x1: Long)(
      implicit
      region: Region[R],
    ): Byte =
      byteVh
        .getOpaque(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 0)

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](mem: Memory[L, R], x1: Int)(
      implicit
      region: Region[R],
    ): Byte =
      byteVh
        .getOpaque(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 0)

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](mem: Memory[L, R], x1: Long)(
      implicit
      region: Region[R],
    ): Byte =
      byteVh
        .getAcquire(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 0)

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](mem: Memory[L, R], x1: Int)(
      implicit
      region: Region[R],
    ): Byte =
      byteVh
        .getAcquire(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 0)

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Byte, x1: Long)(
      implicit
      region: Region[R],
    ): Unit =
      byteVh
        .set(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 0, value)

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Byte, x1: Int)(
      implicit
      region: Region[R],
    ): Unit =
      byteVh
        .set(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 0, value)

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](mem: Memory[L, R], value: Byte, x1: Long)(
      implicit
      region: Region[R],
    ): Unit =
      byteVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 0,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](mem: Memory[L, R], value: Byte, x1: Int)(
      implicit
      region: Region[R],
    ): Unit =
      byteVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 0,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](mem: Memory[L, R], value: Byte, x1: Long)(
      implicit
      region: Region[R],
    ): Unit =
      byteVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 0,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](mem: Memory[L, R], value: Byte, x1: Int)(
      implicit
      region: Region[R],
    ): Unit =
      byteVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 0,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](mem: Memory[L, R], value: Byte, x1: Long)(
      implicit
      region: Region[R],
    ): Unit =
      byteVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 0,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](mem: Memory[L, R], value: Byte, x1: Int)(
      implicit
      region: Region[R],
    ): Unit =
      byteVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 0,
        value,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
      x1: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 0,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
      x1: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 0,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
      x1: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 0,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
      x1: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 0,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
      x1: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 0,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
      x1: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 0,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
      x1: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 0,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
      x1: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 0,
        expectedValue,
        newValue,
      )

  }

  implicit final class Byte2Ops[L <: Layout](
      protected val vh: MemoryPtr2[L, Byte],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Long, x2: Long)(
      implicit
      region: Region[R],
    ): Byte =
      byteVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          0,
      )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Byte =
      byteVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          0,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](mem: Memory[L, R], x1: Long, x2: Long)(
      implicit
      region: Region[R],
    ): Byte =
      byteVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          0,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](mem: Memory[L, R], x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Byte =
      byteVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          0,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](mem: Memory[L, R], x1: Long, x2: Long)(
      implicit
      region: Region[R],
    ): Byte =
      byteVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          0,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](mem: Memory[L, R], x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Byte =
      byteVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          0,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](mem: Memory[L, R], x1: Long, x2: Long)(
      implicit
      region: Region[R],
    ): Byte =
      byteVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          0,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](mem: Memory[L, R], x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Byte =
      byteVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          0,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Byte, x1: Long, x2: Long)(
      implicit
      region: Region[R],
    ): Unit =
      byteVh.set(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          0,
        value,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Byte, x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Unit =
      byteVh.set(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          0,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Byte,
      x1: Long,
      x2: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      byteVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          0,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Byte,
      x1: Int,
      x2: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      byteVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          0,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Byte,
      x1: Long,
      x2: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      byteVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          0,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Byte,
      x1: Int,
      x2: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      byteVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          0,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Byte,
      x1: Long,
      x2: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      byteVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          0,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Byte,
      x1: Int,
      x2: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      byteVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          0,
        value,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
      x1: Long,
      x2: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          0,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
      x1: Int,
      x2: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          0,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
      x1: Long,
      x2: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          0,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
      x1: Int,
      x2: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          0,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
      x1: Long,
      x2: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          0,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
      x1: Int,
      x2: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          0,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
      x1: Long,
      x2: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          0,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
      x1: Int,
      x2: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          0,
        expectedValue,
        newValue,
      )

  }

  implicit final class Byte3Ops[L <: Layout](
      protected val vh: MemoryPtr3[L, Byte],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Long, x2: Long, x3: Long)(
      implicit
      region: Region[R],
    ): Byte =
      byteVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 0,
      )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int, x2: Int, x3: Int)(
      implicit
      region: Region[R],
    ): Byte =
      byteVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 0,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Byte =
      byteVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 0,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](mem: Memory[L, R], x1: Int, x2: Int, x3: Int)(
      implicit
      region: Region[R],
    ): Byte =
      byteVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 0,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](mem: Memory[L, R], x1: Long, x2: Long, x3: Long)(
      implicit
      region: Region[R],
    ): Byte =
      byteVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 0,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](mem: Memory[L, R], x1: Int, x2: Int, x3: Int)(
      implicit
      region: Region[R],
    ): Byte =
      byteVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 0,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Byte =
      byteVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 0,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](mem: Memory[L, R], x1: Int, x2: Int, x3: Int)(
      implicit
      region: Region[R],
    ): Byte =
      byteVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 0,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Byte,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      byteVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 0,
        value,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Byte,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      byteVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 0,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Byte,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      byteVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 0,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Byte,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      byteVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 0,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Byte,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      byteVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 0,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Byte,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      byteVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 0,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Byte,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      byteVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 0,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Byte,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      byteVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 0,
        value,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 0,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 0,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 0,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 0,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 0,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 0,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 0,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 0,
        expectedValue,
        newValue,
      )

  }

  implicit final class Byte4Ops[L <: Layout](
      protected val vh: MemoryPtr4[L, Byte],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Byte =
      byteVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 0,
      )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int, x2: Int, x3: Int, x4: Int)(
      implicit
      region: Region[R],
    ): Byte =
      byteVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 0,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Byte =
      byteVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 0,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Byte =
      byteVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 0,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Byte =
      byteVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 0,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Byte =
      byteVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 0,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Byte =
      byteVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 0,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Byte =
      byteVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 0,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Byte,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      byteVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 0,
        value,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Byte,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      byteVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 0,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Byte,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      byteVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 0,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Byte,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      byteVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 0,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Byte,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      byteVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 0,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Byte,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      byteVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 0,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Byte,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      byteVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 0,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Byte,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      byteVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 0,
        value,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 0,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 0,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 0,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 0,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 0,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 0,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 0,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 0,
        expectedValue,
        newValue,
      )

  }

  implicit final class Byte5Ops[L <: Layout](
      protected val vh: MemoryPtr5[L, Byte],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Byte =
      byteVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 0,
      )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Byte =
      byteVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 0,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Byte =
      byteVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 0,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Byte =
      byteVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 0,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Byte =
      byteVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 0,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Byte =
      byteVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 0,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Byte =
      byteVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 0,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Byte =
      byteVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 0,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Byte,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      byteVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 0,
        value,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Byte,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      byteVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 0,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Byte,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      byteVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 0,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Byte,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      byteVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 0,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Byte,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      byteVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 0,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Byte,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      byteVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 0,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Byte,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      byteVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 0,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Byte,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      byteVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 0,
        value,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 0,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 0,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 0,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 0,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 0,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 0,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 0,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 0,
        expectedValue,
        newValue,
      )

  }

  implicit final class Byte6Ops[L <: Layout](
      protected val vh: MemoryPtr6[L, Byte],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Byte =
      byteVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 0,
      )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Byte =
      byteVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 0,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Byte =
      byteVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 0,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Byte =
      byteVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 0,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Byte =
      byteVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 0,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Byte =
      byteVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 0,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Byte =
      byteVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 0,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Byte =
      byteVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 0,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Byte,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      byteVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 0,
        value,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Byte,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      byteVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 0,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Byte,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      byteVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 0,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Byte,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      byteVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 0,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Byte,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      byteVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 0,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Byte,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      byteVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 0,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Byte,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      byteVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 0,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Byte,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      byteVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 0,
        value,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 0,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 0,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 0,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 0,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 0,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 0,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 0,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Byte,
      newValue: Byte,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      byteVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 0,
        expectedValue,
        newValue,
      )

  }

  implicit final class Short0Ops[L <: Layout](
      protected val vh: MemoryPtr0[L, Short],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R])(
      implicit
      region: Region[R],
    ): Short = shortVh.get(mem.asJava, (vh.offset0) >> 1)

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](mem: Memory[L, R])(
      implicit
      region: Region[R],
    ): Short = shortVh.getVolatile(mem.asJava, (vh.offset0) >> 1)

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](mem: Memory[L, R])(
      implicit
      region: Region[R],
    ): Short = shortVh.getOpaque(mem.asJava, (vh.offset0) >> 1)

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](mem: Memory[L, R])(
      implicit
      region: Region[R],
    ): Short = shortVh.getAcquire(mem.asJava, (vh.offset0) >> 1)

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Short)(
      implicit
      region: Region[R],
    ): Unit = shortVh.set(mem.asJava, (vh.offset0) >> 1, value)

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](mem: Memory[L, R], value: Short)(
      implicit
      region: Region[R],
    ): Unit = shortVh.setVolatile(mem.asJava, (vh.offset0) >> 1, value)

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](mem: Memory[L, R], value: Short)(
      implicit
      region: Region[R],
    ): Unit = shortVh.setOpaque(mem.asJava, (vh.offset0) >> 1, value)

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](mem: Memory[L, R], value: Short)(
      implicit
      region: Region[R],
    ): Unit = shortVh.setRelease(mem.asJava, (vh.offset0) >> 1, value)

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh
        .compareAndSet(mem.asJava, (vh.offset0) >> 1, expectedValue, newValue)

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0) >> 1,
        expectedValue,
        newValue,
      )

  }

  implicit final class Short1Ops[L <: Layout](
      protected val vh: MemoryPtr1[L, Short],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Long)(
      implicit
      region: Region[R],
    ): Short =
      shortVh.get(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 1)

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int)(
      implicit
      region: Region[R],
    ): Short =
      shortVh.get(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 1)

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](mem: Memory[L, R], x1: Long)(
      implicit
      region: Region[R],
    ): Short =
      shortVh
        .getVolatile(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 1)

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](mem: Memory[L, R], x1: Int)(
      implicit
      region: Region[R],
    ): Short =
      shortVh
        .getVolatile(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 1)

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](mem: Memory[L, R], x1: Long)(
      implicit
      region: Region[R],
    ): Short =
      shortVh
        .getOpaque(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 1)

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](mem: Memory[L, R], x1: Int)(
      implicit
      region: Region[R],
    ): Short =
      shortVh
        .getOpaque(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 1)

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](mem: Memory[L, R], x1: Long)(
      implicit
      region: Region[R],
    ): Short =
      shortVh
        .getAcquire(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 1)

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](mem: Memory[L, R], x1: Int)(
      implicit
      region: Region[R],
    ): Short =
      shortVh
        .getAcquire(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 1)

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Short, x1: Long)(
      implicit
      region: Region[R],
    ): Unit =
      shortVh
        .set(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 1, value)

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Short, x1: Int)(
      implicit
      region: Region[R],
    ): Unit =
      shortVh
        .set(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 1, value)

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](mem: Memory[L, R], value: Short, x1: Long)(
      implicit
      region: Region[R],
    ): Unit =
      shortVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](mem: Memory[L, R], value: Short, x1: Int)(
      implicit
      region: Region[R],
    ): Unit =
      shortVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](mem: Memory[L, R], value: Short, x1: Long)(
      implicit
      region: Region[R],
    ): Unit =
      shortVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](mem: Memory[L, R], value: Short, x1: Int)(
      implicit
      region: Region[R],
    ): Unit =
      shortVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](mem: Memory[L, R], value: Short, x1: Long)(
      implicit
      region: Region[R],
    ): Unit =
      shortVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](mem: Memory[L, R], value: Short, x1: Int)(
      implicit
      region: Region[R],
    ): Unit =
      shortVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
      x1: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
      x1: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
      x1: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
      x1: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
      x1: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
      x1: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
      x1: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
      x1: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 1,
        expectedValue,
        newValue,
      )

  }

  implicit final class Short2Ops[L <: Layout](
      protected val vh: MemoryPtr2[L, Short],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Long, x2: Long)(
      implicit
      region: Region[R],
    ): Short =
      shortVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          1,
      )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Short =
      shortVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          1,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](mem: Memory[L, R], x1: Long, x2: Long)(
      implicit
      region: Region[R],
    ): Short =
      shortVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          1,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](mem: Memory[L, R], x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Short =
      shortVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          1,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](mem: Memory[L, R], x1: Long, x2: Long)(
      implicit
      region: Region[R],
    ): Short =
      shortVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          1,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](mem: Memory[L, R], x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Short =
      shortVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          1,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](mem: Memory[L, R], x1: Long, x2: Long)(
      implicit
      region: Region[R],
    ): Short =
      shortVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          1,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](mem: Memory[L, R], x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Short =
      shortVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          1,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Short, x1: Long, x2: Long)(
      implicit
      region: Region[R],
    ): Unit =
      shortVh.set(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Short, x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Unit =
      shortVh.set(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Short,
      x1: Long,
      x2: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      shortVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Short,
      x1: Int,
      x2: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      shortVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Short,
      x1: Long,
      x2: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      shortVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Short,
      x1: Int,
      x2: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      shortVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Short,
      x1: Long,
      x2: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      shortVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Short,
      x1: Int,
      x2: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      shortVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
      x1: Long,
      x2: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
      x1: Int,
      x2: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
      x1: Long,
      x2: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
      x1: Int,
      x2: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
      x1: Long,
      x2: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
      x1: Int,
      x2: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
      x1: Long,
      x2: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
      x1: Int,
      x2: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          1,
        expectedValue,
        newValue,
      )

  }

  implicit final class Short3Ops[L <: Layout](
      protected val vh: MemoryPtr3[L, Short],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Long, x2: Long, x3: Long)(
      implicit
      region: Region[R],
    ): Short =
      shortVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int, x2: Int, x3: Int)(
      implicit
      region: Region[R],
    ): Short =
      shortVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Short =
      shortVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](mem: Memory[L, R], x1: Int, x2: Int, x3: Int)(
      implicit
      region: Region[R],
    ): Short =
      shortVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](mem: Memory[L, R], x1: Long, x2: Long, x3: Long)(
      implicit
      region: Region[R],
    ): Short =
      shortVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](mem: Memory[L, R], x1: Int, x2: Int, x3: Int)(
      implicit
      region: Region[R],
    ): Short =
      shortVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Short =
      shortVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](mem: Memory[L, R], x1: Int, x2: Int, x3: Int)(
      implicit
      region: Region[R],
    ): Short =
      shortVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Short,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      shortVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Short,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      shortVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Short,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      shortVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Short,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      shortVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Short,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      shortVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Short,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      shortVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Short,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      shortVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Short,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      shortVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 1,
        expectedValue,
        newValue,
      )

  }

  implicit final class Short4Ops[L <: Layout](
      protected val vh: MemoryPtr4[L, Short],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Short =
      shortVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int, x2: Int, x3: Int, x4: Int)(
      implicit
      region: Region[R],
    ): Short =
      shortVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Short =
      shortVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Short =
      shortVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Short =
      shortVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Short =
      shortVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Short =
      shortVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Short =
      shortVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Short,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      shortVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Short,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      shortVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Short,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      shortVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Short,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      shortVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Short,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      shortVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Short,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      shortVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Short,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      shortVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Short,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      shortVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 1,
        expectedValue,
        newValue,
      )

  }

  implicit final class Short5Ops[L <: Layout](
      protected val vh: MemoryPtr5[L, Short],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Short =
      shortVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Short =
      shortVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Short =
      shortVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Short =
      shortVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Short =
      shortVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Short =
      shortVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Short =
      shortVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Short =
      shortVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Short,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      shortVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Short,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      shortVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Short,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      shortVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Short,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      shortVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Short,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      shortVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Short,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      shortVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Short,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      shortVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Short,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      shortVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 1,
        expectedValue,
        newValue,
      )

  }

  implicit final class Short6Ops[L <: Layout](
      protected val vh: MemoryPtr6[L, Short],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Short =
      shortVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Short =
      shortVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Short =
      shortVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Short =
      shortVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Short =
      shortVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Short =
      shortVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Short =
      shortVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Short =
      shortVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Short,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      shortVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Short,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      shortVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Short,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      shortVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Short,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      shortVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Short,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      shortVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Short,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      shortVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Short,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      shortVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Short,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      shortVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Short,
      newValue: Short,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      shortVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 1,
        expectedValue,
        newValue,
      )

  }

  implicit final class Char0Ops[L <: Layout](
      protected val vh: MemoryPtr0[L, Char],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R])(
      implicit
      region: Region[R],
    ): Char = charVh.get(mem.asJava, (vh.offset0) >> 1)

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](mem: Memory[L, R])(
      implicit
      region: Region[R],
    ): Char = charVh.getVolatile(mem.asJava, (vh.offset0) >> 1)

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](mem: Memory[L, R])(
      implicit
      region: Region[R],
    ): Char = charVh.getOpaque(mem.asJava, (vh.offset0) >> 1)

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](mem: Memory[L, R])(
      implicit
      region: Region[R],
    ): Char = charVh.getAcquire(mem.asJava, (vh.offset0) >> 1)

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Char)(
      implicit
      region: Region[R],
    ): Unit = charVh.set(mem.asJava, (vh.offset0) >> 1, value)

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](mem: Memory[L, R], value: Char)(
      implicit
      region: Region[R],
    ): Unit = charVh.setVolatile(mem.asJava, (vh.offset0) >> 1, value)

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](mem: Memory[L, R], value: Char)(
      implicit
      region: Region[R],
    ): Unit = charVh.setOpaque(mem.asJava, (vh.offset0) >> 1, value)

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](mem: Memory[L, R], value: Char)(
      implicit
      region: Region[R],
    ): Unit = charVh.setRelease(mem.asJava, (vh.offset0) >> 1, value)

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh
        .compareAndSet(mem.asJava, (vh.offset0) >> 1, expectedValue, newValue)

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0) >> 1,
        expectedValue,
        newValue,
      )

  }

  implicit final class Char1Ops[L <: Layout](
      protected val vh: MemoryPtr1[L, Char],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Long)(
      implicit
      region: Region[R],
    ): Char =
      charVh.get(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 1)

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int)(
      implicit
      region: Region[R],
    ): Char =
      charVh.get(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 1)

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](mem: Memory[L, R], x1: Long)(
      implicit
      region: Region[R],
    ): Char =
      charVh
        .getVolatile(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 1)

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](mem: Memory[L, R], x1: Int)(
      implicit
      region: Region[R],
    ): Char =
      charVh
        .getVolatile(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 1)

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](mem: Memory[L, R], x1: Long)(
      implicit
      region: Region[R],
    ): Char =
      charVh
        .getOpaque(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 1)

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](mem: Memory[L, R], x1: Int)(
      implicit
      region: Region[R],
    ): Char =
      charVh
        .getOpaque(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 1)

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](mem: Memory[L, R], x1: Long)(
      implicit
      region: Region[R],
    ): Char =
      charVh
        .getAcquire(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 1)

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](mem: Memory[L, R], x1: Int)(
      implicit
      region: Region[R],
    ): Char =
      charVh
        .getAcquire(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 1)

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Char, x1: Long)(
      implicit
      region: Region[R],
    ): Unit =
      charVh
        .set(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 1, value)

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Char, x1: Int)(
      implicit
      region: Region[R],
    ): Unit =
      charVh
        .set(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 1, value)

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](mem: Memory[L, R], value: Char, x1: Long)(
      implicit
      region: Region[R],
    ): Unit =
      charVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](mem: Memory[L, R], value: Char, x1: Int)(
      implicit
      region: Region[R],
    ): Unit =
      charVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](mem: Memory[L, R], value: Char, x1: Long)(
      implicit
      region: Region[R],
    ): Unit =
      charVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](mem: Memory[L, R], value: Char, x1: Int)(
      implicit
      region: Region[R],
    ): Unit =
      charVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](mem: Memory[L, R], value: Char, x1: Long)(
      implicit
      region: Region[R],
    ): Unit =
      charVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](mem: Memory[L, R], value: Char, x1: Int)(
      implicit
      region: Region[R],
    ): Unit =
      charVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
      x1: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
      x1: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
      x1: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
      x1: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
      x1: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
      x1: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
      x1: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
      x1: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 1,
        expectedValue,
        newValue,
      )

  }

  implicit final class Char2Ops[L <: Layout](
      protected val vh: MemoryPtr2[L, Char],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Long, x2: Long)(
      implicit
      region: Region[R],
    ): Char =
      charVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          1,
      )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Char =
      charVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          1,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](mem: Memory[L, R], x1: Long, x2: Long)(
      implicit
      region: Region[R],
    ): Char =
      charVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          1,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](mem: Memory[L, R], x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Char =
      charVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          1,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](mem: Memory[L, R], x1: Long, x2: Long)(
      implicit
      region: Region[R],
    ): Char =
      charVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          1,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](mem: Memory[L, R], x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Char =
      charVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          1,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](mem: Memory[L, R], x1: Long, x2: Long)(
      implicit
      region: Region[R],
    ): Char =
      charVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          1,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](mem: Memory[L, R], x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Char =
      charVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          1,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Char, x1: Long, x2: Long)(
      implicit
      region: Region[R],
    ): Unit =
      charVh.set(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Char, x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Unit =
      charVh.set(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Char,
      x1: Long,
      x2: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      charVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Char,
      x1: Int,
      x2: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      charVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Char,
      x1: Long,
      x2: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      charVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Char,
      x1: Int,
      x2: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      charVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Char,
      x1: Long,
      x2: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      charVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Char,
      x1: Int,
      x2: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      charVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
      x1: Long,
      x2: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
      x1: Int,
      x2: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
      x1: Long,
      x2: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
      x1: Int,
      x2: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
      x1: Long,
      x2: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
      x1: Int,
      x2: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
      x1: Long,
      x2: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
      x1: Int,
      x2: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          1,
        expectedValue,
        newValue,
      )

  }

  implicit final class Char3Ops[L <: Layout](
      protected val vh: MemoryPtr3[L, Char],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Long, x2: Long, x3: Long)(
      implicit
      region: Region[R],
    ): Char =
      charVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int, x2: Int, x3: Int)(
      implicit
      region: Region[R],
    ): Char =
      charVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Char =
      charVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](mem: Memory[L, R], x1: Int, x2: Int, x3: Int)(
      implicit
      region: Region[R],
    ): Char =
      charVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](mem: Memory[L, R], x1: Long, x2: Long, x3: Long)(
      implicit
      region: Region[R],
    ): Char =
      charVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](mem: Memory[L, R], x1: Int, x2: Int, x3: Int)(
      implicit
      region: Region[R],
    ): Char =
      charVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Char =
      charVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](mem: Memory[L, R], x1: Int, x2: Int, x3: Int)(
      implicit
      region: Region[R],
    ): Char =
      charVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Char,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      charVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Char,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      charVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Char,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      charVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Char,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      charVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Char,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      charVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Char,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      charVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Char,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      charVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Char,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      charVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 1,
        expectedValue,
        newValue,
      )

  }

  implicit final class Char4Ops[L <: Layout](
      protected val vh: MemoryPtr4[L, Char],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Char =
      charVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int, x2: Int, x3: Int, x4: Int)(
      implicit
      region: Region[R],
    ): Char =
      charVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Char =
      charVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Char =
      charVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Char =
      charVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Char =
      charVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Char =
      charVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Char =
      charVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Char,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      charVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Char,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      charVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Char,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      charVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Char,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      charVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Char,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      charVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Char,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      charVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Char,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      charVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Char,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      charVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 1,
        expectedValue,
        newValue,
      )

  }

  implicit final class Char5Ops[L <: Layout](
      protected val vh: MemoryPtr5[L, Char],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Char =
      charVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Char =
      charVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Char =
      charVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Char =
      charVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Char =
      charVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Char =
      charVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Char =
      charVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Char =
      charVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Char,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      charVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Char,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      charVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Char,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      charVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Char,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      charVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Char,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      charVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Char,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      charVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Char,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      charVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Char,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      charVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 1,
        expectedValue,
        newValue,
      )

  }

  implicit final class Char6Ops[L <: Layout](
      protected val vh: MemoryPtr6[L, Char],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Char =
      charVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Char =
      charVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Char =
      charVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Char =
      charVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Char =
      charVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Char =
      charVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Char =
      charVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Char =
      charVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 1,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Char,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      charVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Char,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      charVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Char,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      charVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Char,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      charVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Char,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      charVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Char,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      charVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Char,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      charVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Char,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      charVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 1,
        value,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 1,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Char,
      newValue: Char,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      charVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 1,
        expectedValue,
        newValue,
      )

  }

  implicit final class Int0Ops[L <: Layout](
      protected val vh: MemoryPtr0[L, Int],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R])(
      implicit
      region: Region[R],
    ): Int = intVh.get(mem.asJava, (vh.offset0) >> 2)

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](mem: Memory[L, R])(
      implicit
      region: Region[R],
    ): Int = intVh.getVolatile(mem.asJava, (vh.offset0) >> 2)

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](mem: Memory[L, R])(
      implicit
      region: Region[R],
    ): Int = intVh.getOpaque(mem.asJava, (vh.offset0) >> 2)

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](mem: Memory[L, R])(
      implicit
      region: Region[R],
    ): Int = intVh.getAcquire(mem.asJava, (vh.offset0) >> 2)

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Int)(
      implicit
      region: Region[R],
    ): Unit = intVh.set(mem.asJava, (vh.offset0) >> 2, value)

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](mem: Memory[L, R], value: Int)(
      implicit
      region: Region[R],
    ): Unit = intVh.setVolatile(mem.asJava, (vh.offset0) >> 2, value)

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](mem: Memory[L, R], value: Int)(
      implicit
      region: Region[R],
    ): Unit = intVh.setOpaque(mem.asJava, (vh.offset0) >> 2, value)

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](mem: Memory[L, R], value: Int)(
      implicit
      region: Region[R],
    ): Unit = intVh.setRelease(mem.asJava, (vh.offset0) >> 2, value)

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh
        .compareAndSet(mem.asJava, (vh.offset0) >> 2, expectedValue, newValue)

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0) >> 2,
        expectedValue,
        newValue,
      )

  }

  implicit final class Int1Ops[L <: Layout](
      protected val vh: MemoryPtr1[L, Int],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Long)(
      implicit
      region: Region[R],
    ): Int =
      intVh.get(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 2)

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int)(
      implicit
      region: Region[R],
    ): Int =
      intVh.get(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 2)

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](mem: Memory[L, R], x1: Long)(
      implicit
      region: Region[R],
    ): Int =
      intVh
        .getVolatile(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 2)

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](mem: Memory[L, R], x1: Int)(
      implicit
      region: Region[R],
    ): Int =
      intVh
        .getVolatile(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 2)

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](mem: Memory[L, R], x1: Long)(
      implicit
      region: Region[R],
    ): Int =
      intVh
        .getOpaque(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 2)

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](mem: Memory[L, R], x1: Int)(
      implicit
      region: Region[R],
    ): Int =
      intVh
        .getOpaque(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 2)

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](mem: Memory[L, R], x1: Long)(
      implicit
      region: Region[R],
    ): Int =
      intVh
        .getAcquire(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 2)

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](mem: Memory[L, R], x1: Int)(
      implicit
      region: Region[R],
    ): Int =
      intVh
        .getAcquire(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 2)

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Int, x1: Long)(
      implicit
      region: Region[R],
    ): Unit =
      intVh
        .set(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 2, value)

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Int, x1: Int)(
      implicit
      region: Region[R],
    ): Unit =
      intVh
        .set(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 2, value)

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](mem: Memory[L, R], value: Int, x1: Long)(
      implicit
      region: Region[R],
    ): Unit =
      intVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](mem: Memory[L, R], value: Int, x1: Int)(
      implicit
      region: Region[R],
    ): Unit =
      intVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](mem: Memory[L, R], value: Int, x1: Long)(
      implicit
      region: Region[R],
    ): Unit =
      intVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](mem: Memory[L, R], value: Int, x1: Int)(
      implicit
      region: Region[R],
    ): Unit =
      intVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](mem: Memory[L, R], value: Int, x1: Long)(
      implicit
      region: Region[R],
    ): Unit =
      intVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](mem: Memory[L, R], value: Int, x1: Int)(
      implicit
      region: Region[R],
    ): Unit =
      intVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
      x1: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
      x1: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
      x1: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
      x1: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
      x1: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
      x1: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
      x1: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
      x1: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 2,
        expectedValue,
        newValue,
      )

  }

  implicit final class Int2Ops[L <: Layout](
      protected val vh: MemoryPtr2[L, Int],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Long, x2: Long)(
      implicit
      region: Region[R],
    ): Int =
      intVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          2,
      )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Int =
      intVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          2,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](mem: Memory[L, R], x1: Long, x2: Long)(
      implicit
      region: Region[R],
    ): Int =
      intVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          2,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](mem: Memory[L, R], x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Int =
      intVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          2,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](mem: Memory[L, R], x1: Long, x2: Long)(
      implicit
      region: Region[R],
    ): Int =
      intVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          2,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](mem: Memory[L, R], x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Int =
      intVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          2,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](mem: Memory[L, R], x1: Long, x2: Long)(
      implicit
      region: Region[R],
    ): Int =
      intVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          2,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](mem: Memory[L, R], x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Int =
      intVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          2,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Int, x1: Long, x2: Long)(
      implicit
      region: Region[R],
    ): Unit =
      intVh.set(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Int, x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Unit =
      intVh.set(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Int,
      x1: Long,
      x2: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      intVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Int,
      x1: Int,
      x2: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      intVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Int,
      x1: Long,
      x2: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      intVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](mem: Memory[L, R], value: Int, x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Unit =
      intVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Int,
      x1: Long,
      x2: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      intVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Int,
      x1: Int,
      x2: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      intVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
      x1: Long,
      x2: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
      x1: Int,
      x2: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
      x1: Long,
      x2: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
      x1: Int,
      x2: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
      x1: Long,
      x2: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
      x1: Int,
      x2: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
      x1: Long,
      x2: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
      x1: Int,
      x2: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          2,
        expectedValue,
        newValue,
      )

  }

  implicit final class Int3Ops[L <: Layout](
      protected val vh: MemoryPtr3[L, Int],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Long, x2: Long, x3: Long)(
      implicit
      region: Region[R],
    ): Int =
      intVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int, x2: Int, x3: Int)(
      implicit
      region: Region[R],
    ): Int =
      intVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Int =
      intVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](mem: Memory[L, R], x1: Int, x2: Int, x3: Int)(
      implicit
      region: Region[R],
    ): Int =
      intVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](mem: Memory[L, R], x1: Long, x2: Long, x3: Long)(
      implicit
      region: Region[R],
    ): Int =
      intVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](mem: Memory[L, R], x1: Int, x2: Int, x3: Int)(
      implicit
      region: Region[R],
    ): Int =
      intVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Int =
      intVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](mem: Memory[L, R], x1: Int, x2: Int, x3: Int)(
      implicit
      region: Region[R],
    ): Int =
      intVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Int,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      intVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Int,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      intVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Int,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      intVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Int,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      intVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Int,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      intVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Int,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      intVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Int,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      intVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Int,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      intVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 2,
        expectedValue,
        newValue,
      )

  }

  implicit final class Int4Ops[L <: Layout](
      protected val vh: MemoryPtr4[L, Int],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Int =
      intVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int, x2: Int, x3: Int, x4: Int)(
      implicit
      region: Region[R],
    ): Int =
      intVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Int =
      intVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Int =
      intVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Int =
      intVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Int =
      intVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Int =
      intVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Int =
      intVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Int,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      intVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Int,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      intVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Int,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      intVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Int,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      intVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Int,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      intVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Int,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      intVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Int,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      intVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Int,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      intVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 2,
        expectedValue,
        newValue,
      )

  }

  implicit final class Int5Ops[L <: Layout](
      protected val vh: MemoryPtr5[L, Int],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Int =
      intVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Int =
      intVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Int =
      intVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Int =
      intVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Int =
      intVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Int =
      intVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Int =
      intVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Int =
      intVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Int,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      intVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Int,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      intVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Int,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      intVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Int,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      intVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Int,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      intVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Int,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      intVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Int,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      intVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Int,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      intVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 2,
        expectedValue,
        newValue,
      )

  }

  implicit final class Int6Ops[L <: Layout](
      protected val vh: MemoryPtr6[L, Int],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Int =
      intVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Int =
      intVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Int =
      intVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Int =
      intVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Int =
      intVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Int =
      intVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Int =
      intVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Int =
      intVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Int,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      intVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Int,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      intVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Int,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      intVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Int,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      intVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Int,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      intVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Int,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      intVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Int,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      intVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Int,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      intVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Int,
      newValue: Int,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      intVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 2,
        expectedValue,
        newValue,
      )

  }

  implicit final class Long0Ops[L <: Layout](
      protected val vh: MemoryPtr0[L, Long],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R])(
      implicit
      region: Region[R],
    ): Long = longVh.get(mem.asJava, (vh.offset0) >> 3)

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](mem: Memory[L, R])(
      implicit
      region: Region[R],
    ): Long = longVh.getVolatile(mem.asJava, (vh.offset0) >> 3)

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](mem: Memory[L, R])(
      implicit
      region: Region[R],
    ): Long = longVh.getOpaque(mem.asJava, (vh.offset0) >> 3)

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](mem: Memory[L, R])(
      implicit
      region: Region[R],
    ): Long = longVh.getAcquire(mem.asJava, (vh.offset0) >> 3)

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Long)(
      implicit
      region: Region[R],
    ): Unit = longVh.set(mem.asJava, (vh.offset0) >> 3, value)

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](mem: Memory[L, R], value: Long)(
      implicit
      region: Region[R],
    ): Unit = longVh.setVolatile(mem.asJava, (vh.offset0) >> 3, value)

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](mem: Memory[L, R], value: Long)(
      implicit
      region: Region[R],
    ): Unit = longVh.setOpaque(mem.asJava, (vh.offset0) >> 3, value)

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](mem: Memory[L, R], value: Long)(
      implicit
      region: Region[R],
    ): Unit = longVh.setRelease(mem.asJava, (vh.offset0) >> 3, value)

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh
        .compareAndSet(mem.asJava, (vh.offset0) >> 3, expectedValue, newValue)

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0) >> 3,
        expectedValue,
        newValue,
      )

  }

  implicit final class Long1Ops[L <: Layout](
      protected val vh: MemoryPtr1[L, Long],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Long)(
      implicit
      region: Region[R],
    ): Long =
      longVh.get(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 3)

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int)(
      implicit
      region: Region[R],
    ): Long =
      longVh.get(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 3)

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](mem: Memory[L, R], x1: Long)(
      implicit
      region: Region[R],
    ): Long =
      longVh
        .getVolatile(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 3)

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](mem: Memory[L, R], x1: Int)(
      implicit
      region: Region[R],
    ): Long =
      longVh
        .getVolatile(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 3)

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](mem: Memory[L, R], x1: Long)(
      implicit
      region: Region[R],
    ): Long =
      longVh
        .getOpaque(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 3)

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](mem: Memory[L, R], x1: Int)(
      implicit
      region: Region[R],
    ): Long =
      longVh
        .getOpaque(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 3)

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](mem: Memory[L, R], x1: Long)(
      implicit
      region: Region[R],
    ): Long =
      longVh
        .getAcquire(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 3)

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](mem: Memory[L, R], x1: Int)(
      implicit
      region: Region[R],
    ): Long =
      longVh
        .getAcquire(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 3)

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Long, x1: Long)(
      implicit
      region: Region[R],
    ): Unit =
      longVh
        .set(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 3, value)

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Long, x1: Int)(
      implicit
      region: Region[R],
    ): Unit =
      longVh
        .set(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 3, value)

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](mem: Memory[L, R], value: Long, x1: Long)(
      implicit
      region: Region[R],
    ): Unit =
      longVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](mem: Memory[L, R], value: Long, x1: Int)(
      implicit
      region: Region[R],
    ): Unit =
      longVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](mem: Memory[L, R], value: Long, x1: Long)(
      implicit
      region: Region[R],
    ): Unit =
      longVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](mem: Memory[L, R], value: Long, x1: Int)(
      implicit
      region: Region[R],
    ): Unit =
      longVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](mem: Memory[L, R], value: Long, x1: Long)(
      implicit
      region: Region[R],
    ): Unit =
      longVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](mem: Memory[L, R], value: Long, x1: Int)(
      implicit
      region: Region[R],
    ): Unit =
      longVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
      x1: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
      x1: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
      x1: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
      x1: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
      x1: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
      x1: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
      x1: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
      x1: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 3,
        expectedValue,
        newValue,
      )

  }

  implicit final class Long2Ops[L <: Layout](
      protected val vh: MemoryPtr2[L, Long],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Long, x2: Long)(
      implicit
      region: Region[R],
    ): Long =
      longVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          3,
      )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Long =
      longVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          3,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](mem: Memory[L, R], x1: Long, x2: Long)(
      implicit
      region: Region[R],
    ): Long =
      longVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          3,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](mem: Memory[L, R], x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Long =
      longVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          3,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](mem: Memory[L, R], x1: Long, x2: Long)(
      implicit
      region: Region[R],
    ): Long =
      longVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          3,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](mem: Memory[L, R], x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Long =
      longVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          3,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](mem: Memory[L, R], x1: Long, x2: Long)(
      implicit
      region: Region[R],
    ): Long =
      longVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          3,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](mem: Memory[L, R], x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Long =
      longVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          3,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Long, x1: Long, x2: Long)(
      implicit
      region: Region[R],
    ): Unit =
      longVh.set(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Long, x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Unit =
      longVh.set(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Long,
      x1: Long,
      x2: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      longVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Long,
      x1: Int,
      x2: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      longVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Long,
      x1: Long,
      x2: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      longVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Long,
      x1: Int,
      x2: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      longVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Long,
      x1: Long,
      x2: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      longVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Long,
      x1: Int,
      x2: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      longVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
      x1: Long,
      x2: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
      x1: Int,
      x2: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
      x1: Long,
      x2: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
      x1: Int,
      x2: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
      x1: Long,
      x2: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
      x1: Int,
      x2: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
      x1: Long,
      x2: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
      x1: Int,
      x2: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          3,
        expectedValue,
        newValue,
      )

  }

  implicit final class Long3Ops[L <: Layout](
      protected val vh: MemoryPtr3[L, Long],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Long, x2: Long, x3: Long)(
      implicit
      region: Region[R],
    ): Long =
      longVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int, x2: Int, x3: Int)(
      implicit
      region: Region[R],
    ): Long =
      longVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Long =
      longVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](mem: Memory[L, R], x1: Int, x2: Int, x3: Int)(
      implicit
      region: Region[R],
    ): Long =
      longVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](mem: Memory[L, R], x1: Long, x2: Long, x3: Long)(
      implicit
      region: Region[R],
    ): Long =
      longVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](mem: Memory[L, R], x1: Int, x2: Int, x3: Int)(
      implicit
      region: Region[R],
    ): Long =
      longVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Long =
      longVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](mem: Memory[L, R], x1: Int, x2: Int, x3: Int)(
      implicit
      region: Region[R],
    ): Long =
      longVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Long,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      longVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Long,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      longVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Long,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      longVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Long,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      longVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Long,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      longVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Long,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      longVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Long,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      longVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Long,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      longVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 3,
        expectedValue,
        newValue,
      )

  }

  implicit final class Long4Ops[L <: Layout](
      protected val vh: MemoryPtr4[L, Long],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Long =
      longVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int, x2: Int, x3: Int, x4: Int)(
      implicit
      region: Region[R],
    ): Long =
      longVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Long =
      longVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Long =
      longVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Long =
      longVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Long =
      longVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Long =
      longVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Long =
      longVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Long,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      longVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Long,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      longVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Long,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      longVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Long,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      longVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Long,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      longVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Long,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      longVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Long,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      longVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Long,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      longVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 3,
        expectedValue,
        newValue,
      )

  }

  implicit final class Long5Ops[L <: Layout](
      protected val vh: MemoryPtr5[L, Long],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Long =
      longVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Long =
      longVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Long =
      longVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Long =
      longVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Long =
      longVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Long =
      longVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Long =
      longVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Long =
      longVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Long,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      longVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Long,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      longVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Long,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      longVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Long,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      longVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Long,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      longVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Long,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      longVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Long,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      longVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Long,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      longVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 3,
        expectedValue,
        newValue,
      )

  }

  implicit final class Long6Ops[L <: Layout](
      protected val vh: MemoryPtr6[L, Long],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Long =
      longVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Long =
      longVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Long =
      longVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Long =
      longVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Long =
      longVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Long =
      longVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Long =
      longVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Long =
      longVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Long,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      longVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Long,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      longVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Long,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      longVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Long,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      longVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Long,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      longVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Long,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      longVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Long,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      longVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Long,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      longVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Long,
      newValue: Long,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      longVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 3,
        expectedValue,
        newValue,
      )

  }

  implicit final class Float0Ops[L <: Layout](
      protected val vh: MemoryPtr0[L, Float],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R])(
      implicit
      region: Region[R],
    ): Float = floatVh.get(mem.asJava, (vh.offset0) >> 2)

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](mem: Memory[L, R])(
      implicit
      region: Region[R],
    ): Float = floatVh.getVolatile(mem.asJava, (vh.offset0) >> 2)

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](mem: Memory[L, R])(
      implicit
      region: Region[R],
    ): Float = floatVh.getOpaque(mem.asJava, (vh.offset0) >> 2)

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](mem: Memory[L, R])(
      implicit
      region: Region[R],
    ): Float = floatVh.getAcquire(mem.asJava, (vh.offset0) >> 2)

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Float)(
      implicit
      region: Region[R],
    ): Unit = floatVh.set(mem.asJava, (vh.offset0) >> 2, value)

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](mem: Memory[L, R], value: Float)(
      implicit
      region: Region[R],
    ): Unit = floatVh.setVolatile(mem.asJava, (vh.offset0) >> 2, value)

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](mem: Memory[L, R], value: Float)(
      implicit
      region: Region[R],
    ): Unit = floatVh.setOpaque(mem.asJava, (vh.offset0) >> 2, value)

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](mem: Memory[L, R], value: Float)(
      implicit
      region: Region[R],
    ): Unit = floatVh.setRelease(mem.asJava, (vh.offset0) >> 2, value)

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh
        .compareAndSet(mem.asJava, (vh.offset0) >> 2, expectedValue, newValue)

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0) >> 2,
        expectedValue,
        newValue,
      )

  }

  implicit final class Float1Ops[L <: Layout](
      protected val vh: MemoryPtr1[L, Float],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Long)(
      implicit
      region: Region[R],
    ): Float =
      floatVh.get(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 2)

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int)(
      implicit
      region: Region[R],
    ): Float =
      floatVh.get(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 2)

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](mem: Memory[L, R], x1: Long)(
      implicit
      region: Region[R],
    ): Float =
      floatVh
        .getVolatile(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 2)

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](mem: Memory[L, R], x1: Int)(
      implicit
      region: Region[R],
    ): Float =
      floatVh
        .getVolatile(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 2)

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](mem: Memory[L, R], x1: Long)(
      implicit
      region: Region[R],
    ): Float =
      floatVh
        .getOpaque(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 2)

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](mem: Memory[L, R], x1: Int)(
      implicit
      region: Region[R],
    ): Float =
      floatVh
        .getOpaque(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 2)

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](mem: Memory[L, R], x1: Long)(
      implicit
      region: Region[R],
    ): Float =
      floatVh
        .getAcquire(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 2)

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](mem: Memory[L, R], x1: Int)(
      implicit
      region: Region[R],
    ): Float =
      floatVh
        .getAcquire(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 2)

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Float, x1: Long)(
      implicit
      region: Region[R],
    ): Unit =
      floatVh
        .set(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 2, value)

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Float, x1: Int)(
      implicit
      region: Region[R],
    ): Unit =
      floatVh
        .set(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 2, value)

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](mem: Memory[L, R], value: Float, x1: Long)(
      implicit
      region: Region[R],
    ): Unit =
      floatVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](mem: Memory[L, R], value: Float, x1: Int)(
      implicit
      region: Region[R],
    ): Unit =
      floatVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](mem: Memory[L, R], value: Float, x1: Long)(
      implicit
      region: Region[R],
    ): Unit =
      floatVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](mem: Memory[L, R], value: Float, x1: Int)(
      implicit
      region: Region[R],
    ): Unit =
      floatVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](mem: Memory[L, R], value: Float, x1: Long)(
      implicit
      region: Region[R],
    ): Unit =
      floatVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](mem: Memory[L, R], value: Float, x1: Int)(
      implicit
      region: Region[R],
    ): Unit =
      floatVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
      x1: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
      x1: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
      x1: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
      x1: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
      x1: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
      x1: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
      x1: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
      x1: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 2,
        expectedValue,
        newValue,
      )

  }

  implicit final class Float2Ops[L <: Layout](
      protected val vh: MemoryPtr2[L, Float],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Long, x2: Long)(
      implicit
      region: Region[R],
    ): Float =
      floatVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          2,
      )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Float =
      floatVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          2,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](mem: Memory[L, R], x1: Long, x2: Long)(
      implicit
      region: Region[R],
    ): Float =
      floatVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          2,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](mem: Memory[L, R], x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Float =
      floatVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          2,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](mem: Memory[L, R], x1: Long, x2: Long)(
      implicit
      region: Region[R],
    ): Float =
      floatVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          2,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](mem: Memory[L, R], x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Float =
      floatVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          2,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](mem: Memory[L, R], x1: Long, x2: Long)(
      implicit
      region: Region[R],
    ): Float =
      floatVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          2,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](mem: Memory[L, R], x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Float =
      floatVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          2,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Float, x1: Long, x2: Long)(
      implicit
      region: Region[R],
    ): Unit =
      floatVh.set(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Float, x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Unit =
      floatVh.set(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Float,
      x1: Long,
      x2: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      floatVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Float,
      x1: Int,
      x2: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      floatVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Float,
      x1: Long,
      x2: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      floatVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Float,
      x1: Int,
      x2: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      floatVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Float,
      x1: Long,
      x2: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      floatVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Float,
      x1: Int,
      x2: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      floatVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
      x1: Long,
      x2: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
      x1: Int,
      x2: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
      x1: Long,
      x2: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
      x1: Int,
      x2: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
      x1: Long,
      x2: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
      x1: Int,
      x2: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
      x1: Long,
      x2: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
      x1: Int,
      x2: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          2,
        expectedValue,
        newValue,
      )

  }

  implicit final class Float3Ops[L <: Layout](
      protected val vh: MemoryPtr3[L, Float],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Long, x2: Long, x3: Long)(
      implicit
      region: Region[R],
    ): Float =
      floatVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int, x2: Int, x3: Int)(
      implicit
      region: Region[R],
    ): Float =
      floatVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Float =
      floatVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](mem: Memory[L, R], x1: Int, x2: Int, x3: Int)(
      implicit
      region: Region[R],
    ): Float =
      floatVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](mem: Memory[L, R], x1: Long, x2: Long, x3: Long)(
      implicit
      region: Region[R],
    ): Float =
      floatVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](mem: Memory[L, R], x1: Int, x2: Int, x3: Int)(
      implicit
      region: Region[R],
    ): Float =
      floatVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Float =
      floatVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](mem: Memory[L, R], x1: Int, x2: Int, x3: Int)(
      implicit
      region: Region[R],
    ): Float =
      floatVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Float,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      floatVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Float,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      floatVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Float,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      floatVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Float,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      floatVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Float,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      floatVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Float,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      floatVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Float,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      floatVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Float,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      floatVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 2,
        expectedValue,
        newValue,
      )

  }

  implicit final class Float4Ops[L <: Layout](
      protected val vh: MemoryPtr4[L, Float],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Float =
      floatVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int, x2: Int, x3: Int, x4: Int)(
      implicit
      region: Region[R],
    ): Float =
      floatVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Float =
      floatVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Float =
      floatVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Float =
      floatVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Float =
      floatVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Float =
      floatVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Float =
      floatVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Float,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      floatVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Float,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      floatVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Float,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      floatVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Float,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      floatVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Float,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      floatVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Float,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      floatVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Float,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      floatVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Float,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      floatVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 2,
        expectedValue,
        newValue,
      )

  }

  implicit final class Float5Ops[L <: Layout](
      protected val vh: MemoryPtr5[L, Float],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Float =
      floatVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Float =
      floatVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Float =
      floatVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Float =
      floatVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Float =
      floatVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Float =
      floatVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Float =
      floatVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Float =
      floatVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Float,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      floatVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Float,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      floatVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Float,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      floatVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Float,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      floatVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Float,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      floatVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Float,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      floatVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Float,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      floatVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Float,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      floatVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 2,
        expectedValue,
        newValue,
      )

  }

  implicit final class Float6Ops[L <: Layout](
      protected val vh: MemoryPtr6[L, Float],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Float =
      floatVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Float =
      floatVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Float =
      floatVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Float =
      floatVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Float =
      floatVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Float =
      floatVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Float =
      floatVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Float =
      floatVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 2,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Float,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      floatVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Float,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      floatVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Float,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      floatVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Float,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      floatVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Float,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      floatVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Float,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      floatVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Float,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      floatVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Float,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      floatVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 2,
        value,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 2,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Float,
      newValue: Float,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      floatVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 2,
        expectedValue,
        newValue,
      )

  }

  implicit final class Double0Ops[L <: Layout](
      protected val vh: MemoryPtr0[L, Double],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R])(
      implicit
      region: Region[R],
    ): Double = doubleVh.get(mem.asJava, (vh.offset0) >> 3)

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](mem: Memory[L, R])(
      implicit
      region: Region[R],
    ): Double = doubleVh.getVolatile(mem.asJava, (vh.offset0) >> 3)

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](mem: Memory[L, R])(
      implicit
      region: Region[R],
    ): Double = doubleVh.getOpaque(mem.asJava, (vh.offset0) >> 3)

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](mem: Memory[L, R])(
      implicit
      region: Region[R],
    ): Double = doubleVh.getAcquire(mem.asJava, (vh.offset0) >> 3)

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Double)(
      implicit
      region: Region[R],
    ): Unit = doubleVh.set(mem.asJava, (vh.offset0) >> 3, value)

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](mem: Memory[L, R], value: Double)(
      implicit
      region: Region[R],
    ): Unit = doubleVh.setVolatile(mem.asJava, (vh.offset0) >> 3, value)

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](mem: Memory[L, R], value: Double)(
      implicit
      region: Region[R],
    ): Unit = doubleVh.setOpaque(mem.asJava, (vh.offset0) >> 3, value)

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](mem: Memory[L, R], value: Double)(
      implicit
      region: Region[R],
    ): Unit = doubleVh.setRelease(mem.asJava, (vh.offset0) >> 3, value)

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh
        .compareAndSet(mem.asJava, (vh.offset0) >> 3, expectedValue, newValue)

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0) >> 3,
        expectedValue,
        newValue,
      )

  }

  implicit final class Double1Ops[L <: Layout](
      protected val vh: MemoryPtr1[L, Double],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Long)(
      implicit
      region: Region[R],
    ): Double =
      doubleVh.get(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 3)

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int)(
      implicit
      region: Region[R],
    ): Double =
      doubleVh.get(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 3)

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](mem: Memory[L, R], x1: Long)(
      implicit
      region: Region[R],
    ): Double =
      doubleVh
        .getVolatile(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 3)

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](mem: Memory[L, R], x1: Int)(
      implicit
      region: Region[R],
    ): Double =
      doubleVh
        .getVolatile(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 3)

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](mem: Memory[L, R], x1: Long)(
      implicit
      region: Region[R],
    ): Double =
      doubleVh
        .getOpaque(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 3)

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](mem: Memory[L, R], x1: Int)(
      implicit
      region: Region[R],
    ): Double =
      doubleVh
        .getOpaque(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 3)

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](mem: Memory[L, R], x1: Long)(
      implicit
      region: Region[R],
    ): Double =
      doubleVh
        .getAcquire(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 3)

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](mem: Memory[L, R], x1: Int)(
      implicit
      region: Region[R],
    ): Double =
      doubleVh
        .getAcquire(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 3)

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Double, x1: Long)(
      implicit
      region: Region[R],
    ): Unit =
      doubleVh
        .set(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 3, value)

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Double, x1: Int)(
      implicit
      region: Region[R],
    ): Unit =
      doubleVh
        .set(mem.asJava, (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 3, value)

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](mem: Memory[L, R], value: Double, x1: Long)(
      implicit
      region: Region[R],
    ): Unit =
      doubleVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](mem: Memory[L, R], value: Double, x1: Int)(
      implicit
      region: Region[R],
    ): Unit =
      doubleVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](mem: Memory[L, R], value: Double, x1: Long)(
      implicit
      region: Region[R],
    ): Unit =
      doubleVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](mem: Memory[L, R], value: Double, x1: Int)(
      implicit
      region: Region[R],
    ): Unit =
      doubleVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](mem: Memory[L, R], value: Double, x1: Long)(
      implicit
      region: Region[R],
    ): Unit =
      doubleVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](mem: Memory[L, R], value: Double, x1: Int)(
      implicit
      region: Region[R],
    ): Unit =
      doubleVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
      x1: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
      x1: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
      x1: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
      x1: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
      x1: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
      x1: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
      x1: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
      x1: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1) >> 3,
        expectedValue,
        newValue,
      )

  }

  implicit final class Double2Ops[L <: Layout](
      protected val vh: MemoryPtr2[L, Double],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Long, x2: Long)(
      implicit
      region: Region[R],
    ): Double =
      doubleVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          3,
      )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Double =
      doubleVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          3,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](mem: Memory[L, R], x1: Long, x2: Long)(
      implicit
      region: Region[R],
    ): Double =
      doubleVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          3,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](mem: Memory[L, R], x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Double =
      doubleVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          3,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](mem: Memory[L, R], x1: Long, x2: Long)(
      implicit
      region: Region[R],
    ): Double =
      doubleVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          3,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](mem: Memory[L, R], x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Double =
      doubleVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          3,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](mem: Memory[L, R], x1: Long, x2: Long)(
      implicit
      region: Region[R],
    ): Double =
      doubleVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          3,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](mem: Memory[L, R], x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Double =
      doubleVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
          .offset2) >>
          3,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Double, x1: Long, x2: Long)(
      implicit
      region: Region[R],
    ): Unit =
      doubleVh.set(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Double, x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Unit =
      doubleVh.set(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Double,
      x1: Long,
      x2: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      doubleVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Double,
      x1: Int,
      x2: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      doubleVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Double,
      x1: Long,
      x2: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      doubleVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Double,
      x1: Int,
      x2: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      doubleVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Double,
      x1: Long,
      x2: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      doubleVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Double,
      x1: Int,
      x2: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      doubleVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh
          .step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2) >>
          3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
      x1: Long,
      x2: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
      x1: Int,
      x2: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
      x1: Long,
      x2: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
      x1: Int,
      x2: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
      x1: Long,
      x2: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
      x1: Int,
      x2: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
      x1: Long,
      x2: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
      x1: Int,
      x2: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh
          .offset1 + vh.step2 * x2 + vh.offset2) >>
          3,
        expectedValue,
        newValue,
      )

  }

  implicit final class Double3Ops[L <: Layout](
      protected val vh: MemoryPtr3[L, Double],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Long, x2: Long, x3: Long)(
      implicit
      region: Region[R],
    ): Double =
      doubleVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int, x2: Int, x3: Int)(
      implicit
      region: Region[R],
    ): Double =
      doubleVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Double =
      doubleVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](mem: Memory[L, R], x1: Int, x2: Int, x3: Int)(
      implicit
      region: Region[R],
    ): Double =
      doubleVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](mem: Memory[L, R], x1: Long, x2: Long, x3: Long)(
      implicit
      region: Region[R],
    ): Double =
      doubleVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](mem: Memory[L, R], x1: Int, x2: Int, x3: Int)(
      implicit
      region: Region[R],
    ): Double =
      doubleVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Double =
      doubleVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](mem: Memory[L, R], x1: Int, x2: Int, x3: Int)(
      implicit
      region: Region[R],
    ): Double =
      doubleVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Double,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      doubleVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Double,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      doubleVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Double,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      doubleVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Double,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      doubleVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Double,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      doubleVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Double,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      doubleVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Double,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      doubleVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Double,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      doubleVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
      x1: Long,
      x2: Long,
      x3: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
      x1: Int,
      x2: Int,
      x3: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3) >> 3,
        expectedValue,
        newValue,
      )

  }

  implicit final class Double4Ops[L <: Layout](
      protected val vh: MemoryPtr4[L, Double],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Double =
      doubleVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int, x2: Int, x3: Int, x4: Int)(
      implicit
      region: Region[R],
    ): Double =
      doubleVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Double =
      doubleVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Double =
      doubleVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Double =
      doubleVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Double =
      doubleVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Double =
      doubleVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Double =
      doubleVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Double,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      doubleVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Double,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      doubleVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Double,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      doubleVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Double,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      doubleVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Double,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      doubleVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Double,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      doubleVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Double,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      doubleVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Double,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      doubleVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4) >> 3,
        expectedValue,
        newValue,
      )

  }

  implicit final class Double5Ops[L <: Layout](
      protected val vh: MemoryPtr5[L, Double],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Double =
      doubleVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Double =
      doubleVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Double =
      doubleVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Double =
      doubleVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Double =
      doubleVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Double =
      doubleVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Double =
      doubleVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Double =
      doubleVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Double,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      doubleVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Double,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      doubleVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Double,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      doubleVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Double,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      doubleVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Double,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      doubleVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Double,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      doubleVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Double,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      doubleVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Double,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      doubleVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5) >> 3,
        expectedValue,
        newValue,
      )

  }

  implicit final class Double6Ops[L <: Layout](
      protected val vh: MemoryPtr6[L, Double],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Double =
      doubleVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Double =
      doubleVh.get(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Double =
      doubleVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def getVolatile[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Double =
      doubleVh.getVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Double =
      doubleVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def getOpaque[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Double =
      doubleVh.getOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](
      mem: Memory[L, R],
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Double =
      doubleVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def getAcquire[R <: Global](
      mem: Memory[L, R],
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Double =
      doubleVh.getAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 3,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Double,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      doubleVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](
      mem: Memory[L, R],
      value: Double,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      doubleVh.set(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Double,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      doubleVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setVolatile[R <: Global](
      mem: Memory[L, R],
      value: Double,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      doubleVh.setVolatile(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Double,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      doubleVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setOpaque[R <: Global](
      mem: Memory[L, R],
      value: Double,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      doubleVh.setOpaque(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Double,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      doubleVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def setRelease[R <: Global](
      mem: Memory[L, R],
      value: Double,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      doubleVh.setRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 3,
        value,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def compareAndSet[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.compareAndSet(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetPlain[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.weakCompareAndSetPlain(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetAcquire[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.weakCompareAndSetAcquire(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
      x1: Long,
      x2: Long,
      x3: Long,
      x4: Long,
      x5: Long,
      x6: Long,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 3,
        expectedValue,
        newValue,
      )

    @IntrinsicCandidate
    @inline
    def weakCompareAndSetRelease[R <: Global](
      mem: Memory[L, R],
      expectedValue: Double,
      newValue: Double,
      x1: Int,
      x2: Int,
      x3: Int,
      x4: Int,
      x5: Int,
      x6: Int,
    )(
      implicit
      region: Region[R],
    ): Boolean =
      doubleVh.weakCompareAndSetRelease(
        mem.asJava,
        (vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2 +
          vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4 +
          vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6) >> 3,
        expectedValue,
        newValue,
      )

  }

}
