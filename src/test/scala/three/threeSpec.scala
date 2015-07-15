package three

import org.scalatest.FlatSpec
import org.scalatest.Assertions._
import org.scalatest.prop.TableDrivenPropertyChecks

class threeSpec extends FlatSpec with TableDrivenPropertyChecks {

  val setHeadParameters = Table(
    ("input", "expected"),
    ((1, _root_.three.List[Int](2, 3)), _root_.three.List[Int](1, 3)),
    ((1, _root_.three.List[Int](1, 2, 3)), _root_.three.List[Int](1, 2, 3)),
    ((1, _root_.three.List[Int](3, 2, 1)), _root_.three.List[Int](1, 2, 1)),
    ((5, _root_.three.List[Int](1, 2, 3)), _root_.three.List[Int](5, 2, 3)),
    ((5, _root_.three.List[Int](1, 2, 3, 4)), _root_.three.List[Int](5, 2, 3, 4)),
    ((1, Nil), _root_.three.List[Int](1))
  )

  forAll(setHeadParameters) { (input: (Int, _root_.three.List[Int]), expected: _root_.three.List[Int]) =>
    "setHead" should s"replace the first element of ${input._2} with ${input._1}" in {
      assert(three.setHead(input._2, input._1) == expected)
    }
  }

}
