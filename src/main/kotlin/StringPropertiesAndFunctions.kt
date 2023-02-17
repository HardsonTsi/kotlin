import java.util.*

fun main() {
    val word = "sfjpowiefhoiwehfoigwhgiohfoa"

    //word length
    println(word.length)

    //word to capitalize
    println(word.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() })

    //word ro uppercase
    println(word.uppercase())

    // ...


}