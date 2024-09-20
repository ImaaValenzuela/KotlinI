fun main(){
    // FOR
    for(i in 1..5){
        println(i)
    }

    // for downTo
    for(i in 5 downTo 1){
        println(i)
    }

    // for step
    for (i in 3..6 step 2){
        println(i)
    }

    // Recorrer arrays
    val pets = arrayOf("dog", "cat", "canary")

    for (el in pets){
        println(el + " ")
    }

    // array con indice
    for((index, el) in pets.withIndex()){
        println("Item at $index is $el\n")
    }

    // WHILE
    var bicycles = 0
    while(bicycles < 50){
        bicycles++
    }

    println("$bicycles bicycles in the bicycle rack\n")

    // DO WHILE
    do {
        bicycles--
    } while (bicycles > 50)

    println("$bicycles bicycles in the bicycle rack\n")

    // REPEAT
    repeat(2){
        print("Hello")
    }
}