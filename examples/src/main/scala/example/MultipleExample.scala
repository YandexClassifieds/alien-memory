package example

import alien.memory.*

object MultipleExample extends App {

  val a: "a" := BoundedSequence[Value[Long]] = "a" := Values.Long * 10
  val b: "b" := BoundedSequence[Value[Long]] = "b" := Values.Long * 20

  val c: "c" := BoundedSequence[Value[Long]] = "c" := Values.Long * 30

  val d: "d" := BoundedSequence[BoundedSequence[Value[Char]]] =
    "d" := Values.Char * 10 * 5

  val layout = a >>: b >>: c >>: d

  Region
    .named["MultipleExample"]
    .confined { implicit region =>
      val mem = Memory.allocate(layout)

      val ptrA = layout / "a" / 0 / $
      val ptrB = layout / "b" / 0 / $
      val ptrC = layout / "d" / 0 / 0 / $
      val ptrD = layout / "d" / 0 / 0 / $

      ptrA.set(mem, 17)
      println(s"${ptrA.get(mem)}") // res = 17

      ptrB.set(mem, 23)
      println(s"${ptrB.get(mem)}") // res = 23

      ptrD.set(mem, 'A')
      println(s"${ptrD.get(mem)}") // res = A
    }
}
