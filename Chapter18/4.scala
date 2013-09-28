import scala.collection.mutable.ArrayBuffer

class Network { outer =>
  class Member(val name:String) {
    private val network = outer

    val contacts = new ArrayBuffer[Network#Member]

    override def equals(that:Any) =
      that.isInstanceOf[Member] &&
      this.network == that.asInstanceOf[Member].network
  }

  private val members = new ArrayBuffer[Member]

  def join(name:String) = {
    val m = new Member(name)
    members += m
    m
  }
}

val chatter = new Network
val myFace = new Network

val fred1 = chatter.join("Fred")
val fred2 = chatter.join("Fred")
val fred3 = myFace.join("Fred")

println(fred1 == fred2)
println(fred1 == fred3)
