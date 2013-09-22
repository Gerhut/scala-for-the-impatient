class BigSequence {
  private var bits:Long = 0

  def apply(index:Byte):Boolean = ((bits & (1 << index)) > 0)
  def update(index:Byte, value:Boolean) {
    if (value)
      bits |= (1 << index)
    else
      bits &= ~(1 << index)
  }
}

val seq = new BigSequence

println(seq(15))
seq(15) = true
println(seq(15))
seq(15) = false
println(seq(15))
