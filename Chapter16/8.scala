import scala.xml.Node

def dlToMap(dl:Node) =
  Map((dl \\ "dt" zip dl \\ "dd").map((td:(Node, Node)) => (td._1.text -> td._2.text)): _*)

println(dlToMap(<dl><dt>A</dt><dd>1</dd><dt>B</dt><dd>2</dd></dl>))
