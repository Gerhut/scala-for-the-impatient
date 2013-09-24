import scala.io.Source
import scala.xml.{Attribute, Elem, Node, Null, XML}
import scala.xml.dtd.{DocType, PublicID}
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

XML.save("foo.xml", new RuleTransformer(todoRule).transform(doc)(0),
  enc = "UTF-8",
  xmlDecl = true,
  doctype = DocType("html",
    PublicID("-//W3C//DTD XHTML 1.0 Strict//EN",
      "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd"),
    Nil))
