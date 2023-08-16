package OOP.polymorphism

//taking many states or different form.

//superclass
 open class Building(val type :String) {
   open fun openDoor() {
        println("$type door is opening")
    }
}

//subclass
class House(type:String) :Building(type){
   override fun openDoor() {
        println("$type house door is opening")
    }


}

class Apartment(type: String) :Building(type){
    override fun openDoor() {
        println("$type apartment door is opening")
    }


}

class OfficeBlock(type: String) :Building(type) {
    override fun openDoor() {
        println("$type office door is opening")

    }
}
fun main(args: Array<String>) {
    var buliding1:Building= House("The Bungalow")  //House Object is been treated like a building.
    buliding1.openDoor() // calls the overriden method in house.

    var building2:Building = Apartment("Studio")//Apartment Object is been treated like a building.
    building2.openDoor() // calls the overriden method in apartment.

    var buliding3:Building = OfficeBlock("CW")//OfficeBlock  Object is been treated like a building.
    buliding3.openDoor()// calls the overriden method in officeblock.
}

