class Money private (val value:Int) {
  def +(that:Money) = new Money(this.value + that.value)
  def -(that:Money) = new Money(this.value - that.value)
  def ==(that:Money) = this.value == that.value
  def <(that:Money) = this.value < that.value
  def >(that:Money) = this.value > that.value
}

object Money {
  def apply(dollar:Int, cent:Int) = new Money(dollar * 100 + cent)
}

println(Money(1, 75) + Money(0, 50) == Money(2, 25))
println(Money(1, 25) - Money(0, 50) == Money(0, 75))
println(Money(1, 25) > Money(0, 75))
println(Money(1, 25) < Money(0, 75))
