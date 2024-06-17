import org.scalafmt.interfaces.Scalafmt

import java.io.{File, PrintWriter}
import scala.collection.immutable.HashMap
import java.nio.file.Paths

object HandleBoiler {

  val scalafmt = Scalafmt.create(this.getClass.getClassLoader)
  val config   = Paths.get(".scalafmt.conf")

  def format(source: String): String = {
    scalafmt.format(config, Paths.get("Generated.scala"), source)
  }

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

  def casMethod(
    withRegion: Boolean,
  )(argType: String)(name: String, i: Int, tpe: String): String =
    if (withRegion)
      s"def $name[R <: Global](mem: Memory[L, R], expectedValue: $tpe, newValue: $tpe ${ctArgs(i, argType)})(implicit region: Region[R]): Boolean"
    else
      s"def $name(mem: Memory[L], expectedValue: $tpe, newValue: $tpe ${ctArgs(i, argType)}): Boolean"

  def generateOffsetCalculation(i: Int): String = {
    var result = "vh.offset0"
    for (j <- 1 to i) {
      result += s" + vh.step$j * x$j + vh.offset$j"
    }
    result
  }

  val typeSize = HashMap(
    "Int"     -> "2",
    "Long"    -> "3",
    "Short"   -> "1",
    "Boolean" -> "0",
    "Double"  -> "3",
    "Float"   -> "2",
    "Byte"    -> "0",
    "Char"    -> "1",
  )

  val vhName = (x: String) => x.toLowerCase() + "Vh"

  def getMethodImpl(name: String)(typ: String, i: Int): String = {
    s"${vhName(typ)}.$name(mem.asJava, (${generateOffsetCalculation(i)}) >> ${typeSize(typ)})"
  }

  def setMethodImpl(name: String)(typ: String, i: Int): String = {
    s"${vhName(typ)}.$name(mem.asJava, (${generateOffsetCalculation(i)}) >> ${typeSize(typ)}, value)"
  }

  def casMethodImpl(name: String)(typ: String, i: Int): String =
    s"${vhName(typ)}.$name(mem.asJava, (${generateOffsetCalculation(i)}) >> ${typeSize(typ)}, expectedValue, newValue)"

  val methods = List(
    ("get", (getMethod(withRegion = true) _, getMethodImpl _)),
    ("getVolatile", (getMethod(withRegion = true) _, getMethodImpl _)),
    ("getOpaque", (getMethod(withRegion = true) _, getMethodImpl _)),
    ("getAcquire", (getMethod(withRegion = true) _, getMethodImpl _)),
    ("set", (setMethod(withRegion = true) _, setMethodImpl _)),
    ("setVolatile", (setMethod(withRegion = true) _, setMethodImpl _)),
    ("setOpaque", (setMethod(withRegion = true) _, setMethodImpl _)),
    ("setRelease", (setMethod(withRegion = true) _, setMethodImpl _)),
    ("compareAndSet", (casMethod(withRegion = true) _, casMethodImpl _)),
    (
      "weakCompareAndSetPlain",
      (casMethod(withRegion = true) _, casMethodImpl _),
    ),
    (
      "weakCompareAndSetAcquire",
      (casMethod(withRegion = true) _, casMethodImpl _),
    ),
    (
      "weakCompareAndSetRelease",
      (casMethod(withRegion = true) _, casMethodImpl _),
    ),
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
    format(
      s"""package alien.memory.handle

import alien.memory.*

import scala.Specializable.AllNumeric


case class MemoryPtr$i[L <: Layout, @specialized(AllNumeric) T]private[alien](${fields(
          i,
        )})
""",
    )
  }

  def implSyntax(tpe: String, i: Int): String =
    s"""  implicit def ${tpe
        .toLowerCase}${i}Ops[L <: Layout](vh: MemoryPtr$i[L, $tpe]): $tpe${i}Ops[L] = $tpe${i}Ops(vh)"""

  def impl(tpe: String, i: Int): String =
    format(
      s"""  implicit final class ${tpe}${i}Ops[L <: Layout](protected val vh: MemoryPtr$i[L, $tpe]) extends AnyVal {



${methods.flatMap { case (names, (method, impl)) =>
            names
              .split("\n")
              .map { n =>
                if (i == 0) {
                  s"""
              @IntrinsicCandidate
              @inline
              ${method("")(n, i, tpe)} = ${impl(n)(tpe, i)}
              """.stripMargin
                } else {
                  s"""
              @IntrinsicCandidate
              @inline
              ${method("Long")(n, i, tpe)} = ${impl(n)(tpe, i)}
              """.stripMargin ++ s"""
              @IntrinsicCandidate
              @inline
              ${method("Int")(n, i, tpe)} = ${impl(n)(tpe, i)}
              """.stripMargin
                }
              }
          }
          .mkString}
      }
     """.stripMargin,
    )

  def memoryHandle =
    format(s"""package alien.memory.handle

import alien.memory.{Global, Layout, Memory, Region}
import jdk.internal.vm.annotation.IntrinsicCandidate

import java.lang.foreign.MemoryLayout.PathElement
import java.lang.foreign.{MemoryLayout, ValueLayout}

object MemoryHandle {
  val byteVh = MemoryLayout
    .sequenceLayout(Long.MaxValue / ValueLayout.JAVA_BYTE.byteSize(), ValueLayout.JAVA_BYTE)
    .varHandle(PathElement.sequenceElement())

  val shortVh = MemoryLayout
    .sequenceLayout(Long.MaxValue / ValueLayout.JAVA_SHORT.byteSize(), ValueLayout.JAVA_SHORT)
    .varHandle(PathElement.sequenceElement())

  val intVh = MemoryLayout
    .sequenceLayout(Long.MaxValue / ValueLayout.JAVA_INT.byteSize(), ValueLayout.JAVA_INT)
    .varHandle(PathElement.sequenceElement())

  val longVh = MemoryLayout
    .sequenceLayout(Long.MaxValue / ValueLayout.JAVA_LONG.byteSize(), ValueLayout.JAVA_LONG)
    .varHandle(PathElement.sequenceElement())

  val floatVh = MemoryLayout
    .sequenceLayout(Long.MaxValue / ValueLayout.JAVA_FLOAT.byteSize(), ValueLayout.JAVA_FLOAT)
    .varHandle(PathElement.sequenceElement())

  val doubleVh = MemoryLayout
    .sequenceLayout(Long.MaxValue / ValueLayout.JAVA_DOUBLE.byteSize(), ValueLayout.JAVA_DOUBLE)
    .varHandle(PathElement.sequenceElement())

  val charVh = MemoryLayout
    .sequenceLayout(Long.MaxValue / ValueLayout.JAVA_CHAR.byteSize(), ValueLayout.JAVA_CHAR)
    .varHandle(PathElement.sequenceElement())

  val boolVh = MemoryLayout
    .sequenceLayout(Long.MaxValue / ValueLayout.JAVA_BOOLEAN.byteSize(), ValueLayout.JAVA_BOOLEAN)
    .varHandle(PathElement.sequenceElement())


    trait MemoryHandleSyntax {
    ${{
        for {
          tpe <- List("Byte", "Short", "Char", "Int", "Long", "Float", "Double")
          i   <- 0 to 6
        } yield implSyntax(tpe, i)
      }.mkString("\n")}

    }
${{
        for {
          tpe <- List("Byte", "Short", "Char", "Int", "Long", "Float", "Double")
          i   <- 0 to 6
        } yield impl(tpe, i)
      }.mkString("\n")}
}
""")

  def writeToFile(filename: String, contents: String): Unit = {
    val writer = new PrintWriter(new File(filename))
    writer.write(contents)
    writer.flush()
    writer.close()
  }

  def generate(folder: String): Unit = {
    for (i <- 0 to 9) {
      writeToFile(
        folder +
          s"src/main/scala/alien/memory/handle/MemoryPtr$i.generated.scala",
        ops_i(i),
      )
    }
    writeToFile(
      folder +
        s"src/main/scala/alien/memory/handle/MemoryHandle.generated.scala",
      memoryHandle,
    )
  }

}
