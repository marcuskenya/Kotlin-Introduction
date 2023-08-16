package OOP

open class Animal (colour:String,legs:String,breed:String,gender:String){

    init {
        println("Boscow is $colour and it has $legs of $breed and its a $gender")
    }



}

class Dog (name:String,) : Animal(colour = "White", legs = "four ",breed="German shepherd",gender = "Male") {


}
fun nameofdog(){
//    println("Boscow is $colour and it has $legs of $breed and its a $gender")
}

fun main(args: Array<String>) {
var dog1= Dog("Boscow")
//    dog1.nameofdog()
}

