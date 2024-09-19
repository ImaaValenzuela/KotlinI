fun main (){
    /* Un fabricante de repuestos para tractores ha descubierto que ciertos artículos
    identificados por los números de catálogo 12121 al 18081; 30012 al 45565 y 67000 al
    68000 son defectuosos. Se desea confeccionar un programa al que informándole el
    número de catálogo indique si el artículo es o no defectuoso. Los artículos del catálogo van
    desde el 1200 al 90000. Si se ingresa otro número informar “FUERA DE CATALOGO”.*/
    println("Ingrese el numero de catalogo del articulo (1200 a 90000)")

    val codProd : Int = readln().toInt()

    if (codProd in 1200..90000){
        when(codProd){
            in 12121..18081 -> print("Defectuoso")
            in 30012..45565  -> print("Defectuoso")
            in 67000..68000  -> print("Defectuoso")
            else  -> print("No defectuoso")
        }
    } else print("FUERA DE CATALOGO")
}