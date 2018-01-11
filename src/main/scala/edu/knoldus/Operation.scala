package edu.knoldus

import org.apache.log4j.Logger

class Operation {

  val log = Logger.getLogger(this.getClass)

  def sum(function: (Int, Int) => Int, number1: Int, number2: Int): Int = {
    function(number1, number2)
  }

  /*def operationsOnList(list: List[Int], operation: String, calculation: (List[Int]) => Int) = {
    if (operation == "max" || operation == "product" || operation == "sum") {
      def calculation(list: List[Int]): Int = {
        list match {
          case head :: head1 :: tail if (head >= head1) => calculation(head :: tail)
          case head :: head1 :: tail if (head < head1) => calculation(head1 :: tail)
          case head :: Nil => head
          case head :: tail => head * calculation(tail)
          case head :: tail => head + calculation(tail)
          case Nil => 0
        }
      }
    }
    else {
      log.info("invalid operation")
      0
    }
  }
  */
}



