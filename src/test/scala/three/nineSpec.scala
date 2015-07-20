package three

import org.scalatest.FlatSpec
import org.scalatest.Assertions._
import org.scalatest.prop.TableDrivenPropertyChecks

class nineSpec extends FlatSpec with TableDrivenPropertyChecks {

  val lengthParameters = Table(
    ("length", "list"),
    (Nil, 0),
    (List(1), 1),
    (List(1, 2), 2),
    (List(1, 2, 3), 3),
    (List('a', 'b', 'c', 'd'), 4)
  )


  forAll(lengthParameters) { (list: List[Any], length: Int) =>
    "length implemented with foldRight" should s"return $length when given $list" in {
      assert(nine.length(list) == length)
    }
  }

}
