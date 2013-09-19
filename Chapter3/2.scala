val a = Array(1, 2, 3, 4, 5)

for (i <- 1 until (a.length, 2)) {
  val t = a(i - 1)
  a(i - 1) = a(i)
  a(i) = t
}

println(a.mkString(", "))
