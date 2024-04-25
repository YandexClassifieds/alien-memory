package alien

import alien.memory.*
import zio.test.{Spec, ZIOSpecDefault, assertTrue}

object HandleSpec extends ZIOSpecDefault {

  def spec: Spec[Any, Nothing] =
    suite("pointer's offsets & steps")(
      test("struct handlers") {
        val layout =
          ("a" := Values.Int) >>: ("b" := Values.Int) >>: ("c" := Values.Int)
        val aHandle = layout / "a" / $
        val bHandle = layout / "b" / $
        val cHandle = layout / "c" / $
        assertTrue(
          aHandle.offset0 == 0,
          bHandle.offset0 == 4,
          cHandle.offset0 == 8,
        )
      },
      test("union handlers") {
        val layout =
          ("a" := Values.Int) <>: ("b" := Values.Long) <>: ("c" := Values.Short)
        val aHandle = layout / "a" / $
        val bHandle = layout / "b" / $
        val cHandle = layout / "c" / $
        assertTrue(
          aHandle.offset0 == 0,
          bHandle.offset0 == 0,
          cHandle.offset0 == 0,
        )
      },
      test("union handlers with structs inside") {
        val layout =
          ("a"   := Values.Int) <>:
            ("b" := (("x" := Values.Long) >>: ("y" := Values.Int))) <>:
            ("c" := Values.Short)
        val aHandle = layout / "a" / $
        val bHandle = layout / "b" / "y" / $
        val cHandle = layout / "c" / $
        assertTrue(
          aHandle.offset0 == 0,
          bHandle.offset0 == 8,
          cHandle.offset0 == 0,
        )
      },
      test("sequence handlers") {
        val layout =
          ("a"   := Values.Long * 100) >>:
            ("b" := Values.Int * 200) >>:
            ("c" := Values.Byte * 300)
        val aHandle = layout / "a" / % / $
        val bHandle = layout / "b" / % / $
        val cHandle = layout / "c" / % / $
        assertTrue(
          aHandle.offset0 == 0 && aHandle.step1 == 8 && aHandle.offset1 == 0,
          bHandle.offset0 == 800 && bHandle.step1 == 4 && bHandle.offset1 == 0,
          cHandle.offset0 == 1600 && cHandle.step1 == 1 && cHandle.offset1 == 0,
        )
      },
      test("indexed handlers") {
        val layout =
          ("a"   := Values.Long * 100) >>:
            ("b" := Values.Int * 200) >>:
            ("c" := Values.Byte * 300)
        val aHandle = layout / "a" / 29 / $
        val bHandle = layout / "b" / 42 / $
        val cHandle = layout / "c" / 2 / $
        assertTrue(
          aHandle.offset0 == 29 * 8,
          bHandle.offset0 == 800 + 42 * 4,
          cHandle.offset0 == 1600 + 2,
        )
      },
      test("step handlers") {
        val layout =
          ("a"   := Values.Long * 100) >>:
            ("b" := Values.Int * 200) >>:
            ("c" := Values.Byte * 300)
        val aHandle = layout / "a" / (4, 2) / $
        val bHandle = layout / "b" / (8, 3) / $
        val cHandle = layout / "c" / (12, 45) / $
        assertTrue(
          aHandle.offset0 == 32 && aHandle.step1 == 16 && aHandle.offset1 == 0,
          bHandle.offset0 == 832 && bHandle.step1 == 12 && bHandle.offset1 == 0,
          cHandle.offset0 == 1612 && cHandle.step1 == 45 && cHandle.offset1 == 0,
        )
      },
      test("aligned handler") {
        val layout =
          (
            ("a"   := Values.Long * 100) >>:
              ("b" := Values.Int * 200) >>:
              ("c" := Values.Byte * 300)
          ).align[`2^4`]
        val aHandle = layout / "a" / (4, 2) / $
        val bHandle = layout / "b" / (8, 3) / $
        val cHandle = layout / "c" / (12, 45) / $
        assertTrue(
          aHandle.offset0 == 32 && aHandle.step1 == 16 && aHandle.offset1 == 0,
          bHandle.offset0 == 832 && bHandle.step1 == 12 && bHandle.offset1 == 0,
          cHandle.offset0 == 1612 && cHandle.step1 == 45 && cHandle.offset1 == 0,
        )
      },
      test("inner aligned handler") {
        val layout =
          ("a"   := (Values.Long * 100).align[`2^4`]) >>:
            ("b" := Values.Int * 200) >>:
            ("c" := Values.Byte * 300)
        val aHandle = layout / "a" / (4, 2) / $
        val bHandle = layout / "b" / (8, 3) / $
        val cHandle = layout / "c" / (12, 45) / $
        assertTrue(
          aHandle.offset0 == 32 && aHandle.step1 == 16 && aHandle.offset1 == 0,
          bHandle.offset0 == 832 && bHandle.step1 == 12 && bHandle.offset1 == 0,
          cHandle.offset0 == 1612 && cHandle.step1 == 45 && cHandle.offset1 == 0,
        )
      },
      test("deep sequence handlers") {
        val layout =
          ("a" :=
            (("1" := Values.Int * 100) >>: ("2" := Values.Float * 400)) *
              200) >>:
            ("b" :=
              >>(
                "1"      :=
                  ((("z" := Values.Int * 100) >>: ("y" := Values.Int)) * 200),
              )) >>:
            ("c" := Values.Byte * 300)
        val a1Handle  = layout / "a" / % / "1" / % / $
        val a2Handle  = layout / "a" / % / "2" / (1, 2) / $
        val b1zHandle = layout / "b" / "1" / % / "z" / % / $
        val b1yHandle = layout / "b" / "1" / % / "y" / $
        assertTrue(
          a1Handle.offset0 == 0 && a1Handle.step1 == 2000 &&
            a1Handle
              .offset1 == 0 && a1Handle.step2 == 4 && a2Handle.offset2 == 0,
          a2Handle.offset0 == 0 && a2Handle.step1 == 2000 &&
            a2Handle
              .offset1 == 404 && a2Handle.step2 == 8 && a2Handle.offset2 == 0,
          b1zHandle.offset0 == 400_000 && b1zHandle.step1 == 404 &&
            b1zHandle
              .offset1 == 0 && b1zHandle.step2 == 4 && b1zHandle.offset2 == 0,
          b1yHandle.offset0 == 400_000 && b1yHandle.step1 == 404 &&
            b1yHandle.offset1 == 400,
        )
      },
    )

}
