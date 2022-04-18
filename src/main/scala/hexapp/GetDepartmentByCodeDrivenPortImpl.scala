package com.codependent.zion
package hexapp

import zio.{ULayer, URLayer, ZIO, ZLayer}

import scala.math.Numeric.Implicits.infixNumericOps

case class GetDepartmentByCodeDrivenPortImpl(departmentRepository: DepartmentRepository) extends GetDepartmentByCodeDrivenPort {

  override def execute(code: String): ZIO[Any, Throwable, Department] = departmentRepository.findByCode(code)

}

object GetDepartmentByCodeDrivenPortImpl {
  val layer: ZLayer[DepartmentRepository, Nothing, GetDepartmentByCodeDrivenPort] = 
    ZLayer.fromFunction( (dep : DepartmentRepository) => GetDepartmentByCodeDrivenPortImpl(dep))

}
