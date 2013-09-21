class Square(xy: (Int, Int), width:Int) extends java.awt.Rectangle(xy._1, xy._2, width, width) {
  def this(width:Int) { this((0, 0), width) }
  def this() { this((0, 0), 0) }
}

println(new Square((4,4), 8).x)
println(new Square(3).width)
println(new Square().y)
