package com.codependent.zion

import zio.*
import zio.Console.*

import java.io.IOException
import scala.io.StdIn

object BlockingApp2 extends ZIOAppDefault {

  override def run: Task[Any] = blockingTask(10)

  def blockingTask(n: Int): Task[Any] = ZIO.attemptBlocking {
    while(true) {
      println(s"Running blocking task number $n on dedicated blocking thread pool")
      Thread.sleep(3000)
    }
  }

}
