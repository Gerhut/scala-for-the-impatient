class Employee() {
  private var _name:String = "John Q. Public"
  var salary:Double = 0.0

  def this(name:String, salary:Double) {
    this()
    _name = name
    this.salary = salary
  }

  def name:String = this._name
}

var e = new Employee("Fred", 1000)
println(e.name)
println(e.salary)

e = new Employee()
println(e.name)
println(e.salary)
