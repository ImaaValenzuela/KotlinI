fun main(){
    /* Calcular el factorial de un número ingresado por teclado. El factorial se calcula como el
    producto de todos los enteros positivos desde 1 hasta el número. En matemática el
    factorial se expresa con el símbolo !. Por ejemplo, el factorial de 5 es 120 ya que 5! = 1 x 2
    x 3 x 4 x 5 =120 */
    println("Enter a positive integer number to perform the factorial between the smaller numbers and itself")
    val number: Int = readln().toInt()

    if (number < 0) {
        println("You have not entered a positive number")
    } else {
        var total = 1

        if (number == 0) {
            total = 1
        } else {
            for (i in 1..number) {
                total *= i
            }
        }

        println("The total factorial is $total")
    }

}