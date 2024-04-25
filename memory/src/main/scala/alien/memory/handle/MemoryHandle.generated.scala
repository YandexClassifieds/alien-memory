package alien.memory.handle

import alien.memory.{Global, Layout, Memory, Region}
import jdk.internal.vm.annotation.IntrinsicCandidate

import java.lang.foreign.ValueLayout

object MemoryHandle {

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

    implicit def byte7Ops[L <: Layout](vh: MemoryPtr7[L, Byte]): Byte7Ops[L] =
      Byte7Ops(vh)

    implicit def byte8Ops[L <: Layout](vh: MemoryPtr8[L, Byte]): Byte8Ops[L] =
      Byte8Ops(vh)

    implicit def byte9Ops[L <: Layout](vh: MemoryPtr9[L, Byte]): Byte9Ops[L] =
      Byte9Ops(vh)

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

    implicit def short7Ops[L <: Layout](
      vh: MemoryPtr7[L, Short],
    ): Short7Ops[L] = Short7Ops(vh)

    implicit def short8Ops[L <: Layout](
      vh: MemoryPtr8[L, Short],
    ): Short8Ops[L] = Short8Ops(vh)

    implicit def short9Ops[L <: Layout](
      vh: MemoryPtr9[L, Short],
    ): Short9Ops[L] = Short9Ops(vh)

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

    implicit def char7Ops[L <: Layout](vh: MemoryPtr7[L, Char]): Char7Ops[L] =
      Char7Ops(vh)

    implicit def char8Ops[L <: Layout](vh: MemoryPtr8[L, Char]): Char8Ops[L] =
      Char8Ops(vh)

    implicit def char9Ops[L <: Layout](vh: MemoryPtr9[L, Char]): Char9Ops[L] =
      Char9Ops(vh)

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

    implicit def int7Ops[L <: Layout](vh: MemoryPtr7[L, Int]): Int7Ops[L] =
      Int7Ops(vh)

    implicit def int8Ops[L <: Layout](vh: MemoryPtr8[L, Int]): Int8Ops[L] =
      Int8Ops(vh)

    implicit def int9Ops[L <: Layout](vh: MemoryPtr9[L, Int]): Int9Ops[L] =
      Int9Ops(vh)

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

    implicit def long7Ops[L <: Layout](vh: MemoryPtr7[L, Long]): Long7Ops[L] =
      Long7Ops(vh)

    implicit def long8Ops[L <: Layout](vh: MemoryPtr8[L, Long]): Long8Ops[L] =
      Long8Ops(vh)

    implicit def long9Ops[L <: Layout](vh: MemoryPtr9[L, Long]): Long9Ops[L] =
      Long9Ops(vh)

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

    implicit def float7Ops[L <: Layout](
      vh: MemoryPtr7[L, Float],
    ): Float7Ops[L] = Float7Ops(vh)

    implicit def float8Ops[L <: Layout](
      vh: MemoryPtr8[L, Float],
    ): Float8Ops[L] = Float8Ops(vh)

    implicit def float9Ops[L <: Layout](
      vh: MemoryPtr9[L, Float],
    ): Float9Ops[L] = Float9Ops(vh)

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

    implicit def double7Ops[L <: Layout](
      vh: MemoryPtr7[L, Double],
    ): Double7Ops[L] = Double7Ops(vh)

    implicit def double8Ops[L <: Layout](
      vh: MemoryPtr8[L, Double],
    ): Double8Ops[L] = Double8Ops(vh)

    implicit def double9Ops[L <: Layout](
      vh: MemoryPtr9[L, Double],
    ): Double9Ops[L] = Double9Ops(vh)

  }

  implicit final class Byte0Ops[L <: Layout](
      protected val vh: MemoryPtr0[L, Byte],
  ) extends AnyVal {

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R])(
      implicit
      region: Region[R],
    ): Byte = mem.asJava.get(ValueLayout.JAVA_BYTE, vh.offset0)

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Byte)(
      implicit
      region: Region[R],
    ): Unit = mem.asJava.set(ValueLayout.JAVA_BYTE, vh.offset0, value)

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
      mem
        .asJava
        .get(ValueLayout.JAVA_BYTE, vh.offset0 + vh.step1 * x1 + vh.offset1)

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int)(
      implicit
      region: Region[R],
    ): Byte =
      mem
        .asJava
        .get(ValueLayout.JAVA_BYTE, vh.offset0 + vh.step1 * x1 + vh.offset1)

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Byte, x1: Long)(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_BYTE,
          vh.offset0 + vh.step1 * x1 + vh.offset1,
          value,
        )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Byte, x1: Int)(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_BYTE,
          vh.offset0 + vh.step1 * x1 + vh.offset1,
          value,
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
      mem
        .asJava
        .get(
          ValueLayout.JAVA_BYTE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2,
        )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Byte =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_BYTE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2,
        )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Byte, x1: Long, x2: Long)(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_BYTE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2,
          value,
        )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Byte, x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_BYTE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2,
          value,
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
      mem
        .asJava
        .get(
          ValueLayout.JAVA_BYTE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3,
        )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int, x2: Int, x3: Int)(
      implicit
      region: Region[R],
    ): Byte =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_BYTE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_BYTE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh
            .step2 * x2 + vh.offset2 + vh.step3 * x3 + vh.offset3,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_BYTE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh
            .step2 * x2 + vh.offset2 + vh.step3 * x3 + vh.offset3,
          value,
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
      mem
        .asJava
        .get(
          ValueLayout.JAVA_BYTE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4,
        )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int, x2: Int, x3: Int, x4: Int)(
      implicit
      region: Region[R],
    ): Byte =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_BYTE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_BYTE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_BYTE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4,
          value,
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
      mem
        .asJava
        .get(
          ValueLayout.JAVA_BYTE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5,
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
      mem
        .asJava
        .get(
          ValueLayout.JAVA_BYTE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_BYTE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh
            .step2 * x2 + vh.offset2 + vh.step3 * x3 + vh
            .offset3 + vh.step4 * x4 + vh.offset4 + vh.step5 * x5 + vh.offset5,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_BYTE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh
            .step2 * x2 + vh.offset2 + vh.step3 * x3 + vh
            .offset3 + vh.step4 * x4 + vh.offset4 + vh.step5 * x5 + vh.offset5,
          value,
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
      mem
        .asJava
        .get(
          ValueLayout.JAVA_BYTE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6,
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
      mem
        .asJava
        .get(
          ValueLayout.JAVA_BYTE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_BYTE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_BYTE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6,
          value,
        )

  }

  implicit final class Byte7Ops[L <: Layout](
      protected val vh: MemoryPtr7[L, Byte],
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
      x7: Long,
    )(
      implicit
      region: Region[R],
    ): Byte =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_BYTE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7,
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
      x7: Int,
    )(
      implicit
      region: Region[R],
    ): Byte =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_BYTE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7,
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
      x7: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_BYTE,
          vh.offset0 + vh.step1 * x1 + vh
            .offset1 + vh.step2 * x2 + vh.offset2 + vh.step3 * x3 + vh
            .offset3 + vh.step4 * x4 + vh.offset4 + vh.step5 * x5 + vh
            .offset5 + vh.step6 * x6 + vh.offset6 + vh.step7 * x7 + vh.offset7,
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
      x7: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_BYTE,
          vh.offset0 + vh.step1 * x1 + vh
            .offset1 + vh.step2 * x2 + vh.offset2 + vh.step3 * x3 + vh
            .offset3 + vh.step4 * x4 + vh.offset4 + vh.step5 * x5 + vh
            .offset5 + vh.step6 * x6 + vh.offset6 + vh.step7 * x7 + vh.offset7,
          value,
        )

  }

  implicit final class Byte8Ops[L <: Layout](
      protected val vh: MemoryPtr8[L, Byte],
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
      x7: Long,
      x8: Long,
    )(
      implicit
      region: Region[R],
    ): Byte =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_BYTE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7 + vh.step8 * x8 + vh.offset8,
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
      x7: Int,
      x8: Int,
    )(
      implicit
      region: Region[R],
    ): Byte =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_BYTE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7 + vh.step8 * x8 + vh.offset8,
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
      x7: Long,
      x8: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_BYTE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7 + vh.step8 * x8 + vh.offset8,
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
      x7: Int,
      x8: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_BYTE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7 + vh.step8 * x8 + vh.offset8,
          value,
        )

  }

  implicit final class Byte9Ops[L <: Layout](
      protected val vh: MemoryPtr9[L, Byte],
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
      x7: Long,
      x8: Long,
      x9: Long,
    )(
      implicit
      region: Region[R],
    ): Byte =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_BYTE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7 + vh.step8 * x8 + vh
            .offset8 + vh.step9 * x9 + vh.offset9,
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
      x7: Int,
      x8: Int,
      x9: Int,
    )(
      implicit
      region: Region[R],
    ): Byte =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_BYTE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7 + vh.step8 * x8 + vh
            .offset8 + vh.step9 * x9 + vh.offset9,
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
      x7: Long,
      x8: Long,
      x9: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_BYTE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh
            .step4 * x4 + vh.offset4 + vh.step5 * x5 + vh
            .offset5 + vh.step6 * x6 + vh.offset6 + vh.step7 * x7 + vh
            .offset7 + vh.step8 * x8 + vh.offset8 + vh.step9 * x9 + vh.offset9,
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
      x7: Int,
      x8: Int,
      x9: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_BYTE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh
            .step4 * x4 + vh.offset4 + vh.step5 * x5 + vh
            .offset5 + vh.step6 * x6 + vh.offset6 + vh.step7 * x7 + vh
            .offset7 + vh.step8 * x8 + vh.offset8 + vh.step9 * x9 + vh.offset9,
          value,
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
    ): Short = mem.asJava.get(ValueLayout.JAVA_SHORT, vh.offset0)

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Short)(
      implicit
      region: Region[R],
    ): Unit = mem.asJava.set(ValueLayout.JAVA_SHORT, vh.offset0, value)

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
      mem
        .asJava
        .get(ValueLayout.JAVA_SHORT, vh.offset0 + vh.step1 * x1 + vh.offset1)

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int)(
      implicit
      region: Region[R],
    ): Short =
      mem
        .asJava
        .get(ValueLayout.JAVA_SHORT, vh.offset0 + vh.step1 * x1 + vh.offset1)

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Short, x1: Long)(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_SHORT,
          vh.offset0 + vh.step1 * x1 + vh.offset1,
          value,
        )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Short, x1: Int)(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_SHORT,
          vh.offset0 + vh.step1 * x1 + vh.offset1,
          value,
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
      mem
        .asJava
        .get(
          ValueLayout.JAVA_SHORT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2,
        )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Short =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_SHORT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2,
        )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Short, x1: Long, x2: Long)(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_SHORT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2,
          value,
        )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Short, x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_SHORT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2,
          value,
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
      mem
        .asJava
        .get(
          ValueLayout.JAVA_SHORT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3,
        )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int, x2: Int, x3: Int)(
      implicit
      region: Region[R],
    ): Short =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_SHORT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_SHORT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh
            .step2 * x2 + vh.offset2 + vh.step3 * x3 + vh.offset3,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_SHORT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh
            .step2 * x2 + vh.offset2 + vh.step3 * x3 + vh.offset3,
          value,
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
      mem
        .asJava
        .get(
          ValueLayout.JAVA_SHORT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4,
        )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int, x2: Int, x3: Int, x4: Int)(
      implicit
      region: Region[R],
    ): Short =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_SHORT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_SHORT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_SHORT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4,
          value,
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
      mem
        .asJava
        .get(
          ValueLayout.JAVA_SHORT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5,
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
      mem
        .asJava
        .get(
          ValueLayout.JAVA_SHORT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_SHORT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh
            .step2 * x2 + vh.offset2 + vh.step3 * x3 + vh
            .offset3 + vh.step4 * x4 + vh.offset4 + vh.step5 * x5 + vh.offset5,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_SHORT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh
            .step2 * x2 + vh.offset2 + vh.step3 * x3 + vh
            .offset3 + vh.step4 * x4 + vh.offset4 + vh.step5 * x5 + vh.offset5,
          value,
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
      mem
        .asJava
        .get(
          ValueLayout.JAVA_SHORT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6,
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
      mem
        .asJava
        .get(
          ValueLayout.JAVA_SHORT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_SHORT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_SHORT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6,
          value,
        )

  }

  implicit final class Short7Ops[L <: Layout](
      protected val vh: MemoryPtr7[L, Short],
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
      x7: Long,
    )(
      implicit
      region: Region[R],
    ): Short =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_SHORT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7,
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
      x7: Int,
    )(
      implicit
      region: Region[R],
    ): Short =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_SHORT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7,
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
      x7: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_SHORT,
          vh.offset0 + vh.step1 * x1 + vh
            .offset1 + vh.step2 * x2 + vh.offset2 + vh.step3 * x3 + vh
            .offset3 + vh.step4 * x4 + vh.offset4 + vh.step5 * x5 + vh
            .offset5 + vh.step6 * x6 + vh.offset6 + vh.step7 * x7 + vh.offset7,
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
      x7: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_SHORT,
          vh.offset0 + vh.step1 * x1 + vh
            .offset1 + vh.step2 * x2 + vh.offset2 + vh.step3 * x3 + vh
            .offset3 + vh.step4 * x4 + vh.offset4 + vh.step5 * x5 + vh
            .offset5 + vh.step6 * x6 + vh.offset6 + vh.step7 * x7 + vh.offset7,
          value,
        )

  }

  implicit final class Short8Ops[L <: Layout](
      protected val vh: MemoryPtr8[L, Short],
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
      x7: Long,
      x8: Long,
    )(
      implicit
      region: Region[R],
    ): Short =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_SHORT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7 + vh.step8 * x8 + vh.offset8,
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
      x7: Int,
      x8: Int,
    )(
      implicit
      region: Region[R],
    ): Short =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_SHORT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7 + vh.step8 * x8 + vh.offset8,
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
      x7: Long,
      x8: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_SHORT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7 + vh.step8 * x8 + vh.offset8,
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
      x7: Int,
      x8: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_SHORT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7 + vh.step8 * x8 + vh.offset8,
          value,
        )

  }

  implicit final class Short9Ops[L <: Layout](
      protected val vh: MemoryPtr9[L, Short],
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
      x7: Long,
      x8: Long,
      x9: Long,
    )(
      implicit
      region: Region[R],
    ): Short =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_SHORT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7 + vh.step8 * x8 + vh
            .offset8 + vh.step9 * x9 + vh.offset9,
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
      x7: Int,
      x8: Int,
      x9: Int,
    )(
      implicit
      region: Region[R],
    ): Short =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_SHORT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7 + vh.step8 * x8 + vh
            .offset8 + vh.step9 * x9 + vh.offset9,
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
      x7: Long,
      x8: Long,
      x9: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_SHORT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh
            .step4 * x4 + vh.offset4 + vh.step5 * x5 + vh
            .offset5 + vh.step6 * x6 + vh.offset6 + vh.step7 * x7 + vh
            .offset7 + vh.step8 * x8 + vh.offset8 + vh.step9 * x9 + vh.offset9,
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
      x7: Int,
      x8: Int,
      x9: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_SHORT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh
            .step4 * x4 + vh.offset4 + vh.step5 * x5 + vh
            .offset5 + vh.step6 * x6 + vh.offset6 + vh.step7 * x7 + vh
            .offset7 + vh.step8 * x8 + vh.offset8 + vh.step9 * x9 + vh.offset9,
          value,
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
    ): Char = mem.asJava.get(ValueLayout.JAVA_CHAR, vh.offset0)

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Char)(
      implicit
      region: Region[R],
    ): Unit = mem.asJava.set(ValueLayout.JAVA_CHAR, vh.offset0, value)

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
      mem
        .asJava
        .get(ValueLayout.JAVA_CHAR, vh.offset0 + vh.step1 * x1 + vh.offset1)

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int)(
      implicit
      region: Region[R],
    ): Char =
      mem
        .asJava
        .get(ValueLayout.JAVA_CHAR, vh.offset0 + vh.step1 * x1 + vh.offset1)

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Char, x1: Long)(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_CHAR,
          vh.offset0 + vh.step1 * x1 + vh.offset1,
          value,
        )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Char, x1: Int)(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_CHAR,
          vh.offset0 + vh.step1 * x1 + vh.offset1,
          value,
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
      mem
        .asJava
        .get(
          ValueLayout.JAVA_CHAR,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2,
        )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Char =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_CHAR,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2,
        )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Char, x1: Long, x2: Long)(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_CHAR,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2,
          value,
        )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Char, x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_CHAR,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2,
          value,
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
      mem
        .asJava
        .get(
          ValueLayout.JAVA_CHAR,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3,
        )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int, x2: Int, x3: Int)(
      implicit
      region: Region[R],
    ): Char =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_CHAR,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_CHAR,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh
            .step2 * x2 + vh.offset2 + vh.step3 * x3 + vh.offset3,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_CHAR,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh
            .step2 * x2 + vh.offset2 + vh.step3 * x3 + vh.offset3,
          value,
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
      mem
        .asJava
        .get(
          ValueLayout.JAVA_CHAR,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4,
        )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int, x2: Int, x3: Int, x4: Int)(
      implicit
      region: Region[R],
    ): Char =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_CHAR,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_CHAR,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_CHAR,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4,
          value,
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
      mem
        .asJava
        .get(
          ValueLayout.JAVA_CHAR,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5,
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
      mem
        .asJava
        .get(
          ValueLayout.JAVA_CHAR,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_CHAR,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh
            .step2 * x2 + vh.offset2 + vh.step3 * x3 + vh
            .offset3 + vh.step4 * x4 + vh.offset4 + vh.step5 * x5 + vh.offset5,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_CHAR,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh
            .step2 * x2 + vh.offset2 + vh.step3 * x3 + vh
            .offset3 + vh.step4 * x4 + vh.offset4 + vh.step5 * x5 + vh.offset5,
          value,
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
      mem
        .asJava
        .get(
          ValueLayout.JAVA_CHAR,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6,
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
      mem
        .asJava
        .get(
          ValueLayout.JAVA_CHAR,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_CHAR,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_CHAR,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6,
          value,
        )

  }

  implicit final class Char7Ops[L <: Layout](
      protected val vh: MemoryPtr7[L, Char],
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
      x7: Long,
    )(
      implicit
      region: Region[R],
    ): Char =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_CHAR,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7,
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
      x7: Int,
    )(
      implicit
      region: Region[R],
    ): Char =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_CHAR,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7,
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
      x7: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_CHAR,
          vh.offset0 + vh.step1 * x1 + vh
            .offset1 + vh.step2 * x2 + vh.offset2 + vh.step3 * x3 + vh
            .offset3 + vh.step4 * x4 + vh.offset4 + vh.step5 * x5 + vh
            .offset5 + vh.step6 * x6 + vh.offset6 + vh.step7 * x7 + vh.offset7,
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
      x7: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_CHAR,
          vh.offset0 + vh.step1 * x1 + vh
            .offset1 + vh.step2 * x2 + vh.offset2 + vh.step3 * x3 + vh
            .offset3 + vh.step4 * x4 + vh.offset4 + vh.step5 * x5 + vh
            .offset5 + vh.step6 * x6 + vh.offset6 + vh.step7 * x7 + vh.offset7,
          value,
        )

  }

  implicit final class Char8Ops[L <: Layout](
      protected val vh: MemoryPtr8[L, Char],
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
      x7: Long,
      x8: Long,
    )(
      implicit
      region: Region[R],
    ): Char =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_CHAR,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7 + vh.step8 * x8 + vh.offset8,
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
      x7: Int,
      x8: Int,
    )(
      implicit
      region: Region[R],
    ): Char =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_CHAR,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7 + vh.step8 * x8 + vh.offset8,
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
      x7: Long,
      x8: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_CHAR,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7 + vh.step8 * x8 + vh.offset8,
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
      x7: Int,
      x8: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_CHAR,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7 + vh.step8 * x8 + vh.offset8,
          value,
        )

  }

  implicit final class Char9Ops[L <: Layout](
      protected val vh: MemoryPtr9[L, Char],
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
      x7: Long,
      x8: Long,
      x9: Long,
    )(
      implicit
      region: Region[R],
    ): Char =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_CHAR,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7 + vh.step8 * x8 + vh
            .offset8 + vh.step9 * x9 + vh.offset9,
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
      x7: Int,
      x8: Int,
      x9: Int,
    )(
      implicit
      region: Region[R],
    ): Char =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_CHAR,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7 + vh.step8 * x8 + vh
            .offset8 + vh.step9 * x9 + vh.offset9,
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
      x7: Long,
      x8: Long,
      x9: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_CHAR,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh
            .step4 * x4 + vh.offset4 + vh.step5 * x5 + vh
            .offset5 + vh.step6 * x6 + vh.offset6 + vh.step7 * x7 + vh
            .offset7 + vh.step8 * x8 + vh.offset8 + vh.step9 * x9 + vh.offset9,
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
      x7: Int,
      x8: Int,
      x9: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_CHAR,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh
            .step4 * x4 + vh.offset4 + vh.step5 * x5 + vh
            .offset5 + vh.step6 * x6 + vh.offset6 + vh.step7 * x7 + vh
            .offset7 + vh.step8 * x8 + vh.offset8 + vh.step9 * x9 + vh.offset9,
          value,
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
    ): Int = mem.asJava.get(ValueLayout.JAVA_INT, vh.offset0)

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Int)(
      implicit
      region: Region[R],
    ): Unit = mem.asJava.set(ValueLayout.JAVA_INT, vh.offset0, value)

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
      mem
        .asJava
        .get(ValueLayout.JAVA_INT, vh.offset0 + vh.step1 * x1 + vh.offset1)

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int)(
      implicit
      region: Region[R],
    ): Int =
      mem
        .asJava
        .get(ValueLayout.JAVA_INT, vh.offset0 + vh.step1 * x1 + vh.offset1)

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Int, x1: Long)(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_INT,
          vh.offset0 + vh.step1 * x1 + vh.offset1,
          value,
        )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Int, x1: Int)(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_INT,
          vh.offset0 + vh.step1 * x1 + vh.offset1,
          value,
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
      mem
        .asJava
        .get(
          ValueLayout.JAVA_INT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2,
        )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Int =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_INT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2,
        )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Int, x1: Long, x2: Long)(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_INT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2,
          value,
        )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Int, x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_INT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2,
          value,
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
      mem
        .asJava
        .get(
          ValueLayout.JAVA_INT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3,
        )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int, x2: Int, x3: Int)(
      implicit
      region: Region[R],
    ): Int =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_INT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_INT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh
            .step2 * x2 + vh.offset2 + vh.step3 * x3 + vh.offset3,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_INT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh
            .step2 * x2 + vh.offset2 + vh.step3 * x3 + vh.offset3,
          value,
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
      mem
        .asJava
        .get(
          ValueLayout.JAVA_INT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4,
        )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int, x2: Int, x3: Int, x4: Int)(
      implicit
      region: Region[R],
    ): Int =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_INT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_INT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_INT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4,
          value,
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
      mem
        .asJava
        .get(
          ValueLayout.JAVA_INT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5,
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
      mem
        .asJava
        .get(
          ValueLayout.JAVA_INT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_INT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh
            .step2 * x2 + vh.offset2 + vh.step3 * x3 + vh
            .offset3 + vh.step4 * x4 + vh.offset4 + vh.step5 * x5 + vh.offset5,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_INT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh
            .step2 * x2 + vh.offset2 + vh.step3 * x3 + vh
            .offset3 + vh.step4 * x4 + vh.offset4 + vh.step5 * x5 + vh.offset5,
          value,
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
      mem
        .asJava
        .get(
          ValueLayout.JAVA_INT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6,
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
      mem
        .asJava
        .get(
          ValueLayout.JAVA_INT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_INT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_INT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6,
          value,
        )

  }

  implicit final class Int7Ops[L <: Layout](
      protected val vh: MemoryPtr7[L, Int],
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
      x7: Long,
    )(
      implicit
      region: Region[R],
    ): Int =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_INT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7,
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
      x7: Int,
    )(
      implicit
      region: Region[R],
    ): Int =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_INT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7,
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
      x7: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_INT,
          vh.offset0 + vh.step1 * x1 + vh
            .offset1 + vh.step2 * x2 + vh.offset2 + vh.step3 * x3 + vh
            .offset3 + vh.step4 * x4 + vh.offset4 + vh.step5 * x5 + vh
            .offset5 + vh.step6 * x6 + vh.offset6 + vh.step7 * x7 + vh.offset7,
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
      x7: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_INT,
          vh.offset0 + vh.step1 * x1 + vh
            .offset1 + vh.step2 * x2 + vh.offset2 + vh.step3 * x3 + vh
            .offset3 + vh.step4 * x4 + vh.offset4 + vh.step5 * x5 + vh
            .offset5 + vh.step6 * x6 + vh.offset6 + vh.step7 * x7 + vh.offset7,
          value,
        )

  }

  implicit final class Int8Ops[L <: Layout](
      protected val vh: MemoryPtr8[L, Int],
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
      x7: Long,
      x8: Long,
    )(
      implicit
      region: Region[R],
    ): Int =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_INT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7 + vh.step8 * x8 + vh.offset8,
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
      x7: Int,
      x8: Int,
    )(
      implicit
      region: Region[R],
    ): Int =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_INT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7 + vh.step8 * x8 + vh.offset8,
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
      x7: Long,
      x8: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_INT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7 + vh.step8 * x8 + vh.offset8,
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
      x7: Int,
      x8: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_INT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7 + vh.step8 * x8 + vh.offset8,
          value,
        )

  }

  implicit final class Int9Ops[L <: Layout](
      protected val vh: MemoryPtr9[L, Int],
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
      x7: Long,
      x8: Long,
      x9: Long,
    )(
      implicit
      region: Region[R],
    ): Int =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_INT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7 + vh.step8 * x8 + vh
            .offset8 + vh.step9 * x9 + vh.offset9,
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
      x7: Int,
      x8: Int,
      x9: Int,
    )(
      implicit
      region: Region[R],
    ): Int =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_INT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7 + vh.step8 * x8 + vh
            .offset8 + vh.step9 * x9 + vh.offset9,
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
      x7: Long,
      x8: Long,
      x9: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_INT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh
            .step4 * x4 + vh.offset4 + vh.step5 * x5 + vh
            .offset5 + vh.step6 * x6 + vh.offset6 + vh.step7 * x7 + vh
            .offset7 + vh.step8 * x8 + vh.offset8 + vh.step9 * x9 + vh.offset9,
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
      x7: Int,
      x8: Int,
      x9: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_INT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh
            .step4 * x4 + vh.offset4 + vh.step5 * x5 + vh
            .offset5 + vh.step6 * x6 + vh.offset6 + vh.step7 * x7 + vh
            .offset7 + vh.step8 * x8 + vh.offset8 + vh.step9 * x9 + vh.offset9,
          value,
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
    ): Long = mem.asJava.get(ValueLayout.JAVA_LONG, vh.offset0)

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Long)(
      implicit
      region: Region[R],
    ): Unit = mem.asJava.set(ValueLayout.JAVA_LONG, vh.offset0, value)

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
      mem
        .asJava
        .get(ValueLayout.JAVA_LONG, vh.offset0 + vh.step1 * x1 + vh.offset1)

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int)(
      implicit
      region: Region[R],
    ): Long =
      mem
        .asJava
        .get(ValueLayout.JAVA_LONG, vh.offset0 + vh.step1 * x1 + vh.offset1)

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Long, x1: Long)(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_LONG,
          vh.offset0 + vh.step1 * x1 + vh.offset1,
          value,
        )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Long, x1: Int)(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_LONG,
          vh.offset0 + vh.step1 * x1 + vh.offset1,
          value,
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
      mem
        .asJava
        .get(
          ValueLayout.JAVA_LONG,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2,
        )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Long =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_LONG,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2,
        )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Long, x1: Long, x2: Long)(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_LONG,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2,
          value,
        )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Long, x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_LONG,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2,
          value,
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
      mem
        .asJava
        .get(
          ValueLayout.JAVA_LONG,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3,
        )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int, x2: Int, x3: Int)(
      implicit
      region: Region[R],
    ): Long =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_LONG,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_LONG,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh
            .step2 * x2 + vh.offset2 + vh.step3 * x3 + vh.offset3,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_LONG,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh
            .step2 * x2 + vh.offset2 + vh.step3 * x3 + vh.offset3,
          value,
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
      mem
        .asJava
        .get(
          ValueLayout.JAVA_LONG,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4,
        )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int, x2: Int, x3: Int, x4: Int)(
      implicit
      region: Region[R],
    ): Long =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_LONG,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_LONG,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_LONG,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4,
          value,
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
      mem
        .asJava
        .get(
          ValueLayout.JAVA_LONG,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5,
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
      mem
        .asJava
        .get(
          ValueLayout.JAVA_LONG,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_LONG,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh
            .step2 * x2 + vh.offset2 + vh.step3 * x3 + vh
            .offset3 + vh.step4 * x4 + vh.offset4 + vh.step5 * x5 + vh.offset5,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_LONG,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh
            .step2 * x2 + vh.offset2 + vh.step3 * x3 + vh
            .offset3 + vh.step4 * x4 + vh.offset4 + vh.step5 * x5 + vh.offset5,
          value,
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
      mem
        .asJava
        .get(
          ValueLayout.JAVA_LONG,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6,
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
      mem
        .asJava
        .get(
          ValueLayout.JAVA_LONG,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_LONG,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_LONG,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6,
          value,
        )

  }

  implicit final class Long7Ops[L <: Layout](
      protected val vh: MemoryPtr7[L, Long],
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
      x7: Long,
    )(
      implicit
      region: Region[R],
    ): Long =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_LONG,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7,
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
      x7: Int,
    )(
      implicit
      region: Region[R],
    ): Long =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_LONG,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7,
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
      x7: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_LONG,
          vh.offset0 + vh.step1 * x1 + vh
            .offset1 + vh.step2 * x2 + vh.offset2 + vh.step3 * x3 + vh
            .offset3 + vh.step4 * x4 + vh.offset4 + vh.step5 * x5 + vh
            .offset5 + vh.step6 * x6 + vh.offset6 + vh.step7 * x7 + vh.offset7,
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
      x7: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_LONG,
          vh.offset0 + vh.step1 * x1 + vh
            .offset1 + vh.step2 * x2 + vh.offset2 + vh.step3 * x3 + vh
            .offset3 + vh.step4 * x4 + vh.offset4 + vh.step5 * x5 + vh
            .offset5 + vh.step6 * x6 + vh.offset6 + vh.step7 * x7 + vh.offset7,
          value,
        )

  }

  implicit final class Long8Ops[L <: Layout](
      protected val vh: MemoryPtr8[L, Long],
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
      x7: Long,
      x8: Long,
    )(
      implicit
      region: Region[R],
    ): Long =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_LONG,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7 + vh.step8 * x8 + vh.offset8,
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
      x7: Int,
      x8: Int,
    )(
      implicit
      region: Region[R],
    ): Long =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_LONG,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7 + vh.step8 * x8 + vh.offset8,
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
      x7: Long,
      x8: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_LONG,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7 + vh.step8 * x8 + vh.offset8,
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
      x7: Int,
      x8: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_LONG,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7 + vh.step8 * x8 + vh.offset8,
          value,
        )

  }

  implicit final class Long9Ops[L <: Layout](
      protected val vh: MemoryPtr9[L, Long],
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
      x7: Long,
      x8: Long,
      x9: Long,
    )(
      implicit
      region: Region[R],
    ): Long =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_LONG,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7 + vh.step8 * x8 + vh
            .offset8 + vh.step9 * x9 + vh.offset9,
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
      x7: Int,
      x8: Int,
      x9: Int,
    )(
      implicit
      region: Region[R],
    ): Long =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_LONG,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7 + vh.step8 * x8 + vh
            .offset8 + vh.step9 * x9 + vh.offset9,
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
      x7: Long,
      x8: Long,
      x9: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_LONG,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh
            .step4 * x4 + vh.offset4 + vh.step5 * x5 + vh
            .offset5 + vh.step6 * x6 + vh.offset6 + vh.step7 * x7 + vh
            .offset7 + vh.step8 * x8 + vh.offset8 + vh.step9 * x9 + vh.offset9,
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
      x7: Int,
      x8: Int,
      x9: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_LONG,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh
            .step4 * x4 + vh.offset4 + vh.step5 * x5 + vh
            .offset5 + vh.step6 * x6 + vh.offset6 + vh.step7 * x7 + vh
            .offset7 + vh.step8 * x8 + vh.offset8 + vh.step9 * x9 + vh.offset9,
          value,
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
    ): Float = mem.asJava.get(ValueLayout.JAVA_FLOAT, vh.offset0)

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Float)(
      implicit
      region: Region[R],
    ): Unit = mem.asJava.set(ValueLayout.JAVA_FLOAT, vh.offset0, value)

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
      mem
        .asJava
        .get(ValueLayout.JAVA_FLOAT, vh.offset0 + vh.step1 * x1 + vh.offset1)

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int)(
      implicit
      region: Region[R],
    ): Float =
      mem
        .asJava
        .get(ValueLayout.JAVA_FLOAT, vh.offset0 + vh.step1 * x1 + vh.offset1)

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Float, x1: Long)(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_FLOAT,
          vh.offset0 + vh.step1 * x1 + vh.offset1,
          value,
        )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Float, x1: Int)(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_FLOAT,
          vh.offset0 + vh.step1 * x1 + vh.offset1,
          value,
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
      mem
        .asJava
        .get(
          ValueLayout.JAVA_FLOAT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2,
        )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Float =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_FLOAT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2,
        )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Float, x1: Long, x2: Long)(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_FLOAT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2,
          value,
        )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Float, x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_FLOAT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2,
          value,
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
      mem
        .asJava
        .get(
          ValueLayout.JAVA_FLOAT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3,
        )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int, x2: Int, x3: Int)(
      implicit
      region: Region[R],
    ): Float =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_FLOAT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_FLOAT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh
            .step2 * x2 + vh.offset2 + vh.step3 * x3 + vh.offset3,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_FLOAT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh
            .step2 * x2 + vh.offset2 + vh.step3 * x3 + vh.offset3,
          value,
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
      mem
        .asJava
        .get(
          ValueLayout.JAVA_FLOAT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4,
        )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int, x2: Int, x3: Int, x4: Int)(
      implicit
      region: Region[R],
    ): Float =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_FLOAT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_FLOAT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_FLOAT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4,
          value,
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
      mem
        .asJava
        .get(
          ValueLayout.JAVA_FLOAT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5,
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
      mem
        .asJava
        .get(
          ValueLayout.JAVA_FLOAT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_FLOAT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh
            .step2 * x2 + vh.offset2 + vh.step3 * x3 + vh
            .offset3 + vh.step4 * x4 + vh.offset4 + vh.step5 * x5 + vh.offset5,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_FLOAT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh
            .step2 * x2 + vh.offset2 + vh.step3 * x3 + vh
            .offset3 + vh.step4 * x4 + vh.offset4 + vh.step5 * x5 + vh.offset5,
          value,
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
      mem
        .asJava
        .get(
          ValueLayout.JAVA_FLOAT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6,
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
      mem
        .asJava
        .get(
          ValueLayout.JAVA_FLOAT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_FLOAT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_FLOAT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6,
          value,
        )

  }

  implicit final class Float7Ops[L <: Layout](
      protected val vh: MemoryPtr7[L, Float],
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
      x7: Long,
    )(
      implicit
      region: Region[R],
    ): Float =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_FLOAT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7,
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
      x7: Int,
    )(
      implicit
      region: Region[R],
    ): Float =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_FLOAT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7,
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
      x7: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_FLOAT,
          vh.offset0 + vh.step1 * x1 + vh
            .offset1 + vh.step2 * x2 + vh.offset2 + vh.step3 * x3 + vh
            .offset3 + vh.step4 * x4 + vh.offset4 + vh.step5 * x5 + vh
            .offset5 + vh.step6 * x6 + vh.offset6 + vh.step7 * x7 + vh.offset7,
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
      x7: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_FLOAT,
          vh.offset0 + vh.step1 * x1 + vh
            .offset1 + vh.step2 * x2 + vh.offset2 + vh.step3 * x3 + vh
            .offset3 + vh.step4 * x4 + vh.offset4 + vh.step5 * x5 + vh
            .offset5 + vh.step6 * x6 + vh.offset6 + vh.step7 * x7 + vh.offset7,
          value,
        )

  }

  implicit final class Float8Ops[L <: Layout](
      protected val vh: MemoryPtr8[L, Float],
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
      x7: Long,
      x8: Long,
    )(
      implicit
      region: Region[R],
    ): Float =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_FLOAT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7 + vh.step8 * x8 + vh.offset8,
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
      x7: Int,
      x8: Int,
    )(
      implicit
      region: Region[R],
    ): Float =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_FLOAT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7 + vh.step8 * x8 + vh.offset8,
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
      x7: Long,
      x8: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_FLOAT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7 + vh.step8 * x8 + vh.offset8,
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
      x7: Int,
      x8: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_FLOAT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7 + vh.step8 * x8 + vh.offset8,
          value,
        )

  }

  implicit final class Float9Ops[L <: Layout](
      protected val vh: MemoryPtr9[L, Float],
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
      x7: Long,
      x8: Long,
      x9: Long,
    )(
      implicit
      region: Region[R],
    ): Float =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_FLOAT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7 + vh.step8 * x8 + vh
            .offset8 + vh.step9 * x9 + vh.offset9,
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
      x7: Int,
      x8: Int,
      x9: Int,
    )(
      implicit
      region: Region[R],
    ): Float =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_FLOAT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7 + vh.step8 * x8 + vh
            .offset8 + vh.step9 * x9 + vh.offset9,
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
      x7: Long,
      x8: Long,
      x9: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_FLOAT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh
            .step4 * x4 + vh.offset4 + vh.step5 * x5 + vh
            .offset5 + vh.step6 * x6 + vh.offset6 + vh.step7 * x7 + vh
            .offset7 + vh.step8 * x8 + vh.offset8 + vh.step9 * x9 + vh.offset9,
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
      x7: Int,
      x8: Int,
      x9: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_FLOAT,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh
            .step4 * x4 + vh.offset4 + vh.step5 * x5 + vh
            .offset5 + vh.step6 * x6 + vh.offset6 + vh.step7 * x7 + vh
            .offset7 + vh.step8 * x8 + vh.offset8 + vh.step9 * x9 + vh.offset9,
          value,
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
    ): Double = mem.asJava.get(ValueLayout.JAVA_DOUBLE, vh.offset0)

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Double)(
      implicit
      region: Region[R],
    ): Unit = mem.asJava.set(ValueLayout.JAVA_DOUBLE, vh.offset0, value)

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
      mem
        .asJava
        .get(ValueLayout.JAVA_DOUBLE, vh.offset0 + vh.step1 * x1 + vh.offset1)

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int)(
      implicit
      region: Region[R],
    ): Double =
      mem
        .asJava
        .get(ValueLayout.JAVA_DOUBLE, vh.offset0 + vh.step1 * x1 + vh.offset1)

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Double, x1: Long)(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_DOUBLE,
          vh.offset0 + vh.step1 * x1 + vh.offset1,
          value,
        )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Double, x1: Int)(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_DOUBLE,
          vh.offset0 + vh.step1 * x1 + vh.offset1,
          value,
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
      mem
        .asJava
        .get(
          ValueLayout.JAVA_DOUBLE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2,
        )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Double =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_DOUBLE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2,
        )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Double, x1: Long, x2: Long)(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_DOUBLE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2,
          value,
        )

    @IntrinsicCandidate
    @inline
    def set[R <: Global](mem: Memory[L, R], value: Double, x1: Int, x2: Int)(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_DOUBLE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh.offset2,
          value,
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
      mem
        .asJava
        .get(
          ValueLayout.JAVA_DOUBLE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3,
        )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int, x2: Int, x3: Int)(
      implicit
      region: Region[R],
    ): Double =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_DOUBLE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_DOUBLE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh
            .step2 * x2 + vh.offset2 + vh.step3 * x3 + vh.offset3,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_DOUBLE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh
            .step2 * x2 + vh.offset2 + vh.step3 * x3 + vh.offset3,
          value,
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
      mem
        .asJava
        .get(
          ValueLayout.JAVA_DOUBLE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4,
        )

    @IntrinsicCandidate
    @inline
    def get[R <: Global](mem: Memory[L, R], x1: Int, x2: Int, x3: Int, x4: Int)(
      implicit
      region: Region[R],
    ): Double =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_DOUBLE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_DOUBLE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_DOUBLE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh.offset4,
          value,
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
      mem
        .asJava
        .get(
          ValueLayout.JAVA_DOUBLE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5,
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
      mem
        .asJava
        .get(
          ValueLayout.JAVA_DOUBLE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_DOUBLE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh
            .step2 * x2 + vh.offset2 + vh.step3 * x3 + vh
            .offset3 + vh.step4 * x4 + vh.offset4 + vh.step5 * x5 + vh.offset5,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_DOUBLE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh
            .step2 * x2 + vh.offset2 + vh.step3 * x3 + vh
            .offset3 + vh.step4 * x4 + vh.offset4 + vh.step5 * x5 + vh.offset5,
          value,
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
      mem
        .asJava
        .get(
          ValueLayout.JAVA_DOUBLE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6,
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
      mem
        .asJava
        .get(
          ValueLayout.JAVA_DOUBLE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_DOUBLE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6,
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
      mem
        .asJava
        .set(
          ValueLayout.JAVA_DOUBLE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh.offset6,
          value,
        )

  }

  implicit final class Double7Ops[L <: Layout](
      protected val vh: MemoryPtr7[L, Double],
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
      x7: Long,
    )(
      implicit
      region: Region[R],
    ): Double =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_DOUBLE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7,
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
      x7: Int,
    )(
      implicit
      region: Region[R],
    ): Double =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_DOUBLE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7,
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
      x7: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_DOUBLE,
          vh.offset0 + vh.step1 * x1 + vh
            .offset1 + vh.step2 * x2 + vh.offset2 + vh.step3 * x3 + vh
            .offset3 + vh.step4 * x4 + vh.offset4 + vh.step5 * x5 + vh
            .offset5 + vh.step6 * x6 + vh.offset6 + vh.step7 * x7 + vh.offset7,
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
      x7: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_DOUBLE,
          vh.offset0 + vh.step1 * x1 + vh
            .offset1 + vh.step2 * x2 + vh.offset2 + vh.step3 * x3 + vh
            .offset3 + vh.step4 * x4 + vh.offset4 + vh.step5 * x5 + vh
            .offset5 + vh.step6 * x6 + vh.offset6 + vh.step7 * x7 + vh.offset7,
          value,
        )

  }

  implicit final class Double8Ops[L <: Layout](
      protected val vh: MemoryPtr8[L, Double],
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
      x7: Long,
      x8: Long,
    )(
      implicit
      region: Region[R],
    ): Double =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_DOUBLE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7 + vh.step8 * x8 + vh.offset8,
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
      x7: Int,
      x8: Int,
    )(
      implicit
      region: Region[R],
    ): Double =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_DOUBLE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7 + vh.step8 * x8 + vh.offset8,
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
      x7: Long,
      x8: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_DOUBLE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7 + vh.step8 * x8 + vh.offset8,
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
      x7: Int,
      x8: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_DOUBLE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7 + vh.step8 * x8 + vh.offset8,
          value,
        )

  }

  implicit final class Double9Ops[L <: Layout](
      protected val vh: MemoryPtr9[L, Double],
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
      x7: Long,
      x8: Long,
      x9: Long,
    )(
      implicit
      region: Region[R],
    ): Double =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_DOUBLE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7 + vh.step8 * x8 + vh
            .offset8 + vh.step9 * x9 + vh.offset9,
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
      x7: Int,
      x8: Int,
      x9: Int,
    )(
      implicit
      region: Region[R],
    ): Double =
      mem
        .asJava
        .get(
          ValueLayout.JAVA_DOUBLE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh.step4 * x4 + vh
            .offset4 + vh.step5 * x5 + vh.offset5 + vh.step6 * x6 + vh
            .offset6 + vh.step7 * x7 + vh.offset7 + vh.step8 * x8 + vh
            .offset8 + vh.step9 * x9 + vh.offset9,
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
      x7: Long,
      x8: Long,
      x9: Long,
    )(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_DOUBLE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh
            .step4 * x4 + vh.offset4 + vh.step5 * x5 + vh
            .offset5 + vh.step6 * x6 + vh.offset6 + vh.step7 * x7 + vh
            .offset7 + vh.step8 * x8 + vh.offset8 + vh.step9 * x9 + vh.offset9,
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
      x7: Int,
      x8: Int,
      x9: Int,
    )(
      implicit
      region: Region[R],
    ): Unit =
      mem
        .asJava
        .set(
          ValueLayout.JAVA_DOUBLE,
          vh.offset0 + vh.step1 * x1 + vh.offset1 + vh.step2 * x2 + vh
            .offset2 + vh.step3 * x3 + vh.offset3 + vh
            .step4 * x4 + vh.offset4 + vh.step5 * x5 + vh
            .offset5 + vh.step6 * x6 + vh.offset6 + vh.step7 * x7 + vh
            .offset7 + vh.step8 * x8 + vh.offset8 + vh.step9 * x9 + vh.offset9,
          value,
        )

  }

}
