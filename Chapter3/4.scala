import scala.collection.mutable.ArrayBuffer

def rearrange(a: Array[Int]) = {
  val s = new ArrayBuffer[Int]()
  for (i <- a if i > 0) s += i
  for (i <- a if i <= 0) s += i
  s.toArray
}

println(rearrange(Array(1,-1,2,-3,0)).mkString(", "))
