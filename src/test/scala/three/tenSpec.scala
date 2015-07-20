package three

import org.scalatest.FlatSpec
import org.scalatest.Assertions._
import org.scalatest.prop.TableDrivenPropertyChecks

class tenSpec extends FlatSpec with TableDrivenPropertyChecks {

  val foldLeftParameters = Table(
    ("as", "z", "f", "expected"),
    (List(1, 2, 3, 4, 5), 0, (z: Int, b: Int) => z+1, 5),
    (List(1, 2, 3), 1, (z: Int, b: Int) => z*b, 6),
    (List(1, 2, 3, 4), 1, (z: Int, b: Int) => z*b, 24)
  )

  forAll(foldLeftParameters) { (as, z, f, expected) =>
    "foldLeft" should s"return $expected given $as, $z, and some function" in {
      assert(Fold.left(as, z)(f) == expected)
    }
  }

}
