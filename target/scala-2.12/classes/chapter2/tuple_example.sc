// src/main/scala/progscala2/typelessdomore/tuple-example.sc
object tuple_example {
  val t = ("Hello", 1, 2.3) // <1>
  println("Print the whole tuple: " + t)
  println("Print the first item:  " + t._1) // <2>
  println("Print the second item: " + t._2)
  println("Print the third item:  " + t._3)

  val (t1, t2, t3) = ("World", '!', 0x22) // <3>
  println(t1 + ", " + t2 + ", " + t3)

  val (t4, t5, t6) = Tuple3("World", '!', 0x22) // <4>
  println(t4 + ", " + t5 + ", " + t6)


  (1, "one")

  1 -> "one"
  2 -> "two"
  3 -> "three" -> "four"
  val t21 = 3 -> ("three" -> "four" -> "five")

  //  t2._1
  println(t21._1, t21._2._1._2)


  val numbers = List(1, 2, 3, 4, 5, 6)
  val rList = numbers.reverse

  for(a <- rList) {
    println(a)
  }

  val onlyFewList = numbers drop 2 take 3

  println(onlyFewList)

  val things = List(0,1,true)

  things(2)


  val things2 = List(0, 1, "false")  // LUB : List Upper type Bound


}

