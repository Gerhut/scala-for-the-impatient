def getValueArray(strings:Array[String], stringValues:Map[String, Int]) = {
  strings.flatMap((s:String) => stringValues.get(s))
}

println(getValueArray(
  Array("Tom", "Fred", "Harry"),
  Map("Tom" -> 3, "Dick" -> 4, "Harry" -> 5)).mkString(", "))
