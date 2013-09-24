import scala.xml.Text

def mapToDl(m: Map[String, String]) =
  <dl>{m.map(d =>
    <dt>{Text(d._1)}</dt><dd>{Text(d._2)}</dd>)
  }</dl>

println(mapToDl(Map("A" -> "1", "B" -> "2")))
