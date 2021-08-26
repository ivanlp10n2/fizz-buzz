package application

import application.FizzBuzzValidator.evaluateRange
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class HelloSpec extends AnyWordSpec with Matchers {
  "The program that prints one line for each number from 1 to 100 " when {
    val range = 1 to 100

    "normal number" should {
      "print the normal number for 1 to 2" in{
        evaluateRange(1 to 2) shouldBe List("1", "2")
      }
      "print the normal number for 4" in{
        evaluateRange(4 to 4) shouldBe List("4")
      }
      "print the normal number for 4 to 6" in{
        evaluateRange(7 to 8) shouldBe List("7", "8")
      }
    }
    "multiple of three" should {
      "return Fizz instead of the number" in {
        evaluateRange(1 to 3) shouldBe List("1", "2", "Fizz")
      }
    }
    "multiple of five" should {
      "return Buzz instead of the number" in {
        evaluateRange(1 to 5) shouldBe List("1", "2", "Fizz", "4", "Buzz")
      }
    }
    "multiple of both three and five" should{
      "print FizzBuzz instead of the number" in {
        evaluateRange(1 to 15) shouldBe
          List("1","2","Fizz","4","Buzz",
            "Fizz", "7", "8", "Fizz", "Buzz",
            "11", "Fizz", "13", "14", "FizzBuzz")
      }
    }
  }
}
