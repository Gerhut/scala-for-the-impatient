sealed abstract class BinaryTree
case class Leaf(value:Int) extends BinaryTree
case class Node(operator:Char, children:BinaryTree*) extends BinaryTree

def eval(tree:BinaryTree):Int = tree match {
  case Leaf(value) => value
  case Node('-', children @ _*) => -children.map(eval).sum
  case Node('*', children @ _*) => children.map(eval).product
  case Node(_, children @ _*) => children.map(eval).sum
}

println(eval(Node('+', Node('*', Leaf(3), Leaf(8)), Leaf(2), Node('-', Leaf(5)))))
