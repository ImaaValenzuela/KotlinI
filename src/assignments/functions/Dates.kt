fun main() {
    /*
        Realizar una función que reciba 3 números enteros correspondientes al día, mes y año de
        una fecha y valide si la misma es correcta. En caso de que la fecha es correcta debe
        imprimir “Es correcta”, y si es incorrecta debe imprimir “No es correcta”. Para la validación
        usar la función del punto 7 que retorna la cantidad de días de un mes

    */
    println("Enter the day:")
    val day = readlnOrNull()?.toIntOrNull()

    println("Enter the month (1-12):")
    val month = readlnOrNull()?.toIntOrNull()

    println("Enter the year:")
    val year = readlnOrNull()?.toIntOrNull()

    if (day != null && month != null && year != null && month in 1..12) {
        if (isDateValid(day, month, year)) {
            println("Es correcta")
        } else {
            println("No es correcta")
        }
    } else {
        println("Invalid input. Please enter valid values for day, month (1-12), and year.")
    }
}

fun isDateValid(day: Int, month: Int, year: Int): Boolean {
    val maxDays = totalDaysOfMonth(month, year)
    return day in 1..maxDays
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
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
}
