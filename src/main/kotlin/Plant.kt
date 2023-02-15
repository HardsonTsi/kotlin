fun main() {
    val plant = "orchid"
    val potSize = 6
    val dayNumber = 10

    // concatenation
    println("An " + plant + " in a " + potSize + " inch pot must be watered every " + dayNumber + " days.")

    //best way
    println("An $plant in a $potSize inch pot must be watered every $dayNumber days.")

}