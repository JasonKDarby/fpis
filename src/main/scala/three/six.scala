package three

object six {

  def init[A](l: List[A]): List[A] = l match {
    case Nil => List()
    case Cons(x, Nil) => List()
    case Cons(x, y) => Cons(x, init(y))
  }

}
