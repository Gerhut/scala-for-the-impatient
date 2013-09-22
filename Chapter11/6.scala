class ASCIIArt(c:String) {
  
  val content = if (c.endsWith("\n")) c else c + "\n"

  def <>(that:ASCIIArt) = {
    val thisLines = this.content.split("\n")
    val thatLines = that.content.split("\n")
    val targetLines = new Array[String](math.max(thisLines.length, thatLines.length))
    val thisWidth = (for (line <- thisLines) yield line.length).max
    
    for (i <- 0 until targetLines.length) {
      if (i >= thisLines.length)
        targetLines(i) = " " * thisWidth + thatLines(i)
      else if (i >= thatLines.length)
        targetLines(i) = thisLines(i)
      else
        targetLines(i) = thisLines(i) + " " * (thisWidth - thisLines(i).length) + thatLines(i)
    }

    new ASCIIArt(targetLines.mkString("\n"))
  }

  def ^(that:ASCIIArt) = new ASCIIArt(this.content + that.content)

  override def toString = content  
}

val kitty = new ASCIIArt(""" /\_/\
( ' ' )
(  -  )
 | | |
(__|__)""")
val talk = new ASCIIArt("""   -----
 / Hello \
<  Scala |
 \ Coder /
   -----
""")
println(kitty <> talk)
println(kitty ^ talk)
