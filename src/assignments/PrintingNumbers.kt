fun main(){
    /*Leer una serie de números hasta que el usuario ingrese 0 (cero) y determinar cuál es el
    mayor. (Nota: Todos los números deben ser mayor a 0 (cero), en caso de ser menor,
    ignorarlo).*/
    var maxNumber = Int.MIN_VALUE
    var input: Int

    do {
        print("Enter a number greater than 0; to end the program, enter 0: ")
        input = readln().toInt()

        if (input > 0) {
            if (input > maxNumber) {
                maxNumber = input
            }
        } else if (input < 0) {
            println("Ignored number $input as it is less than 0.")
        }

    } while (input != 0)

    if (maxNumber != Int.MIN_VALUE) {
        println("The largest number entered is $maxNumber")
    } else {
        println("No valid numbers were entered.")
    }
}