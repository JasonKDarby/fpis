package three

import org.scalatest.FlatSpec
import org.scalatest.Assertions._
import org.scalatest.prop.TableDrivenPropertyChecks

class eighteenSpec extends FlatSpec with TableDrivenPropertyChecks {

  val mapParameters = Table(
    ("list", "f", "expected"),
    (List(1, 2, 3, 4, 5), (e: Int) => e+1, List(2, 3, 4, 5, 6)),
    (List(1, 2, 3), (e: Int) => e+2, List(3, 4, 5)),
    (List(1, 2, 3, 4), (e: Int) => (e+1)*10, List(20, 30, 40, 50))
  )

  forAll(mapParameters) { (list, f, expected) =>
    "map" should s"return $expected given $list and $f" in {
      assert(eighteen.map(list)(f) == expected)
    }
  }

}
