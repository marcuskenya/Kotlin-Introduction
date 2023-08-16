fun main(args: Array<String>) {

    //for the ranges 1..100
    //User to enter 1st and 2nd number on the terminal
    println("Enter 1st number")
    var num1 = readln()!!.toInt()
    println("Enter 2nd number")
    var num2 = readln()!!.toInt()

    for (j in num1..num2) {


     if (j % 3 == 0  &&  j % 5 == 0)  {
          println("FizzBuzz")
     }
       else if (j % 3 == 0 ) {
         println("Fizz")

       }else if(j % 5 == 0 ) {
          println("Buzz")
       }else
           println(j)

    }


    }
