package two

import org.scalatest.FlatSpec
import org.scalatest.Assertions._

class threeSpec extends FlatSpec {

  "curry" should "partially apply a function" in {
    def f(a: String, b: String): String = s"$a, $b"
    def g = three.curry(f)
    assert(g("hey").isInstanceOf[String => String])
    assert(g("hey")("you") == "hey, you")
  }

}
