package kotlinchallenge

fun main(args: Array<String>) {

    println("Enter your name")
    var name = readln()!!.toString()

    if (name.isBlank()  ) {
        println("Please enter a valid name")
    }else{
            println("Hello, $name!")

        }
    }
