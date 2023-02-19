fun main() {

    var uniqueTransport = mapOf(
        "India" to "Tuktuk", "Egypt" to "Felucca", "Peru" to "Totora Boat",
        "Hong Kong" to "Junk Boat"
    )

    // retrieve a transportation mode that exists in Peru
    println("A unique mode of transportation that exists in Peru is ${uniqueTransport["Peru"]}.")

    // output all keys from the uniqueTransport
    println(uniqueTransport.keys)

    // output all values from the uniqueTransport
    println(uniqueTransport.values)


}