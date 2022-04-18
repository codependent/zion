package com.codependent.zion

import zio.*
import zio.Console.*

import java.io.IOException

object BasicApp2 extends ZIOAppDefault {

  override def run: ZIO[Any, Nothing, Int] = myAppLogic

  val myAppLogic: ZIO[Any, Nothing, Int] = ZIO.succeed(3)
}
