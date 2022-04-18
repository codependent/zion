package com.codependent.zion
package hexapp

import zio.{Task, URIO, ZIO}

trait GetDepartmentByCodeDrivenPort {

  def execute(code: String): Task[Department]

}
/*
object GetDepartmentByCodeDrivenPort {
  def exec(code: String): ZIO[GetDepartmentByCodeDrivenPort, Throwable, Department] = ZIO.serviceWithZIO[GetDepartmentByCodeDrivenPort](_.execute(code))
}*/
