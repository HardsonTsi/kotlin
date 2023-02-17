/*
   - We can rely on a while loop which repeats code as long as a specified condition is true
*/

fun main() {

    var counter = 0
    var index = 0
    var schoolGrades = listOf("Kindergarten", "1st", "2nd", "3rd", "4th", "5th", "6th", "7th")

    // repeats as long the variable counter is less than 5
    println("---Counter output---")
    while (counter < 5){
        println(counter)
        counter++
    }

    // has a condition, schoolGrades[index] != "6th"
    println("\n---Elementary School Grades---")
    while (schoolGrades[index] != "6th"){
        println(schoolGrades[index])
        index++
    }


}