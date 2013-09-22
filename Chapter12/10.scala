abstract class DoSomething {
  def els(block: => Unit)
}

def unless(cond:Boolean)(block: => Unit) = {
  if(!cond)
    new DoSomething { block; def els(block: => Unit){} }
  else
    new DoSomething { def els(block: => Unit){ block } }
}

unless(1 > 2) {
  println("success")
} els {
  println("failed")
}
unless(1 < 2) {
  println("failed")
} els {
  println("success")
}
