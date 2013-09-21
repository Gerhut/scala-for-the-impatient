import java.util.{HashMap => JavaHashMap}
import scala.collection.mutable.{HashMap => ScalaHashMap}

val source = new JavaHashMap[String, Int]
val destination = new ScalaHashMap[String, Int]

source.put("A", 1)
source.put("B", 2)
source.put("C", 3)

destination.put("C", 1)
destination.put("D", 2)
destination.put("E", 3)

for (key <- source.keySet.toArray(new Array[String](0)))
  destination(key) = source.get(key)

println(destination)
