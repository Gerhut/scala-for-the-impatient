package object random {

  private val a = 1664525
  private val b = 1013904223
  
  private var seed = 0
  def setSeed(seed:Int) {
    this.seed = seed
  }

  def nextInt = {
    seed = (seed * a + b)
    seed
  }

  def nextDouble = 1.0 / nextInt

}

package random {}

object Test extends App {
  random.setSeed(100)
  println(random.nextInt)
  println(random.nextDouble) 
}
