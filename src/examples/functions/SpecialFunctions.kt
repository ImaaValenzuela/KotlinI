fun main(){
    println(double(10).isOdd())

    val dirtLevel = 20
    val waterFilter = {level: Int -> level/2} // Lambda Functions -> Retornan unit
    val waterFilter2 : (Int) -> Int = {level -> level/2}
    println(waterFilter(dirtLevel))

    val enc1: (String) -> String = {input -> input.toUpperCase()}
    println(encodeMsg("abc", enc1))
}

fun double (x : Int) : Int = x.plus(2)  // Compact Functions

fun Int.isOdd() : Boolean {return this % 2 == 1} // Extension Functions -> Agrega funcionalidades a clases

fun encodeMsg(msg : String , encode: (String) -> String) : String{ // High Order Function -> Toman funciones como parámetros o devuelven una función.
    return encode(msg)
}

