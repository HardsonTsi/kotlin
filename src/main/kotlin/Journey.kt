/*
  - A map consists of group of key-value pairs where each key corresponds to a single
    value

  - To declare an immutable map, we need to use the mapOf keyword followed by a pair of
   parentheses:
    var/val mapName = mapOf(key1 to val1, key2 to val2, key3 to val3)
        * Within the parentheses must exist unique keys along with their
          corresponding values.
        * The 'to' keyword is used to link each key to its value.
        * Each entry must be separed by a comma.

  - Note: The keys within a map must be unique, however, the values can duplicate.
*/

fun main() {

    var codeysMap = mapOf("valley" to "scorpions", "creek" to "snakes", "forest" to "bears")

    println(codeysMap)

}