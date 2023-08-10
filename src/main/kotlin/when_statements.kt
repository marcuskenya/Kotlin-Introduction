fun main(args: Array<String>) {

    print("Enter the floor number")
    var floor = readln()!!.toInt()
    when(floor){

        1->println("Go to 1st floor")
        2->println("Go to 2nd floor")
        3->println("Go to 3rd floor")
        4->println("Go to 4th floor")

        else ->print("No floor above 4th floor")
    }


}