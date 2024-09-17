fun main(){
    /* Dado un numero N, Imprimir N veces “Hola mundo”. Realizarlo de 3 formas distintas.
    Ejemplo: Si N es 10, se deberá imprimir 10 veces “Hola mundo” */
    print("Enter the number of times to print 'Hola mundo': ")
    val n: Int = readln().toInt()

    println("---------------------------")

    repeat(n){
        println("Hola mundo from repeat")
    }

    println("---------------------------")

    for (i in 1..n){
        println("Hola mundo from for")
    }

    println("---------------------------")

    var count = 1

    while(count <= n){
        println("Hola mundo from while")
        count++
    }
}