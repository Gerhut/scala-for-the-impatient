object SimpleColor extends Enumeration {
  val Black = Value(0x000000)
  val Red = Value(0xFF0000)
  val Green = Value(0x00FF00)
  val Blue = Value(0x0000FF)
  val Yellow = Value(0xFFFF00)
  val Magenta = Value(0xFF00FF)
  val Cyan = Value(0x00FFFF)
  val White = Value(0xFFFFFF)
}

println(SimpleColor.Magenta.id)
