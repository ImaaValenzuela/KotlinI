fun main(){
    val pets = arrayOf("dog", "cat", 4) // Array, puede contener diferentes tipos de datos
    println(pets.joinToString(", "))

    val num = intArrayOf(1, 8, 17) // Array de un solo tipo
    val num2 = intArrayOf(12,1,14)
    val combined = num + num2 // Combinacion de Arrays
    println(Arrays.toString(combined))

}