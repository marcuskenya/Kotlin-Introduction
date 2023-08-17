package OOP.encapsulation

//offering protection of data to an outside world.
class People(private val  name:String ,  private var age:Int) {

    fun getpersoninfo():String{
        return "Name:$name, Age :$age"
    }

}

fun main(args: Array<String>) {

    val person1= People("Marcus",18)

    println(person1.getpersoninfo())
}