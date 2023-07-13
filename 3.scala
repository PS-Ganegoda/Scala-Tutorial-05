// . Write a recursive function returns the addition of numbers from1 to n?
// For example sum(5) should print 15


object question3{
    //  def getn():Unit={  
    //   println("Enter n numbers you want to get sum:");
    //   val n = scala.io.StdIn.readInt();

    //  }
     def sum(n:Int):Int={
       if (n<=0)
        {
          return 0;
         }
      else 
          return n + sum(n-1);
    }

     def main(args:Array[String]):Unit={
    //   val n =getn();
       val result=sum(5);
       println(result);
     
      
    }

}