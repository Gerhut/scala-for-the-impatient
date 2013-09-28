def find(ns:Array[Int], n:Int): Int Either Int =
  if (n == ns(ns.length / 2))
    Left(ns.length / 2)
  else if (n > ns(ns.length / 2))
    Left(find(ns take ns.length / 2, n))
  else
    Left(find(ns drop ns.length / 2, n) + ns.length / 2)

println(find(Array(1,2,3,4,5,6,7), 3))