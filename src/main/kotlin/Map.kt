/*
   - To declare a mutable map, use the term, mutableMapOf in a map declaration
        example: var/val mapName = mutableMapOf(key1 to value1, key2 to value2, key3 to value3)
*/

fun main() {

    var tvShows = mutableMapOf(
        "The Big Bang Theory" to 278, "Modern Family" to 250,
        "Bewitched" to 254, "That \'70s Show" to 200
    )

    //update the value of The Big Bang Theory show
    tvShows["The Big Bang Theory"] = 279

    println(tvShows)

}