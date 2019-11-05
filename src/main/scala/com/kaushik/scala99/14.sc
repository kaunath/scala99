def duplicate(value: List[Symbol]): List[Symbol] = {
  value.map(x => x :: x :: Nil).flatten
}

duplicate(List('a, 'b, 'c, 'c, 'c, 'd))
