package three

import org.scalatest.FlatSpec
import org.scalatest.Assertions._
import org.scalatest.prop.TableDrivenPropertyChecks

class twoSpec extends FlatSpec with TableDrivenPropertyChecks {

  val tailParameters = Table(
    ("input", "expected"),
    (Nil, Nil),
    (three.List(1), 1),
    (three.List(1,2), 2),
    (three.List(1,2,3), 3)
  )

  forAll(tailParameters) { (input, expected) =>
    "tail" should s"return $expected when given $input" in {
      assert(three.two.tail(input).getOrElse(Nil) == expected)
    }
  }

}
