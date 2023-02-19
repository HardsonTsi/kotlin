fun main() {
    var season = "Fall"

    when (season) {
        "Winter" -> println("Grow late.")
        "Spring" -> println("Grow lettuce.")
        "Summer" -> println("Grow corn.")
        "Fall" -> println("Grow pumpinks.")
        else -> println("$season is not a valid season.")
    }

}