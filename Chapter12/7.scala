def adjustToPair(func:(Int, Int) => Int)(pair:(Int, Int)) = func(pair._1, pair._2)

println(adjustToPair(_ * _)((6, 7)))

val pairs = (1 to 10) zip (11 to 20)
println(pairs.map(adjustToPair(_ + _)))
