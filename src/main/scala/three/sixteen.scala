package three

object sixteen {

  def addOneToEach(list: List[Int]): List[Int] = {
    Fold.left(list, List[Int]())((e, newList) => fourteen.append(newList, e+1))
  }

}
