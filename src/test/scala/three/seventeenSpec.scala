package three

import org.scalatest.FlatSpec
import org.scalatest.Assertions._
import org.scalatest.prop.TableDrivenPropertyChecks

class seventeenSpec extends FlatSpec with TableDrivenPropertyChecks {

  val toStringEachParameters = Table(
    ("list", "expected"),
    (List[Double](1, 2, 3, 4.7, 5), List("1.0", "2.0", "3.0", "4.7", "5.0")),
    (List[Double](1, 2, 3), List("1.0", "2.0", "3.0")),
    (List[Double](1, 2, 3, 4), List("1.0", "2.0", "3.0", "4.0"))
  )

  forAll(toStringEachParameters) { (list, expected) =>
    "addOneToEach" should s"return $expected given $list" in {
      assert(seventeen.toStringEach(list) == expected)
    }
  }

}

