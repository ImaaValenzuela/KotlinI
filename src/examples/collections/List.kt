private val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3) // Lista Mutable
private val sudoers : List<Int> = systemUsers
private val instruments = listOf("trumpet", "piano", "violin") // Lista Inmutable
private val instrumentsMutable = mutableListOf("trumpet", "piano", "violin") // Lista Mutable con listOf()

fun main (){
    addSystemUser(4)
    println(getSysSudoers())
    println(instruments)
    println(instrumentsMutable)
    instrumentsMutable.remove("violin")
    println(instrumentsMutable)
}

private fun addSystemUser(newUser: Int){
    systemUsers.add(newUser) // Agrego elemento a la lista
}

private fun getSysSudoers() : List<Int>{
    return sudoers
}