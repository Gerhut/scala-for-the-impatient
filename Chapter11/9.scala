object RichFile {
  def unapply(pathname:String) = {
    val (path, fullname) = pathname.splitAt(pathname.lastIndexOf('/'))
    val (name, ext) = fullname.splitAt(fullname.lastIndexOf('.'))
    if (name.length == 0)
      Some((path, ext.drop(1), ""))
    else
      Some((path, name.drop(1), ext.drop(1)))
  }
}

val RichFile(path, name, ext) = "/home/cay/readme.txt"
println(path)
println(name)
println(ext)
