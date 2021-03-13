val scala3Version = "3.0.0-RC1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "scala3-simple",
    version := "0.1.0",

    scalaVersion := scala3Version,
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.5" % "test",
      "org.scalatestplus" %% "scalacheck-1-15" % "3.2.6.0" % "test",
      ("io.get-coursier" %% "coursier" % "2.0.13").withDottyCompat(scalaVersion.value)
    ),

    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"
  )
