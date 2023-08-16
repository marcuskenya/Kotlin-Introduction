package kotlinchallenge

fun main(args: Array<String>) {


        println("Simple Calculator")
        println("Enter the first number:")
        var num1 = readLine()!!.toDouble()

        println("Enter the second number:")
        var num2 = readLine()!!.toDouble()

        println("Enter the operator (+, -, *, /):")
        var operator = readLine()

        if (num1 == null || num2 == null || operator == null) {
            println("Invalid input")
            return
        }

        var result = when (operator) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> {
                if (num2 != 0.0) {
                    num1 / num2
                } else {
                    println("Division by zero is not allowed")
                    return
                }
            }
            else -> {
                println("Invalid operator")
                return
            }
        }

        println("Result: $result")



}