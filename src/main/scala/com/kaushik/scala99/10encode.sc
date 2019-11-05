def pack(xs: List[Symbol]): List[List[Symbol]] = xs match {
  case Nil => Nil
  case x :: xs1 => {
    val (first, second) = xs span (y => y == x)
    first :: pack(second)
  }
}

def encode(list: List[Symbol]): List[(Int, Symbol)] = list match {
  case Nil => Nil
  case head :: list1 => {
    pack(list).map(x => (x.length, x.head))
  }
}

encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
