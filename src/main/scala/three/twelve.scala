package three

object twelve {

  def reverse[A](as: List[A]): List[A] = {
    Fold.left(as, Nil: List[A])((a, b) => Cons(a, b))
  }

}

