/*
                                    Jump Expressions
       The jump expressions, break and continue, are used to change the standard
       loop behavior by exiting a loop early or skipping a single repetition

                                    Labeled Jump Expressions
        "How would use jump expressions inside nested loop ?"
        Good question ! The answer is labeled jump expressions. By adding a label to outer loop
        of nested loops, we can execute a jump expression from the inner loop and have it act
        on the labeled outer loop
*/

fun main() {

    grid@ for (i in 1..6) {
        for (j in 'A'..'F') {
            if (j == 'C') {
                continue@grid
            }
            print("$j$i ")
        }
        println()
    }


}