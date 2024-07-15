# Region

To ensure safe memory access, every allocated memory region is bound to an implicit scope with `Region[R <: Global]` type.

`Region[R]` is a wrapper over `java.lang.foreign.Arena`. The `confined`, `shared` and `slicing` regions match JDK arenas,
providing various level's of confinement and access to allocated memory.

```scala
val layout = Values.Int * 100
val ptr = layout / % / $
val leakedMemory = Region.fresh.confined { implicit region =>
  val memory = Memory.allocate(layout)

  for (i <- 0 until 100) {
    ptr.set(memory, -i, i)
  }
  memory
}

Region.fresh.confined { implicit region =>
  ptr.set(leakedMemory, 0, i) // won't compile
}

```

## Tags

Each allocated memory region has a type tag `R`, matching a type parameter in `Region[R]`. All allocations made with
`Region[R]` will have the same type tag. This type `R` serves as a label for each memory region. Every tag is a descendant
of the `Global` tag which is applied to memory allocations made in an unsafe mode, not managed by GC and that are never
deallocated. See [documentation of Arenas for more detailed info](https://docs.oracle.com/en/java/javase/22/core/memory-segments-and-arenas.html)

### Fresh

`Region.fresh` generates a unique label at compile time. That's particularly useful if many regions are going to be allocated
to avoid name conflicts.

```scala
Region.fresh.confined { implicit region =>
  val memory = Memory.allocate(layout) // Memory[LayoutType, RandomCompiletimeTag]
}
```

### Named

Tag names can be specified explicitly.

```scala
Region.named["ScopeName"].confined { implicit region =>
  val memory = Memory.allocate(layout) // Memory[LayoutType, NamedMark["ScopeName"]]
}
```

### Global

Parent type tag for all the other tags. Global type tag can be overrided using `Region.newGlobal` method, providing
a specific memory segment. By default, same as `Arena.global()` from `java.lang.foreign`.

```scala
val customArena = ...
implicit val newGlobalArena = Region.newGlobal(customArena)

val memory = Memory.allocateGlobal(layout)
```


## Arenas

Every `Region` contains `java.lang.foreign.Arena`. There are several types of arenas, each with their own confinement levels
and strategies for allocation and de-allocation. For detailed info, please refer to [official Java FFM API docs](https://docs.oracle.com/en/java/javase/22/core/memory-segments-and-arenas.html)

### Confined

All allocations, made with such region will be available only from owner thread.
Such allocations and de-allocations are faster than shared arenas.

```scala

Region.fresh.confined { implicit region =>
  val memory = Memory.allocate(layout)
  ptr.get(memory, 0)
  val anotherThread = new Thread {
    override def run(): Unit =
      ptr.get(memory, 0) // throws error
  }
  anotherThread.start()
  anotherThread.join()
}

```

### Shared

Shared region allocations are available for every thread. Allocations and de-allocations are slower compared to confined regions.

```scala

Region.fresh.shared { implicit region =>
  val memory = Memory.allocate(layout)
  ptr.get(memory, 0)
  val anotherThread = new Thread {
    override def run(): Unit =
      ptr.get(memory, 0) // works fine
  }
  anotherThread.start()
  anotherThread.join()
}
```

### Slicing

`Slicing`  will do consecutive allocations within the pre-allocated memory region. Such region can be in either `confined` or
`shared` Arena. Such allocations are not thread safe.

```scala
val layout1 = Values.Long * 16
val layout2 = Values.Char * 12
Region.fresh.confinedSlicing(128, 8) { implicit region =>
  val memory1 = Memory.allocate(layout1) // the first segment will be at the beginning of pre-allocated memory
  val memory2 = Memory.allocate(layout2) // this segment will be right after the first
}
```

### Custom

Region can be used with any custom arena.

```scala
val newCustomArena = new Arena { ... }
Region.fresh.custom(newCustomArena) { implicit region =>
  val memory = Memory.allocate(layout)
}
```
