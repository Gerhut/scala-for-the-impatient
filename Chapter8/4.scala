abstract class Item {
  def price:Double
  def description:String
}

class SimpleItem(val price:Double, val description:String) extends Item {}

class Bundle extends Item {
  import scala.collection.mutable.ArrayBuffer;

  private val items = new ArrayBuffer[Item]()
  def addItem(item:Item) = items += item

  def price = (for (item <- items) yield item.price).sum
  def description = (for (item <- items) yield item.description).mkString(", ")
}

val bundle = new Bundle
bundle.addItem(new SimpleItem(10, "Apple"))
bundle.addItem(new SimpleItem(20, "Banana"))
bundle.addItem(new SimpleItem(30, "Peach"))
println(bundle.price)
println(bundle.description)
