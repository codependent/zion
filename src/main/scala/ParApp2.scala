package com.codependent.zion

import zio.*
import zio.Console.*

import java.io.IOException
import scala.io.StdIn

object ParApp2 extends ZIOAppDefault {

  override def run: ZIO[Any, Nothing, (Int, Int)] = stringToInt("1234")
    .zipPar(stringToInt("asdf"))
    .map({ it =>
      println(it)
      it
    })

  def stringToInt(string: String): URIO[Any, Int] = ZIO.succeed(string).mapAttempt(_.toInt).orElseSucceed(0)

}
