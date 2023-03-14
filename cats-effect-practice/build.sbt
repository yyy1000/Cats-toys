ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "cats-effect-practice"
  )

libraryDependencies += "org.typelevel" %% "cats-effect" % "3.4.8"

libraryDependencies += "org.typelevel" %% "munit-cats-effect-3" % "1.0.6" % Test
