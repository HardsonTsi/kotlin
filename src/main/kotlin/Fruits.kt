/*
*
* Furthermore, size can be used along with an element's index to retrieve the last element of collection
* example: var identities = listOf("TESSI", "Hardson", "Modeste", "Enangnon", "Sègla")
* var lastElement = identities[identities.size - 1]
*
* */

fun main() {

    // variable fruitTrees which stores a mutable list of fruit trees
    var fruitTrees = mutableListOf("Apple", "Plum", "Pear", "Cherry")

    println("I am growin ${fruitTrees.size} different types of fruit in my garden.")

}