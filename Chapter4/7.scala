import scala.collection.JavaConversions.propertiesAsScalaMap

val props:scala.collection.Map[String, String] = System.getProperties()
val maxKeyLength = (for ((key, _) <- props) yield key.length).max

for ((key, value) <- props)
  printf("%-" + maxKeyLength + "s | %s\n", key, value)
