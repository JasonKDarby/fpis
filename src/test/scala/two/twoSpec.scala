package two

import org.scalatest.FlatSpec
import org.scalatest.Assertions._

class twoSpec extends FlatSpec {

  "isSorted" should "tell whether an array is sorted by a given comparator" in {
    val originalArray = Array(0, 1, 2, 3, 5, 6, 7, 8, 9)
    def ascendingComparator = (x: Int, y: Int) => x < y
    def descendingComparator = (x: Int, y: Int) => x > y

    assert(two.isSorted[Int](originalArray, ascendingComparator))
    assert(!two.isSorted[Int](originalArray, descendingComparator))
  }

}
