lazy val root = (project in file(".")).
  settings(
    organization := "com.vericred.api",
    name := "client",
    version := "0.0.8",
    scalaVersion := "2.11.4",
    scalacOptions ++= Seq("-feature"),
    javacOptions in compile ++= Seq("-Xlint:deprecation"),
    publishArtifact in (Compile, packageDoc) := false,
    resolvers += Resolver.mavenLocal,
    libraryDependencies ++= Seq(
      "io.swagger" % "swagger-annotations" % "1.5.9" % "compile",
      "com.netflix.feign" % "feign-core" % "8.16.0" % "compile",
      "com.netflix.feign" % "feign-jackson" % "8.17.0" % "compile",
      "com.netflix.feign" % "feign-slf4j" % "8.16.0" % "compile",
      "com.fasterxml.jackson.core" % "jackson-core" % "2.7.5" % "compile",
      "com.fasterxml.jackson.core" % "jackson-annotations" % "2.7.5" % "compile",
      "com.fasterxml.jackson.core" % "jackson-databind" % "2.7.5" % "compile",
      "com.fasterxml.jackson.datatype" % "jackson-datatype-jsr310" % "2.7.5" % "compile",
      "org.apache.oltu.oauth2" % "org.apache.oltu.oauth2.client" % "1.0.1" % "compile",
      "com.brsanthu" % "migbase64" % "2.2" % "compile",
      "junit" % "junit" % "4.12" % "test",
      "com.novocode" % "junit-interface" % "0.10" % "test"
    )
  )
