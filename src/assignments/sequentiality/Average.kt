fun main () {
    //  Dadas las notas de dos evaluaciones de un alumno, determinar la nota promedio.
    print("Ingrese la nota de su primer parcial: ")
    val note1 : Double = readln().toDouble()

    print("Ingrese la nota de su segundo parcial: ")
    val note2 : Double = readln().toDouble()

    val average = (note1.plus(note2)).div(2)
    println("El promedio del alumno es de $average")

}