import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "gather"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    jdbc,
    anorm,
     "org.cloudfoundry" % "auto-reconfiguration" % "0.6.6"
  )


  val main = play.Project(appName, appVersion, appDependencies).settings(
    // spring maven repository      
    resolvers += "Spring Milestone Repository" at "http://maven.springframework.org/milestone"      
  )

}
