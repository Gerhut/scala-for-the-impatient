def sum(l: List[Option[Int]]) = l.collect{ case Some(i) => i }.sum

println(sum(List(Some(2), None, Some(3))))
