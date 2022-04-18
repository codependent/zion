package com.codependent.zion

import zio._
import zio.Runtime.{default => runtime}
import zio.ZLayer.Debug
/*
object CompileTime extends ZIOAppDefault {
  trait GetUserByLegalIdDrivenPort {
    def getById(): IO[String, Int]
  }

  abstract case class GetUserByLegalIdDrivenPortImpl() extends GetUserByLegalIdDrivenPort

  object GetUserByLegalIdDrivenPortImpl {
    val layer = ZLayer.succeed(new GetUserByLegalIdDrivenPort {
      def getById(): zio.IO[String, Int] = ???
    })
  }

  trait GetDepartmentByCodeDrivenPort

  case class GetDepartmentByCodeDrivenPortImpl() extends GetDepartmentByCodeDrivenPort

  object GetDepartmentByCodeDrivenPortImpl {
    val layer = ZLayer.succeed(new GetDepartmentByCodeDrivenPortImpl {})
  }

  trait UpdateUserDrivenPort

  case class UpdateUserDrivenPortImpl() extends UpdateUserDrivenPort

  object UpdateUserDrivenPortImpl {
    val layer = ZLayer.succeed(UpdateUserDrivenPortImpl())
  }

  trait AddUserToDepartmentUseCase {
    def foo(): IO[String, Int]
  }

  case class AddUserToDepartmentUseCaseImpl(
                                             getUserPort: GetUserByLegalIdDrivenPort,
                                             getDepartmentPort: GetDepartmentByCodeDrivenPort,
                                             updateUserPort: UpdateUserDrivenPort
                                           ) extends AddUserToDepartmentUseCase {

    override def foo(): IO[String, Int] =
      for {
        _ <- getUserPort.getById()
      } yield 1
  }

  object AddUserToDepartmentUseCaseImpl {
    val layer: ZLayer[
      GetUserByLegalIdDrivenPort & GetDepartmentByCodeDrivenPort & UpdateUserDrivenPort,
      Nothing,
      AddUserToDepartmentUseCase
    ] =
      ZLayer {
        for {
          getUser <- ZIO.service[GetUserByLegalIdDrivenPort]
          getDepartment <- ZIO.service[GetDepartmentByCodeDrivenPort]
          updateUser <- ZIO.service[UpdateUserDrivenPort]
        } yield AddUserToDepartmentUseCaseImpl(
          getUser,
          getDepartment,
          updateUser
        )
      }
  }

  val myProgram =
    for {
      useCase <- ZIO.service[AddUserToDepartmentUseCase]
      result <- useCase.foo()
    } yield result

  val result = runtime.unsafeRun(
    myProgram.provide(
      AddUserToDepartmentUseCaseImpl.layer,
      GetUserByLegalIdDrivenPortImpl.layer,
      GetDepartmentByCodeDrivenPortImpl.layer,
      UpdateUserDrivenPortImpl.layer,
      Debug.mermaid
    )
  )

  println("ZIO/Scala is awesome: " + new java.util.Date())

}
*/

