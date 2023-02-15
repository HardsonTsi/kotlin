fun main() {
    var a = true
    var b = false
    var c = true
    var d = false

    if (a || b) {
        println("Hooorah !")
    }

    if (!b && c) {
        println("Wooooooo !")
    }

    if (a || d) {
        println("Yay !")
    }

    if (!(!d && b)) {
        println("Wow !")
    }


}