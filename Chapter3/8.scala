import scala.collection.mutable.ArrayBuffer
val a = ArrayBuffer(1, -2, 3, -4, 5, -6, 7)
var indexes = (for (i <- 0 until a.length if a(i) < 0) yield i)
  .reverse.dropRight(1)
for(i <- indexes) a.remove(i)
println(a.mkString(", "))