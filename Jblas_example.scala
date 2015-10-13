/**
 * Created by s3553 on 2015/10/12.
 */

import org.jblas._

object Jblas_example {
  def main(args: Array[String]) {

    //1.Matrix creation and element access
    var a = new DoubleMatrix(10,5)
    //a.put(row,column,number) the first column and row in dimension is 0
    a.put(1, 0, 10) //put 10 into (row2,column1)
    println(a.get(1, 0))
    //a.put(line,number) count by line
    a.put(10 , 1) //put 1 into (row1,column2)
    println(a.get(10))
    println("----a Matrix----")
    println(a)
    // not yet   a.putRow(2,a)
    //    println(a.getRow(2))
    println("----b Matrix----")
    var b = new DoubleMatrix(4,3)
    for (i <- 0 to b.length - 1){
      b.put(i, i )
    }
    println(b)
    //Pass a buffer object to prevent spurious object creation
    println("----Matrix use buf----")
    var abuf = DoubleMatrix.randn(10, 100)
    var buf = new DoubleMatrix(10)
    for (i <- 0 to abuf.columns-1){
      println(i + "column" + abuf.getColumn(i,buf))
      //do something with buf
    }

    //2.Matrix Arithmetic
    var c = new DoubleMatrix(3, 3, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    var x = new DoubleMatrix(3, 1, 10 ,11, 12)
    println("----Matrix Arithmetic")
    var y = c.mmul(x) //product of two array
    println("mmul")
    println(y)
    var z = x.add(y)
    println("add")
    println(z)


  }
}
