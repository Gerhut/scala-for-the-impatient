def factorial(n:Int) = (1 to n).reduceLeft(_ * _)

println(factorial(5))
