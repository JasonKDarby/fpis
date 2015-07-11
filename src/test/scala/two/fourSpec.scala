package two

import org.scalatest.FlatSpec
import org.scalatest.Assertions._

class fourSpec extends FlatSpec {

  "uncurry" should "'undo' curry" in {
    def f(a: String, b: String): String = s"$a, $b"
    def g = three.curry(f)
    def h = four.uncurry(g)

    assert(h.isInstanceOf[(String, String) => String])
    assert(h("0", "1") == f("0", "1"))
  }

}
