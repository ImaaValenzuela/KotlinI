import kotlin.random.Random

fun main (){
    /* Una farmacia vende algunos artículos sin descuento y a otros con descuento del 20%.
    Confeccionar un programa que recibiendo el precio original y un código que indica si es o
    no con descuento, informe el precio final (0 no aplica el descuento y 1 aplica el
    descuento).*/

    var product : Double = 0.0;

    print("Por favor ingrese el precio del producto para ver si tiene descuento: ")
    val price : Double = readln().toDouble()

    product = price

    val randomNumber = Random.nextInt(0, 2)

    if(randomNumber == 0){
        println("El producto no aplica para el descuento, total a pagar: $product")
    } else {
        product = product.minus(product.times(0.2))
        println("El producto aplica el 20% de descuento, total a pagar $product")
    }
}