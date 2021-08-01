package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class HelloSpec extends AnyWordSpec with Matchers {

  "The Hello object" when {
    "say hello" should {
      Hello.greeting shouldEqual "hello"
    }
  }
}
