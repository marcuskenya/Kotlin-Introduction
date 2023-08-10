fun main(args: Array<String>) {

    println("Enter any number")

    var SMS = readLine()!!.toInt()
    when(SMS){
        1->print("Redeem bonga points")
        2->print("Okoa Jahazi")
        3->print("Get Fuliza")
        4->print("Airtime with no expiry")

        else-> print("Invalid input")
    }


}