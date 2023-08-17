package kotlinchallenge

fun main(args: Array<String>) {




        print("Enter any character: ")
        var letter = readLine()!!.toString().trim()

        if (letter.isBlank() && letter.length == 1) {
            var character = letter[0]
            var result = VoORCon(character)
            println("The character '$character' is a $result.")
        } else {
            println("Please enter a valid single character.")
        }



}
fun VoORCon(character: Char): String {
    var lowerChar = character.toLowerCase()

    return when (lowerChar) {
        'a', 'e', 'i', 'o', 'u' -> "vowel"
        in 'a'..'z' -> "consonant"
        else -> "not a letter"
    }
}