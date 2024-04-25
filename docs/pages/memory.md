# Memory

```Memory[L <: LayoutType, R <: Global]``` - обертка над ```java.lang.foreign.MemorySegment```. Позволяет выделять
off-heap память для схем данных описанных через Layout. Первый параметр `L` - это тип layout для которого аллоцирована
эта память. Второй параметр `R` - это тег региона внутри которого был аллоцирован этот сегмент памяти.

Для доступа к сегменту памяти следует использовать `MemoryPtr*`

## Аллокации

Все аллокации осуществляются с помощью ##malloc## установленного в системе.
> По умолчанию все аллоцированные области заполняются нолями, чтобы этим пренебречь укажите ##JVM## флаг:
  ```-J-Djdk.internal.foreign.skipZeroMemory=true```

Для аллокации сегментов есть следующие методы

### ##allocate##

Использует методы аллокации региона лежащего в имплицитном контексте.

```scala
implicit val region = Region.fresh.newShared()
val memory = Memory.allocateGC(layout)
region.close()
```


### ##allocateGC##

Память проаллоцируется в offheap, но сборкой ее будет заниматься указанный сборщик мусора ##JVM##. Все такие сегменты памяти будут иметь тайп-тег ```Global```.

```scala
val layout = ("a" := Values.Int) >>: ("b" := Values.Int)
val memory = Memory.allocateGC(layout) // память лежит в offheap, но собирается сборщиком
```


### ##allocateStatic##

Аллоцирует память, которая не удалится никогда и будет жить до окончания программы. Все такие сегменты памяти будут иметь тип-тег ```Global```.

```scala
val layout = ("a" := Values.Int) >>: ("b" := Values.Int)
val memory = Memory.allocateStatic(layout)
```

### ##allocateManual##

Аллоцирует память с помощью переданной ```java.lang.foreign.Arena```. Все такие сегменты памяти будут иметь тип-тег ```Global```.

```scala
val layout = ("a" := Values.Int) >>: ("b" := Values.Int)
val memory = Memory.allocateManual(layout, Arena.ofAuto())
```


### ##allocateGlobal##

Аллоцирует память с помощью региона с тегом ```Global``` взятым из имплицитного контекста. Все такие сегменты памяти будут иметь тип-тег ```Global```.

```scala
val layout = ("a" := Values.Int) >>: ("b" := Values.Int)
val memory = Memory.allocateGlobal(layout)
```


## Байт-буферы

Каждый объект типа `Memory` можно преобразовывать в соответсвующий `ByteBuffer` и обратно. Обе структуры будут указывать на один и тот же сегмент памяти, вне зависимости от того где он лежит.

```scala
val heapMemory = Memory.ofArray(new Array[Byte](128))
val byteBuffer = Memory.readOnlyByteBuffer()
val memory = Memory.ofByteBuffer(byteBuffer)
```
