# Path и MemoryPtr

To access allocated memory, you need to obtain a relative pointer to it `MemoryPtr*`
It is used to efficiently access memory at specific offsets.

`Path` is used to navigate complex data structures defined via `Layout`.
Navigation starts with the root Layout. Next layers are accessed using `/`, same as in file systems.

#### Examples

```scala
val structLayout = ("a" := Values.Long) >>:
  ("sequence" := Values.Long * 123) >>:
  ("b" := Values.Char)
val aPtr = structLayout / "a" / $ // MemoryPtr0 referencing 'a' field
val sequencePtr = structLayout / "sequence" / % / $ // MemoryPtr1, size-1 pointer, parametrized with index in 'sequence' array
val sequence2Ptr = structLayout / "sequence" / 12 / $ // MemoryPtr0, referencing 12th element of 'sequence' array

```

## Terms used with `Path`

|        Term        | Layout type |                              Points to                               |
|:------------------:|:-----------:|:--------------------------------------------------------------------:|
| `"_<layer_name>_"` |   Dynamic   |                       Layer with defined name                        |
|        `i`         |  Sequence   |                      sequence element number i                       |
|      `(n, m)`      |  Sequence   | Subsequence of elements starting with n and then every m'th elements |
|        `%`         |  Sequence   |                      Every element in sequence                       |
|        `$`         |    Value    |                         nowhere, final layer                         |

Depending on a number of `%` and `(n, m)` used in `Path` `MemoryPtr*` of the corresponding size will be returned
(there are `MemoryPtr0`, `MemoryPtr1`, ..., `MemoryPtr9`).

#### More examples

```scala
val matrixLayout = Values.Long * 5 * 6
val matrixPtr = maxtrixLayout / % / % / $ // matrix layer, without additional structures
val namedLayout = "matrix" := (Values.Long * 5 * 6)
val matrix = namedLayout / "matrix" / % / % / $
val oneRow = namedLayout / "matrix" / 0 / % / $
val oneColumn = namedLayout / "matrix" / % / 0 / $
// filling matrix with zeroes
for (i <- 0 until 6) {
  for (j <- 0 until 5) {
    matrixPtr.set(memory, 0, i, j)
  }
}
// filling one line with zeroes
for (i <- 0 until 5) {
  oneRow.set(memory, 0, i)
}
```

## Accessing memory

Reading from and writing to memory is done via `MemoryPtr*` and two methods:

* ```get(memory: Memory[L, R], i1: Long, ...)```
* ```set(memory: Memory[L, R], value: V, i1: Long, ...)```

Number of indices in methods is the same as `MemoryPtr*` size. Only primitive types can be read from memory, such as:

* ##Byte##
* ##Short##
* ##Int##
* ##Long##
* ##Float##
* ##Double##
* ##Char##
* ##Boolean##
