import java.util.Calendar

fun main(args: Array<String>) {
    //write a simple kotlin program
    //enter year ur born
    //displays your age

    println("Enter the year you were born")
    var yearborn:Int= readln()!!.toInt()

    var currentyear=Calendar.getInstance().get(Calendar.YEAR)



    var  myage = currentyear-yearborn

    println("You are $myage years old")
}