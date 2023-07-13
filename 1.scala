/*1. Write a recursive function prime(n) that returns true for a prime number
and false for the other? For example prime(5) should return true and
prime(8) should return false.*/


object question1{
  def GCD(a:Int,b:Int):Int=b match{
   case 0 => a
   case x if x>a => GCD(x,a)
   case x => GCD(b,a%b)
}

  def prime(p:Int,n:Int=2):Boolean=n match{
case x  if(x==p)=>true;
case x if GCD(p,x)>1=> false;
case x=>prime(p,x+1);

  }
 def primeseque(n:Int):Unit={
 for(i<-2 to n){
println(prime(i))
 println(i);
 }
 
 }  




  def main(args:Array[String]):Unit={
primeseque(10)
  }
}