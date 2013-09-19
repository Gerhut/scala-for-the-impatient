def product(s:String):Long = {
  if (s.length == 0)
    1
  else
    s.head.toLong * product(s.tail)
}

println(product("Hello"))
