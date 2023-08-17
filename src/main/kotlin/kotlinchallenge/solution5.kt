package kotlinchallenge

fun main(args: Array<String>) {

    println("Enter any word")
        var inputString = readLine()!!.toString()

    println("Which character do want to target?")
        var targetChar = readLine()?.get(0)?:' '

        var occurrences = countcharacterinstances(inputString, targetChar)

        println("The character $targetChar appears $occurrences times in the string.")



}
fun countcharacterinstances(inputString: String, targetChar: Char): Int {
    var count = 0

    for (char in inputString) {
        if (char == targetChar) {
            count++
        }
    }

    return count
}