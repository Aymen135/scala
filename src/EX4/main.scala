package EX4

object main {
    def isPrime(n: Int): Boolean = {
    if (n <= 1) return false
    for (i <- 2 to Math.sqrt(n).toInt) {
      if (n % i == 0) return false
    }
    true
  }

    def findPrimes(n: Int): List[Int] = {
    (2 to n).filter(isPrime).toList
  }
  def main(args: Array[String]): Unit = {
    val x = findPrimes(20)
    print(x)
  }
}
