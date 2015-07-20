package three

import org.scalatest.FlatSpec
import org.scalatest.Assertions._

class elevenSpec extends FlatSpec {

  "sum with foldLeft" should "add the items in the list together" in {
    assert(eleven.sum(List(1,2,3,4)) == 10)
  }

  "product with foldLeft" should "multiply the items in the list together" in {
    assert(eleven.product(List(1,2,3,4)) == 24)
  }

  "length with foldLeft" should "count the items in the list" in {
    assert(eleven.length(List(1,2,3,4)) == 4)
  }

}
