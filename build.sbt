import sbt.Keys.scalacOptions

import scala.collection.Seq

val scala213Version = "2.13.12"

ThisBuild / organization := "org.me"
ThisBuild / version      := "0.2.0"

lazy val zioVersion         = "2.0.14"
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

lazy val root = (project in file(".")).aggregate(alienMemory, alienExamples)
