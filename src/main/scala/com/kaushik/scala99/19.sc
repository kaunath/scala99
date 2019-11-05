def rotate(value: Int, list: List[Symbol]) = {

  def rotateAt(value1: Int, list1: List[Symbol]) = {
    val first = list1.take(value1)
    val second = list1.drop(value1)
    second ::: first
  }

  if (value > 0) rotateAt(value, list)

  else rotateAt(list.length + value, list)

}

rotate(-3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))