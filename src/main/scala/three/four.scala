package three

object four {

  def drop[A](l: List[A], n: Int): List[A] = n match {
    case 0 => l
    case n if n > 0 => l match {
      case Nil => List()
      case Cons(x, Nil) => drop(Nil, n-1)
      case Cons(x, y) => drop(y, n-1)
    }
  }

}
