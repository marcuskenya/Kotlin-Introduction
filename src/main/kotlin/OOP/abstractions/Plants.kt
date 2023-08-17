package OOP.abstractions

abstract class Plants (val name:String){

    abstract fun growing()

    fun description() {
        println("That $name is bright red in color")
    }
}

class Flower(name: String):Plants(name){

    override fun growing() {
        println("The $name is blooming")

    }
}
class Tree(name:String):Plants(name){

    override fun growing() {
        println(" The $name usually grows at a rapid rate")
    }
}

fun main(args: Array<String>) {

    var plant1:Plants = Flower("Rose")
    var plant2:Plants = Tree("Eucalyptus")

    plant1.description()
    plant1.growing()

    plant2.description()
    plant2.growing()
}