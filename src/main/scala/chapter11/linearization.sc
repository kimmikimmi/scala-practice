object test {
  class C1 {
    def m = print("C1 ")
  }

  trait T1 extends C1{
    override def m = {print("t1 "); super.m}
  }

  trait T2 extends C1 {
    override def m = {print("t2 ") ;super.m}
  }
  trait T3 extends C1 {
    override def m = {print("t3"); super.m}
  }

  class C2A extends  T2 {
    override def m = {print("C2A "); super.m}
  }

  class C2 extends C2A with T1 with T2 with T3{
    override def m = {print("C2 "); super.m}
  }


  def calLinearization(obj : C1, name: String) = {
    print(s"$name : ")
    obj.m
    print("AnyRef ")
    print("Any ")
  }

  calLinearization(new C2, "C2 ")
  println()
  calLinearization(new T3{}, "T3 ")
  calLinearization(new T2{}, "T2 ")
  calLinearization(new T2{}, "T1 ")
  calLinearization(new C2A, "C2A")
  calLinearization(new C1, "C1 ")


  /**
    * Type is unable to be overrided
    */
  //  abstract class AC1 {
//    val name : String
//    var count: Int
//    type in  =  String
//  }
//
//
//  class AC21 extends AC1 {
//    val name = "AC21"
//    var count = 1
//    override type in = Int
//  }
}