val in = new java.util.Scanner(new java.io.File("foo.txt"))
var counts = Map[String, Int]()
while (in.hasNext()) {
  val word = in.next()
  counts += word -> (counts.getOrElse(word, 0) + 1)
}
println(counts)