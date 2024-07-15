# Memory

```Memory[L <: LayoutType, R <: Global]``` is a wrapper over ```java.lang.foreign.MemorySegment```. Allows to allocate
off-heap memory for data structures defined with [Layout](./layouts.md).

`L` - layout type for which this memory is allocated.
`R` -  region tag where this segment should be allocated

To access memory segment use `MemoryPtr*`

## Allocations

All allocations use system's ##malloc## .
> By default, all allocated regions are initialized with 0s. To override this behaviour use ##JVM## parameter:
  ```-J-Djdk.internal.foreign.skipZeroMemory=true```

There are following methods for different allocations

### ##allocate##

Allocations use implicit region's properties

```scala
implicit val region = Region.fresh.newShared()
val memory = Memory.allocateGC(layout)
region.close()
```


### ##allocateGC##

Off-heap memory is allocated, but ##JVM## garbage collector will manage it. All such memory segments will have ```Global``` TypeTag.

```scala
val layout = ("a" := Values.Int) >>: ("b" := Values.Int)
val memory = Memory.allocateGC(layout) // память лежит в offheap, но собирается сборщиком
```


### ##allocateStatic##

Allocated memory will never be collected and will be allocated as long as program runs. All such memory segments will have ```Global``` TypeTag.

```scala
val layout = ("a" := Values.Int) >>: ("b" := Values.Int)
val memory = Memory.allocateStatic(layout)
```

### ##allocateManual##

Allocates memory using the passed ```java.lang.foreign.Arena```. All such memory segments will have ```Global``` TypeTag.

```scala
val layout = ("a" := Values.Int) >>: ("b" := Values.Int)
val memory = Memory.allocateManual(layout, Arena.ofAuto())
```


### ##allocateGlobal##

Allocates memory using Region tagged ```Global``` from implicit context. All such memory segments will have ```Global``` TypeTag.

```scala
val layout = ("a" := Values.Int) >>: ("b" := Values.Int)
val memory = Memory.allocateGlobal(layout)
```


## Byte buffers

Objects with type `Memory` can be transformed to and back from `ByteBuffer`. Both structures will point to the same
memory segment regardless where it was located

```scala
val heapMemory = Memory.ofArray(new Array[Byte](128))
val byteBuffer = Memory.readOnlyByteBuffer()
val memory = Memory.ofByteBuffer(byteBuffer)
```
