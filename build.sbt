//lazy val root = (project in file("."))
//  .settings(
//    name := "spray-tower",
//    organization := "com.digcredit",
//    scalaVersion := "2.11.8",
//    version := "0.1.0-SNAPSHOT"
//  )

name := "spray-tower"

version := "1.0"

scalaVersion := "2.11.8"

val sprayVersion = "1.3.4"
val akkaVersion = "2.4.17"


resolvers ++= Seq(
  "Aliyun" at "http://maven.aliyun.com/nexus/content/groups/public/"
)

libraryDependencies ++= Seq(
  "org.json4s" % "json4s-native_2.11" % "3.4.2",
  "io.spray" % "spray-json_2.11" % "1.3.3",
  "io.spray" % "spray-can_2.11" % sprayVersion,
  "io.spray" % "spray-routing_2.11" % sprayVersion,
  "io.spray" % "spray-testkit_2.11" % sprayVersion,
  "com.typesafe.akka" % "akka-actor_2.11" % akkaVersion
)

