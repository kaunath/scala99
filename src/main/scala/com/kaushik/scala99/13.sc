encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))

def encodeDirect(value: List[Symbol])=value match {
  case Nil => Nil
  case x::xs if value.span(value==x)=>x::encodeDirect(xs)

}