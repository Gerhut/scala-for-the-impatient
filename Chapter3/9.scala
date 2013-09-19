import java.util.TimeZone
val timeZones = (for {
  id <- TimeZone.getAvailableIDs
  if !id.startsWith("America/")
} yield id).sorted

println(timeZones.mkString("\n"))
