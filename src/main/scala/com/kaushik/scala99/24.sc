def removeAt(value: Int, list: List[Symbol]): (List[Symbol], Symbol) = {
  val intermediateList = list.take(value - 1)
  val intermediateList2 = list.drop(value)
  (intermediateList ::: intermediateList2, list(value - 1))

}

def randomSelect(n: Int, ls: List[Symbol]): List[Symbol] = {
  def randomSelectR(n: Int, ls: List[Symbol], random: util.Random): List[Symbol] =
    if (n <= 0) Nil
    else {
      val (rest, e) = removeAt(random.nextInt(ls.length), ls)
      e :: randomSelectR(n - 1, rest, random)
    }

  randomSelectR(n, ls, new util.Random)

}

def lotto(no: Int, rangevalue:Int):List[Symbol]= {
  randomSelect(no,List.range(1,rangevalue))

}
lotto(6, 49)
