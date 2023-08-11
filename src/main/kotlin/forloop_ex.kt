fun main(args: Array<String>) {
    //using for loop and range of number 1..100
    //numbers divisible by 3 and 5 print FizzBuzz
    //numbers divisible by 3 print Fizz
    //numbers divisible by 5 print Buzz

    for(j in 1..100){


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