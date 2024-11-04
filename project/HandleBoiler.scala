import org.scalafmt.interfaces.Scalafmt

import java.io.{File, PrintWriter}
import scala.collection.immutable.HashMap
import java.nio.file.{Path, Paths}

object HandleBoiler {

  val scalafmt: Scalafmt = Scalafmt.create(this.getClass.getClassLoader)
  val config: Path = Paths.get(".scalafmt.conf")

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

  val typeSize: HashMap[String, String] = HashMap(
    "Int"     -> "2",
    "Long"    -> "3",
    "Short"   -> "1",
    "Boolean" -> "0",
    "Double"  -> "3",
    "Float"   -> "2",
    "Byte"    -> "0",
    "Char"    -> "1",
  )

  val vhName: String => String = (x: String) => x.toLowerCase() + "Vh"

  def getMethodImpl(name: String)(typ: String, i: Int): String = {
    s"${vhName(typ)}.$name(mem.asJava, (${generateOffsetCalculation(i)}) >> ${typeSize(typ)})"
  }

  def setMethodImpl(name: String)(typ: String, i: Int): String = {
    s"${vhName(typ)}.$name(mem.asJava, (${generateOffsetCalculation(i)}) >> ${typeSize(typ)}, value)"
  }

  def casMethodImpl(name: String)(typ: String, i: Int): String =
    s"${vhName(typ)}.$name(mem.asJava, (${generateOffsetCalculation(i)}) >> ${typeSize(typ)}, expectedValue, newValue)"

  val methods: List[
    (
      String,
      (
        String => (String, Int, String) => String,
        JavaSpecification => String => (String, Int) => String,
      ),
    ),
  ] = List(
    ("get", (getMethod(withRegion = true), _.getMethodImpl)),
    ("getVolatile", (getMethod(withRegion = true), _.getMethodImpl)),
    ("getOpaque", (getMethod(withRegion = true), _.getMethodImpl)),
    ("getAcquire", (getMethod(withRegion = true), _.getMethodImpl)),
    ("set", (setMethod(withRegion = true), _.setMethodImpl)),
    ("setVolatile", (setMethod(withRegion = true), _.setMethodImpl)),
    ("setOpaque", (setMethod(withRegion = true), _.setMethodImpl)),
    ("setRelease", (setMethod(withRegion = true), _.setMethodImpl)),
    ("compareAndSet", (casMethod(withRegion = true), _.casMethodImpl)),
    ("weakCompareAndSetPlain", (casMethod(withRegion = true), _.casMethodImpl)),
    (
      "weakCompareAndSetAcquire",
      (casMethod(withRegion = true), _.casMethodImpl),
    ),
    (
      "weakCompareAndSetRelease",
      (casMethod(withRegion = true), _.casMethodImpl),
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

  def impl(tpe: String, arity: Int)(
    specification: JavaSpecification,
  ): String = {
    val hasIntParameters = arity != 0
    format(
      s"""  implicit final class $tpe${arity}Ops[L <: Layout](protected val vh: MemoryPtr$arity[L, $tpe]) extends AnyVal {



${methods.flatMap { case (names, (method, impl)) =>
            names
              .split("\n")
              .map { name =>
                if (hasIntParameters) {
                  s"""
              @IntrinsicCandidate
              @inline
              ${method("Long")(name, arity, tpe)} = {
                ${impl(specification)(name)(tpe, arity)}
              }
              """.stripMargin ++ s"""
              @IntrinsicCandidate
              @inline
              ${method("Int")(name, arity, tpe)} = {
                ${impl(specification)(name)(tpe, arity)}
              }
              """.stripMargin
                } else {
                  s"""
              @IntrinsicCandidate
              @inline
              ${method("")(name, arity, tpe)} = ${impl(specification)(name)(
                      tpe,
                      arity,
                    )}
              """.stripMargin
                }
              }
          }
          .mkString}
      }
     """.stripMargin,
    )
  }

  // todo support options for Boolean including in MemoryPtr_i or remove boolVh
  def memoryHandle(specification: JavaSpecification): String =
    format(
      s"""package alien.memory.handle

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
            tpe <-  SupportedTypes.values.map(_.typeName).toList
            i <- 0 to 6
          } yield implSyntax(tpe, i)
        }.mkString("\n")}

    }
${{
          for {
            tpe <- SupportedTypes.values.map(_.typeName).toList
            i <- 0 to 6
          } yield impl(tpe, i)(specification)
        }.mkString("\n")}
}
""",
    )

  // todo: create specified file with all required directories if absent
  def writeToFile(filename: String, contents: String): Unit = {
    val writer = new PrintWriter(new File(filename))
    writer.write(contents)
    writer.flush()
    writer.close()
  }

  def generate(folder: String, specification: JavaSpecification): Unit = {
    for (i <- 0 to 9) {
      writeToFile(
        folder +
          s"src/main/scala/alien/memory/handle/MemoryPtr$i.generated.scala",
        ops_i(i),
      )
    }
    writeToFile(
      folder +
        s"${specification.rootDir}/main/scala/alien/memory/handle/MemoryHandle.generated.scala",
      memoryHandle(specification),
    )
  }

  sealed trait JavaSpecification {
    def version: Int
    def rootDir: String

    def getMethodImpl(methodName: String)(typ: String, arity: Int): String
    def setMethodImpl(methodName: String)(typ: String, arity: Int): String
    def casMethodImpl(methodName: String)(typ: String, arity: Int): String

    protected def methodImpl(methodName: String, typ: String)(
      applicationArgs: String*,
    ): String = {
      s"${vhName(typ)}.$methodName(mem.asJava${applicationArgs.mkString(
          if (applicationArgs.isEmpty)
            ""
          else
            ", ",
          ",",
          ")",
        )}"
    }

  }

  object JavaSpecification {

    case object JAVA_21 extends JavaSpecification {

      override def version: Int = 21

      override def rootDir: String = "v21"

      override def getMethodImpl(
        methodName: String,
      )(typ: String, arity: Int): String =
        methodImpl(methodName, typ)(
          s"(${generateOffsetCalculation(arity)}) >> ${typeSize(typ)}",
        )

      override def setMethodImpl(
        methodName: String,
      )(typ: String, arity: Int): String =
        methodImpl(methodName, typ)(
          s"(${generateOffsetCalculation(arity)}) >> ${typeSize(typ)}",
          "value",
        )

      override def casMethodImpl(
        methodName: String,
      )(typ: String, arity: Int): String =
        methodImpl(methodName, typ)(
          s"(${generateOffsetCalculation(arity)}) >> ${typeSize(typ)}",
          "expectedValue",
          "newValue",
        )

    }

    case object JAVA_22_23 extends JavaSpecification {

      override def version: Int = 22

      override def rootDir: String = "v22"

      override def getMethodImpl(
        methodName: String,
      )(typ: String, arity: Int): String =
        methodImpl(methodName, typ)(
          s"${generateOffsetCalculation(arity)}",
          "0L",
        )

      override def setMethodImpl(
        methodName: String,
      )(typ: String, arity: Int): String =
        methodImpl(methodName, typ)(
          s"${generateOffsetCalculation(arity)}",
          "0L",
          "value",
        )

      override def casMethodImpl(
        methodName: String,
      )(typ: String, arity: Int): String =
        methodImpl(methodName, typ)(
          s"${generateOffsetCalculation(arity)}",
          "0L",
          "expectedValue",
          "newValue",
        )
    }
  }

  object SupportedTypes extends Enumeration {
    protected case class TypeVal(typeName: String) extends super.Val
    val BYTE: TypeVal = TypeVal("Byte")
    val SHORT: TypeVal = TypeVal("Short")
    val CHAR: TypeVal = TypeVal("Char")
    val INT: TypeVal = TypeVal("Int")
    val LONG: TypeVal = TypeVal("Long")
    val FLOAT: TypeVal = TypeVal("Float")
    val DOUBLE: TypeVal = TypeVal("Double")

    import scala.language.implicitConversions

    implicit def valueToTypeVal(x: Value): TypeVal = x.asInstanceOf[TypeVal]
  }
}
