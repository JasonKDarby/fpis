package three

import org.scalatest.FlatSpec
import org.scalatest.Assertions._
import org.scalatest.prop.TableDrivenPropertyChecks

class twelveSpec extends FlatSpec with TableDrivenPropertyChecks {

  val reverseParameters = Table(
    ("list", "expected"),
    (List(1, 2, 3, 4, 5), List(5, 4, 3, 2, 1)),
    (List(1, 2, 3), List(3, 2, 1)),
    (List(1, 2, 3, 4), List(4, 3, 2, 1))
  )

  forAll(reverseParameters) { (list, expected) =>
    "foldLeft" should s"return $expected given $list" in {
      assert(twelve.reverse(list) == expected)
    }
  }

}
