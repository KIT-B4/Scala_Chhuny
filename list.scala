object demo{
  def main(args:Array[String]){
    var fruit = List("banana","apple","coconut")
    println("First List: "+fruit)
    fruit=fruit:+"pineapple"
    println("List add: "+fruit)
    println("Fruit tail is: "+fruit.tail)
    println("List reverse: "+fruit.reverse)
    print("Input some list: ")
    var x:String = scala.io.StdIn.readLine()
    fruit=fruit:+x
    println("List add by user: "+fruit)
  }
}
