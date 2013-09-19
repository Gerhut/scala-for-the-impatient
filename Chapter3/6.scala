val a = Array[Int](1,2,3,4,5)
println(a.reverse.mkString(", "))

val b = a.toBuffer
println(b.reverse.mkString(", "))
