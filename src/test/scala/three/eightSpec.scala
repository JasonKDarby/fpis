package three

import org.scalatest.FlatSpec
import org.scalatest.Assertions._

class eightSpec extends FlatSpec {

  "foldRight" should "return List(1,2,3) when Cons-ing List(1,2,3) and Nil" in {
    assert(Fold.right(List(1,2,3), Nil:List[Int])(Cons(_,_)) == List(1,2,3))
  }

}
