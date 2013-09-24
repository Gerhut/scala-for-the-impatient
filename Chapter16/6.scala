val url = "http://w3.org/"
val doc = (new scala.xml.parsing.XhtmlParser(scala.io.Source.fromURL(url))).initialize.document

println((doc \\ "a").map(
  (el:scala.xml.Node) => (el.text.trim + "\t" + el.attributes("href"))
).mkString("\n"))
