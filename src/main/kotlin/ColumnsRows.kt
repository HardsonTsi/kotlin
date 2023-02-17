/*
                                    Jump Expressions
       The jump expressions, break and continue, are used to change the standard
       loop behavior by exiting a loop early or skipping a single repetition
*/

fun main() {

    for (i in 1..6) {
        for (j in 'A'..'F') {
            print("$j$i ")
        }
        println()
    }

    val rooms = listOf("Kitchen", "Living Room", "Basement", "Bathroom")
    //search Living Room
    println("---Room Search---")
    for (room in rooms) {
        print("$room: ")
        if (room == "Living Room") {
            println("Found it !")
            break
        }
        println("Found nothing.")
    }

    // skip a loop iteration
    println("---Divide by Zero---")
    for (number in 12 downTo -12 step 4) {
        if (number == 0) {
            continue
        }
        println("120/$number = ${120 / number}")
    }

}