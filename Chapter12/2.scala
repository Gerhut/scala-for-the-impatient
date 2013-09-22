def max(ary:Array[Int]) = ary.reduceLeft((x:Int, y:Int) => if (x > y) x else y)

println(max(Array(1,2,5,4,3)))
