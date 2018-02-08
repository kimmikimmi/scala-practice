
object foroptions {
  val states = List("Alibama", "Alaska", "Virginia", "Wyoming")


  for {
    s <- states
    c <- s
    if c.isLower

  } yield s"$c-${c.toUpper}"



  states flatMap (_.toSeq withFilter (_.isLower) map (c => s"$c - ${c.toUpper}"))
}