ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.14"

ThisBuild / javacOptions ++= Seq("--release", "21")

lazy val root = (project in file("."))
  .settings(
    name := "remona",
    libraryDependencies ++= Seq(
      "dev.zio" %% "zio" % "1.0.17",    // ZIO 라이브러리, 안정적인 버전 사용
      "dev.zio" %% "zio-streams" % "1.0.17",
      "org.http4s" %% "http4s-blaze-server" % "1.0.0-M35",  // HTTP4S 서버 라이브러리
      "org.http4s" %% "http4s-circe" % "1.0.0-M35",         // HTTP4S와 Circe 통합
      "org.http4s" %% "http4s-dsl" % "1.0.0-M35",
      "io.circe" %% "circe-generic" % "0.15.0",             // JSON 라이브러리
      "io.circe" %% "circe-literal" % "0.15.0"
    )
  )

enablePlugins(JavaAppPackaging)
