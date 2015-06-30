name := "play-scala"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  jdbc, cache, ws, specs2 % Test,
  "org.jooq" % "jooq" % "3.6.2",
  "org.jooq" % "jooq-meta" % "3.6.2",
  "org.jooq" % "jooq-codegen" % "3.6.2",
  "postgresql" % "postgresql" % "9.1-901-1.jdbc4"
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator
