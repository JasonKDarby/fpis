package three

import org.scalatest.FlatSpec
import org.scalatest.Assertions._
import org.scalatest.prop.TableDrivenPropertyChecks

class fifteenSpec extends FlatSpec with TableDrivenPropertyChecks {

  val appendParameters = Table(
    ("lists", "expected"),
    (List(List(1, 2, 3, 4, 5), List(6, 7, 8, 9)), List(1, 2, 3, 4, 5, 6, 7, 8, 9)),
    (List(List(1, 2, 3), List(1, 2, 3, 1)), List(1, 2, 3, 1, 2, 3, 1)),
    (List(List(1, 2, 3, 4), List(1, 2, 3, 4, 1)), List(1, 2, 3, 4, 1, 2, 3, 4, 1)),
    (List(List(1, 2, 3, 4, 5), List(6, 7, 8, 9), List(1, 2, 3)), List(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3)),
    (List(List(1, 2, 3, 4, List(1, 2)), List(6, 7, 8, 9)), List(1, 2, 3, 4, List(1, 2), 6, 7, 8, 9)),
    (List(List(1, 2, 3, 4, 5), List(1, 2, 3), List(6, 7, 8, 9)), List(1, 2, 3, 4, 5, 1, 2, 3, 6, 7, 8, 9)),
    (List(List(1, 2), List(6, 7, 8, 9), List(3, 4, 5)), List(1, 2, 6, 7, 8, 9, 3, 4, 5))
  )

  forAll(appendParameters) { (lists, expected) =>
    "flatten" should s"return $expected given $lists" in {
      assert(fifteen.flatten(lists) == expected)
    }
  }

}
