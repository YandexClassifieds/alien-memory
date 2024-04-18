package alien.memory.layout

import alien.memory.layout.Value

import java.lang.foreign.ValueLayout

case object Values {
  val Byte: Value[Byte]       = Value[Byte](ValueLayout.JAVA_BYTE)
  val Short: Value[Short]     = Value[Short](ValueLayout.JAVA_SHORT)
  val Int: Value[Int]         = Value[Int](ValueLayout.JAVA_INT)
  val Long: Value[Long]       = Value[Long](ValueLayout.JAVA_LONG)
  val Float: Value[Float]     = Value[Float](ValueLayout.JAVA_FLOAT)
  val Double: Value[Double]   = Value[Double](ValueLayout.JAVA_DOUBLE)
  val Char: Value[Char]       = Value[Char](ValueLayout.JAVA_CHAR)
  val Boolean: Value[Boolean] = Value[Boolean](ValueLayout.JAVA_BOOLEAN)
}
