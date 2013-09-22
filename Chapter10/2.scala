import java.awt.Point

class OrderedPoint(x:Int = 0, y:Int = 0) extends Point(x, y) with scala.math.Ordered[Point] {
  override def compare(that: Point) = {
    if (x != that.x)
      x - that.x
    else
      y - that.y
  }
}

println(new OrderedPoint < new OrderedPoint(0, 2))
println(new OrderedPoint(0, 1) < new OrderedPoint(-1, 2))
