package com.codependent.zion
package hexapp

import zio.*
import zio.Console.*
import zio.Runtime.default as runtime
import zio.ZLayer.Debug

import java.io.IOException
import scala.io.StdIn
import zio.*

object HexApp extends scala.App {

  val program: ZIO[GetDepartmentByCodeDrivenPort, Throwable, Department] = for {
    srv <- ZIO.service[GetDepartmentByCodeDrivenPort]
    dep <- srv.execute("asdf")
    _   <- Console.printLine(dep)
    _   <- ZIO.logInfo(s"My department $dep")
  } yield dep

  //val program = GetDepartmentByCodeDrivenPort.exec("asdf")
  val x: ZIO[GetDepartmentByCodeDrivenPort, Throwable, Department] = program.mapError(e => e)

  val mainEffect: ZIO[Any, Throwable, Department] = program.provide(
    DepartmentRepositoryImpl.layer,
    GetDepartmentByCodeDrivenPortImpl.layer, Debug.mermaid)

  val result = runtime.unsafeRun(mainEffect)

}
