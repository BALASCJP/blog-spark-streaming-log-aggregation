name := "blog-spark-streaming-log-aggregation"
organization := "com.chimpler"
version := "1.0"
scalaVersion := "2.11.8"

val sparkVersion = "2.4.3"
val kafkaVersion = "1.6.3"
 
  libraryDependencies++=Seq(
    // Spark and Spark Streaming
    "org.apache.spark" %% "spark-core" % sparkVersion,
    "org.apache.spark" %% "spark-streaming" % sparkVersion,
    "org.apache.spark" %% "spark-streaming-kafka" % kafkaVersion,
    // Kafka
    "org.apache.kafka" %% "kafka" % "0.10.2.2",
    // Algebird (used here for HyperLogLog)
    "com.twitter" %% "algebird-core" % "0.13.5",
    // for serialization of case class
    "com.novus" %% "salat" % "1.9.9",
    // MongoDB
    "org.reactivemongo" %% "reactivemongo" % "0.17.1",
    // Joda dates for Scala
    "com.github.nscala-time" %% "nscala-time" % "2.22.0"
    // refer this https://stackoverflow.com/questions/28458987/sbt-resolveexception-unresolved-dependency-com-github-mpeltonensbt-idea1-7-0
    //"com.github.mpeltonen" % "sbt-idea" % "1.7.0-SNAPSHOT"
  )

//resolvers += "typesafe repo" at " http://repo.typesafe.com/typesafe/releases/"
