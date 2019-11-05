//def rangeAt(value: Int, value1: Int):List[Int]= {
  def range(start: Int, end: Int): List[Int] = {
    if (start < end) {
      val a = start :: range(start + 1, end)
   a
    }



  }
range(4, 9)
  //rangeAt(4, 9)
//}