class Pair[T, S](val first:T, val second:S) {}

def swap[T, S](source:Pair[T, S]) = new Pair(source.second, source.first)

val p = new Pair(1, "two")
val q = swap(p)
println(q.first, q.second)
