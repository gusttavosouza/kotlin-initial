package src.exercises

fun countVowels(phrase: String): Int {
    var count = 0
    val vowels = "aeiou"
    val newhrase = phrase.replace("\\s".toRegex(), "")
    for(letter in newhrase){
        if(letter.toLowerCase() in vowels){
            count++
        }
    }
    return count
}

fun countConsonants(phrase: String): Int {
    val vowals = countVowels(phrase)
    val newhrase = phrase.replace("\\s".toRegex(), "")
    val consonants = newhrase.length - vowals
    return consonants
}