fun main(){
    val inst = listOf(1, 2, 3)
    println( inst.filter { it > 2 })

    val books = listOf("nature", "biology", "math")
    val booksInitWithB = books.filter { it[0] == 'b' }
    println(booksInitWithB) // Filtra listas

    val num = setOf(1, 2, 3)
    println(num.map { it * 3 }) //Transforma cada elemento

    val numSet = listOf(setOf(1, 2, 3), setOf(4, 5), setOf(1, 2))
    println(numSet.flatten()) // Retorna una sola lista
}