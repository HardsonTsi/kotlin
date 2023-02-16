fun main() {

    // immmutable list
    val waterSports = listOf("Wind Surfing", "Sailing", "Swimming", "Jet Skiing", "Water Skiing")

    println(waterSports)

    //to access an element waterSports[index]
    println(waterSports[0])
    println(waterSports[1])
    println(waterSports[2])
    println(waterSports[3])
    println(waterSports[4])

    //mutable list
    var openBroadwayShows = mutableListOf("The Lion King", "Chicago", "The Cher Show", "Les Miserables")
    openBroadwayShows[2] = "Wicked"
    println(openBroadwayShows)

}