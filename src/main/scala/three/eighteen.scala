package three

object eighteen {

  def map[A, B](as: List[A])(f: A => B): List[B] = {
    Fold.left(as, List[B]())((e, b) => fourteen.append(b, f(e)))
  }

}
