object demo{
  def main(args:Array[String]){
    var list1 = List(25,17,12)
    var list2 = List(44,2,6,77)
    var list3 = list1 ++ list2
    println(list3)
    println("List reverse: "+list3.reverse)
    list3=list3:+25
    println(list3)
    var list4 = List(list1,list2)
    println(list4)
    var str = list1.mkString(". ")
    println(str)
  }
}
