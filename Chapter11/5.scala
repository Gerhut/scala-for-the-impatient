class Table {
  import scala.collection.mutable.ArrayBuffer
  private val rows = new ArrayBuffer[ArrayBuffer[String]]
  rows += new ArrayBuffer[String]
  
  def |(content:String) = {
    rows(rows.length - 1) += content
    this
  }
  def ||(content:String) = {
    rows += new ArrayBuffer[String]
    rows(rows.length - 1) += content
    this
  }
  override def toString = {
    (for(row <- rows) yield row.mkString("<tr><td>", "</td><td>", "</td></tr>")).mkString("<table>", "", "</table>")
  }
}

object Table {
  def apply() = new Table
}

println(Table() | "Java" | "Scala" || "Gosling" | "Odersky" || "JVM" | "JVM, .NET")
