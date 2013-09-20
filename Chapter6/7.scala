object Suit extends Enumeration {
  type Suit = Value

  val Club = Value("♣")
  val Diamond = Value("♦")
  val Heart = Value("♥")
  val Spade = Value("♠")
}

import Suit._

class Card(val suit:Suit, val rank:Char) {
  def isRed = (suit == Diamond || suit == Heart)
}

println(new Card(Diamond, 'A').isRed)
println(new Card(Spade, '4').isRed)
