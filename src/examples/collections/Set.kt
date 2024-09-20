val openIssues: MutableSet<String> = mutableSetOf("uniqueDes1", "uniqueDes2", "uniqueDes3") // Set mutable

fun addIssue(uniqueDes : String) : Boolean{
    return openIssues.add(uniqueDes)
}

fun getStatusLog(isAdded: Boolean) : String{
    return if (isAdded) "Registered Correctly" else "Marked as duplicate and rejected"
}

fun main(){
    val aNewIssue : String = "uniqueDes4"
    val aIssueAlreadyIn : String = "uniqueDes1"

    println("Issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}")
    println("Issue $aIssueAlreadyIn ${getStatusLog(addIssue(aIssueAlreadyIn))}")
}