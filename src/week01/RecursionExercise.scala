package week01

object RecursionExercise {
  def main(args: Array[String]) = {
    for (r <- 0 to 10) {
      for (c <- 0 to r) {
        print(pascal(c, r) + " ")
      }
      println()
    }  
  }
  
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1
    else pascal(c, r - 1) + pascal(c - 1, r - 1)
  }
}