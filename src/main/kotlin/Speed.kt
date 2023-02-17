/*
    - Arguments are pieces of data we feed to our functions in order to produce
      dynamic results. We can include as many arguments as the function needs.

    - To pass arguments into a functions, we need to add parameters to our
      function header. Parameters are the names given to data being passed
      into a function. For example:
      fun calculateForce(mass: Int, acceleration: Int){
        Function Body
      }

*/

fun getSpeed(distance: Int, time: Int){
    var speed = distance / time
    println("$speed meters per second")
}

fun main() {
    // invoke the getSpeed() function
    getSpeed(10, 3)
    // or
    getSpeed(distance = 10, time = 3)
}