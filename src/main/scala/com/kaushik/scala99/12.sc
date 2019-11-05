def decode(list: List[(Int, Symbol)]): List[Symbol] = {
  list.flatMap(elem => List.fill(elem._1)(elem._2))
}

decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
