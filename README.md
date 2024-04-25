# alien

Библиотека для типобезопасной работы с прямым доступом к памяти через
примитивы Foreign Function & Memory API из JDK 22.

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

# Начало работы

Для использования библиотеки, добавьте следующую зависимость в файл `build.sbt` вашего проекта:

```scala
libraryDependencies += "com.yandex.classifieds" %% "alien-memory" % "0.1.0"
```
### Поддерживаемые версии

Библиотека доступна для использования в следующих версиях:

- Scala 2.13
- Java 21 и Java 22

На момент выпуска Java 21, [Foreign Function & Memory API](https://openjdk.org/jeps/442) находилось в стадии превью, поэтому рекомендуется использовать предпочтительную версию Java 22.

# Документация

Документацию можно найти [здесь](https://yandexclassifieds.github.io/alien-memory/).
