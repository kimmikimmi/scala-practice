
object groupby {
  val list = Seq(("one", "i", "char"), ("two", "2", "num"), ("two", "ii", "char"))


  val v = list.groupBy(_._3)

  println(v)


  val values = list
    .groupBy(_._3)
    .mapValues(_.map(_._2))

  println(values)

  val value1 = list
    .groupBy((_._3))
    .map(t => (t._1, t._2.length))

  println(value1)


  val names = List("Jactson", "Pter", "jax", "karl", "jactson", "jactson", "jax")

  println(names.groupBy(x => x.toString))

  println(names.groupBy(_.toString))



  // element 의 length 별로 그룹핑할 수 있고 groupBy 결과 타입은 Map
  println(names.groupBy(_.length))


  val unsorted = names.distinct.groupBy(_.length)

  println(unsorted)




}
