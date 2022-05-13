package com.codependent.zion

import zio._
import zio.Console._
import zio.stm._

import java.io.IOException
import scala.io.StdIn

object TMapApp extends ZIOAppDefault {

  val program: ZIO[Any, Nothing, Option[Int]] =
    (for
      tMap <- TMap.make(("a", 1), ("b", 2))
      _ <- tMap.put("c", 3)
      value <- tMap.get("c")
      //_ <- ZIO.logInfo(s"value $value")
      //_ <- ZIO.logInfo(s"value2 $value2")
    yield value).commit


  /*
  val program2 = program.flatMap { (p: Option[Int]) =>
    ZIO.logInfo(s"Value -> $p")
  }*/

  val program2 =
    for
      value <- program
      _ <- ZIO.logInfo(s"Value -> $value")
    yield ()

  override def run = program2

}
