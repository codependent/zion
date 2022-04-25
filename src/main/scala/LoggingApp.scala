package com.codependent.zion

import zio.*
import zio.Console.*

import java.io.IOException
import scala.io.StdIn

object LoggingApp extends ZIOAppDefault {

  trait Logger {
    def log(message: String): IO[IOException, Unit]
  }

  case class LoggerConsoleImpl() extends Logger {
    def log(message: String) = Console.printLine(message)
  }

    object LoggerConsoleImpl {
      val layer: ZLayer[Any, Nothing, Logger] = ZLayer.succeed(new LoggerConsoleImpl())
    }

    val program: ZIO[Logger, IOException, Unit] = for {
      logger <- ZIO.service[Logger]
      _ <- logger.log("Hey")
    } yield ()

    override def run = program.provideLayer(LoggerConsoleImpl.layer)

}
