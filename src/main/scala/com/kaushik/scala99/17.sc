
def split(value: Int, list: List[Symbol]): (List[Symbol], List[Symbol]) = {
  (list.take(value), list.drop(value))
}

split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))

