val url = "http://w3.org/"
val doc = (new scala.xml.parsing.XhtmlParser(scala.io.Source.fromURL(url))).initialize.document

println((doc \\ "img").map (_.attributes("src").text).mkString("\n"))
