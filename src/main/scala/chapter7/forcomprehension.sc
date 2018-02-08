
object forcomprehension {

  import scala.util.control.TailCalls._

  def isEven(xs: List[Int]): TailRec[Boolean] =
    if (xs.isEmpty) done(true) else tailcall(isOdd(xs.tail))


  def isOdd(xs: List[Int]): TailRec[Boolean] =
    if (xs.isEmpty) done(false) else tailcall(isEven(xs.tail))


  for (i <- 1 to 5) {
    val even = isEven((1 to i).toList).result

    println(s"$i is even ? $even")
  }


  val seq1 = Seq("Programming", "Scala")
  val seq2 = "People" +: "shuild" +: "read" +: "seq1"

  val seq3 = "Programming" +: "Scala" +: Seq.empty
  val seq4 = "People" +: "should" +: "read" +: Seq.empty
  val seq5 = seq4 ++ seq3


  (List(1, 2, 3, 4, 5, 6) foldRight List.empty[String]) {
    (x, list) => ("[" + x + "]") :: list
  }


  (List(1, 2, 3, 4, 5, 6) reduce (_ + _))
  //  (List(1,2,3,4,5,6) fold (0) (_, _) => (_ + _))
  val fold1 = (List(1, 2, 3, 4, 5, 6) fold 10) _ // ??
  fold1(_ * _)


  (List.empty[Int] fold 10) (_ + _)
  val numbers = List(1, 2, 3, 4, 5, 6)
  (numbers fold 10) (_ + _)


  //??
  import scala.math.BigInt

  val fibs: Stream[BigInt] = BigInt(0) #:: BigInt(1) #:: fibs.zip(fibs.tail).map(n => n._1 + n._2)

  fibs take 10 foreach (i => print(s"$i "))


  val stateCapitals = Map(
    "Alibama" -> "Montgomery",
    "Alaska" -> "Juneau",
    "Wyoming" -> "Cheyenne"
  )

  val map2 = stateCapitals filter { kv => kv._1 startsWith "A" }
  val map3 = stateCapitals filter (kv => kv._1.startsWith("A"))

  def positive(i: Int): Either[String, Int] =
    if (i > 0) Right(i) else Left(s"nonpositive number $i")


  for {
    i1 <- positive(5).right
    i2 <- positive(10 * i1).right
    i3 <- positive(25 * i2).right
    i4 <- positive(2 * i3).right
  } yield (i1 + i2 + i3 + i4)


  print(1)

  val results = Seq[Either[RuntimeException, Int]] =
    Vector(Right(10), Left(new RuntimeException("Boo!")), Right(20))

//  val results2a = for {
//    Right(i) <- results
//  } yield (Right(i).value)
//
//  println(results2a)

  print(1)

}
