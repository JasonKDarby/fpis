package three

import org.scalatest.FlatSpec
import org.scalatest.Assertions._
import org.scalatest.prop.TableDrivenPropertyChecks

class sixteenSpec extends FlatSpec with TableDrivenPropertyChecks {

  val addOneToEachParameters = Table(
    ("list", "expected"),
    (List(1, 2, 3, 4, 5), List(2, 3, 4, 5, 6)),
    (List(1, 2, 3), List(2, 3, 4)),
    (List(1, 2, 3, 4), List(2, 3, 4, 5))
  )

  forAll(addOneToEachParameters) { (list, expected) =>
    "addOneToEach" should s"return $expected given $list" in {
      assert(sixteen.addOneToEach(list) == expected)
    }
  }

}

