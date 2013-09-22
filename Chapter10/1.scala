trait RectangleLike extends java.awt.geom.RectangularShape {

  def translate(dx:Int, dy:Int) {
    setFrame(getX + dx, getY + dy, getWidth, getHeight)
  }

  def grow(h:Int, v:Int) {
    setFrame(getX - h, getY - v, getWidth + 2 * h, getHeight + 2 * v)
  }
}

val egg = new java.awt.geom.Ellipse2D.Double(5, 10, 20, 30) with RectangleLike
egg.translate(10, -10)
egg.grow(10, 20)
println(egg.getX)
println(egg.getY)
println(egg.getWidth)
println(egg.getHeight)
