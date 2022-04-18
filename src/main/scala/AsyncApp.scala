package com.codependent.zion

import zio.*
import zio.Console.*

import java.io.IOException
import scala.io.StdIn

object AsyncApp extends ZIOAppDefault {

  override def run: Task[Unit] = sleeping

  val sleeping: Task[Unit] = ZIO.attemptBlocking(Thread.sleep(Long.MaxValue))
}
