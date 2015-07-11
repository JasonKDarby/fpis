package two

import org.scalatest.FlatSpec
import org.scalatest.prop.TableDrivenPropertyChecks
import org.scalatest.Assertions._

class oneSpec extends FlatSpec with TableDrivenPropertyChecks {

  val fibNumbers = Table(
    ("input", "expected"),
    (0, 0),
    (1, 1),
    (2, 1),
    (3, 2),
    (4, 3),
    (5, 5),
    (6, 8),
    (7, 13),
    (8, 21),
    (9, 34)
  )

  forAll(fibNumbers) { (input: Int, expected: Int) =>
    "fib" should s"return $expected when given $input" in {
      val out = one.fib(input)
      assert(out == expected)
    }
  }

}
