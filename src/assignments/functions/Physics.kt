fun main() {
    /*
            En el mundo de la física, tenemos las siguientes formulas:
                o velocidad = distancia / tiempo
                o distancia = velocidad * tiempo
                o tiempo = distancia / velocidad
            Haciendo uso de funciones lambdas, realizar tres funciones para calcular:
                a. La velocidad dada una distancia y un tiempo.
                b. La distancia dada una velocidad y un tiempo.
                c. El tiempo dada una distancia y una velocidad.
     */

    val velocity: (Double, Double) -> Double = { distanceU, timeU -> distanceU.div(timeU) }
    val distance: (Double, Double) -> Double = { velocityU, timeU -> velocityU.times(timeU)}
    val time: (Double, Double) -> Double = { distanceU, velocityU -> distanceU.div(velocityU) }

    while (true) {
        println("Welcome to the Physics Calculator!")
        println("Please choose an option:")
        println("1. Calculate Velocity")
        println("2. Calculate Distance")
        println("3. Calculate Time")
        println("4. Exit")

        val choice = readlnOrNull()

        when (choice) {
            "1" -> {
                println("Enter distance (in meters):")
                val distanceInput = readlnOrNull()?.toDoubleOrNull()
                println("Enter time (in seconds):")
                val timeInput = readlnOrNull()?.toDoubleOrNull()

                if (distanceInput != null && timeInput != null && timeInput != 0.0) {
                    val result = velocity(distanceInput, timeInput)
                    println("Velocity = $result m/s")
                } else {
                    println("Invalid input. Please enter valid numbers.")
                }
            }
            "2" -> {
                println("Enter velocity (in m/s):")
                val velocityInput = readlnOrNull()?.toDoubleOrNull()
                println("Enter time (in seconds):")
                val timeInput = readlnOrNull()?.toDoubleOrNull()

                if (velocityInput != null && timeInput != null) {
                    val result = distance(velocityInput, timeInput)
                    println("Distance = $result meters")
                } else {
                    println("Invalid input. Please enter valid numbers.")
                }
            }
            "3" -> {
                println("Enter distance (in meters):")
                val distanceInput = readlnOrNull()?.toDoubleOrNull()
                println("Enter velocity (in m/s):")
                val velocityInput = readlnOrNull()?.toDoubleOrNull()

                if (distanceInput != null && velocityInput != null && velocityInput != 0.0) {
                    val result = time(distanceInput, velocityInput)
                    println("Time = $result seconds")
                } else {
                    println("Invalid input. Please enter valid numbers.")
                }
            }
            "4" -> {
                println("Exiting the program. Goodbye!")
                return
            }
            else -> {
                println("Invalid option. Please choose a valid option.")
            }
        }
        println()
    }
}