import math.sqrt

def compose(f: Double => Option[Double], g: Double => Option[Double]) =
  (x:Double) => g(x) match {
    case Some(gx) => f(gx)
    case None => None
  }

def f(x:Double) = if (x >= 0) Some(sqrt(x)) else None
def g(x:Double) = if (x != 1) Some(1 / (x - 1)) else None
val h = compose(f, g)
println(h(2))
println(h(1))
println(h(0))
