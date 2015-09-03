package three

object fourteen {

  def append[A](list: List[A], e: A): List[A] = {
    Fold.right(list, Cons(e, Nil))((a, b) => Cons(a, b))
  }

}
