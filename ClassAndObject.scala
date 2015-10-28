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
    val loca = new Location(10,20,15)
    println("----Extends Example----")
    println(loca.move(2,3,4))
  }
}
