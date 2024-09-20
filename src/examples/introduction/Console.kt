fun main(){
    print("Hello world")
    println("My first script") // Salto de linea al final

    // Ingresar dato por consola
    val name = readln()

    if (name.isEmpty()){
        println("Invalid name")
    } else {
        println("Hello $name")
    }
}