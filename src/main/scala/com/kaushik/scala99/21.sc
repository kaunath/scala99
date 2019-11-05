def insertAt(value: Symbol, index: Int, list: List[Symbol]) = {
  list.splitAt(index) match {
    case (list1, list2) => list1 ::: value :: list2
  }
}
insertAt('new, 3, List('a, 'b, 'c, 'd))