package three

object fifteen {

  def flatten[A](lists: List[List[A]]): List[A] = {
    thirteen.foldLeft(lists, List[A]())((as: List[A], b: List[A]) =>
      thirteen.foldLeft(as, b)((as0, b0) =>
        fourteen.append(b0, as0)
      )
    )
  }

}
