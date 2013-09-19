import java.awt.datatransfer._
import scala.collection.JavaConversions.asScalaBuffer
import scala.collection.mutable.Buffer

val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
val natives:Buffer[String] = flavors.getNativesForFlavor(DataFlavor.imageFlavor)

println(natives.mkString(", "))
