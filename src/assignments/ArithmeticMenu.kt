fun main (){
    var option : Int

    do {
        println("Seleccione una opción:")
        println("1. Sumar")
        println("2. Restar")
        println("3. Multiplicar")
        println("4. Dividir")
        println("5. Salir")
        print("Ingrese su opcion: ")
        option = readln().toInt()

        if (option == 5){
            println("Saliendo del programa...")
            break
        }

        if (option in 1..4){
            print("Ingrese el primer numero: ")
            val num1 = readln().toInt()
            print("Ingrese el segundo numero: ")
            val num2 = readln().toInt()

            when(option){
                1 -> println("El resultado de la suma es de ${num1.plus(num2)}")
                2 -> println("El resultado de la resta es de ${num1.minus(num2)}")
                3 -> println("El resultado de la multiplicacion es de ${num1.times(num2)}")
                4 -> {
                    if (num2 != 0){
                        println("El resultado de la division es de ${num1.div(num2)}")
                    } else println("Division por 0 no permitida")
                }
            }
        } else println("Opcion invalida. Por favor ingrese un numero entre el 1 y 5")
    } while (option != 5)
}