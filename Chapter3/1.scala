import scala.util.Random

val n = 10
val a = new Array[Int](n)
for (i <- 0 until n)
  a(i) = Random.nextInt(n)

println(a.mkString(", "))
