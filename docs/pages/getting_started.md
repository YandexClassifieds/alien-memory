# Getting started

Add alien as a dependency to project's `build.sbt`:

```scala
libraryDependencies += "com.yandex.classifieds" %% "alien-memory" % "0.1.0"
```
### Compatibility

Alien can be used with

- Scala 2.13
- Java 21 or Java 22

Java 21 release contains preview version of [Foreign Function & Memory API](https://openjdk.org/jeps/442) thus using Java 22 with final version of FFM is recommended.
