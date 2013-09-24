def leafSum(lst:List[Any]):Int = lst.map(_ match {
  case l:List[Any] => leafSum(l)
  case i:Int => i
}).sum

println(leafSum(List(List(3, 8), 2, List(5))))
