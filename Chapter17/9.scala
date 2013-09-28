class Pair[+T](val first:T, val second:T) {
  def replaceFirst(newFirst:T) = new Pair(newFirst, second)
}

class NastyDoublePair(first:Double, second:Double) extends Pair[Double](first, second) {
  override def replaceFirst(newFirst:Double) = super.replaceFirst(math.sqrt(newFirst))
}

val p:Pair[Any] = new NastyDoublePair(4, 9)
p.replaceFirst("Hello")
