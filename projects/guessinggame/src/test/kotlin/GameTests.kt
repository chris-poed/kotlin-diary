import kotlin.test.Test

class GameTests {
    @Test
    fun testGetWordToGuess() {
        val game = Game()
        println(game.getWordToGuess())

        assert("M_____" == game.getWordToGuess())
    }
}