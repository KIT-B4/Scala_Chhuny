object demo{
    def main(args:Array[String]){
        // var a = Array(2,1,3,4)
        // var b = Array(3,4,5,6)
        // for(x <- 0 to a.length-1){
        //     print(a(x)+b(x)+" ")
        // }
        var x = Array.ofDim[Int](2,2)
        var y = Array.ofDim[Int](2,2)
        var z = Array.ofDim[Int](2,2)
        var i = 0;
        var j = 0;
        println("Enter element of array: ")
        for(i <- 0 to 1){
            for(j <- 0 to 1){
                x(i)(j)=scala.io.StdIn.readInt()
            }
        }
        println("Enter element of array: ")
        for(i <- 0 to 1){
            for(j <- 0 to 1){
                y(i)(j)=scala.io.StdIn.readInt()
            }
        }
        println("Result")
        for(i <- 0 to 1){
            for(j <- 0 to 1){
                z(i)(j)=x(i)(j)+y(i)(j)
            }
        }
        for(i <- 0 to 1){
            for(j <- 0 to 1){
                print(z(i)(j)+" ")
            }
            print("\n")
        }
    }
}