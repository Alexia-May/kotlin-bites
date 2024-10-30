package org.example

fun main() {
    println("Hello World!")

    //exercise 1
    val message : String = "hello"
    val reversedMessage : String = message.reversed()
    println(reversedMessage)

    //exercise 2 - debug
    var aNumber = 2
    aNumber = 4
    println(aNumber)

    //exercise 3 - debug
    val otherNames: List<String?> = listOf("Kat", "Marc", null)

        // Loop on each name in the list
    /* for (name in otherNames) {
        if (name != null) {
            // Print the length
            println(name.length)
        }
    } */

    //exercise 4 - debug
    val number : Number = 3
    println(number)

    // exercise 5
    val listOfThings: List<Any> = listOf(3, "Hello", 4)

    // Functions exercises

    // exercise 1
    fun superify (word: String): String {
        return "Super${word}"
    }

    println(superify(superify("cat")))

    // exercise 2

    fun revealSecret (password: Any): String? {
        if (password == "HUNGRY") {
            return "The cookies are in the desk drawer"
        }
        else {
            return null
        }
    }

    val secret = revealSecret("hi")
    println(secret)

    // exercise 3

    /* Define a function getNumberSign that takes a number and
    returns a String which is either "zero", "positive" or "negative" depending on its sign.
    If the argument is not a number, the function should return null.
     */

    fun getNumberSign (input : Any) : String? {
        if (input is Number) {
            val number = input.toDouble()
                // number < 0  -> "negative"
            if (number < 0) {
                return "negative"
                // number = 0  -> "zero"
            } else if (number == 0.toDouble()) {
                return "zero"
            // number > 0  -> "positive"
            } else {
                return "positive"
            }
            // not a number -> null
        } else {
            return null
        }
    }

        println(getNumberSign(3)) // "positive"
        println(getNumberSign(0)) // "zero"
        println(getNumberSign(-5)) // "negative"
        println(getNumberSign("not a number")) // null

//Data structures


}



