/*Write a recursive function primeSeq(n) that prints all prime number 
which less than n? For example prime(10) should print 2,3,5, and 7 on the 
terminal.*/


object question2{
  def isprime(n:Int,i:Int=2):Boolean={

 if (n <= 1)
      return false

    for (i <- 2 until n) {
      if (n % i == 0)
        return false
    }

    return true
  }

  def primeSeq(n: Int): Unit = {
    for (i <- 2 until n) {
      if (isprime(i))
        println(i)
    }
  }
 def primeseque():Unit={
 for(i<-2 to 10){
    if(isprime(i))
    println(i);
 }
//println(isprime(i))
//println(i);

 }
 
 
primeseque();



  def main(args:Array[String]):Unit={

  }
}