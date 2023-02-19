/*
                                Function Literals
    - To simplify how we define functions, we can use function literals.
    A function literals is an unnamed function that can be treated as a value:
    we can call them, assign them as variables, pass them as arguments and
    return them from a function as we could with any other value

    - Two types of function literals: anonymous functions and lambda expressions
*/


fun main() {

    // anonymous function
    var area = fun(base: Int, height: Int): Int = (base * height) / 2
    println(area(15, 19))

    // lambda expression
    var perimeter = { side1: Int, side2: Int -> side1 + side2 }
    println(perimeter(15, 24))
}

