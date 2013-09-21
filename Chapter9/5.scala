import java.io.PrintWriter

var i = 1
val width = (1 << 20).toString.length
val writer = new PrintWriter("foo.txt")
for (n <- 0 to 20) {
  writer.printf("%-" + width + "s %s\n", i.toString, (BigDecimal(1.0)/i).toString)
  i <<= 1
}
writer.close()
