def grouped(source:Array[Double], cols:Int) =
  source.grouped(cols).toArray

println(grouped(Array(1, 2, 3, 4, 5, 6), 3).map(_.mkString(",")).mkString(" "))
