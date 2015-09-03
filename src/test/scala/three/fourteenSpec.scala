package three

import org.scalatest.FlatSpec
import org.scalatest.Assertions._
import org.scalatest.prop.TableDrivenPropertyChecks

class fourteenSpec extends FlatSpec with TableDrivenPropertyChecks {

  val appendParameters = Table(
    ("list", "e", "expected"),
    (List(1, 2, 3, 4, 5), 0, List(1, 2, 3, 4, 5, 0)),
    (List(1, 2, 3), 1, List(1, 2, 3, 1)),
    (List(1, 2, 3, 4), 1, List(1, 2, 3, 4, 1))
  )

  forAll(appendParameters) { (list, e, expected) =>
    "append" should s"return $expected given $list and $e" in {
      assert(fourteen.append(list, e) == expected)
    }
  }

}

