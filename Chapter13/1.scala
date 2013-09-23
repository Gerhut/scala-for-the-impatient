def indexes(str:String) = {
  import scala.collection.mutable.HashMap
  import scala.collection.mutable.TreeSet

  val result = new HashMap[Char, TreeSet[Int]]
  str.zipWithIndex.foreach((ci: (Char, Int)) =>
    result(ci._1) = result.getOrElse(ci._1, new TreeSet[Int]) + ci._2)
  result
}

println(indexes("Mississippi"))
