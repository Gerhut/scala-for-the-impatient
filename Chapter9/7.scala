import scala.io.Source

val pattern = """^\d*.\d*$""".r
for (line <- Source.fromFile("foo.txt").getLines if pattern.findPrefixOf(line) != None)
  println(line)
