class Counter {
  private var value = Int.MaxValue - 1
  def increment() { value = if (value == Int.MaxValue) 0 else value + 1 }
  def current() = value
}

val counter = new Counter
println(counter.current)
counter.increment()
println(counter.current)
counter.increment()
println(counter.current)
