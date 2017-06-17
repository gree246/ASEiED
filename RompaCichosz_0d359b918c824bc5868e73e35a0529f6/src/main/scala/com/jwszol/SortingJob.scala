package com.jwszol
import org.apache.spark.sql.{Dataset, SparkSession}
import org.apache.spark.sql.functions.col
import org.apache.spark.sql.SparkSession

class SortingJob {

  val sparkSession = SparkSession.builder.
    master("local")
    .appName("spark session example")
    .config("spark.some.config.option", "some-value")
    .getOrCreate()
  val path = "./src/main/resources/dataMay-31-2017.json"
  val data = sparkSession.read.json(sparkSession.sparkContext.wholeTextFiles(path).values)
  var wrapped= data.head().getList(1)
  var newWrap  = wrapped.toArray   //zawiera w sobie 2 wartosci, id i value


  def selectionSort: Unit = {

    println("test")


  }
}

