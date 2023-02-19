/*
                          Single Expression Functions
   If one of our functions contains only a single expression, we can write the
   function out wich shortand syntax. This syntax allow us to create a function
   using only a single line of code
*/


/*fun pyramidVolume(l: Double, w: Double, h: Double): Double{
    return (l * w * h) / 3
}*/

// best way
fun pyramidVolume(l: Int, w: Int, h: Int): Int = (l * w * h) / 3

fun main() {

    var length = 5
    var with = 8
    var height = 14

    // invoke pyramidVolume() function
    var volume = pyramidVolume(length, with, height)
    println("The volume of this pyramid is $volume.")
}