# Word-guessing game (Kotlin)

_**This is a Makers Wheel.** Wheels are designed to develop your skills
efficiently. They are organised around a central exercise, supported by a range
of resources including text, video, and external documentation. [Read more about
how to use Makers
Wheels.](https://github.com/makersacademy/course/blob/main/labels/wheels.md)_

In this challenge, you'll build an old school favourite — a word-guessing game!

- [Exercise](#exercise)
- [Supporting Materials](#supporting-materials)
    - [How to manage the game state](#how-to-change-the-game-state)
    - [I'm not sure where to start](#im-not-sure-where-to-start)

## Exercise

_This is the exercise. You may or may not be able to do this yet. Use the
supporting materials below this exercise to help you._

Here's the specification for this game:

 * When the game starts, it will choose a random word from a list of words.
 * The game will then display the word to guess, with only the first letter visible (e.g `H____` for "HOUSE").
 * The player starts a counter of 10 attempts.
 * The player will then be prompted to enter a letter they think might be in the word.
 * If the letter is in the word, the game will display the word to guess, with the new letter visible.
 * If the letter is not in the word, the game will display the same letters as before, and decrease the counter of remaining attempts.
 * If the counter of attempts reaches zero, the player loses.
 * If the player finds all the letters in the word, they win.

Below is an example of how your code should be called, and what it should
output.

```kotlin
// file: src/main/kotlin/tech/makers/game/Main.kt

// Note the package:
package tech.makers.game

fun main() {
  // A list of possible words - one will
  // be randomly picked by the program
  val listOfWords = listOf("MAKERS", "DEVELOPER", "SANDWICH")

  // An object of the `GameState` data class
  // (You will need to create this data class too).
  val gameState = createGameState(listOfWords)

  // Returns the partially masked
  // word to guess (e.g  "M_____" if the picked
  // word is "MAKERS")
  getWordToGuess(gameState)

  // Returns the number of remaining attempts
  // (initially 10)
  getRemainingAttempts(gameState)

  // Returns true (the letter is in the word)
  val newGameState = attemptGuessLetter(gameState, "E")

  getWordToGuess(gameState) // "M__E__"

  // Returns false (the letter is not in the word)
  val newGameState2 = attemptLetter(gameState, "O") 

  getWordToGuess(gameState) // "M__E__"

  getRemainingAttempts(gameState) // 9

  // ...
}
```

Build this program using [the Functional programming paradigm](./03_bank.md#on-functional-programming).

## Supporting materials

### How to change the game state?

You'll notice a few things on the code above:
  * Since our functions cannot change external state (have side-effects), we need to "pass around" the `gameState` value to each function.
  * Since the function `attemptGuessLetter` can't change the state, it needs to return a new `GameState` object which corresponds to the new state after trying to guess the letter. This will also be true of any other functions which need to alter the state of the game in some way.

```kotlin
// EXAMPLE:

fun attemptGuessLetter(state: GameState, letter: Char) {
  // state is the current state data

  // This function will do some work

  // ...then return the new game state
  return GameState()
}
```

## I'm not sure where to start...

Start by creating a test class containing a simple test case - for a new game state, we should get the word to guess. Don't use a dictionary of possible words, but use a single word to start with.

```kotlin
// file: src/test/kotlin/GameTest.kt

import kotlin.test.Test

class GameTest {

    @Test
    fun getsMaskedWordToGuess() {
        // Give the word to guess
        val state = createGameState("MAKERS")

        val maskedWord = getWordToGuess(state)

        assert(maskedWord == "M_____")
    }
}
```

Then, gradually add more tests to test-drive the remaining functions used to manage the game.

<!-- BEGIN GENERATED SECTION DO NOT EDIT -->

---

**How was this resource?**  
[😫](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=challenges%2F04_word_guessing_game.md&prefill_Sentiment=😫) [😕](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=challenges%2F04_word_guessing_game.md&prefill_Sentiment=😕) [😐](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=challenges%2F04_word_guessing_game.md&prefill_Sentiment=😐) [🙂](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=challenges%2F04_word_guessing_game.md&prefill_Sentiment=🙂) [😀](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=challenges%2F04_word_guessing_game.md&prefill_Sentiment=😀)  
Click an emoji to tell us.

<!-- END GENERATED SECTION DO NOT EDIT -->
