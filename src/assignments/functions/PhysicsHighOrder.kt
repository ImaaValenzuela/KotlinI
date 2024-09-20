fun main() {
    // Mejorar el ejercicio anterior para poder resolver los cálculos en una única función de orden alto.

    val calculate: (String, Double, Double) -> Double? = { operation, a, b ->
        when (operation) {
            "velocity" -> a.div(b)
            "distance" -> a.times(b)
            "time" -> a.div(b)
            else -> null
        }
    }

    while (true) {
        println("Welcome to the Physics Calculator!")
        println("Please choose an option:")
        println("1. Calculate Velocity")
        println("2. Calculate Distance")
        println("3. Calculate Time")
        println("4. Exit")

        val choice = readLine()

        when (choice) {
            "1" -> {
                println("Enter distance (in meters):")
                val distanceInput = readLine()?.toDoubleOrNull()
                println("Enter time (in seconds):")
                val timeInput = readLine()?.toDoubleOrNull()

                if (distanceInput != null && timeInput != null && timeInput != 0.0) {
                    val result = calculate("velocity", distanceInput, timeInput)
                    println("Velocity = ${result} m/s")
                } else {
                    println("Invalid input. Please enter valid numbers.")
                }
            }
            "2" -> {
                println("Enter velocity (in m/s):")
                val velocityInput = readLine()?.toDoubleOrNull()
                println("Enter time (in seconds):")
                val timeInput = readLine()?.toDoubleOrNull()

                if (velocityInput != null && timeInput != null) {
                    val result = calculate("distance", velocityInput, timeInput)
                    println("Distance = ${result} meters")
                } else {
                    println("Invalid input. Please enter valid numbers.")
                }
            }
            "3" -> {
                println("Enter distance (in meters):")
                val distanceInput = readLine()?.toDoubleOrNull()
                println("Enter velocity (in m/s):")
                val velocityInput = readLine()?.toDoubleOrNull()

                if (distanceInput != null && velocityInput != null && velocityInput != 0.0) {
                    val result = calculate("time", distanceInput, velocityInput)
                    println("Time = ${result} seconds")
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