def drop(value: Int, list: List[Symbol]) = {
  val intermediateList: List[Symbol] = list.take(value - 1)
  val intermediateList2 = list.drop(value)
  intermediateList ::: intermediateList2
}
drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))