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

    // if else-if
    var rewardsPoints = 13
    var memberType: String

    if (rewardsPoints >= 40) {
        memberType = "Platium"
    } else if (rewardsPoints >= 25) {
        memberType = "Gold"
    } else if (rewardsPoints >= 10) {
        memberType = "Silver"
    } else {
        memberType = "Bronze"
    }
    println("You're a $memberType type member.")

}