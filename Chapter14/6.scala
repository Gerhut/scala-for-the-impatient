sealed abstract class BinaryTree
case class Leaf(value:Int) extends BinaryTree
case class Node(left:BinaryTree, right:BinaryTree) extends BinaryTree

def sum(tree:BinaryTree):Int = tree match {
  case Leaf(value) => value
  case Node(left, right) => sum(left) + sum(right)
}

println(sum(Node(Node(Leaf(3), Leaf(8)), Leaf(2))))
