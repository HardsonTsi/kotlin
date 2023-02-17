/*
                               Adding and Removing Entries
   Since a mutable map supports read and write operations, we are able to manipulate
   its contents by adding or removing key-value pairs.

   - We can utilize Kotlin's built-in put() function to add a new entry to the mutable map

   - To remove from the map, we can use the remove() function
*/

fun main() {

    // famous painting in MoMa and their painters
    var momaPainters = mutableMapOf(
        "Les Demoiselles d\'avignon" to "Pablo Picasso",
        "The Starry Night" to "Vincent Van Gogh",
        "Mona Lisa" to "Leonardo Da Vinci",
        "The Persistance of Memory" to "Salvador Dali"
    )

    // check if a painting by Claude Monet does not exist in the map
    if (!momaPainters.containsValue("Claude Monet")) {
        momaPainters.put("Water Lillies", "Claude Monet")
    }

    // remove the key-value pair associate with Mona Lisa
    momaPainters.remove("Mona Lisa")

    println(momaPainters)


}