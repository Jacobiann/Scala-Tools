/**
 * Created by s3553 on 2015/10/17.
 */

object overload {
  class Overload{
    def over(str1: String): Unit = {
      println(str1)
    }
    def over(int1:Int , int2: Int): Unit = {
      println(int1 + int2)
    }
    def over(str2: String,str3: String): Unit = {
      println(str2 + "\t" + str3)
    }
  }

  def main(args: Array[String]) {
    val obj1 = new Overload()
//    val obj2 = new Overload(3,4)
//    val obj3 = new Overload("Hello" , "Scala")
    obj1.over(2,5)
    obj1.over("Hello")
    obj1.over("Hello", "Scala")
  }
}
