/*
   A return statement returns a value from a function and passes it back to where the function
   was invocked. This value can then be used throughout out program
*/



fun ozToTsp(oz: Double): Double {
    var tsp = oz * 6
    return tsp
}

fun main() {
    // invoke ozToTsp() function
    var tspNeedded = ozToTsp(.75)
    println("You will need $tspNeedded tsp of vanilla extract for this recipe.")
}