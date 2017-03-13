
object HelloWorld {
  def variable = "Teste"

  def main(args: Array[String]) {
    println("Hello")
    val vetor = Array(1, 2, 3)
    println(vetor(0))
    println(mult(2 + 6))
    println(variable)
    println(sum(2, 2))
    testeAndOr
  }

  def mult(x: Double) = x * x

  def sum(x: Integer, y: Integer): Integer = x + y

  def and(x: Boolean, y: Boolean) = {
    if (x) y
    else false
  }

  def or(x: Boolean, y: Boolean) = {
    if (x) true
    else y
  }

  def testeAndOr() = {
    println(and(true, false))
    println(and(true, true))
    println(and(false, false))
    println(and(false, true))
    println(or(true, false))
    println(or(true, true))
    println(or(false, false))
    println(or(false, true))
  }

  //Call by name example
  def square(x: => Int) = x * x
}
         