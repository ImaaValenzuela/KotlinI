fun main(){
    /*
            Hacer una función que calcule el área de un rectángulo. La función debe recibir los
            parámetros requeridos base y altura. El área de un rectángulo es el resultado de hacer el
            producto entre la base y la altura. Hacer uso de funciones compactas.
     */
    print("Ingrese la base del rectangulo: ")
    val base = readln().toDouble()
    print("Ingrese la altura del rectangulo: ")
    val height = readln().toDouble()

    println("El area del rectangulo es " + area(base, height))

}

fun area (base: Double, height: Double) : Double = base.times(height)