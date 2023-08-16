package OOP

class House(landlord:String , location:String, type:String ) {

    init {
        println("$landlord rents people  $type houses at $location in Nairobi " )
    }
}


fun main(args: Array<String>) {
    var owner = House("Kung'u","Runda","three bedroomed")
}