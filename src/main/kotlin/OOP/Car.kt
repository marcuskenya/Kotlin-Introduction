package OOP

class Car( val make:String , val model:String, val price:Int,) {
    init {
//        println("Make is $make")
//        println("Model is $model")
//        println("Price is $price")
//        println("Marcus owns a $make $model that costs $price")
        println("$make $model costs $price")
    }


}


fun main(args: Array<String>) {

    var owner1 = Car("Toyota","Vitz",450000)
    var owner2 = Car("BMW","312",950000)
    var owner3 = Car("Aston Martin","DBX 707",10050000)

}
