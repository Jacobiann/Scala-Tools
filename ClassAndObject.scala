/**
 * Created by s3553 on 2015/10/28.
 */
object ClassAndObject {
  class Point(val xc: Int, val yc: Int){
    var x = xc
    var y = yc
    def move(dx:Int, dy:Int): Unit ={
      x = x + dx
      y = y + dy
      println("Point x location : " + x)
      println("Point y location : " + y)
    }
  }

  //要overrride的變數必須是：1.immutable value(use val)
  //2.只能繼承non-private的變數 3.副建構子無法extends
  //In this case Point class is called "superclass"
  //Location is called "subclass"
  //Scala 只允許繼承一個Class
  class Location(override val xc: Int, override val yc:Int,
                 val zc:Int) extends Point(xc,yc){
    var z = zc
    def move(dx:Int, dy:Int, dz:Int): Unit ={
      x = x + dx
      y = y + dy
      z = z + dz
      println("Point (x,y,z) location : (" +x+","+y+","+z+")")
    }
  }

  def main(args: Array[String]) {
    val point = new Point(2,4)
    println("----Simple Example----")
    println(point.move(2,2))
    println(point.x)
    println(point.y)
    val loca = new Location(10,20,15)
    println("----Extends Example----")
    println(loca.move(2,3,4))
  }
}
