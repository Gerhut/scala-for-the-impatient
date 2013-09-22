def factorial(n:Int) = (1 to n).foldLeft(1)(_ * _)

println(factorial(0))
println(factorial(5))