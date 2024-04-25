# Path и MemoryPtr

Для того чтобы получить доступ к самой памяти, нужно получить относительный указатель на нее `MemoryPtr*`. Он используется для того чтобы эффективно обращаться в память по нужным смещениям. `Path` используется для навигации по сложной структуре данных, описанных через `Layout`.
Навигация начинается с корневого Layout. Углубляемся внутрь через оператор `/`, аналогично файловой системе.

#### Пример:
```scala
val structLayout = ("a" := Values.Long) >>:
                   ("sequence" := Values.Long * 123) >>:
                   ("b" := Values.Char)
val aPtr = structLayout / "a" / $ // MemoryPtr0, указатель на поле a
val sequencePtr = structLayout / "sequence" / % / $ // MemoryPtr1, указатель с размерностью 1, параметризован индексом массива sequence
val sequence2Ptr = structLayout / "sequence" / 12 / $ // MemoryPtr0, указатель на 14 элемент массива sequence

```
## Таблица термов для `Path`

|       Терм       | Применим на Layout |                                  Куда углубляемся                                   |
|:----------------:|:------------------:|:-----------------------------------------------------------------------------------:|
| `"_<имя слоя>_"` |      Dynamic       |                                В слой с этим именем                                 |
|       `i`        |      Sequence      |                          В i-й элемент последовательности                           |
|     `(n, m)`     |      Sequence      | В подмножество элементов, а именно начиная с элемента n, далее каждый m-ный элемент |
|       `%`        |      Sequence      |                        В каждый элементов последовательности                        |
|       `$`        |       Value        |                                Никуда, конечный слой                                |

В зависимости от того сколько операторов `%` и `(n, m)` было использовано в `Path` будет возвращен
соответствующий `MemoryPtr*`(существуют `MemoryPtr0`, `MemoryPtr1`, ..., `MemoryPtr9`).

#### Больше примеров:

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

## Доступ к памяти

Чтение и запись данных осуществляется через объект `MemoryPtr*` и два метода.

* ```get(memory: Memory[L, R], i1: Long, ...)```
* ```set(memory: Memory[L, R], value: V, i1: Long, ...)```

Количество индексов в методах соответствует размерности `MemoryPtr*`. Доступ к памяти возможен только для примитивных типов данных, таких как:

* ##Byte##
* ##Short##
* ##Int##
* ##Long##
* ##Float##
* ##Double##
* ##Char##
* ##Boolean##
