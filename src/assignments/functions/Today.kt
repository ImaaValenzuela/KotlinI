fun main(){
    /*
        Hacer una función que reciba como parámetros requeridos el día y mes de una fecha y
        como parámetro opcional el año (su valor por defecto debe ser 2022). Imprimir un
        mensaje que diga “Hoy es [día] del mes [mes] del [año]”
     */
    print("Que dia es hoy?: ")
    val day = readln().toInt()
    print("De que mes?: ")
    val month = readln()
    print("Del año 2022? Si/No: ")
    val opc = readln()

    if (opc == "Si" && opc == "SI" && opc == "si"){
        dateToday(day, month)
    } else {
        print("Ingrese el año: ")
        val year = readln().toInt()
        dateToday(day, month, year)
    }
}

fun dateToday(day: Int, month: String, year: Int = 2022){
    println("Hoy es $day del mes $month del año $year")
}