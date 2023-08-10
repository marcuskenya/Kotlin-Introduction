fun main(args: Array<String>) {

    println("Enter your weight")
    var weight:Float= readLine()!!.toFloat()
    println("Enter your height ")
    var height:Float= readLine()!!.toFloat()

    var bmi=weight/(height * height)

    println("Your bmi is "  + bmi +"kg/m2")



}