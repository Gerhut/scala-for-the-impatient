class Time(hrs:Int, min:Int) {
  private val totalMins = min + hrs * 60
  def before(other:Time):Boolean = {
    totalMins < other.totalMins
  }
}

val t1 = new Time(8, 20)
val t2 = new Time(8, 30)
val t3 = new Time(7, 40)

println(t1.before(t2))
println(t2.before(t3))
