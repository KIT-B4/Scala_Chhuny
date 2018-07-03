object demo{
  def main(args:Array[String]){
    var list:String=List()
    var x=0
    print("Input list: ")
    for(x<- 0 to 5)
    {
      var x:String = scala.io.StdIn.readLine()
      list = list:+ x
    }
    println(list)
  }
}
