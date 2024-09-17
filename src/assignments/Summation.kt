fun main (){
    /* Confeccionar un programa para calcular la suma de los primeros N números naturales.
    Ejemplo: Si N es 5, el resultado seria 15 (1 + 2 + 3 + 4 + 5 = 15) */
    println("Enter a natural number to perform the summation between the smaller numbers and itself")
    var number : Int = readln().toInt()
    var total = 0;
    if(number < 0){
        println("You have not entered a natural number")
    } else if (number == 0){
        println("Unnecessary sum")
    } else {
        for (i in 1..number){
            total += i
        }
    }

    println("The total summation is $total")
}