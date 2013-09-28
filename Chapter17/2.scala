class Pair[T](var first:T, var second:T) {
  def swap() {
    val temp = second
    second = first
    first = temp
  }
}

val p = new Pair(1, 2)
p.swap
println(p.first, p.second)
