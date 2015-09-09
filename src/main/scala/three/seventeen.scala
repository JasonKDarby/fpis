package three

object seventeen {

  def toStringEach(list: List[Double]): List[String] = {
    Fold.left(list, List[String]())((e, b) => fourteen.append(b, e.toString()))
  }

}
