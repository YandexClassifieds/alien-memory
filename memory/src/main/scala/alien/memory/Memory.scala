package alien.memory

import alien.memory.layout.{BoundedSequence, Layout, Value}
import supertagged.*

import java.lang.Byte.toUnsignedLong
import java.lang.foreign.{Arena, MemorySegment, ValueLayout}
import java.nio.ByteBuffer
import java.nio.channels.ReadableByteChannel
import scala.util.control.NonFatal

case object Memory extends NewType0 {

  private[alien] type Type[LayoutType <: Layout, R <: Global] = Newtype[
    MemorySegment @@ LayoutType @@ R,
    Ops[LayoutType, R],
  ]

  /** Transforms a byte array to Memory placed on heap. Memory would represent the same Memory Segment as array.
   */
  def ofArray(
    array: Array[Byte],
  ): Memory[BoundedSequence[Value[Byte]], Global] =
    tag(MemorySegment.ofArray(array))

  /** Transforms a short array to Memory of bytes placed on heap.
   */
  def ofArray(
    array: Array[Short],
  ): Memory[BoundedSequence[Value[Short]], Global] =
    tag(MemorySegment.ofArray(array))

  /** Transforms a char array to Memory of bytes placed on heap.
   */
  def ofArray(
    array: Array[Char],
  ): Memory[BoundedSequence[Value[Char]], Global] =
    tag(MemorySegment.ofArray(array))

  /** Transforms a int array to Memory of bytes placed on heap.
   */
  def ofArray(array: Array[Int]): Memory[BoundedSequence[Value[Int]], Global] =
    tag(MemorySegment.ofArray(array))

  /** Transforms a long array to Memory of bytes placed on heap.
   */
  def ofArray(
    array: Array[Long],
  ): Memory[BoundedSequence[Value[Long]], Global] =
    tag(MemorySegment.ofArray(array))

  /** Transforms a float array to Memory of bytes placed on heap.
   */
  def ofArray(
    array: Array[Float],
  ): Memory[BoundedSequence[Value[Float]], Global] =
    tag(MemorySegment.ofArray(array))

  /** Transforms a double array to Memory placed on heap.
   */
  def ofArray(
    array: Array[Double],
  ): Memory[BoundedSequence[Value[Double]], Global] =
    tag(MemorySegment.ofArray(array))

  /** Transforms a bytebuffer to Memory. Memory would be based on the same memory segment that buffer was based on.
   *
   * @param bb: ByteBuffer that would be casted to Memory.
   * @return Memory with the same memory address and limit as `bb`.
   */
  def ofByteBuffer(
    bb: ByteBuffer,
  ): Memory[BoundedSequence[Value[Byte]], Global] =
    tag(MemorySegment.ofBuffer(bb))

  /** Allocates an off-heap memory that is managed by JVM garbage
    * collector.
    *
    * @param layout Layout of allocated memory
    * @tparam LayoutType Type of layout of an allocated memory
    * @return Newly allocated Memory.
    */
  def allocateGC[LayoutType <: Layout](
    layout: LayoutType,
  ): Memory[LayoutType, Global] = tag(Arena.ofAuto().allocate(layout.toLayout))

  /** Allocates an off-heap memory that is managed by the implicitly provided
    * Region. The underlying memory would be freed as soon as associated
    * region is closed.
    *
    * @param layout
    * Layout of allocated memory
    * @tparam LayoutType
    * Type of the layout of an allocated memory
    * @tparam R
    * Region mark
    * @return Memory with corresponding layout and region
    */
  def allocate[LayoutType <: Layout, R <: NonGlobal](layout: LayoutType)(
    implicit
    region: Region[R],
  ): Memory[LayoutType, R] = tag(region.allocate(layout))

  /** Allocates an off-heap memory region that is managed by static arena that can't be closed.
    * The underlying memory would never be freed.
    *
    * @param layout Layout of allocated memory
    * @tparam LayoutType Type of the layout
    * @return Memory with corresponding layout and Global region
    */
  def allocateStatic[LayoutType <: Layout](
    layout: LayoutType,
  ): Memory[LayoutType, Global] = tag(Arena.global().allocate(layout.toLayout))

  /** Allocates an off-heap memory region that is managed by corresponding java.lang.foreign.Arena.
   * The underlying memory would be freed as soon as associated
   * arena is closed.
   *
   * @param layout
   * Layout of allocated memory
   * @tparam LayoutType
   * Type of the layout
   * @return Memory with corresponding layout and Global region
   */
  def allocateManual[LayoutType <: Layout](
    layout: LayoutType,
    arena: Arena,
  ): Memory[LayoutType, Global] = tag(arena.allocate(layout.toLayout))

  /** Allocates an off-heap memory region that is managed by corresponding Region[Global]. By default it uses the same arena as allocateStatic.
   *
   * @param layout
   * Layout of allocated memory
   * @tparam LayoutType
   * Type of the layout
   * @return Memory with corresponding layout and Global region
   */
  def allocateGlobal[LayoutType <: Layout](layout: LayoutType)(
    implicit
    region: Region[Global],
  ): Memory[LayoutType, Global] = tag(region.allocate(layout))

  implicit class Ops[LayoutType <: Layout, R <: Global](
      private val mem: Memory[LayoutType, R],
  ) extends AnyVal {

    /** Unwraps to java.lang.foreign.MemorySegment
     *
     * @return MemorySegment based on the same memory.
     */
    @inline
    private[alien] def asJava: MemorySegment = cotag(mem)

    /** Splits Memory to the chunks of bytes based on the same memory with size not greater than `chunkSize`.
     *
     * @param chunkSize
     * Size of chunk.
     *
     * @return Iterator to chunks of type java.lang.foreign.MemorySegments.
     */
    def iteratorChunked(chunkSize: Long)(
      implicit
      region: Region[R],
    ): Iterator[MemorySegment] =
      new Iterator[MemorySegment] {

        private val total = cotag(mem).byteSize()
        private val n     = total / chunkSize
        private var i     = 0

        override def hasNext: Boolean = i <= n

        override def next(): MemorySegment = {

          val offset = i * chunkSize
          val limit =
            if (offset + chunkSize < total)
              chunkSize
            else
              total - offset
          i += 1
          cotag(mem).asSlice(offset, limit)
        }

      }

    def /[L1 <: Layout](path: MemoryHandleComposer[LayoutType, L1, `0`])(
      implicit
      region: Region[R],
    ): Memory[L1, R] = tag(cotag(mem).asSlice(path.offset, path.size))

    /** FoldLeft on iterator returned by iteratorChunked.
      *
      * @param chunkSize
      * Size of chunk.
      *
      * @return Folding result.
      */
    def foldChunked[Z](chunkSize: Long)(z: Z)(fold: (Z, MemorySegment) => Z)(
      implicit
      region: Region[R],
    ): Z = iteratorChunked(chunkSize).foldLeft(z)(fold)

    /** Size in bytes of allocated memory.
      *
      * @return Size in bytes.
      */
    @inline
    def allocatedSize(
      implicit
      region: Region[R],
    ): Long = cotag(mem).byteSize()

    /** Copy data from Java NIO channel to memory segment.
      *
      * @param channel Java NIO ReadableByteChannel from which bytes should be read to current memory segment.
      * @param chunkLimit Size of chunks that will be extracted from the channel.
      *
      * @return ReadStatus
      */
    def readFrom(channel: ReadableByteChannel, chunkLimit: Int = Int.MaxValue)(
      implicit
      region: Region[R],
    ): ReadStatus = {
      val total = mem.allocatedSize
      readToSliceFromChannel(offset = 0, limit = total)(
        channel = channel,
        chunkLimit = chunkLimit,
      )
    }

    /** Fills memory with the same `value` byte.
      *
      * @return The same memory.
      */
    def fill(value: Byte)(
      implicit
      region: Region[R],
    ): Memory[LayoutType, R] = tag(cotag(mem).fill(value))

    /** Casts memory segment to byte buffer based on the same memory.
     *
     * @return Readonly `ByteBuffer` that based on the same memory segment as this `Memory`.
     */
    def readOnlyByteBuffer(
      implicit
      region: Region[R],
    ): ByteBuffer = cotag(mem).asByteBuffer().asReadOnlyBuffer()

    /** Copy from array of bytes to `Memory`.
     *
     * @param offset Target offset in bytes. From that offset data would be placed in `Memory`.
     *
     * @return ReadStatus. ReadSucceed on success, or TooManyData on failed bound checking.
     */
    def readFrom(offset: Long, data: Array[Byte])(
      implicit
      region: Region[R],
    ): ReadStatus = {
      val total = cotag(mem).byteSize()
      if (offset + data.length > total)
        return TooManyData(offset + data.length - total)
      cotag(mem)
        .asSlice(offset, data.length)
        .copyFrom(MemorySegment.ofArray(data))
      ReadSucceed
    }

    /** Copy data from Java NIO channel to memory segment slice.
     *
     * @param offset Target offset in bytes from which copy segment would be started.
     * @param limit Length of slice.
     * @param channel Java NIO ReadableByteChannel from which bytes should be read to current memory segment.
     * @param chunkLimit Size of chunks that will be extracted from the channel.
     *
     * @return ReadSucceed on success.
     *         ReadEofReached if eof in channel reached earlier than all slice was filled.
     *         ReadFailed if any exception was caught during copying.
     */
    def readToSliceFromChannel(
      offset: Long,
      limit: Long,
    )(channel: ReadableByteChannel, chunkLimit: Int = Int.MaxValue)(
      implicit
      region: Region[R],
    ): ReadStatus = {
      val total = cotag(mem).byteSize()

      val end = Math.min(offset + limit, total)

      var position  = offset
      var totalRead = 0L

      var eof = false
      try {
        while (!eof && position < end) {
          val sliceLimit =
            if (position + chunkLimit.toLong < end)
              chunkLimit.toLong
            else
              end - position
          val read = channel
            .read(cotag(mem).asSlice(position, sliceLimit).asByteBuffer())

          if (read == -1) {
            eof = true
          } else {
            position += read
            totalRead += read
          }
        }
        if (eof)
          ReadEofReached(totalRead)
        else
          ReadSucceed
      } catch {
        case NonFatal(e) =>
          ReadFailed(e)
      }

    }

    /** Take slice of Memory. Resulting Memory layout would be `BoundedSequence[Value[Byte]]`.
     *
     * @param offset Offset in bytes. Starting point of slice segment.
     * @param length Length of resulting memory segment in bytes.
     *
     * @return Raw Memory of bytes. If bound checking was failed returns `Left(NotEnoughBytesError)`.
     */
    def slice(offset: Long, length: Long)(
      implicit
      region: Region[R],
    ): Either[AcquireError, Memory[BoundedSequence[Value[Byte]], R]] = {
      if (mem.allocatedSize >= offset + length)
        Right(mem.unsafeSlice(offset, length))
      else
        Left(NotEnoughBytesError)
    }

    /** Take unsafe slice of Memory without bound checking. Resulting Memory layout would be `BoundedSequence[Value[Byte]]`.
     *
     * @param offset Offset in bytes. Starting point of slice segment.
     * @param length Length of resulting memory segment in bytes.
     *
     * @return Raw Memory of bytes.
     */
    def unsafeSlice(offset: Long, length: Long)(
      implicit
      region: Region[R],
    ): Memory[BoundedSequence[Value[Byte]], R] =
      tag(cotag(mem).asSlice(offset, length))

    /** Casts all memory to Another Layout.
     *
     * @param another Layout that would be obtained.
     *
     * @return Right(castedMemory) if casts was successful. And Left(NotEnoughBytesError) if new layout size was greater than current `Memory` size.
     */
    def cast[AnotherLayout <: Layout](
      another: AnotherLayout,
    ): Either[AcquireError, Memory[AnotherLayout, R]] = {
      val layout = another.toLayout
      if (cotag(mem).byteSize() >= layout.byteSize())
        Right(tag(cotag(mem).asSlice(0L, layout.byteSize())))
      else
        Left(NotEnoughBytesError)
    }

    /** Obtains a slice from Memory in given offset and casts to any layout.
     *
     * @param another Layout that would be obtained.
     * @param offsetBytes Bytes in offset from which slice would be obtained.
     *
     * @return Right(castedMemory) if casts was successful. And Left(NotEnoughBytesError) if new layout size was greater than current `Memory` size.
     */
    def offsetCast[AnotherLayout <: Layout](
      offsetBytes: Long,
      another: AnotherLayout,
    )(
      implicit
      region: Region[R],
    ): Either[AcquireError, Memory[AnotherLayout, R]] = {
      val layout = another.toLayout
      if (cotag(mem).byteSize() >= layout.byteSize() + offsetBytes) {
        Right(tag(cotag(mem).asSlice(offsetBytes, layout.byteSize())))
      } else {
        Left(NotEnoughBytesError)
      }
    }

    /** Raw copy bytes from this memory to another.
     *
     * @param another Target memory.
     * @param length Length of segment that would be copied.
     * @param offsetFrom Offset in bytes of source memory(this) from which source segment would be started
     * @param offsetTo Offset in bytes of target memory(this) from which target segment would be started.
     */
    def copyBytesTo[L1 <: Layout, R1 <: Global](
      another: Memory[L1, R1],
      length: Long,
      offsetFrom: Long,
      offsetTo: Long,
    )(
      implicit
      region: Region[R],
      region1: Region[R1],
    ): Unit = {
      cotag(another)
        .asSlice(offsetTo, length)
        .copyFrom(cotag(mem).asSlice(offsetFrom, length))
    }

    /** Size of `Memory` in bytes.
     *
     * @return Size in bytes
     */
    def length(
      implicit
      region: Region[R],
    ): Long = cotag(mem).byteSize()

    /** Lexicographically compares two memory segments by bytes.
     *
     * @param that another memory with the same layout
     * @return compareTo result
     */
    def compareTo[R1 <: Global](that: Memory[LayoutType, R1])(
      implicit
      region: Region[R],
      region1: Region[R1],
    ): Long = {

      val mismatch = cotag(mem).mismatch(cotag(that))
      if (mismatch < 0)
        0
      else {
        val aLen = mem.length
        val bLen = that.length

        if (aLen == 0L) {
          -bLen
        } else if (bLen == 0) {
          aLen
        } else if (mismatch >= aLen) {
          -mismatch
        } else if (mismatch >= bLen) {
          mismatch
        } else
          toUnsignedLong(cotag(mem).get(ValueLayout.JAVA_BYTE, mismatch)) -
            toUnsignedLong(cotag(that).get(ValueLayout.JAVA_BYTE, mismatch))
      }
    }

  }

}

sealed trait AcquireError
case object NotEnoughBytesError extends AcquireError

sealed trait CloseError
case object CloseFailed extends CloseError

sealed trait ReadStatus
case class ReadEofReached(read: Long)   extends ReadStatus
case class ReadFailed(cause: Throwable) extends ReadStatus
case class TooManyData(tail: Long)      extends ReadStatus
case object ReadSucceed                 extends ReadStatus
