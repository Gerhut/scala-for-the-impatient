import scala.io.Source
import java.io.PrintWriter

val lines = Source.fromFile("foo.txt").getLines.toArray.reverse

val out = new PrintWriter("foo.txt")
out.println(lines.mkString("\n"))
out.close()
