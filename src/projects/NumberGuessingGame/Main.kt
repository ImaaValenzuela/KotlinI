import kotlin.random.Random

fun main() {
    println("Welcome to the Number Guessing Game!")
    println("Try to guess the number between 1 and 100.")

    val randomNumber = generateRandomNumber()

    startGame(randomNumber)
}


fun generateRandomNumber(): Int {
    return Random.nextInt(1, 101)
}


fun startGame(randomNumber: Int) {
    var guess: Int? = null

    while (guess != randomNumber) {
        guess = getUserGuess()

        if (guess != null) {
            giveHint(guess, randomNumber)
        }
    }

    println("Congratulations! You've guessed the correct number: $randomNumber")
}


fun getUserGuess(): Int? {
    println("Enter your guess:")
    val input = readlnOrNull()?.toIntOrNull()

    return if (input == null || input !in 1..100) {
        println("Please enter a valid number between 1 and 100.")
        null
    } else {
        input
    }
}


fun giveHint(guess: Int, randomNumber: Int) {
    if (guess < randomNumber) {
        println("The number is higher!")
    } else if (guess > randomNumber) {
        println("The number is lower!")
    }
}
