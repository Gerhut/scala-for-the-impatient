class Person(fullName:String) {
  val firstName = fullName.split(' ')(0)
  val lastName = fullName.split(' ')(1)
}

val p = new Person("Fred Smith")
println(p.firstName)
println(p.lastName)
