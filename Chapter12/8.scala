val strings = Array("abc", "de", "f")
val lengths = Array(3, 2, 1)

println(strings.corresponds(lengths)(_.length == _))
lengths(2) = 2
println(strings.corresponds(lengths)(_.length == _))
