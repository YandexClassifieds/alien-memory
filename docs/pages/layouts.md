# Layout

Layout is a description of data structures stored in foreign memory. It is based on `java.lang.foreign.MemoryLayout`.

Layout has the following building blocks:

- `Value` - a basic layer for primitive types: numbers, characters, etc
  ```scala
  val a = Values.Long //  layer for Long type values
  ```
- `BoundedSequence` - container for sequences of same-type data.
  Sequences can be built using `*`, which makes matrix data definitions more readable
  ```scala
  val a = Values.Long * 2 * 5 // matrix with 5 rows * 2 columns
  ```
- `Aligned` - container for data sequence that specifies byte alignment for the underlying data.
  ```scala
  val aligned = (Values.Long * 2 * 5).align[`2^8`] //  allocated memory address is a multiple of 256.
  ```
- `Padding` - A "gap" in memory that doesn't store any meaningful data, but adds a byte offset before the next element.

  ```scala
  val onlyPadding = Padding(32) // 32 empty bytes
  ```
- `Dynamic` - container for a group of data. There are 2 types: structures and unions.

  [Structures](https://en.wikipedia.org/wiki/Struct_(C_programming_language)) has data of their fields written sequentially
  (same as struct in C).

  [Unions](https://en.wikipedia.org/wiki/Union_type), on the other hand,  can contain one of two values (same as union from C)

  alien has the following constructs to build dynamic layout:

  ```scala
  <>: // adds this union to existing union

  >> // initialize layer:  name := layout passed to this constructor is now a union with 1 element

  >>: // add new structure to existing structure
  ```

  Parts of unions and structures may be named using `:=`.

  For example:

  ```scala
  val a = "matrix" := Values.Long * 7 * 2 //  matrix named 'matrix'
  val b = "array" := Values.Long * 5 // array named 'array'
  val layout: ("matrix" := BoundedSequence[BoundedSequence[Value[Long]]]) >>:
              (>>["array" := BoundedSequence[Value[Long]]]) = a >>: b // structure containing matrix and array
  ```

### Note

 When constructing `Layout` please, note, that it's dimensions have _reverse order_
 compared to mathematics or programming languages

```scala
val memL = "bitmap" := (Values.Long * columns) * rows // creates matrix rows*columns
```

