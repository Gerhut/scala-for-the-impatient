def corresponds[A, B](seq1:Seq[A], seq2:Seq[B], func:(A, B) => Boolean) = seq1.zip(seq2).forall(pair => func(pair._1, pair._2))

val strings = Array("abc", "de", "f")
val lengths = Array(3, 2, 1)

println(corresponds(strings, lengths, (x:String, y:Int) => x.length == y))
lengths(2) = 2
println(corresponds(strings, lengths, (x:String, y:Int) => x.length == y))