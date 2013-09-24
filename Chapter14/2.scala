def swap(pair:(Int, Int)) = pair match {
  case (a, b) => (b, a)
}


println(swap(1, 2))