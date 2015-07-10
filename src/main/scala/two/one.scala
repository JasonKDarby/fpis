package two

import scala.annotation.tailrec

object one {

  def fib(n: Int): Int = {

    if(n == 0) return 0

    var x = 0
    var y = 1

    @tailrec
    def go(i: Int): Int = {
      if(i == 1) return y
      val tmp = x + y
      x = y
      y = tmp
      go(i - 1)
    }

    go(n)
  }

}
