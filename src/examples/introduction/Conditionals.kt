fun main(){
    // if else
    val numberOfCups = 30
    val numberOfPlates = 50
    if(numberOfCups > numberOfPlates) {
        println("Demasiadas copas")
    } else println("Insuficientes copas")

    // if else if
    val guests = 30

    if(guests == 0){
        println("No guests")
    } else if (guests < 20 ){
        println("Small group of people")
    } else {
        println("Large group of people")
    }

    // Rango in
    val numberOfStudents = 50

    if(numberOfStudents in 1..100){
        println(numberOfStudents)
    }

    // Secuencia when
    val results = 100

    when(results){
        0 -> println("No results")
        in 1..39 -> println("Got results")
        else -> println("That's a lot of results")
    }
}