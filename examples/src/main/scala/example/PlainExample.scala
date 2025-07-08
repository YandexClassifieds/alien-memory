package example

import alien.memory.*

object PlainExample extends App {

  val b = "b" := Values.Int * 10 * 5

  val vh = b / "b" / % / % / $

  Region
    .named["PlainExample"]
    .confined { implicit region =>
      val m = "matrix" := Values.Int * 2 * 3
      val a = "array" := Values.Int * 3
      val n = "n" := Values.Int

      val layout = m >>: ("inner" := a >>: n)

      val memory = Memory.allocate(layout)
      val matrixVh = layout / "matrix" / % / % / $
      val arrayVH = layout / "inner" / "array" / % / $

      val matrixData = Array(Array(1, 2), Array(3, 4), Array(5, 6))
      val arrayData = Array(10, 20, 30)
      for {
        i <- matrixData.indices
        j <- matrixData(i).indices
      } {

        matrixVh.set(memory, matrixData(i)(j), i, j)
      }
      arrayData.zipWithIndex
        .foreach { case (v, i) =>
          arrayVH.set(memory, v, i)
        }
    }
}
