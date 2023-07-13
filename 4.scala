//write a recursive function to determine even and odd numbers? 


  object Q4 {
  def isEven(n: Int): Boolean = {
    if (n == 0)
      true
    else
      isOdd(n - 1)
  }

  def isOdd(n: Int): Boolean = {
    if (n == 0)
      false
    else
      isEven(n - 1)
  }

  def main(args: Array[String]): Unit = {
    println(isEven(6)) // Output: true
    println(isOdd(6)) // Output: false
  }
}
