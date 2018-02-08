//import scala.concurrent
import scala.annotation.tailrec
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object name_param {
  def printName(first: String = "john", last: String = "jay"): Unit = {
    println(s"$first $last")
  }

  printName("hyunjun", "kim")
  printName(first = "jaden", last = "kimm")
  printName(last = "dabb`")
  printName(last = "Kim")
  printName()

  def sleep(millis: Long) = {
    Thread.sleep(millis)
  }

  def doWork(index: Int) = {
    sleep((math.random * 1000).toLong)
    index
  }

  (1 to 5) foreach { index =>
    val future = Future {
      doWork(index)
    }

    future onSuccess {
      case answer: Int => println(s"success! returned : $answer")
    }

    future onFailure {
      case th: Throwable => println(s"Failure! returned : $th")
    }
  }
  sleep(1000)
  println("fine")


  def factorial(i: Int): Integer = {
    @tailrec
    def fact(i: Int, accumulator: Integer): Integer = {
      if (i <= 1) accumulator
      else fact(i - 1, i * accumulator)
    }

    fact(i, 1)
  }

  (0 to 10) foreach (i => println(factorial(i)))


  def factorial2(i: Int): Long = {
    def fact(i: Int, accumulator: Long): Long = {
      if (i <= 1) accumulator
      else fact(i - 1, i * accumulator)
    }

    fact(i, 1L)
  }

  (0 to 5) foreach ( i => println(factorial2(i)) )


  println(factorial(5))
  println(factorial2(5))
}