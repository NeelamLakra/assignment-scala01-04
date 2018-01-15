package edu.knoldus

import org.apache.log4j.Logger

class Operation {

  val log = Logger.getLogger(this.getClass)

  def sum(function: (Int, Int) => Int, number1: Int, number2: Int): Int = {
    function(number1, number2)
  }

  /*def operationsOnList(list: List[Int], operation: String,functio:=>Int):Int = {
   def function(list:List[Int]):Int = {
      list match {
        case head :: head1 :: tail if head >= head1 => function(head :: tail)
        case head :: head1 :: tail if head < head1 => function(head1 :: tail)
        case head :: head1 :: tail if(operation == "product") => function(head * head1 ::tail)
        case head :: head1 :: tail if(operation == "sum") => function(head + head1 ::tail)

        case head :: tail => recursion(tail, f(head, result),f)
        case head :: Nil => head
}
}
*/

  def operateList(list: List[Int], f: (Int, Int) => Int, operation: String): Int = {
    def inner(list: List[Int], result: Int): Int = {
      list match {
        case head :: tail => inner(tail, f(head, result))
        case Nil => result
      }
    }
    operation.toLowerCase match {
      case "product" => inner(list, 1)
      case "sum" => inner(list, 0)
      case "max" =>
        list match {
          case head :: tail => inner(tail, head)
          case Nil => 0 //default case
        }
    }
  }
}



