import java.io.InputStream

class IterableInputStream(val in:InputStream) extends InputStream with Iterable[Byte] {
  def read = in.read
  def iterator = new Iterator[Byte] {
    def hasNext = in.available > 0
    def next = in.read.toByte
  }
}

import java.io.FileInputStream

val fin = new IterableInputStream(new FileInputStream("foo.txt"))
for (b <- fin) print(b.toChar)
fin.close
