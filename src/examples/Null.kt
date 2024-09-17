fun main(){
    // SAFE CALL OPERATOR
    var numberOfBooks: Int? = null

    numberOfBooks = numberOfBooks?.dec()

    // VARIABLE NO PUEDE SER NULA
    var len = 6
    len = len!!.length

}