package application

import scala.language.postfixOps

object FizzBuzzValidator {
    def evaluateRange: Range => List[String] = numbers =>
      numbers map evaluate toList

    def evaluate : Int => String = _ match {
      case n if isBuzzFizz(n) => "FizzBuzz"
      case n if isFizz(n) => "Fizz"
      case n if isBuzz(n) => "Buzz"
      case n => n toString
    }
    private def isFizz : Int => Boolean = _ % 3 == 0
    private def isBuzz : Int => Boolean = _ % 5 == 0
    private def isBuzzFizz : Int => Boolean = n => isFizz(n) && isBuzz(n)
  }

