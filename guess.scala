object demo{
  def square(a:Int):Int = a*a
  def main(args:Array[String])
  {
    var a:Int=9
    println("Valua is:"+square(a))
    print("Guess the value of square: ")
    var b:Int = scala.io.StdIn.readInt()
    if(b==a)
      println("Your input is RIGHT")
    else
      println("Guess WRONG")
  }
}
