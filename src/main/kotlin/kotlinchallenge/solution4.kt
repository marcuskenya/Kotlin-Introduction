package kotlinchallenge

fun main(args: Array<String>) {



        var numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)


        var evenNumbers = mutableListOf<Int>()


        for (j in numbers) {
            if (j % 2 == 0) {
                evenNumbers.add(j)
            }
        }

        println("Even numbers: $evenNumbers")


}