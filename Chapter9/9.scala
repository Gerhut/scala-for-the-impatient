import java.io.File

def subdirs(dir:File): Iterator[File] = {
  val children = dir.listFiles.filter(_.isDirectory)
  children.toIterator ++ children.toIterator.flatMap(subdirs _)
}

def countClass(path:String) = {
  var s = 0
  for (dir <- subdirs(new File(path)))
    for (file <- dir.listFiles)
      if (file.getName.endsWith(".class"))
        s += 1
  s
}

println(countClass("C:\\"))
