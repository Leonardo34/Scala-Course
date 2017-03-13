package week01

object RecursionExercise {
  def main(args: Array[String]) = {
    // Test pascal triangle exercise
    for (r <- 0 to 10) {
      for (c <- 0 to r) {
        print(pascal(c, r) + " ")
      }
      println()
    }
    println("Test Balance Parentheses")
    println(balance("(if (zero? x) max (/ 1 x))".toList))
    println(balance("I told him (that it’s not (yet) done). (But he wasn’t listening)".toList))
    println(balance(":-)".toList))
    println(balance("())(".toList))
    
  }
  
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1
    else pascal(c, r - 1) + pascal(c - 1, r - 1)
  }
  
  def balance(chars: List[Char]): Boolean = {
    def balanceParentheses(chars: List[Char], OpensPar: Int): Boolean = {
      if (chars.isEmpty) OpensPar == 0
      else if (chars.head != '(' && chars.head != ')') {
        balanceParentheses(chars.tail, OpensPar)
      }
      else if (chars.head == '(') {
        balanceParentheses(chars.tail, OpensPar + 1)
      }
      else {
        if (OpensPar == 0) false
        else balanceParentheses(chars.tail, OpensPar - 1)
      }
    }
    
    balanceParentheses(chars, 0)
  }
}