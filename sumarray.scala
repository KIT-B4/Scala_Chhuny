object demo{
  def main(args:Array[String]){
    var array = new Array[Int](5)
    var array2 = new Array[Int](5)
    var arr = new Array[Int](10)
    var sum = 0
    var max = 0
    var min = 0
    var a = 0
    println("Input element of array 1")
    for (x <- 0 to array.length-1){
      array(x) = scala.io.StdIn.readInt()
    }
    for (x <- 0 to array.length-1){
      sum = sum + array(x)
    }
    println("Sum of array is: "+sum)
    max = array(0)
    min = array(0)
    for (i <- 1 to array.length-1){
      if(max<array(i)){
        max = array(i)
      }
    }
    for (i <- 1 to array.length-1){
      if(min>array(i)){
        min = array(i)
      }
    }
    println("Max value is: "+max)
    println("Min value is: "+min)
    println("Input element of array 2")
    for (x <- 0 to array2.length-1){
      array(x) = scala.io.StdIn.readInt()
    }
    arr = array ++ array2
    println("Concatenate of array: ")
    arr.foreach(a => println(a))
  }
}
