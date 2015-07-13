package three

object two {

  def tail[A](list: three.List[A]): Option[A] = list match {
    case Nil => Option.empty
    case Cons(x, Nil) => Option(x)
    case Cons(x, y) => tail(y)
  }

}
