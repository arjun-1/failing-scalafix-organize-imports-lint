ThisBuild / scalaVersion     := "2.13.1"
ThisBuild / scalafixDependencies += "com.github.liancheng" %% "organize-imports" % "0.3.0+3-de6d0237-SNAPSHOT"

lazy val root = (project in file("."))
.settings(
  name := "failing-lint",
)

addCompilerPlugin(scalafixSemanticdb)

scalacOptions ++= Seq(
  "-Ywarn-unused"
)

libraryDependencies ++= Seq(
  "com.softwaremill.sttp.client" %% "core" % "2.1.1"
)

