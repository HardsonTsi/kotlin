fun main() {

    val mySchedule = listOf(
        "Eat Breakfast", "Clean Up", "Work", "Eat Lunch",
        "Clea Up", "Work", "Eat Dinner", "Clean Up"
    )

    // output the loop variable
    println("\n---mySchedule output---")
    for (task in mySchedule) {
        println(task)
    }

    val myTasks = setOf(
        "Eat Breakfast", "Clean Up", "Work", "Eat Lunch",
        "Clea Up", "Work", "Eat Dinner", "Clean Up"
    )

    // printing out the indices and the elements of the set
    println("\n---myTaks output---")
    for ((taskIndex, task) in myTasks.withIndex()) {
        println("$taskIndex: $task")
    }

    // iterating through maps
    val favoriteColors = mapOf(
        "Jesse" to "Violet",
        "Megan" to "Red",
        "Tamala" to "Blue",
        "Jordan" to "Pink"
    )

    println("\n---Key: Value Output---")
    for (favoriteEntry in favoriteColors) {
        println("${favoriteEntry.key}: ${favoriteEntry.value}")
    }

    for ((key, value) in favoriteColors) {
        println("$key: $value")
    }

    println("\n---Only Value Output---")
    for (color in favoriteColors.values) {
        println(color)
    }

}