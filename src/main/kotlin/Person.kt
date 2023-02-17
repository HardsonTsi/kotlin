// primary constructor in header
class Person(val name: String, val age: Int, val favoriteColor: String)

fun main() {

    val me = Person("TESSI", 20, "violet")
    // or
    val me2 = Person(name = "TESSI", age = 20, favoriteColor = "violet")

    println("${me.name} is ${me.age} years old and my favorite color is ${me.favoriteColor}.")

}