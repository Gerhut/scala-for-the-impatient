def signum(n: Int) = if (n > 0) 1 else (if (n < 0) -1 else 0)

println(signum(2))
println(signum(0))
println(signum(-3))
