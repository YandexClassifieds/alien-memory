# alien

Alien is a library for type safe direct memory access using structures introduced in
JDK 22 [Foreign Function & Memory API](https://openjdk.org/jeps/454).

```scala
Region.fresh.shared { implicit region =>
  val layout = ("a" := Values.Long) >>:
               ("seq" := Values.Long * 123) >>:
               ("b" := Values.Char)
  val ptr = layout / "seq" / % / $
  val memory = Memory.allocate(layout)
  ptr.set(memory, 0, 42)
}

```

# Getting started

Add alien as a dependency to your `build.sbt`:

```scala
libraryDependencies += "com.yandex.classifieds" %% "alien-memory" % "0.1.0"
```
### Compatibility

Alien can be used with

- Scala 2.13
- Java 21 or Java 22

At the time of the release of Java 21, the Foreign Function & Memory API was in the preview stage, so it is recommended to use Java 22 with a final version of FFM.

# Docs

More detailed docs can be found [here](https://yandexclassifieds.github.io/alien-memory/).
