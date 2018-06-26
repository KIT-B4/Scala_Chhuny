object demo{
  def main(args:Array[String])
  {
    def square(n:Int):Int = (n*n)
    def sumsquare(n:Int,m:Int):Int = square(n)+square(m)
    println(square(2))
    println(sumsquare(2,3))

  }
}
