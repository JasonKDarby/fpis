package three

object eleven {

  def sum(ns: List[Int]): Int = {
    Fold.left(ns, 0)(_+_)
  }

  def product(ns: List[Int]): Int = {
    Fold.left(ns, 1)(_*_)
  }

  def length[A](as: List[A]): Int = {
    Fold.left(as, 0)((b, a) => b+1)
  }

}
