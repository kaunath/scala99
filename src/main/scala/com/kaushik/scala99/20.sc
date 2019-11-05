
def removeAt(value: Int, list: List[Symbol]): (List[Symbol], Symbol) ={
  val intermediateList=list.take(value-1)
  val intermediateList2=list.drop(value)
  (intermediateList:::intermediateList2,list(value-1))

}
removeAt(3, List('a, 'b, 'c, 'd))