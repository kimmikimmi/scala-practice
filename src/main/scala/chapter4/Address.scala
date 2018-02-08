package chapter4

/**
  * @author : Jaden
  * @since : 07/02/2018
  */
case class Address(street : String, city : String, country : String)

case class Person(name : String, age : Int, address: Address)
