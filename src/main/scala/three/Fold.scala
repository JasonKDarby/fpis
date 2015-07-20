package three

import scala.annotation.tailrec

object Fold {

  def right[A,B](as: List[A], z: B)(f: (A, B) => B): B = as match {
    case Nil => z
    case Cons(x, xs) => f(x, right(xs, z)(f))
  }

  def left[A,B](as: List[A], z: B)(f: (B, A) => B): B = {
    @tailrec
    def go(as: List[A], z: B): B = as match {
      case Nil => z
      case Cons(b, rest) => go(rest, f(z, b))
    }

    go(as, z)
  }

}
