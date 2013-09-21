class Point(val x:Double, val y:Double) {}

class LabeledPoint(val tag:String, x:Double, y:Double) extends Point(x, y) {}

val point = new LabeledPoint("Black Thursday", 1929, 230.07)
println(point.tag)
println(point.x)
println(point.y)
