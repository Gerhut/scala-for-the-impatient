object RichFile {
  def unapplySeq(pathname:String): Option[Seq[String]] = {
    if (pathname == "") None else {
      var takename = pathname
      if(takename.startsWith("/"))
        takename = takename.drop(1)
      if(takename.endsWith("/"))
        takename = takename.dropRight(1)
      Some(takename.split('/'))
    }
  }
}

val RichFile(part1, part2, part3) = "/home/cay/readme.txt"
println(part1)
println(part2)
println(part3)
