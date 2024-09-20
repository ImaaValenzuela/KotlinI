fun main(){
    /*
            Realizar una función que, dado un mes y un año, calcule la cantidad de días de dicho mes.
            El año se utilizará en el caso de que el mes sea febrero ya que los años bisiestos tienen 29
            días en lugar de 28. Un año es bisiesto cuando: (el año es divisible por 4 y NO por 100) o
            (el año es divisible por 400).
    */
    println("Enter the month (1-12):")
    val month = readlnOrNull()?.toIntOrNull()

    println("Enter the year:")
    val year = readlnOrNull()?.toIntOrNull()

    if (month != null && year != null && month in 1..12) {
        val days = totalDaysOfMonth(month, year)
        println("The total number of days in month $month of year $year is $days days.")
    } else {
        println("Invalid input. Please enter a valid month (1-12) and a year.")
    }
}


fun totalDaysOfMonth(month: Int, year: Int): Int {
    return when (month) {
        1, 3, 5, 7, 8, 10, 12 -> 31
        4, 6, 9, 11 -> 30
        2 -> if (isLeapYear(year)) 29 else 28
        else -> 0
    }
}

fun isLeapYear(year: Int): Boolean {
    return (year % 4 == 0 && year %  100 != 0)  || (year % 400 == 0)
}