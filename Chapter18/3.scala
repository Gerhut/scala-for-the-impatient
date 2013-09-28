trait Prop
object Title extends Prop
object Author extends Prop

class Document {
  private var _title = ""
  private var _author = ""
  private var useNextArgAs:Any = null
  def set(obj:Prop):this.type = { useNextArgAs = obj; this }
  def to(arg:String):this.type = {
    useNextArgAs match {
      case Title => _title = arg
      case Author => _author = arg
    }
    this
  }
  def title = _title
  def author = _author
}

val book = new Document
book set Title to "Scala for the Impatient" set Author to "Cay Horstmann"
println(book.title, book.author)
