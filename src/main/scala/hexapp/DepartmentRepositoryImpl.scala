package com.codependent.zion
package hexapp

import zio.{Task, ULayer, ZIO, ZLayer}

case class DepartmentRepositoryImpl() extends DepartmentRepository {

  def findByCode(code: String) : Task[Department] = ZIO.succeed(Department.create("asdf", "asdf", "asdf"))

}

object DepartmentRepositoryImpl {
  val layer: ULayer[DepartmentRepository] = ZLayer.succeed(new DepartmentRepositoryImpl())
}
