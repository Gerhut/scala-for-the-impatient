def lteqgt(values: Array[Int], v: Int) = {
  var (lt, eq, gt) = (0, 0, 0)
  for (value <- values) {
    if (value < v) lt += 1
    if (value == v) eq += 1
    if (value > v) gt += 1
  }
  (lt, eq, gt)
}

println(lteqgt(Array(1, 2, 3, 4, 5, 6), 4))
