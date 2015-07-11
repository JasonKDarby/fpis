package two

object two {

  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = {
    val sortedWithOrdered = as.sortWith(ordered)
    sortedWithOrdered.deep == as.deep
  }

}
