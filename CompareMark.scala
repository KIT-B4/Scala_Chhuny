object compare
{
    def main(args:Array[String])
    {
        var a=Array(5,6,20,35);
        var b=Array(10,6,15,44);
        var x:Int=0;
        var y:Int=0;

        for(i <- 0 to a.length-1)
        {
            if(a(i)>b(i))
            {
                x=x+1;
            }
            else if(a(i)<b(i))
            {
                y=y+1;
            }
            else
            {
                x=x+0;
             y=y+0;
            }
        }
        println("A got: "+x);
       println("B got: "+y);
    }
}