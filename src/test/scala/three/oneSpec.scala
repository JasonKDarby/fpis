package three

import org.scalatest.FlatSpec
import org.scalatest.Assertions._

class oneSpec extends FlatSpec {

  "x" should "return 3" in {
    val x = three.List(1,2,3,4,5) match {
      case Cons(x, Cons(2, Cons(4, _))) => x
      case Nil => 42
      case Cons(x, Cons(y, Cons(3, Cons(4, _)))) => x + y
      case Cons(h, t) => h + three.List.sum(t)
      case _ => 101
    }

    assert(x == 3)
  }

}
