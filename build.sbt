ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.1.2"

lazy val root = (project in file("."))
  .settings(
    name := "zion",
    idePackagePrefix := Some("com.codependent.zion")
  )

libraryDependencies += "dev.zio" %% "zio" % "2.0.0-RC5"
