class Pair[S, T](var first:S, var second:T) {
  def swap(implicit ev: S =:= T, ev2: T =:= S) {
    val temp = first
    first = second
    second = temp
  }
}

val p = new Pair(2, 3)
p.swap
println(p.first, p.second)
