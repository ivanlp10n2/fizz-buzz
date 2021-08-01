import Dependencies._

ThisBuild / scalaVersion     := "2.13.6"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "application"

lazy val root = (project in file("."))
  .settings(
    name := "fizz-buzz",
    libraryDependencies += scalaTest % Test,
    libraryDependencies += "org.typelevel" %% "cats-effect" % "3.2.0",
    libraryDependencies += "org.typelevel" %% "cats-core" % "2.3.0",

  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
