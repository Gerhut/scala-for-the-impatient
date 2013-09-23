val lst = List(1, 2, 3, 4, 5)
println((lst :\ List[Int]())((a:Int, b:List[Int]) => b :+ a))
println((List[Int]() /: lst)((a:List[Int], b:Int) => b +: a))
