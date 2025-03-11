import HandleBoiler.JavaSpecification.{JAVA_21, JAVA_22_23}
import sbt.Keys.scalacOptions

import scala.collection.Seq

val scala213Version = "2.13.15"

ThisBuild / organization := "com.yandex.classifieds"
ThisBuild / version      := "0.1.0"
ThisBuild / licenses :=
  List("MIT" -> url("https://opensource.org/licenses/MIT"))
ThisBuild / publishMavenStyle := true
ThisBuild / homepage :=
  Some(url("https://github.com/YandexClassifieds/alien-memory"))
ThisBuild / developers :=
  List(
    Developer(
      "lishy2",
      "Islam Talipov",
      "lishy2@yandex-team.ru",
      url("https://github.com/lishy2"),
    ),
  )

ThisBuild / scmInfo :=
  Some(
    ScmInfo(
      url("https://github.com/YandexClassifieds/alien-memory"),
      "https://github.com/YandexClassifieds/alien-memory.git",
    ),
  )
ThisBuild / publishTo := Some(Opts.resolver.sonatypeStaging)

lazy val zioVersion         = "2.1.6"
lazy val supertaggedVersion = "2.0-RC2"

lazy val zioTest      = "dev.zio"       %% "zio-test"      % zioVersion % Test
lazy val zioTestSbt   = "dev.zio"       %% "zio-test-sbt"  % zioVersion % Test
lazy val scalaReflect = "org.scala-lang" % "scala-reflect" % scala213Version
lazy val supertagged  = "org.rudogma"   %% "supertagged"   % supertaggedVersion

lazy val memoryDependencies =
  libraryDependencies ++= Seq(supertagged, scalaReflect, zioTest, zioTestSbt)

val compilerOptions = Seq(
  "-Xsource:3",
  "-deprecation",
  "-encoding",
  "utf-8",
  "-explaintypes",
  "-Vimplicits",
  "-Vtype-diffs",
  "-feature",
  "-language:existentials",
  "-language:experimental.macros",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-Wconf:cat=scala3-migration:silent",
)

lazy val alienMemory = (project in file("memory")).settings(
  name         := "alien-memory",
  scalaVersion := scala213Version,
  scalacOptions ++= compilerOptions,
  memoryDependencies,
  Compile / unmanagedSourceDirectories  ++= {
    val javaVersion = System.getProperty("java.version")
    val baseDir = ( ThisBuild / baseDirectory ).value / "memory"
    System.out.println(s"[warn] build for java version $javaVersion")
    if (javaVersion.startsWith("21")) {
      Seq(baseDir / "v21" / "main" / "scala")
    } else  {
      Seq(baseDir / "v22" / "main" / "scala")
    }
  }
)

lazy val alienExamples = (project in file("examples"))
  .settings(
    name         := "alien-examples",
    scalaVersion := scala213Version,
    scalacOptions ++= compilerOptions,
    publish / skip := true,
    doc / skip     := true,
  )
  .dependsOn(alienMemory)

lazy val root = (project in file("."))
  .aggregate(alienMemory, alienExamples)
  .settings(publish / skip := true, doc / skip := true)


lazy val boiler = taskKey[Unit]("Generates boilerplate")

boiler := {
  HandleBoiler.generate("memory/", JAVA_21)
  HandleBoiler.generate("memory/", JAVA_22_23)
}
