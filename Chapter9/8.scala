import scala.io.Source

val content = Source.fromURL("https://github.com/").mkString
val pattern = """<img.*? src="(.+?)"""".r
for (pattern(url) <- pattern.findAllIn(content)) println(url)