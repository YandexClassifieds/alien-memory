package alien

import alien.memory.*
import zio.Scope
import zio.test.*

import java.lang.foreign.MemoryLayout.*
import java.lang.foreign.ValueLayout

object LayoutSpec extends ZIOSpecDefault {

  def spec: Spec[TestEnvironment & Scope, Any] =
    suite("Layout generation")(
      test("int value") {
        val prototype = Values.Int
        val equiv = ValueLayout.JAVA_INT
        assertTrue(prototype.toLayout == equiv)
      },
      test("long value") {
        val prototype = Values.Long
        val equiv = ValueLayout.JAVA_LONG
        assertTrue(prototype.toLayout == equiv)
      },
      test("float value") {
        val prototype = Values.Float
        val equiv = ValueLayout.JAVA_FLOAT
        assertTrue(prototype.toLayout == equiv)
      },
      test("double value") {
        val prototype = Values.Double
        val equiv = ValueLayout.JAVA_DOUBLE
        assertTrue(prototype.toLayout == equiv)
      },
      test("short value") {
        val prototype = Values.Short
        val equiv = ValueLayout.JAVA_SHORT
        assertTrue(prototype.toLayout == equiv)
      },
      test("byte value") {
        val prototype = Values.Byte
        val equiv = ValueLayout.JAVA_BYTE
        assertTrue(prototype.toLayout == equiv)
      },
      test("char value") {
        val prototype = Values.Char
        val equiv = ValueLayout.JAVA_CHAR
        assertTrue(prototype.toLayout == equiv)
      },
      test("boolean value") {
        val prototype = Values.Boolean
        val equiv = ValueLayout.JAVA_BOOLEAN
        assertTrue(prototype.toLayout == equiv)
      },
      test("padding layout") {
        val prototype = Padding(32)
        val equiv = paddingLayout(32)
        assertTrue(prototype.toLayout == equiv)
      },
      test("sequence") {
        val prototype = Values.Long * 10
        val equiv = sequenceLayout(10, ValueLayout.JAVA_LONG)
        assertTrue(prototype.toLayout == equiv)
      },
      test("struct layout") {
        val prototype =
          ("a" := Values.Int) >>: ("b" := Values.Int) >>: ("c" := Values.Int)
        val equiv = structLayout(
          ValueLayout.JAVA_INT.withName("a"),
          ValueLayout.JAVA_INT.withName("b"),
          ValueLayout.JAVA_INT.withName("c")
        )
        assertTrue(prototype.toLayout == equiv)
      },
      test("struct layout with padding") {
        val prototype =
          ("a" := Values.Int) >>:
            ("padding" := Padding(32)) >>:
            ("b" := Values.Int)
        val equiv = structLayout(
          ValueLayout.JAVA_INT.withName("a"),
          paddingLayout(32).withName("padding"),
          ValueLayout.JAVA_INT.withName("b")
        )
        assertTrue(prototype.toLayout == equiv)
      },
      test("union layout") {
        val prototype = ("a" := Values.Int) <>: ("b" := Values.Long)
        val equiv = unionLayout(
          ValueLayout.JAVA_INT.withName("a"),
          ValueLayout.JAVA_LONG.withName("b")
        )
        assertTrue(prototype.toLayout == equiv)
      },
      test("single named struct") {
        val prototype = "a" := Values.Int
        val equiv = structLayout(ValueLayout.JAVA_INT.withName("a"))
        assertTrue(prototype.toLayout == equiv)
      },
      test("single deep struct") {
        val prototype = "a" := >>("b" := >>("c" := Values.Int))
        val equiv = structLayout(
          structLayout(
            structLayout(ValueLayout.JAVA_INT.withName("c")).withName("b")
          ).withName("a")
        )
        assertTrue(prototype.toLayout == equiv)
      },
      test("int with 8 byte alignment") {
        val prototype = Values.Int.align[`2^3`]
        val equiv = ValueLayout.JAVA_INT.withByteAlignment(8)
        assertTrue(prototype.toLayout == equiv)
      },
      test("int sequence with 8 byte alignment") {
        val prototype = (Values.Int * 200).align[`2^3`]
        val equiv = sequenceLayout(200, ValueLayout.JAVA_INT)
          .withByteAlignment(8)
        assertTrue(prototype.toLayout == equiv)
      },
      test("complex layout") {
        val prototype =
          ("a" := Values.Int) >>:
            ("b" :=
              (("x" := (Values.Int * 100)) >>:
                ("y" := (("g" := Values.Int) >>: ("h" := Values.Int)))) *
                128) >>:
            ("c" := >>("x" := Values.Int))
        val equiv = structLayout(
          ValueLayout.JAVA_INT.withName("a"),
          sequenceLayout(
            128,
            structLayout(
              sequenceLayout(100, ValueLayout.JAVA_INT).withName("x"),
              structLayout(
                ValueLayout.JAVA_INT.withName("g"),
                ValueLayout.JAVA_INT.withName("h")
              ).withName("y")
            )
          ).withName("b"),
          structLayout(ValueLayout.JAVA_INT.withName("x")).withName("c")
        )
        assertTrue(prototype.toLayout == equiv)
      }
    )

}
