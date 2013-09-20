class Person(startAge:Int) {
  private var privateAge:Int = if (startAge >= 0) startAge else 0

  def age = privateAge
  def age_=(newValue: Int) {
    if (newValue > privateAge) privateAge = newValue
  }
}

println(new Person(-2).age)
