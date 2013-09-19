val weekDays = scala.collection.mutable.LinkedHashMap[String, Int]()

weekDays += ("Monday" -> java.util.Calendar.MONDAY)
weekDays += ("Tuesday" -> java.util.Calendar.TUESDAY)
weekDays += ("Wednesday" -> java.util.Calendar.WEDNESDAY)
weekDays += ("Thursday" -> java.util.Calendar.THURSDAY)
weekDays += ("Friday" -> java.util.Calendar.FRIDAY)
weekDays += ("Saturday" -> java.util.Calendar.SATURDAY)
weekDays += ("Sunday" -> java.util.Calendar.SUNDAY)

println(weekDays)
