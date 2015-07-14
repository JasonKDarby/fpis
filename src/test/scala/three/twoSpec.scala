package three

import org.scalatest.FlatSpec
import org.scalatest.Assertions._
import org.scalatest.prop.TableDrivenPropertyChecks

class twoSpec extends FlatSpec with TableDrivenPropertyChecks {

  val tailParameters = Table(
    ("input", "expected"),
    (Nil, Nil),
    (_root_.three.List(1), 1),
    (_root_.three.List(1,2), 2),
    (_root_.three.List(1,2,3), 3)
  )

  forAll(tailParameters) { (input, expected) =>
    "tail" should s"return $expected when given $input" in {
      assert(_root_.three.two.tail(input).getOrElse(Nil) == expected)
    }
  }

}
