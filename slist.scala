object demo{
  def main(args:Array[String]){
    var list = List("Alex","Aloha","Hola","Bob")
    var i = 0
    for(i <- 0 to list.size-1)
    {
      if(list(i).startsWith("A"))
      {
        println(list(i))
      }
    }
  }
}
