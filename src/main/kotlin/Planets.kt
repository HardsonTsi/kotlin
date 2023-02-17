/*
* functions changes the contents of the list it can only be used on mutable lists
*/

fun main() {

    // mutable list containing the names of planets within our solar system
    var planets = mutableListOf("Mercury", "Venus", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto")

    // delete the planet that does not fit in the list
    planets.remove("Pluto")

    // add the planet that's currently missing to the list
    planets.add("Earth")

    // generate random planet from the list
    println(planets.random())
    println(planets.random())
    println(planets.random())

}