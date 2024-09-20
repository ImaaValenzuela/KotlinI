fun main(){
    /*
            Hacer una función que calcule un número elevado al cuadrado. Un número elevado al
            cuadrado es aquel que se multiplica a si mismo dos veces. Por ejemplo 5 = 5 * 5 = 25.
            Hacer uso de funciones compactas.
     */
    print("Ingrese un numero para elevarlo al cuadrado: ")
    val num = readln().toInt()

    println( squared(num))
}

fun squared (x : Int): Int = x.times(x)