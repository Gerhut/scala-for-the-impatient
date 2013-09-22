import java.io.InputStream

trait BufferedInput extends InputStream with Logger{
  import java.io.BufferedInputStream

  private val istream = new BufferedInputStream(this, 10) {
    override def read = {
      log(count.toString)
      super.read
    }
  }
  override def read = {
    istream.read
  }
}

trait Logger {
  def log(msg: String)
}

trait ConsoleLogger {
  def log(msg: String) { println (msg) }
}

import java.io.FileInputStream

val fin = new FileInputStream("foo.txt") with BufferedInput with ConsoleLogger
var data:Int = -2
while (data != -1) {
  if (data >= 0)
    print(data.toChar)
  data = fin.read
}

fin.close
