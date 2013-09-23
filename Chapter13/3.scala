import scala.collection.mutable.LinkedList

def remove0(list: LinkedList[Int]) {
  var cur = new LinkedList(-1, list)
  while (cur.next != Nil) {
    var non0cur = cur.next
    while (non0cur != Nil && non0cur.elem == 0)
      non0cur = non0cur.next
    if (non0cur == Nil) {
      while(cur.next != Nil)
        cur.next = cur.next.next
    } else {
      val t = cur.next.elem
      cur.next.elem = non0cur.elem
      non0cur.elem = t
    }
    cur = cur.next
  }
}

val list = LinkedList(0, 1, 0, 3, 0, 4, 0, 0, 4, 0)
remove0(list)
println(list)
