package three

import org.scalatest.FlatSpec
import org.scalatest.Assertions._
import org.scalatest.prop.TableDrivenPropertyChecks

class fourSpec extends FlatSpec with TableDrivenPropertyChecks {

  val dropParameters = Table(
    ("input", "expected"),
    ((0, _root_.three.List()), _root_.three.List()),
    ((0, _root_.three.List(1, 2, 3)), _root_.three.List(1, 2, 3)),
    ((1, _root_.three.List(1, 2, 3)), _root_.three.List(2, 3)),
    ((2, _root_.three.List(1, 2, 3)), _root_.three.List(3)),
    ((3, _root_.three.List(1, 2, 3)), _root_.three.List())
  )

  forAll(dropParameters) { (input: (Int, _root_.three.List[Int]), expected: _root_.three.List[Int]) =>
    "drop" should s"remove the first ${input._1} elements from ${input._2}" in {
      assert(four.drop(input._2, input._1) == expected)
    }
  }

}
