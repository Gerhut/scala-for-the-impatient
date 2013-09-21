import scala.io.Source

val numbers = (for (line <- Source.fromFile("foo.txt").getLines) yield line.toDouble).toArray

println(numbers.sum)
println(numbers.sum / numbers.length)
println(numbers.max)
println(numbers.min)
