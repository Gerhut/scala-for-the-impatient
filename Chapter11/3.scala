class Fraction(private val n:Int, private val d:Int) {
  private val num: Int = if (d == 0) 1 else n * sign(d) / gcd(n, d)
  private val den: Int = if (d == 0) 0 else d * sign(d) / gcd(n, d)
  override def toString = num + "/" + den
  def sign(a: Int) = if (a > 0) 1 else if (a < 0) -1 else 0
  def gcd(a: Int, b:Int): Int = if (b == 0) math.abs(a) else gcd(b, a % b)
  def lcm(a: Int, b:Int): Int = a * b / gcd(a, b)

  def +(that: Fraction) = {
    val den = lcm(this.d, that.d)
    new Fraction(den / this.d * this.n + den / that.d * that.n, den)
  }

  def -(that: Fraction) = {
    val den = lcm(this.d, that.d)
    new Fraction(den / this.d * this.n - den / that.d * that.n, den)
  }

  def *(that: Fraction) = new Fraction(this.n * that.n, this.d * that.d)

  def /(that: Fraction) = new Fraction(this.n * that.d, this.d * that.n)
}

val a = new Fraction(1, 3)
val b = new Fraction(1, 2)
println(a + b)
println(a - b)
println(a * b)
println(a / b)
