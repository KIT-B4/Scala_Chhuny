object tuple{
    def main(args: Array[String]){
        val t = ("Hello", 5, 10.3f, "Hey", 3)
        var sum:Float = 0
        var str = " "
        // t.productIterator.foreach{ i => if(isintance(i, int):){sum = sum + i}};
        t.productIterator.foreach {
            case i:Int => sum = sum + i
            case f:Float => sum = sum + f
            case s:String => 
        } 
        println("Sum of int and float in tuple is: " + sum)
        // println("The concatenate string is: " + str);
    }

}