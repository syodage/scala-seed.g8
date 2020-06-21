// give the user a nice default project!
ThisBuild / organization := "$organization;format="lower,package"$" 
ThisBuild / scalaVersion := "$scala_version$" 

lazy val root = (project in file(".")).
  settings(
    name := "$name;format="norm"$"
  )
