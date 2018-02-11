import apple.laf.JRSUIConstants.NothingToScroll

object test {

  sealed trait Drink

  trait SoftDrink extends Drink

  class cola extends SoftDrink

  class TonicWater extends SoftDrink


  trait Juice extends Drink

  class OrangeJuice extends Juice

  class AppleJuice extends Juice

  class VendingMachine[+A] {
    // don't really worry about what's implemented here
  }

  class WeirdVendingMachine[-A] {

  }


  object DrinkMain extends App {
    def install(softDrinkVM: VendingMachine[SoftDrink]): Unit = {
      println("Vending machine ToString : " + softDrinkVM.toString)
    }

    install(new VendingMachine[cola])
    install(new VendingMachine[TonicWater])
    //    install(new VendingMachine[Drink]) Type mismatch

  }

  def installWeirdly(softDrinkVM : WeirdVendingMachine[SoftDrink]) : Unit = {
    println("a")
  }

  installWeirdly(new WeirdVendingMachine[SoftDrink])
  installWeirdly(new WeirdVendingMachine[Drink])
//  install2(new WeirdVendingMachine[TonicWater])

}