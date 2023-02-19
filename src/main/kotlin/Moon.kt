/*
 - To initialize an empty mutable set, we'd use following syntax
    var/val setName = mutableSetOf<Type>()

 - To add a single element to set, we'd use add() function, however if we were interested
    in adding many elements to a set at once, the addAll() function would be more appropriate

 - We can alse remove all elements from a collection using the clear() function

 - To retrieve the first element of any set, we can use first() function

 - To retrieve the last element of any set, we can use last() function

 - If we'd like to sum up all the elements in a set, we can use the sum() function

* */


fun main() {

    var uniqueParticipants = mutableSetOf<String>()
    var participants = listOf("elePHPant", "Gopher", "Lenny", "Moby Dock", "Codey", "Gopher")

    // add all the list names to the uniqueParticipants set at once
    uniqueParticipants.addAll(participants)

    // determinate how many participants are in the set
    println("The talent show has ${uniqueParticipants.size} unique participants.")

    //clear all the participants from the set
    uniqueParticipants.clear()
    println(uniqueParticipants)

    // gather the grades
    var testGrades = mutableSetOf(65, 50, 72, 80, 53, 84)

    //size property of testGrades
    var numStudents = testGrades.size

    //sum of testGrades
    var sum = testGrades.sum()

    // average = sum / number of elements
    var average = sum / numStudents

    if (average < 65) {
        println("Failed")
    } else {
        println("Passed")
    }


}