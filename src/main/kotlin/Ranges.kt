/*
                               Controlling and Iteration
  - The functions until, downTo and step give use more control of a range and therefore
    more control of our loops

  - The downTo function simply creates a reverse order group of values

  - The until function creates an ascending range, just like the (..) operator,
    but excludes the upper boundary

  - The step function specifies the amount these functions count by

*/


fun main() {

    // downTo
    for (i in 10 downTo 1) {
        println("i = $i")
    }
    println("-----")

    // until
    for (j in 1 until 10) {
        println("j = $j")
    }
    println("-----")

    // step
    for (k in 1..10 step 2) {
        println("i = $k")
    }
    println("-----")

}