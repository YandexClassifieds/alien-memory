import java.io.{File, PrintWriter}
import scala.collection.immutable.HashMap

def ctArgs(i: Int, argType: String): String =
  if (i > 0)
    (1 to i).map(x => s"x$x: $argType").mkString(", ", ", ", "")
  else
    ""

def getMethod(
  withRegion: Boolean,
)(argType: String)(name: String, i: Int, tpe: String): String =
  if (withRegion)
    s"def $name[R <: Global](mem: Memory[L, R] ${ctArgs(i, argType)})(implicit region: Region[R]): $tpe"
  else
    s"def $name(mem: Memory[L, Global] ${ctArgs(i, argType)}): $tpe"

def setMethod(
  withRegion: Boolean,
)(argType: String)(name: String, i: Int, tpe: String): String =
  if (withRegion)
    s"def $name[R <: Global](mem: Memory[L, R], value: $tpe ${ctArgs(i, argType)})(implicit region: Region[R]): Unit"
  else
    s"def $name(mem: Memory[L, Global], value: $tpe ${ctArgs(i, argType)}): Unit"

def getMemorySegmentMethod(withRegion: Boolean)(argType: String)(name: String, i: Int, tpe: String): String =
  if (withRegion)
    s"def $name[R <: Global](mem: Memory[L, R] ${ctArgs(i, argType)}, size: Int)(implicit region: Region[R]): MemorySegment"
  else
    s"def $name(mem: Memory[L, Global] ${ctArgs(i, argType)}, size: Int): $tpe"

def generateOffsetCalculation(i: Int): String = {
  var result = "vh.offset0"
  for (j <- 1 to i) {
    result += s" + vh.step$j * x$j + vh.offset$j"
  }
  result
}

val typeLayout = HashMap(
  "Int"     -> "ValueLayout.JAVA_INT",
  "Long"    -> "ValueLayout.JAVA_LONG",
  "Short"   -> "ValueLayout.JAVA_SHORT",
  "Boolean" -> "ValueLayout.JAVA_BOOLEAN",
  "Double"  -> "ValueLayout.JAVA_DOUBLE",
  "Float"   -> "ValueLayout.JAVA_FLOAT",
  "Byte"    -> "ValueLayout.JAVA_BYTE",
  "Char"    -> "ValueLayout.JAVA_CHAR",
)

def getMethodImpl(typ: String, i: Int): String = {
  s"mem.asJava.get(${typeLayout(typ)}, ${generateOffsetCalculation(i)})"
}

def setMethodImpl(typ: String, i: Int): String = {
  s"mem.asJava.set(${typeLayout(typ)}, ${generateOffsetCalculation(i)}, value)"
}

def getMemorySegmentMethodImpl(typ: String, i: Int): String = {
  s"mem.asJava.asSlice(${generateOffsetCalculation(i)}, size * ${typeLayout(typ)}.byteSize())"
}

val methods = List(
  ("get", (getMethod(withRegion = true) _, getMethodImpl _)),
  ("set", (setMethod(withRegion = true) _, setMethodImpl _)),
  ("getMemorySegment", (getMemorySegmentMethod(withRegion = true) _, getMemorySegmentMethodImpl _))
)

def ctParams(i: Int): String =
  if (i > 0)
    s", ${(1 to i).map(x => s"x$x").mkString(", ")}"
  else
    ""


def ops_i(i: Int): String = {
  def fields(i: Int): String = {
    "private[alien] val offset0: Long" +
      (1 to i)
        .map(x =>
          s", private[alien] val step$x: Long, private[alien] val offset$x: Long",
        )
        .mkString("")
  }
  s"""package alien.memory.handle

import alien.memory.*

import scala.Specializable.AllNumeric


case class MemoryPtr$i[L <: Layout, @specialized(AllNumeric) T]private[alien](${fields(i)})
"""
}

def implSyntax(tpe: String, i: Int): String =
  s"""  implicit def ${tpe
    .toLowerCase}${i}Ops[L <: Layout](vh: MemoryPtr$i[L, $tpe]): $tpe${i}Ops[L] = $tpe${i}Ops(vh)"""

def impl(tpe: String, i: Int): String =
  s"""  implicit final class ${tpe}${i}Ops[L <: Layout](protected val vh: MemoryPtr$i[L, $tpe]) extends AnyVal {



${methods
    .flatMap { case (names, (method, impl)) =>
      names
        .split("\n")
        .map { n =>
          if (i == 0) {
            s"""
              @IntrinsicCandidate
              @inline
              ${method("")(n, i, tpe)} = ${impl(tpe, i)}
              """.stripMargin
          } else {
            s"""
              @IntrinsicCandidate
              @inline
              ${method("Long")(n, i, tpe)} = ${impl(tpe, i)}
              """.stripMargin ++ s"""
              @IntrinsicCandidate
              @inline
              ${method("Int")(n, i, tpe)} = ${impl(tpe, i)}
              """.stripMargin
          }
        }
    }
    .mkString}
      }
     """.stripMargin

def memoryHandle =
  s"""package alien.memory.handle

import alien.memory.{Global, Layout, Memory, Region}
import jdk.internal.vm.annotation.IntrinsicCandidate

import java.lang.foreign.{MemorySegment, ValueLayout}

object MemoryHandle {
    trait MemoryHandleSyntax {
    ${{
    for {
      tpe <- List("Byte", "Short", "Char", "Int", "Long", "Float", "Double")
      i   <- 0 to 9
    } yield implSyntax(tpe, i)
  }.mkString("\n")}

    }
${{
    for {
      tpe <- List("Byte", "Short", "Char", "Int", "Long", "Float", "Double")
      i   <- 0 to 9
    } yield impl(tpe, i)
  }.mkString("\n")}
}
"""

def writeToFile(filename: String, contents: String): Unit = {
  val writer = new PrintWriter(new File(filename))
  writer.write(contents)
  writer.flush()
  writer.close()
}

for (i <- 0 to 9) {
  writeToFile(
    s"src/main/scala/alien/memory/handle/MemoryPtr$i.generated.scala",
    ops_i(i),
  )
}
writeToFile(
  s"src/main/scala/alien/memory/handle/MemoryHandle.generated.scala",
  memoryHandle,
)
