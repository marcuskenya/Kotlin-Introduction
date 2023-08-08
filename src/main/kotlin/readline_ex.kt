fun main(args: Array<String>) {
    println("Enter ur age:")
    var myage:Int= readln()!!.toInt()

    if (myage >=18) {
        println("Welcome to the club.")
    }else{
        println("Sorry cant admit an underage.")
    }

}