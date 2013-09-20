class Car (val manufacturers:String,
           val modelName:String,
           val modelYear:Int = -1,
           var license:String = "") {
  def this(manufacturers:String, modelName:String, license:String) {
    this(manufacturers, modelName, -1, license)
  }
}

new Car("Ford", "SUV")
new Car("Ford", "SUV", 1989)
new Car("Ford", "SUV", "JK1234")
new Car("Ford", "SUV", 1989, "JK1234")
