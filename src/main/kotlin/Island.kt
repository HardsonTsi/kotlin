/*
 - elementAt() to access and retrieve elements
 - We can use the elementAtOrNull function, a safer variation of elemetAt() to return null as opposed to an error when
   an element does not exist in the set
*/

fun main() {

    var islandsOfHawaii = setOf("Maui", "Lanai", "Oahu", "Kauai")

    // retrieve the island of Oahu from the set using elementAt()
    println(islandsOfHawaii.elementAt(2))

    // use the elementAtOrNull() function to retrieve an element at 6th position
    println(islandsOfHawaii.elementAtOrNull(6))

}