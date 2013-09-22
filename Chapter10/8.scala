import java.io.InputStream

trait BufferedInput extends InputStream {
  import java.io.BufferedInputStream

  private val istream = new BufferedInputStream(this) 
  override def read = istream.read
}

import java.io.FileInputStream

val fin = new FileInputStream("foo.txt") with BufferedInput
var data:Int = -2
while (data != -1) {
  if (data >= 0)
    print(data.toChar)
  data = fin.read
}

fin.close
