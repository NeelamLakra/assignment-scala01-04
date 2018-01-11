package edu.knoldus

import org.apache.log4j.Logger

object ApplicationClass extends App {

  val caller = new Operation
  val log = Logger.getLogger(this.getClass)
  val input1 = 5
  val input2 = 4
  val x = 0
  val y = 0
  val sumOfSquares = log.info(" sum of squares " + caller.sum((p, q) => (p * p + q * q), input1, input2) + "\n")
  val sumOfCubes = log.info(" sum of cubes " + caller.sum((p, q) => (p * p * p + q * q), input1, input2) + "\n")
  val sumOfInt= log.info(" sum of ints " + caller.sum((p, q) => (p + q), input1, input2) + "\n")
  val invalidCase = log.info(" for invalid inputs " + caller.sum((p, q) => 0, x, y) + "\n")

  val first = 10;
  val second = 20;
  val third = 30
  val list = List(first, second, third)
  //val sumOfList = log.info(caller.operationsOnList(list, "max", (list) => Int))
}




