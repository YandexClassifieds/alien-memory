package alien

import alien.memory.*
import zio.Scope
import zio.test.*
import zio.test.Assertion.{hasSameElements, isSubtype}

import java.io.{ByteArrayInputStream, IOException}
import java.nio.ByteBuffer
import java.nio.channels.Channels

object MemorySpec extends ZIOSpecDefault {

  implicit val region = Region.fresh.newShared()

  def spec: Spec[TestEnvironment & Scope, Any] =
    suite("Memory")(
      test("get & set") {
        val n      = 200
        val layout = Values.Int * n
        val memory = Memory.allocate(layout)
        val ptr    = layout / % / $
        for (i <- 0 until n) {
          ptr.set(memory, i, i)
        }
        val assertion = (0 until n).foldLeft(assertTrue(true))((acc, ind) =>
          assertTrue(ptr.get(memory, ind) == ind),
        )
        assertion
      },
      test("compareTo") {
        val sample      = "abcdefghij"
        val memory      = Memory.ofArray(sample.getBytes)
        val emptyMemory = Memory.ofArray("".getBytes)
        val result      = memory.compareTo(emptyMemory)
        assertTrue(
          emptyMemory.compareTo(memory) < 0L,
          memory.compareTo(memory) == 0L,
          emptyMemory.compareTo(emptyMemory) == 0L,
        )
      },
      test("foldChunked") {
        val sample = "abcdefghij"

        val memory = Memory.ofArray(sample.getBytes)
        val result =
          memory.foldChunked(3)(Seq.empty[String]) { (seq, buffer) =>
            seq :+ bufferToString(buffer.asByteBuffer())
          }

        assert(result)(hasSameElements(Seq("abc", "def", "ghi", "j")))
      },
      test("read enough to fit chunked") {
        val memory = Memory.allocate(Values.Byte * 10)
        val sample = "abcdefghijklmno"
        val bais   = new ByteArrayInputStream(sample.getBytes)
        val status = memory.readFrom(Channels.newChannel(bais), chunkLimit = 3)

        assertTrue(
          status == ReadSucceed, {
            memory.foldChunked(4)("") { (string, buffer) =>
              string + bufferToString(buffer.asByteBuffer())
            } == "abcdefghij"
          },
        )
      },
      test("read enough to fit one slice") {
        val memory = Memory.allocate(Values.Byte * 10)
        val sample = "abcdefghij"
        val bais   = new ByteArrayInputStream(sample.getBytes)
        val status = memory.readFrom(Channels.newChannel(bais))

        assertTrue(
          status == ReadSucceed,
          memory.foldChunked(4)("")((string, buffer) =>
            string + bufferToString(buffer.asByteBuffer()),
          ) == sample,
        )
      },
      test("read small portion") {
        val memory = Memory.ofArray("0123456789".getBytes())
        val sample = "abcd"
        val bais   = new ByteArrayInputStream(sample.getBytes)
        val status = memory.readFrom(Channels.newChannel(bais), chunkLimit = 4)

        assertTrue(
          status == ReadEofReached(4L), {
            memory.foldChunked(4)("") { (string, buffer) =>
              string + bufferToString(buffer.asByteBuffer())
            } == "abcd456789"
          },
        )
      },
      test("read to desired position") {
        val memory = Memory.ofArray("0123456789".getBytes())
        val sample = "abcdefgh"
        val bais   = new ByteArrayInputStream(sample.getBytes)
        val status =
          memory.readToSliceFromChannel(offset = 3, limit = 5)(
            Channels.newChannel(bais),
            chunkLimit = 4,
          )

        assertTrue(
          status == ReadSucceed, {
            memory.foldChunked(4)("") { (string, buffer) =>
              string + bufferToString(buffer.asByteBuffer())
            } == "012abcde89"
          },
        )
      },
      test("read from closed channel") {
        val memory  = Memory.ofArray("0123456789".getBytes())
        val sample  = "abcdefgh"
        val bais    = new ByteArrayInputStream(sample.getBytes)
        val channel = Channels.newChannel(bais)
        channel.close()

        val status =
          memory.readToSliceFromChannel(offset = 3, limit = 5)(
            channel,
            chunkLimit = 4,
          )

        assert(status)(isSubtype[ReadFailed](Assertion.anything)) &&
        assert(status.asInstanceOf[ReadFailed].cause)(
          isSubtype[IOException](Assertion.anything),
        )
      },
    )

  def bufferToString(buffer: ByteBuffer): String = {
    val bytes = new Array[Byte](buffer.remaining)
    buffer.get(bytes)
    new String(bytes)
  }

}
