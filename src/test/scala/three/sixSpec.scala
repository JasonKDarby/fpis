package three

import org.scalatest.FlatSpec
import org.scalatest.Assertions._
import org.scalatest.prop.TableDrivenPropertyChecks

class sixSpec extends FlatSpec with TableDrivenPropertyChecks {

  val initParameters = Table(
    ("input", "expected"),
    (Nil, _root_.three.List[Int]()),
    (_root_.three.List[Int](1), _root_.three.List[Int]()),
    (_root_.three.List[Int](1, 2), _root_.three.List[Int](1)),
    (_root_.three.List[Int](1, 2, 3), _root_.three.List[Int](1, 2))
  )

  forAll(initParameters) { (input: _root_.three.List[Int], expected: _root_.three.List[Int]) =>
    "init" should s"return $expected when given $input" in {
      assert(six.init(input) == expected)
    }
  }

}

