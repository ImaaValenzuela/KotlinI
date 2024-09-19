fun main(){
    // Dado tres números determinar e informar cual es el mayor.
    println("Ingrese tres numeros")

    val num1 : Int = readln().toInt()
    val num2: Int = readln().toInt()
    val num3: Int = readln().toInt()

    if (num1 >= num2 && num1 >= num3) {
        println("El número mayor es: $num1")
    } else if (num2 >= num1 && num2 >= num3) {
        println("El número mayor es: $num2")
    } else {
        println("El número mayor es: $num3")
    }
}