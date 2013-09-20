class Point(val x:Double, val y:Double) {}

object Point {
  def apply(x:Double, y:Double) = new Point(x, y)
}

val p = Point(3, 4)
println(p.x)
println(p.y)
