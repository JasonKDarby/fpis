package three

import org.scalatest.FlatSpec
import org.scalatest.Assertions._
import org.scalatest.prop.TableDrivenPropertyChecks

class nineteenSpec extends FlatSpec with TableDrivenPropertyChecks {

  val filterParameters = Table(
    ("list", "f", "expected"),
    (List(1, 2, 3, 4, 5), (e: Int) => e > 1, List(2, 3, 4, 5)),
    (List(1, 2, 3), (e: Int) => e < 3, List(1, 2)),
    (List(1, 2, 3, 4), (e: Int) => e == 1, List(1))
  )

  forAll(filterParameters) { (list, f, expected) =>
    "filter" should s"return $expected given $list and $f" in {
      assert(nineteen.filter(list)(f) == expected)
    }
  }

}
