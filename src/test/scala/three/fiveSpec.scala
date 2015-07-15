package three

import org.scalatest.FlatSpec
import org.scalatest.Assertions._
import org.scalatest.prop.TableDrivenPropertyChecks

class fiveSpec extends FlatSpec with TableDrivenPropertyChecks {

  val dropWhileParameters = Table(
    ("f", "l", "expected", "i"),
    ((x: Int) => true, _root_.three.List(), _root_.three.List(), 0),
    ((x: Int) => false, _root_.three.List(), _root_.three.List(), 1),
    ((x: Int) => x > 1, _root_.three.List(1, 2, 3), _root_.three.List(1), 2),
    ((x: Int) => x > 2, _root_.three.List(1, 2, 3), _root_.three.List(1, 2), 3),
    ((x: Int) => x < 1, _root_.three.List(1, 2, 3), _root_.three.List(1, 2, 3), 4),
    ((x: Int) => x < 3, _root_.three.List(1, 2, 3), _root_.three.List(3), 5)
  )

  forAll(dropWhileParameters) {
    (f: Int => Boolean, l: _root_.three.List[Int], expected: _root_.three.List[Int], i: Int) =>
    s"$i dropWhile" should s"remove elements from $l while $f" in {
      assert(five.dropWhile(l, f) == expected)
    }
  }

}
