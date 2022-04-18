package com.codependent.zion
package hexapp

import zio.{Task, ZIO}

trait DepartmentRepository {

  def findByCode(code: String) : Task[Department]
  
}
