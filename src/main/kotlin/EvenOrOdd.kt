fun main() {

    // equality
    var userPassword = "secret884"
    var attemptedPassword = "secret884"

    if (userPassword == attemptedPassword) {
        println("The password you enterred is correct !")
    }

    // inequality
    var sliceOfPizza = 14
    var numPeople = 9

    if (sliceOfPizza % numPeople != 0) {
        println("The pizza cannot be split evenly.")
    }

}