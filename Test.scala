/**
 * Created by s3553 on 2015/10/7.
 */

class Financial(name: String , sex: String, math:Int) {
  val studentName = name
  def grade(): Unit={
    println(math)
    if (math >= 60){
      println("畢業")
    }else{
      println("留級")
    }
  }
}


object Test {
  def main(args: Array[String]) {
    val andy = new Financial("Andy","man",60)

    println(andy.studentName)
    andy.grade()
  }
}
