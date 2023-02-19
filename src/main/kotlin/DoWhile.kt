/*
  - A do..while loop is just like a while loop except the looping condition is checked at the end
    of the loop body
*/

fun main() {

    var index = 0
    val celsiusTemps = listOf(0.0, 87.0, 16.0, 33.0, 100.0, 65.0)
    val fahrRatio = 1.8
    var fahr: Double

    println("---Celsius to Fahrenheit---")
    do {
        fahr = celsiusTemps[index] * fahrRatio + 32.0
        println("${celsiusTemps[index]}C = ${fahr}F")
        index++
    }while (index < celsiusTemps.size)

}