package com.codependent.zion
package hexapp

case class Department private (code: String,
                      name: String,
                      description: String) {
}

object Department {
  def create(code: String, name: String, description: String): Department = {
    Department(code, name, description)
  }
}
