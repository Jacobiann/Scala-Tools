/**
 * Created by s3553 on 2015/10/12.
 */

import org.jblas.DoubleMatrix

object Jblas_example {
  def main(args: Array[String]) {
    var a = new DoubleMatrix(10,5)
    //a.put(row,column,number) the first column and row in dimension is 0
    a.put(1, 0, 10) //put 10 into (row2,column1)
    println(a.get(1, 0))
    //a.put(line,number) count by line
    a.put(10 , 1) //put 1 into (row1,column2)
    println(a.get(10))
// not yet   a.putRow(2,a)
//    println(a.getRow(2))
    var b = new DoubleMatrix(4,3)
    for (i <- 0 to b.length - 1){
      b.put(i, i )
    }
    println(b)
  }
}
