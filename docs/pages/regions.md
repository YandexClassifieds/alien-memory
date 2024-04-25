# Region

Для обеспечения безопасного доступа к памяти каждая выделенная область памяти привязывается к implicit scope, с типом `Region[R <: Global]`. 

`Region[R]` представляет собой обертку над `java.lang.foreign.Arena`. Регионы `confined`, `shared` и `slicing` соответствуют аренам из JDK, предоставляя различные уровни ограничения и доступа к выделенным областям памяти.

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
  ptr.set(leakedMemory, 0, i) // не скомпилируется
}

```

## Теги

Каждая выделенная область памяти имеет тип-тег `R`, который соответствует параметру в `Region[R]`. Все аллокации сделанные с помошью `Region[R]`, будут иметь тот же тип-тег. Этот тип `R` является меткой для каждого региона памяти. Каждая метка наследуется от метки `Global`, которая применяется к выделениям памяти, сделанным не в безопасном режиме, выделенным сборщиком мусора или не подлежащим удалению.
### Fresh

Вы можете использовать метод `Region.fresh`, который автоматически генерирует уникальную метку во время компиляции, что полезно, если вы создаете множество регионов и хотите избежать конфликтов имен.

```scala 
Region.fresh.confined { implicit region => 
  val memory = Memory.allocate(layout) // Memory[LayoutType, RandomComiletimeTag]
}
```

### Named

Вы также можете явно указывать имена тегов.

```scala 
Region.named["ScopeName"].confined { implicit region => 
  val memory = Memory.allocate(layout) // Memory[LayoutType, NamedMark["ScopeName"]]
}
```

### Global

Глобальный тип-тег от которого наседуютяс все остальные теги. Вы можете переопределить глобальный тип-тег с помощью метода `Region.newGlobal`, обернув какую-то область памяти. По умолчанию этот тип соответствует `Arena.global()` из `java.lang.foreign`.

```scala
val customArena = ...
implicit val newGlobalArena = Region.newGlobal(customArena)

val memory = Memory.allocateGlobal(layout)
```


## Арены

Внутри каждого региона находится объект `Arena` из пакета `java.lang.foreign`. Каждая арена определяет свои уровни ограничений и имеет различные стратегии выделения и освобождения памяти.

### Confined

Все аллокации памяти, выполненные с помощью такого региона, будут доступны только из потока, который их произвел. Такие аллокации и освобождения памяти производятся быстрее по сравнению с ареной, доступной из разных потоков.

```scala

Region.fresh.confined { implicit region =>
  val memory = Memory.allocate(layout)
  ptr.get(memory, 0)
  val anotherThread = new Thread {
    override def run(): Unit =
      ptr.get(memory, 0) // выкинет ошибку
  }
  anotherThread.start()
  anotherThread.join()
}

```

### Shared

Все аллокации памяти, выполненные с помощью такого региона, будут доступны из любого потока. Такие аллокации и освобождения памяти производятся медление по сравнению с ареной, доступной из одного потока.


```scala

Region.fresh.shared { implicit region =>
  val memory = Memory.allocate(layout)
  ptr.get(memory, 0)
  val anotherThread = new Thread {
    override def run(): Unit =
      ptr.get(memory, 0) // все будет работать
  }
  anotherThread.start()
  anotherThread.join()
}
```

### Slicing

`Slicing` будет выполнять аллокации последовательно на заранее выделенном участке памяти. Такой участок памяти может находиться как в `confined`, так и в `shared` арене. Однако сами аллокации в такой арене не являются потокобезопасными.

```scala
val layout1 = Values.Long * 16
val layout2 = Values.Char * 12
Region.fresh.confinedSlicing(128, 8) { implicit region => 
  val memory1 = Memory.allocate(layout1) // в начале преаллоцированной памяти разместится первый сегмент
  val memory2 = Memory.allocate(layout2) // этот сегмент разместится сразу после
}
```

### Custom

Так-же в регион можно обернуть любую собственную арену.

```scala
val newCustomArena = new Arena { ... }
Region.fresh.custom(newCustomArena) { implicit region => 
  val memory = Memory.allocate(layout) // в начале преаллоцированной памяти разместится первый сегмент
}
```