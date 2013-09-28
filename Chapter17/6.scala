def middle[T](it:Iterable[T]) = it.drop((it.size - 1) / 2).head

println(middle("World"))
