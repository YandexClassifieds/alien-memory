# alien

Библиотека для типобезопасной работы с прямым доступом к памяти через
примитивы Foreign Function & Memory API из JDK 22.

Доступна только для scala 2.13

## Основные понятия

### Layout

Layout - описание схемы данных, хранящихся в памяти. В основе лежит `java.lang.foreign.MemoryLayout`.

Схема собирается из кирпичиков:

- [Value](memory/src/main/scala/alien/memory/layout/Value.scala) - элементарный слой для целых чисел, символов и т.д.
  ```scala
  val a = Values.Long //  слой под Long значения
  ```
- [Sequence](memory/src/main/scala/alien/memory/layout/Sequence.scala): BoundedSequence - контейнер для
  последовательности данных одного типа.
  Упрощенно можно собирать последовательности с помощью оператора *, это повышает читабельность для матриц.
  ```scala
  val a = Values.Long * 2 * 5 // матрица с 5 строчками и 2 столбцами
  ```
- [Aligned](memory/src/main/scala/alien/memory/layout/Aligned.scala) - контейнер группы данных, который задает
  выравнивание в
  байтах для нижележащих данных.
- [Padding](memory/src/main/scala/alien/memory/layout/Padding.scala) - "пробел" в памяти. В нем не хранятся данные,
  добавляет
  смещение в байтах перед нижележащим элементом.
- [Dynamic](memory/src/main/scala/alien/memory/layout/DynamicLayout.scala) - контейнер группы данных. Выделяются два
  типа:
  структуры и объединения.
  Например, описываем массив целых чисел размера N и массив чисел с плавающей точкой размера`M`.

  [Структуры](https://ru.wikipedia.org/wiki/Структура_(язык_Си)) записывают в память данные своих полей последовательно(
  то же самое что и struct из C).

  [Объединения](https://ru.wikipedia.org/wiki/Объединение_(структура_данных)) же могут содержать что-то одно из 2 (то же
  самое что и union из C)

В alien для конструирования разметок используются операторы:

  ```scala
      <>: - дополнение текущего объединения другим объединением

>> - инициализация слоя: переданный в такой конструктор name := layout теперь считается структурой или обьеденением из одного элемента
, ее можно
  присоединять к другим структурам

>>: - дополнение текущей структуры другой структурой
  ```

Части структур и объединений нужно именовать с помощью оператора :=.
Пример:

  ```scala
  val a = "matrix" := Values.Long * 7 * 2 // матрица с именем matrix
val b = "array" := Values.Long * 5 // массив с именем array
val layout: ("matrix" := BoundedSequence[BoundedSequence[Value[Long]]]) >>:
  (>>["array" := BoundedSequence[Value[Long]]]) = a >>: b // структура из матрицы и массива
  ```

#### Note

При построении layout нужно учитывать, что действует обратная (правая) ассоциативность. Например, при создании
матрицы

```
val memL = "bitmap" := (Values.Long * height) * width
```

Сначала формируется одна строчка на height ячеек, потом она вниз растягивается на width.

### [Path и MemoryPtr](memory/src/main/scala/alien/memory/Path.scala)

Для того чтобы получить доступ к самой памяти, нужно получить относительный указатель на нее `MemoryPtr*`. Он
используется для того чтобы эффективно обращаться в память по нужным смещениям. `Path` используется для навигации по
сложной структуре данных, описанных через `Layout`.
Начинается с корневого Layout. Углубляемся внутрь через оператор `/`.
Далее допустимые термы:

|      терм      | применим на Layout |                                  куда углубляемся                                   |
|:--------------:|:------------------:|:-----------------------------------------------------------------------------------:|
| "_<имя слоя>_" |      Dynamic       |                                в слой с этим именем                                 |
|       i        |      Sequence      |                          в i-й элемент последовательности                           |
|     (n, m)     |      Sequence      | в подмножество элементов, а именно начиная с элемента n, далее каждый m-ный элемент |
|       %        |      Sequence      |                        в каждый элементов последовательности                        |
|       $        |       Value        |                                никуда, конечный терм                                |

В зависимости от того сколько операторов `%` и `(n, m)` было использовано в `Path` будет возвращен
соответствующий `MemoryPtr*`(существуют `MemoryPtr0`, `MemoryPtr1`, ..., `MemoryPtr9`).

Примеры:

```scala
val matrixLayout = Values.Long * 5 * 6
val matrixPtr = maxtrixLayout / % / % / $ // слой - матрица, не усложненная структурами
val namedLayout = "matrix" := (Values.Long * 5 * 6)
val matrix = namedLayout / "matrix" / % / % / $
val oneRow = namedLayout / "matrix" / 0 / % / $
val oneColumn = namedLayout / "matrix" / % / 0 / $
// заполнение матрицы нулями
for (i <- 0 until 6) {
  for (j <- 0 until 5) {
    matrixPtr.set(memory, 0, i, j)
  }
}
// заполнение одной строки нулями
for (i <- 0 until 5) {
  oneRow.set(memory, 0, i)
}
```

### [Region](memory/src/main/scala/alien/memory/Region.scala)

Для того чтобы более безопасно обращаться к памяти. Каждая аллокация памяти привязывается к некоторому implicit scope,
так называемому `Region[R <: Global]`. Тайп параметр `R` это некоторый(необязательно уникальный) тег для каждого
региона. Каждый тег наследуется от тега Global, которым тегируется аллокации которые либо сделаны небезопасным путем,
либо убираются сборщиком мусора, либо не удаляются никогда. Cам`Region[R]` это обертка вокруг `java.lang.foreign.Arena`.
Регионы `confined`, `shared` и `slicing` соответсвуют одноименным аренам из JDK.

```scala
val layout = Values.Int * 100
val ptr = layout / % / $
val leakedMemory = Region.named["ImplicitScope"].confined {
  val memory = Memory.allocate(layout)

  for (i <- 0 until 100) {
    ptr.set(memory, -i, i)
  }
  memory
}

Region.named["AnotherScope"].confined {
  ptr.set(leakedMemory, 0, i) // не скомпилируется
}

Region.named["ImplicitScope"].confined {
  ptr.set(leakedMemory, 0, i) // скомпилируется
}
```

Для того чтобы избежать колизий имен, можно использовать `Region.fresh`, он самостоятельно сгенерируется уникальный тег.

```scala
Region.fresh.shared {
  val memory = Memory.allocate(layout)
  ptr.set(memory, 0, i)
}
```

### [Memory](memory/src/main/scala/alien/memory/Memory.scala)

```Memory[L <: LayoutType, R <: Global]``` - обертка над ```java.lang.foreign.MemorySegment```. Позволяет выделять
off-heap память для схем данных описанных через Layout. Первый параметр `L` - это тип layout для которого аллоцирована
эта память. Второй параметр `R` - это тэг региона внутри которого был аллоцирован этот сегмент памяти.

Для доступа к сегменту памяти следует использоавть `MemoryPtr*`

```scala
val layout = ("a" := Values.Int) >>: ("b" := Values.Int)
val memory = Memory.allocateGC(layout) // память лежит в offheap, но собирается сборщиком

```

## Использование:

Подключить библиотеку в build.sbt

```
libraryDependencies += "com.yandex" %% "alien-memory" % "0.2.0"
```
