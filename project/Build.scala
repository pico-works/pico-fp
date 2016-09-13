import sbt.Keys._
import sbt._

object Build extends sbt.Build {  
  val specs2_core               = "org.specs2"      %%  "specs2-core"               % "3.8.4"
  val specs2_scalacheck         = "org.specs2"      %%  "specs2-scalacheck"         % "3.8.4"
  val scalacheck                = "org.scalacheck"  %%  "scalacheck"                % "1.13.2"

  implicit class ProjectOps(self: Project) {
    def standard(theDescription: String) = {
      self
          .settings(scalacOptions in Test ++= Seq("-Yrangepos"))
          .settings(publishTo := Some("Releases" at "s3://dl.john-ky.io/maven/releases"))
          .settings(description := theDescription)
          .settings(isSnapshot := true)
    }

    def notPublished = self.settings(publish := {}).settings(publishArtifact := false)

    def libs(modules: ModuleID*) = self.settings(libraryDependencies ++= modules)

    def testLibs(modules: ModuleID*) = self.libs(modules.map(_ % "test"): _*)
  }

  lazy val `pico-fake` = Project(id = "pico-fake", base = file("pico-fake"))
      .standard("Fake project").notPublished
      .testLibs(specs2_core, specs2_scalacheck, scalacheck)

  lazy val `pico-fp` = Project(id = "pico-fp", base = file("pico-fp"))
      .standard("Tiny publish-subscriber library")
      .testLibs(specs2_core, specs2_scalacheck, scalacheck)

  lazy val all = Project(id = "pico-fp-project", base = file("."))
      .notPublished
      .aggregate(`pico-fp`, `pico-fake`)
}
