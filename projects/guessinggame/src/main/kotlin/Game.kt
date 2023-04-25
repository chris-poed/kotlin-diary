class Game() {

    val dictionary = listOf<String>("MAKERS", "DEVELOPER")
    val word = getWordFromDictionary()

    fun getWordFromDictionary() = dictionary.random()

    fun getWordToGuess() =
        word[0] + word.drop(1).map { "_" }.joinToString("")
}