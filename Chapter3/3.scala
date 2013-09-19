val a = Array(1, 2, 3, 4, 5)

val b = for (i <- 0 until a.length) yield 
  if (i % 2 == 1)
    a(i - 1)
  else if(a.length != i + 1)
    a(i + 1)
  else
    a(i)

println(b.mkString(", "))
