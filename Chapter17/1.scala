class Pair[T, S](val first:T, val second:S) {
  def swap = new Pair(second, first)
}

val p = new Pair(1, "two").swap
println(p.first, p.second)
