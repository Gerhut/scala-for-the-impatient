import scala.collection.mutable.ArrayBuffer
import scala.io.Source
import java.io.PrintWriter

val table = (for (line <- Source.fromFile("foo.txt").getLines) yield line.split('\t')).toArray
var columnCount = 0
var columnsWidth = new ArrayBuffer[Int](columnCount)
for (row <- table) {
  for (i <- 0 until row.length) {
    val dataLength = row(i).length
    if (i >= columnCount) {
      columnCount += 1
      columnsWidth += dataLength
    } else if (dataLength > columnsWidth(i)) {
      columnsWidth(i) = dataLength
    }
  }
}

val writer = new PrintWriter("foo.txt")
for (row <- table) {
  for (i <- 0 until row.length) {
    writer.printf("%-" + columnsWidth(i) +"s ", row(i))
  }
  writer.println
}
writer.close
