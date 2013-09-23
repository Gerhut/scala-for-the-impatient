def indexes(str:String) = {
  import scala.collection.immutable.HashMap
  import scala.collection.immutable.List

  //val result = new HashMap[Char, List[Int]]
  Map(str.distinct.map((c: Char) =>
    (c -> List(str.zipWithIndex.filter(c == _._1).map(_._2): _*))): _*)
  //result
}

println(indexes("Mississippi"))
