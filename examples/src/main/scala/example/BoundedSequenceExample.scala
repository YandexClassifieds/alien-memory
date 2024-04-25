package example

import alien.memory.*

object BoundedSequenceExample extends App {
  val layout = >>("layout" := Values.Long * 10)

  val ptr = layout / "layout" / % / $
  Region
    .named["A"]
    .confined { implicit region =>
      val mem = Memory.allocate(layout)
      ptr.set(mem, 15, 3)
      ptr.set(mem, 16, 4)
      ptr.set(mem, 17, 5)
      println(s"${ptr.get(mem, 0)}") // res = 0 (default value)
      println(s"${ptr.get(mem, 3)}") // res = 15
      println(s"${ptr.get(mem, 4)}") // res = 16
      println(s"${ptr.get(mem, 5)}") // res = 17
    }
}
