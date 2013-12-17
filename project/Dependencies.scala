/*
 * Copyright (c) 2013 Snowplow Analytics Ltd. All rights reserved.
 *
 * This program is licensed to you under the Apache License Version 2.0, and
 * you may not use this file except in compliance with the Apache License
 * Version 2.0.  You may obtain a copy of the Apache License Version 2.0 at
 * http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the Apache License Version 2.0 is distributed on an "AS
 * IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the Apache License Version 2.0 for the specific language
 * governing permissions and limitations there under.
 */
import sbt._

object Dependencies {

  val resolutionRepos = Seq(
    // For scala-util
    "Snowplow Analytics Maven repo" at "http://maven.snplow.com/releases/",
    "spray repo" at "http://repo.spray.io",
    "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
  )

  object V {
    // Java
    val mimepull = "1.9.4"

    // Scala
    val sprayCan = "1.2.0"
    val akka = "2.2.3"
    val scallop = "0.9.4"

    // Scala (test only)
    // TODO
    // val specs2     = "2.3.4"
  }

  object Libraries {
    // Java
    val mimepull = "org.jvnet.mimepull" % "mimepull" % V.mimepull

    // Scala
    val sprayCan = "io.spray" % "spray-can" % V.sprayCan
    val akka = "com.typesafe.akka" %% "akka-actor" % V.akka
    val scallop = "org.rogach" %% "scallop" % V.scallop

    // Scala (test only)
    // TODO
    // val specs2      = "org.specs2" %% "specs2"          % V.specs2     % "test"
  }
}
