fun main(){
    // Dadas las horas trabajadas y el valor por hora de un empleado, determinar su sueldo.
    print("Ingrese las horas trabajadas: ")
    val hours = readln().toInt()

    var hourlyPay : Int = 13

    var salary = hourlyPay.times(hours)
    println("El sueldo a pagar es de $salary")
}