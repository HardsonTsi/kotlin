/*
*   Range
*   StartingValue..EndingValue
*
*   example   number in 1..10
*   example   letter in 'a'..'n'
*
* */

fun main() {
    var sHU = 17000
    var pungency: String

    if (sHU in 1..699) {
        pungency = "very mild"
    } else if (sHU in 700..2999) {
        pungency = "mild"
    } else if (sHU in 3000..24999) {
        pungency = "moderate"
    } else if (sHU in 25000..69999) {
        pungency = "high"
    } else {
        pungency = "very high"
    }

    // best way
    pungency = when (sHU) {
        in 1..699 -> "very mild"
        in 700..2999 -> "mild"
        in 3000..24999 -> "moderate"
        in 25000..69999 -> "high"
        else -> "very high"
    }

    println("A pepper with [$sHU] Scoville  Heat Units has a [$pungency] pungency")

}