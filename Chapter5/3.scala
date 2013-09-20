class Time(private val hrs:Int, private val min:Int) {
  def before(other:Time):Boolean = {
    if (hrs != other.hrs)
      hrs < other.hrs
    else 
      min < other.min
  }
}

val t1 = new Time(8, 20)
val t2 = new Time(8, 30)
val t3 = new Time(7, 40)

println(t1.before(t2))
println(t2.before(t3))
