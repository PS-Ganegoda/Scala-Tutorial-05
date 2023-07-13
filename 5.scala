/*Write a recursive function to get the addition of all even numbers less 
than given n*/

object Q4 {
  def getSumOfEvenNumbers(n: Int): Int = {
    if (n <= 0) {
      0 // Base case: If n is less than or equal to 0, return 0
    } else {
      val current = if (n % 2 == 0) n else 0 // Check if n is even
      current + getSumOfEvenNumbers(n - 1) // Recursively sum even numbers less than n-1
    }
  }

  def main(args: Array[String]): Unit = {
    println("Enter the number:")
    val n = scala.io.StdIn.readInt()
    val result = getSumOfEvenNumbers(n)
    println(s"The sum of even numbers less than $n is: $result")
  }
}
