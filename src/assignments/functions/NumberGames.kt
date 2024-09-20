import kotlin.random.Random

fun main() {
    println("Welcome to the Number Guessing Game!")
    println("Try to guess the number between 1 and 100.")

    val randomNumber = Random.nextInt(1, 101)
    var guess: Int? = null
    
    while (guess != randomNumber) {
        println("Enter your guess:")
        guess = readLine()?.toIntOrNull()

        if (guess == null || guess !in 1..100) {
            println("Please enter a valid number between 1 and 100.")
        } else if (guess < randomNumber) {
            println("The number is higher!")
        } else if (guess > randomNumber) {
            println("The number is lower!")
        } else {
            println("Congratulations! You've guessed the correct number: $randomNumber")
        }
    }
}
