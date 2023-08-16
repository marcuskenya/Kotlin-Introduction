package kotlinchallenge

fun main(args: Array<String>) {

    println("Enter an number")
    var num = readLine()!!.toInt()

    if(num ==null){
        println("Please enter a valid number")
        }else{
    var result = if(num % 2 == 0){
        println("Even number")
    }else{
        println("Odd number")
    }

    }

}