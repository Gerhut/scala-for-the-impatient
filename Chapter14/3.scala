def swap(ary:Array[Any]):Array[Any] = ary match {
  case Array(a, b, rest @ _*) => Array(b, a) ++ rest
}

println(swap(Array(1, 2)).mkString(", "))
println(swap(Array(1, 2, 3, 4)).mkString(", "))
