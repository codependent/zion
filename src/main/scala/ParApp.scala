package com.codependent.zion

import zio.*
import zio.Console.*

import java.io.IOException
import scala.io.StdIn

object ParApp extends ZIOAppDefault {

  override def run: ZIO[Any, Nothing, (Either[Throwable, Int], Either[Throwable, Int])] = stringToInt("1234")
    .zipPar(stringToInt("asdf"))
    .map({ it =>
      println(it)
      it
    })

  def stringToInt(string : String): URIO[Any, Either[Throwable, Int]] = ZIO.succeed(string).mapAttempt(_.toInt).either

}
