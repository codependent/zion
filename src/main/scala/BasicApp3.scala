package com.codependent.zion

import zio.*
import zio.Console.*

import java.io.IOException

import scala.io.StdIn

object BasicApp3 extends ZIOAppDefault {

  override def run: Task[String] = getLine2

  val getLine: Task[String] = ZIO.attempt(StdIn.readLine())

  val getLine2: Task[String] = ZIO.attempt(StdIn.readLine())
}
