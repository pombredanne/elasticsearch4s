name := "elasticsearch4s-gen"

organization := "jp.co.bizreach"

version := "0.0.1"

scalaVersion := "2.11.2"

libraryDependencies ++= Seq(
  "commons-io" %  "commons-io"     % "2.4",
  "org.json4s" %% "json4s-jackson" % "3.2.10"
)

publishMavenStyle := true

publishTo <<= version { (v: String) =>
  val nexus = "https://oss.sonatype.org/"
  if (v.trim.endsWith("SNAPSHOT")) Some("snapshots" at nexus + "content/repositories/snapshots")
  else                             Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

scalacOptions := Seq("-deprecation")

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

pomExtra := (
  <url>https://github.com/bizreach/elasticsearch4s-gen</url>
    <licenses>
      <license>
        <name>The Apache Software License, Version 2.0</name>
        <url>http://www.apache.org/licenses/LICENSE-2.0.txt</url>
      </license>
    </licenses>
    <scm>
      <url>https://github.com/bizreach/elasticsearch4s-gen</url>
      <connection>scm:git:https://github.com/bizreach/elasticsearch4s-gen.git</connection>
    </scm>
    <developers>
      <developer>
        <id>takezoe</id>
        <name>Naoki Takezoe</name>
        <email>naoki.takezoe_at_bizreach.co.jp</email>
        <timezone>+9</timezone>
      </developer>
    </developers>)