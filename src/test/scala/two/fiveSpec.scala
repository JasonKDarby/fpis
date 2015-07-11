package two

import org.scalatest.FlatSpec
import org.scalatest.Assertions._

class fiveSpec extends FlatSpec {

  "compose" should "combine two functions" in {
    def g(a: Int): String = s"a: $a.toString"
    def f(b: String): Int = b.length * 5

    def h = five.compose(f, g)

    assert(h(5) == f(g(5)))
  }

}
