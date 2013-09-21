import scala.io.Source
val pattern = """"(.*?)[^\\]"""".r
for (key <- pattern.findAllIn(Source.fromFile("foo.txt").mkString)) println(key)
