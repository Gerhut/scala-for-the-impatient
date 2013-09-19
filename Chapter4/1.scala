val equip = Map(
  "Sword" -> 160,
  "Lance" -> 140,
  "Axe" -> 120,
  "Bow" -> 190
)

val salesEquip = for ((name, price) <- equip) yield name -> price * .9

println(salesEquip)
