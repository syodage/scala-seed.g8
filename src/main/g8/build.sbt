// give the user a nice default project!
ThisBuild / organization := "$organization_name;format="lower,package"$" 
ThisBuild / scalaVersion := "2.12.8"

lazy val root = (project in file(".")).
  settings(
    name := "$name;format="lower,hyphen"$"
  )
