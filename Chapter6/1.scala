object Conversions {
  def inchesToCentimeters(inches:Double) = inches * 2.54
  def gallonsToLiters(gallons:Double) = gallons * 3.785
  def milesToKilometers(mailes:Double) = mailes * 1.609344
}

println(Conversions.inchesToCentimeters(2))
println(Conversions.gallonsToLiters(3))
println(Conversions.milesToKilometers(4))
