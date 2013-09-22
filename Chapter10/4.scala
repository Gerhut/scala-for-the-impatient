trait Logger {
  def log(msg: String)
}

trait CryptoLogger extends Logger {
  val key:Byte = 3
  abstract override def log(msg: String) {
    super.log(
      for( c <- msg ) yield {
        if (c >= 'a' && c <= 'z')
          ((c - 'a' + key) % 26 + 'a').toChar
        else if (c >= 'A' && c <= 'Z')
          ((c - 'A' + key) % 26 + 'A').toChar
        else if (c >= '0' && c <= '9')
          ((c - '0' + key) % 10 + '0').toChar
        else c
      }
    )
  }
}

class ConsoleLogger extends Logger {
  def log(msg: String) { println(msg) }
}

(new ConsoleLogger).log("Hello World.")
(new ConsoleLogger with CryptoLogger).log("Hello World.")
(new {
  override val key:Byte = -3
} with ConsoleLogger with CryptoLogger).log("Hello World.")
