package EX3

object main {
  def pgcd(a: Int, b: Int): Int = {
    if (b == 0) {
      return a
    }
    else {
      pgcd(b, a % b)
    }
  }
  def main(args: Array[String]): Unit = {
    print("donner a :")
    val a = scala.io.StdIn.readInt
    print("donner b :")
    val b = scala.io.StdIn.readInt
    if (a == 0) {
      println(b)
    }
    if (b == 0) {
      println(a)
    }
    println(pgcd(a, b))
  }
}
