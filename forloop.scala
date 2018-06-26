object demo
{
  def main(args:Array[String])
  {
    print("Input the value: ")
    var num:Int = scala.io.StdIn.readInt();
    var i:Int = 0;
    for(i <- (0 to num) if(i%4!=0))
    {
      print(i+" ");
    }
  }
}
