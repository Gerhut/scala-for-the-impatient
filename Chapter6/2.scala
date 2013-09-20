abstract class UnitConversion {
  def doConversion(source:Double):Double
}

object InchesToCentimeters extends UnitConversion {
  def doConversion(source:Double) = source * 2.54
}

object GallonsToLiters extends UnitConversion {
  def doConversion(source:Double) = source * 3.785
}

object MilesToKilometers extends UnitConversion {
  def doConversion(source:Double) = source * 1.609344
}

println(InchesToCentimeters.doConversion(2))
println(GallonsToLiters.doConversion(3))
println(MilesToKilometers.doConversion(4))
