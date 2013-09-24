import scala.io.Source
import scala.xml.{Attribute, Elem, Node, Null}
import scala.xml.parsing.XhtmlParser
import scala.xml.transform.{RewriteRule, RuleTransformer}

val url = "http://w3.org/"
val doc = (new XhtmlParser(Source.fromURL(url))).initialize.document

val todoRule = new RewriteRule {
  override def transform(n: Node) = n match {
    case img @ <img/> if (img.attribute("alt") == None) =>
      img.asInstanceOf[Elem] % Attribute(null, "alt", "TODO", Null)
    case _ => n
  }  
}

println(new RuleTransformer(todoRule).transform(doc)(0))
