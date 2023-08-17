package OOP.abstractions

abstract class SeaCreatures (val name:String ){

    //abstract method/function.
    abstract fun makesound()

    //general method
    fun describe() {
        println("$name is a sea creature")
    }


}

//subclass
class Fish ( name:String) :SeaCreatures(name){
    override fun makesound() {
        println("$name makes a  blup  blup.")
    }

}

class Whale ( name:String) :SeaCreatures(name){
    override fun makesound() {
        println("$name makes a deep underwater voice .")
    }

}

fun main(args: Array<String>) {

    val creature1:SeaCreatures =Fish("Nemo")
    val creature2:SeaCreatures=Whale("Octavia")

    creature1.describe()
    creature1.makesound()

    creature2.describe()
    creature2.makesound()
}