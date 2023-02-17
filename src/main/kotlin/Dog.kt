class Dog(val name: String, val breed: String, val competitionsParticipated: List<String>) {

    init {
        for (competition in competitionsParticipated){
            println("$name participated in $competition")
        }
    }


    //members functions
    fun speak(){
        println("$name says: Woof !")
    }

}

fun main() {


    val alex = Dog("Alex", "Poodle", listOf("a", "b", "c", "d"))
    alex.speak()

}