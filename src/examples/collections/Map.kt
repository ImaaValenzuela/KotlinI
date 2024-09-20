fun main (args: Array<String>){
    val myMap = mutableMapOf<Int, String>(1 to "Ima", 2 to "Jo", 3 to "Ani") // Mapa Mutable

    for(key in myMap.keys){
        println(myMap[key])
    }

    myMap[4] = "Zo" // Agrego elemento


    for(key in myMap.keys){
        println(myMap[key])
    }

    myMap.remove(3) // Elimino elemento


    for(key in myMap.keys){
        println(myMap[key])
    }
}