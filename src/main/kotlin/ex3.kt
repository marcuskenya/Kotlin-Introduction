fun main(args: Array<String>) {
    println("Enter ur marks")
    var marks: Int = readLine()!!.toInt()
    //    10-29 E
    //    30-39 D
    //    40-59 B
    //    60-70 B+
    //    71-100 A


    if (marks in 1..29) {
        println("E")
    } else if (marks in  30..39) {
        println("D")
    } else if (marks in 40..59) {
        println("B")
    } else if (marks in 70.. 71) {
        println("B+")
    } else if (marks in  71..100) {
        println("A")

    }else{
        print("Invalid marks")

    }



}
