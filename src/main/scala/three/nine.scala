package three

object nine {

  def length[A](as: List[A]): Int = {
    Fold.right(as, 0)((a: A, b: Int) => b+1)
  }

}
