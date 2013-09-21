import scala.collection.mutable.ArrayBuffer
class Person(val name:String) extends Serializable {
  val friends = new ArrayBuffer[Person]
}

object Main extends App {
  val persons = Array(new Person("Amy"), new Person("Bob"), new Person("Cathy"))
  persons(0).friends += persons(1)
  persons(1).friends += persons(2)
  persons(2).friends += persons(0)

  import java.io._
  val out = new ObjectOutputStream(new FileOutputStream("foo.dat"))
  out.writeObject(persons)
  out.close()
  val in = new ObjectInputStream(new FileInputStream("foo.dat"))
  val savedPersons = in.readObject.asInstanceOf[Array[Person]]

  println(savedPersons(0).friends(0) == savedPersons(1))
  println(savedPersons(1).friends(0) == savedPersons(2))
  println(savedPersons(2).friends(0) == savedPersons(0))
}