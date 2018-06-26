object TimeTable
{
    def main(args:Array[String])
    {
        println("Enter a number to display Timetable: ");
        var input = scala.io.StdIn.readInt();
        var num = 0;
        for(num <- 1 to 10)
        {
            println(input+" * "+num+" = "+(input*num));
        }
    }
}