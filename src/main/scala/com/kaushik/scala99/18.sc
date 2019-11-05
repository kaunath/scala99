def slice(initialValue: Int, finalValue: Int, list: List[Symbol])={
  list.drop(initialValue).take(finalValue-initialValue)
}

slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
