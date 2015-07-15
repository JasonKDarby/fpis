package three

object three {

  def setHead[A](list: _root_.three.List[A], head: A): _root_.three.List[A] = list match {
    case Nil => Cons(head, Nil)
    case Cons(x, y) => Cons(head, y)
  }

}
