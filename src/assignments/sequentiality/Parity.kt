fun main(){
    // Dado un numero determinar e informar si es par o no.
    print("Ingrese un numero entero mayor a 0 : ")

    val number : Int = readln().toInt()

    if (number <= 0){
        println("Numero ingresado invalido ")
    } else if(number % 2 == 0){
        println("Numero Par")
    } else println("Numero impar")

}