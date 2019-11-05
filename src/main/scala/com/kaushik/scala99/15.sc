
def duplicateN(value: Int, value1: List[Symbol]) = {
  value1.flatMap(elem => List.fill(value)(elem))
}

duplicateN(3, List('a, 'b, 'c, 'c, 'd))
