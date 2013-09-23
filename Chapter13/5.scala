def mkString(seq:Seq[Any], start:String, sep:String, end:String) = 
  start + seq.reduceLeft(_.toString + sep + _.toString) + end

println(mkString(Array(2, 3, 4, 5), "[", ", ", "]"))
