package three

object five {

  def dropWhile[A](l: List[A], f: A => Boolean): List[A] = l match {
    case Nil => List()
    case Cons(x, y) => if (f(x)) dropWhile(y, f) else Cons(x, dropWhile(y, f))
  }

}
