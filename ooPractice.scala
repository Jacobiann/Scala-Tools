/**
 * Created by s3553 on 2015/10/16.
 */
object ooPractice {
  class ClassA {
    val x =10
    println("Init classAfirst print")

    def hello(): Unit = {
      println("Hello from classA")
    }

    println("Init classA second print")
  }
  //若一個類別不需要定義成員時，可省略大括號
  //變數前加上var/val可以代表是public變數，若無
  class Person(val userID: Int , var name: String)
  //
  class Person1(val userID1: Int , var name1: String){
    //副建構子(auxiliary constructor)，其第一行一定要呼叫
    //類變後的建構子，或是其他已定義過的建構子
    //副建構子的內容，要物件被建立後才能被執行
    def this(userID1: Int) = {
      //println("wrong place")物件還未被建立，Error
      this(userID1,"Who am I")
      println("In auxiliary constructor")
    }
    println("In primary constructor")
  }

  def main(args: Array[String]) {
    //ClassA
    println("-----classA-----")
    val objA = new ClassA
    objA.hello()
    //Person
    println("-----Person-----")
    val person = new Person( 25, "Andy lin")
    println(person.userID)
    println(person.name)
    person.name = "David" //Because it is var, so it can change
    println(person.name)
    //Person1: auxiliary constructor example
    println("-----Person1-----")
    val person1 = new Person1(1)
    println(person1.userID1)
    println(person1.name1)
  }



}
