package kotlinchallenge

fun main(args: Array<String>) {

    println("enter any character")

    var letter = readLine()!!.toString().trim()
    if (letter.isBlank()) {
        println("empty submission try again")
    } else {
        var chara = letter[0]
        var result = if (chara in "aeiou") {
            println(" is a vowel")
        } else {
            println("consonants")
        }
    }

}


