def values(fun: (Int) => Int, low:Int, high:Int) = {
  import scala.collection.mutable.ArrayBuffer
  for (i <- low to high)
    yield (i, fun(i))
}

println(values(x => x * x, -5, 5))
