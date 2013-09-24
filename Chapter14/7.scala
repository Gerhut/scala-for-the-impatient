sealed abstract class BinaryTree
case class Leaf(value:Int) extends BinaryTree
case class Node(children:BinaryTree*) extends BinaryTree

def sum(tree:BinaryTree):Int = tree match {
  case Leaf(value) => value
  case Node(children @ _*) => children.map(sum).sum
}

println(sum(Node(Node(Leaf(3), Leaf(8)), Leaf(2), Node(Leaf(5)))))
