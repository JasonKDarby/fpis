package three

object nineteen {

  def filter[A](as: List[A])(f: A => Boolean): List[A] = {
    Fold.left(as, List[A]())((e, b) => if (f(e)) fourteen.append(b, e) else b)
  }

}
