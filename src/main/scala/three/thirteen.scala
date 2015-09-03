package three

object thirteen {

  def foldLeft[A, B](as: List[A], z: B)(f: (A, B) => B): B = {
    Fold.right(twelve.reverse(as), z)(f)
  }

  def foldRight[A, B](as: List[A], z: B)(f: (A, B) => B): B = {
    Fold.left(twelve.reverse(as), z)(f)
  }

}
