/*
                                           Introduction to Functions
   - A function is a reusable block of code that we can call throughout our program to complete
    a certain task.
   - We'll venture outside the main() function and write our own user-designed functions

   - User-designed function are functions we, the developers, create in our program in order
     to accomplish a specific task.

   - fun functionName(argName: Type): returnType{
        Function Body
     }

*/


// function called smores
fun smores(){
    println("Roast a marshmallow.")
    println("Place marshmallow on a graham cracker.")
    println("Place chocolate on marshmallow.")
    println("Put a new graham cracker on chocolate.")
    println("Enjoy !")
}

fun main() {
    // invoke the function
    smores()
}

