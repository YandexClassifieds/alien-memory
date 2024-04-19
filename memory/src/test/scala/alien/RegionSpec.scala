package alien

import alien.memory.*
import zio.test.*

import java.lang.foreign.Arena

object RegionSpec extends ZIOSpecDefault {

  def spec: Spec[Any, Nothing] =
    suite("regions")(
      test("custom global region") {
        implicit val global: Region[Global] = Region
          .newGlobal(Arena.ofConfined())
        val n      = 200
        val layout = Values.Int * n
        val memory = Memory.allocateGlobal(layout)
        val ptr    = layout / % / $
        for (i <- 0 until n) {
          ptr.set(memory, i, i)
        }
        val assertion = (0 until n).foldLeft(assertTrue(true))((acc, ind) =>
          assertTrue(ptr.get(memory, ind) == ind),
        )
        assertion
      },
      test("manual region") {
        val layout = Values.Int * 100
        val ptr    = layout / % / $
        implicit val region: Region[Region.NamedMark["Shared"]] = Region
          .named["Shared"]
          .newShared()
        val memory = Memory.allocate(layout)
        ptr.get(memory, 0)
        region.deallocate()
        assertTrue(true)
      },
      test("confined region") {
        val layout = Values.Int * 100
        val ptr    = layout / % / $
        var thrown = false
        Region
          .fresh
          .confined { implicit region =>
            val memory = Memory.allocate(layout)
            ptr.get(memory, 0)
            val anotherThread =
              new Thread {

                override def run(): Unit =
                  try ptr.get(memory, 0)
                  catch {
                    case _: Exception =>
                      thrown = true
                  }

              }
            anotherThread.start()
            anotherThread.join()
          }
        assertTrue(thrown)
      },
      test("shared region") {
        val layout = Values.Int * 100
        val ptr    = layout / % / $
        Region
          .fresh
          .shared { implicit region =>
            val memory = Memory.allocate(layout)
            ptr.get(memory, 0)
            val anotherThread =
              new Thread {
                ptr.get(memory, 0)
              }
            anotherThread.start()
            anotherThread.join()
          }
        assertTrue(true)
      },
      test("copy in one region") {
        val layout = Values.Int * 100
        Region
          .fresh
          .confined { implicit region =>
            val memory1 = Memory.allocate(layout)
            val memory2 = Memory.allocate(layout)
            memory1.copyBytesTo(memory2, 100, 0, 0)
          }
        assertTrue(true)
      },
    )

}
