package chapter8

/**
  * @author : Jaden
  * @since : 08/02/2018
  */

class Point extends A {
  override def printTest(): Unit = println("Point class")

  override def test1(): Unit = println("Pointclass test1")

  override def test2(): Unit = println("pointclass test2")

}


object Point extends A {
  override def printTest(): Unit = println("point object")

  override def test1(): Unit = println("point object test1")

}
