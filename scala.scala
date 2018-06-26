object factorial
{
    def main(args:Array[String])
    {
        println(calculate(5));
    }
    def calculate(num:Int):Int=
    {
        if(num<=1)
            1
        else
        num * calculate(num-1)
    }
}