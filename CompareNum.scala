object compare
{
    def main(args:Array[String])
    {
        var mylist = Array(32,26,88);
        var temp=0;

        for(x <- 0 to mylist.length-1)
        {
            for(y <- x+1 to mylist.length-1)
            {
                if(mylist(x)<mylist(y))
                {
                    temp = mylist(y);
                    mylist(y) = mylist(x);
                    mylist(x) = temp;
                }
            }
        }
        
        for (a <- mylist)
        {
            println(a);
        }
    }
}