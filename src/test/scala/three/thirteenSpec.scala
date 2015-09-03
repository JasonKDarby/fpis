package three

import org.scalatest.FlatSpec
import org.scalatest.Assertions._
import org.scalatest.prop.TableDrivenPropertyChecks

class thirteenSpec extends FlatSpec with TableDrivenPropertyChecks {

  val foldLeftParameters = Table(
    ("as", "z", "f", "expected"),
    (List(1, 2, 3, 4, 5), 0, (z: Int, b: Int) => b+1, 5),
    (List(1, 2, 3), 1, (z: Int, b: Int) => z*b, 6),
    (List(1, 2, 3, 4), 1, (z: Int, b: Int) => z*b, 24)
  )

  forAll(foldLeftParameters) { (as, z, f, expected) =>
    "foldLeft" should s"return $expected given $as, $z, and $f" in {
      assert(thirteen.foldLeft(as, z)(f) == expected)
    }

    "foldRight" should s"return $expected given $as, $z, and $f" in {
      assert(thirteen.foldRight(as, z)(f) == expected)
    }
  }

}
