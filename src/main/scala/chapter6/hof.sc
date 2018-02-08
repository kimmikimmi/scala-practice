object hof {
  val numbers = List(1, 2, 3, 4)
  Set(1, 22, 3)

  val hostPort = ("localhost", 8080)
  hostPort._2
  hostPort._1

  Map(1 -> 2)
  Map("foo" -> "woo")

  Map(1 -> Map("al" -> "bl"))


  val num = Map("one" -> 1, "two" -> 2)


  num.get("two")
  num.get("one")

  numbers.map((i: Int) => i * 2)

  def timesTwo(i: Int) = i * 2

  numbers.map(timesTwo _)
  numbers.map(timesTwo)


  numbers.partition(_ % 2 == 0)

  numbers.find((i: Int) => i > 5)
  numbers.drop(1)
  numbers.dropWhile(_ % 2 != 0)


  List(List(1, 2), List(3, 4)).flatten


  val nestedNumbers = List(List(1, 2), List(3, 4))

  nestedNumbers.flatMap(x => x.map(_ * 2))


  def ourMap(Numbers: List[Int], fn: Int => Int): List[Int] = {
    numbers.foldRight(List[Int]()) { (x: Int, xs: List[Int]) =>
      fn(x) :: xs;
    }
  }

  ourMap(numbers, (i : Int) => i + 1)

  val extensions = Map("Steve" -> 100, "bob" -> 101, "joe" -> 201)

  extensions.filter({case(name, extension) => extension < 200})


}