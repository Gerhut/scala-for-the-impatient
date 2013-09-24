import java.io.File

def javas(dir:File):Array[File] = {
  val filedirs = dir.listFiles
  val dirs = filedirs.filter(_.isDirectory)
  val files = filedirs.filter(_.getName.endsWith(".java"))
  files ++ dirs.flatMap(javas)
}

var caseCount = 0
var fallCount = 0
val casePattern = """case [^:]+:""".r
val fallPattern = """[Ff]alls? thr""".r

for (java <- javas(new File("/Users/liuhe/src"))) {
  val code = scala.io.Source.fromFile(java).mkString
  caseCount += casePattern.findAllIn(code).length
  fallCount += fallPattern.findAllIn(code).length
}

println(caseCount)
println(fallCount)
println(fallCount.toDouble / caseCount.toDouble * 100 + "%")
