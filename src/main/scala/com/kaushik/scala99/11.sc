def pack(xs: List[Symbol]): List[List[Symbol]] = xs match {
  case Nil => Nil
  case x :: xs1 => {
    val (first, second) = xs span (y => y == x)
    first :: pack(second)
  }
}

def encodeModified(list: List[Symbol]): List[Any] = list match {
  case Nil => Nil
  case head :: list1 => {
    pack(list).map(x => if (x.length == 1) x.head else List(x.length, x.head))
  }
}

encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))