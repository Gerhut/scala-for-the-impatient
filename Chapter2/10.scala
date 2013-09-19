def f(x:Double, n:Int):Double = {
  if (n > 0) {
    if (n % 2 == 0)
      f(x, n / 2) * f(x, n / 2)
    else
      x * f(x, n - 1)
  }
  else {
    if (n == 0)
      1
    else
      1 / f(x, -n)
  }
}

println(f(2, -4))
