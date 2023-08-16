package kotlinchallenge

fun main(args: Array<String>) {

        var inputString = "Hello, how are you doing today?"
        var targetChar = 'o'

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