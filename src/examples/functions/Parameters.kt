fun main(){
    drive()
    drive("slow")
    drive("turtle like")
    tempToday("Monday" , 18)
}

fun drive(speed: String = "fast"){ // Parametros por defecto
    println("Driving $speed")
}

fun tempToday(day: String, temp: Int){ // Parametros requeridos
    println("Today is $day an its $temp degrees")
}

fun reformat(str : String, divideByCamelHumps : Boolean = false, wordSeparator : Char = '_'){ // Mix de parametros

}