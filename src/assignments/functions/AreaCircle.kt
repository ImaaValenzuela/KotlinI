fun main (){
    /*
            Haciendo uso de funciones lambdas, realizar una función que dado un radio, calcule el
            área de un círculo. Sabemos que al área de un circulo es: A = PI * r2
            siendo ‘r’ el radio
     */
    println("Enter the radius of the circle:")
    val radius = readlnOrNull()?.toDoubleOrNull()

    if (radius != null && radius > 0) {
        val result = area(radius)
        println("The area of the circle with radius $radius is $result")
    } else {
        println("Invalid radius. Please enter a positive number.")
    }
}

val area: (Double) -> Double = { radio -> Math.PI * radio * radio }