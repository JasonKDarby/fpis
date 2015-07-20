package three

object seven {

  //There can't be any shortcutting for 0.0 because foldRight applies the function to each set of arguments and needs
  //the given function to return a Double.  With a large list it might make sense to apply foldRight to subsets of the
  //list.
  def product(ns: List[Double]): Double = {
    Fold.right(ns, 1.0)(_ * _)
  }

}
