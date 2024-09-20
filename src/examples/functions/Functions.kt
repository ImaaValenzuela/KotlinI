fun main(){
    println(printHello())
    println(doubleNumber(4))
    printHelloU("Ima")
}

fun printHello(): String {
    return "Hello World"
}

fun doubleNumber(number : Int) : Int{
    return number.times(2)
}

fun printHelloU(name : String?) /*: Unit */ { // Funcion que no devuelve ningun valor con retorno Unit (opcional)
    println("Hi there!")
}