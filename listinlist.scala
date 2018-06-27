object demo{
  def main(args:Array[String])
  {
    var x : List[List[Int]]=
      List(List(1,2,3,4,5),List(6,7,8,9,10))
    println(x.flatten)


    var linelist = List(1,2,3,4,5)
    var pagelist = List(linelist,6,7,8,9,10)
    var booklist = List(pagelist,11,12,13,14,15)
    var categorylist = List(booklist,16,17,18,19,20)
    var librarylist = List(categorylist,21,22,23,24,25)
    println(booklist(0))
  }
}
