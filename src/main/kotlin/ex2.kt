fun main(args: Array<String>) {

    println("Enter ur marks")
    var marks: Int = readLine()!!.toInt()

//    10-29 E
//    30-39 D
//    40-59 B
//    60-70 B+
//    71-100 A

    if (marks >= 50) {
        print("Congrats you've passed ur exams.")
    } else {
        print("Sorry u have to do a resit")
    }
}
