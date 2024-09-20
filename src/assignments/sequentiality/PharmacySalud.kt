fun main(){
    /* La farmacia SALUD efectúa descuentos a sus afiliados según el importe de la compra con la
    siguiente escala:
    a. menor de $55 el descuento es del 4.5%.
    b. entre $55 y $100 el descuento es del 8%.
    c. más de $100 el descuento es del 10.5%.
    Confeccionar un programa que reciba un importe e informe: el descuento y el precio neto
    a cobrar, con mensajes aclaratorios.*/

    var randomNumber = Random.nextInt(20, 200).toDouble()

    when {
        randomNumber in 20.0..54.0 -> {
            val aux = randomNumber
            randomNumber -= aux * 0.045
            println("El total es de $aux, pero con el descuento del 4.5% aplicado quedaría $randomNumber")
        }
        randomNumber in 55.0..100.0 -> {
            val aux = randomNumber
            randomNumber -= aux * 0.08
            println("El total es de $aux, pero con el descuento del 8% aplicado quedaría $randomNumber")
        }
        else -> {
            val aux = randomNumber
            randomNumber -= aux * 0.105
            println("El total es de $aux, pero con el descuento del 10.5% aplicado quedaría $randomNumber")
        }
    }

}