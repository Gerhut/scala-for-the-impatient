sealed abstract class Item
case class Article(price:Double) extends Item
case class Bundle(discount:Double, items:Item*) extends Item
case class Multiple(count:Int, item:Item) extends Item

def price(it:Item):Double = it match {
  case Article(p) => p
  case Bundle(dis, its @ _*) => its.map(price _).sum - dis
  case Multiple(c, it) => price(it) * c
}

println(price(Multiple(10,
  Multiple(2,
    Bundle(40,
      Multiple(2,
        Article(100)
      ),
      Article(200)
    )
  )
)))