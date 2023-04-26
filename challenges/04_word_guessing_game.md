# Word-guessing game (Kotlin)

_**This is a Makers Wheel.** Wheels are designed to develop your skills
efficiently. They are organised around a central exercise, supported by a range
of resources including text, video, and external documentation. [Read more about
how to use Makers
Wheels.](https://github.com/makersacademy/course/blob/main/labels/wheels.md)_

In this challenge, you'll build an old school favourite — a word-guessing game!

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
  val listOfWords = listOf("MAKERS", "DEVELOPER", "SANDWICH")
  val game = Game(listOfWords)

  game.getWordToGuess() // "M_____"

  game.getRemainingAttempts() // 10

  game.attemptLetter("E") // true

  game.getWordToGuess() // "M__E__"

  game.attemptLetter("O") // false

  game.getWordToGuess() // "M__E__"

  game.getRemainingAttempts() // 9

  // ...
}
```

## Supporting materials

@TODO

<!-- BEGIN GENERATED SECTION DO NOT EDIT -->

---

**How was this resource?**  
[😫](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=challenges%2F04_word_guessing_game.md&prefill_Sentiment=😫) [😕](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=challenges%2F04_word_guessing_game.md&prefill_Sentiment=😕) [😐](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=challenges%2F04_word_guessing_game.md&prefill_Sentiment=😐) [🙂](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=challenges%2F04_word_guessing_game.md&prefill_Sentiment=🙂) [😀](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=challenges%2F04_word_guessing_game.md&prefill_Sentiment=😀)  
Click an emoji to tell us.

<!-- END GENERATED SECTION DO NOT EDIT -->
