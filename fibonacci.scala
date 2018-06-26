object fibonacci
{
    def main(args:Array[String])
    {
        var a:Int = 0;
        var b:Int = 1;
        var i:Int = 0;
        var n:Int = 6;
        var temp:Int = 0;
        println(a);
        println(b);
        while(i<n)
        {
            temp=a+b;
            a=b;
            b=temp;
            println(temp);
            i=i+1;
        }
    }
}