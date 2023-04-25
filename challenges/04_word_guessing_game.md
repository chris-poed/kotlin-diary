# Building a word-guessing game

In this challenge, you'll build an old school favourite — a word-guessing game! Here's the specification for this game:

 * When the game starts, it will choose a random word from a list of words.
 * The game will then display the word to guess, with only the first letter visible (e.g `H____` for "HOUSE").
 * The player starts a counter of 10 attempts.
 * The player will then be prompted to enter a letter they think might be in the word.
 * If the letter is in the word, the game will display the word to guess, with the new letter visible.
 * If the letter is not in the word, the game will display the same letters as before, and decrease the counter of remaining attempts.
 * If the counter of attempts reaches zero, the player loses.
 * If the player finds all the letters in the word, they win.

## Objectives 

 * Initialising a new Kotlin project.
 * Writing a test class and tests
 * Writing a class and a method.
 * Using a loop and some of Kotlin built-in classes, like `StringBuilder`.
 * Running tests.

## A Worked Example With Videos

@TODO add videos

## Project setup

@TODO

First, create a new Kotlin project named `guessinggame` — if you're not sure how to do this, revisit this guidance.

## Exercise - a first test

To complete this exercise, you'll need to:
  * write a test class `GameTest`.
  * write a class `Game` and a method.
  * return a value with a given type.

We'll focus first on test-driving the display of the initial word to guess, with only the first letter visible. Let's create a class `GameTests` that will contain tests for the main `Game` class:

```kotlin
import kotlin.test.Test

class GameTests {
    @Test
    fun testGetWordToGuess() {
        val game = Game()

        assert("B_____" == game.getWordToGuess())
    }
}
```

### Questions

1. What needs to be the type returned by `getWordToGuess()`? 
2. Write the class `Game` with the minimal required code to make this test pass. Don't worry too much about any game logic. For now, your only goal is to make this test pass.

After completing the following, you should be able to make this first test pass. Your class `Game` should be defined with one method `getWordToGuess`.

## Exercise - hiding the word

To complete this exercise, you'll need to:
  * Implement a constructor
  * Use a [loop](../kotlin_bites/05_data_structures.md#iterating) to iterate on each character of a string
  * Use [Kotlin's `StringBuilder` class](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/-string-builder/)

### Questions

1. Modify the test so the word to guess is given as an argument when creating the `Game` instance. In the following examples, we'll choose to use the word "MAKERS". 
2. Modify the `Game` class so it receives the word to guess as an argument when created (what needs to be the type of this argument?):
```kotlin
val game = Game("MAKERS"); // the word is given when creating the instance
```

3. Modify the `getWordToGuess` method so it returns a string which is the word to guess with all letters hidden except the first one. This is likely to require some thought!
4. Have a look at Kotlin's [`StringBuilder` class](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/-string-builder/). Can you use it to build the hidden word?
5. If you've implemented the class correctly, you can update the test in `GameTests`, and it should pass:

```kotlin
fun testGetWordToGuess() {
    val game = Game("MAKERS")

    assert("M_____" == game.getWordToGuess())
}
```

## Exercise - debugging

Someone from your cohort wrote the code for the method `getWordToGuess`, however their code doesn't work.

```kotlin
fun getWordToGuess() =
    word[0] +
    word.drop(1).forEach { "_" }.joinToString("")
```

1. Find the issues in the code above. How would you fix it?
2. Once you've found how to fix it, you can compare this code with your own solution. You can also replace your code with the version above, if you'd like!

## Exercise - adding the attempts counter

### Questions

1. Modify the `Game` class so it holds the number of remaining attempts for the player. This counter should be initialised at 10.
2. Test-drive a new method `getRemainingAttempts()` which returns the number of remaining attempts.

## Exercise - a random word

We're going to change the behaviour of the game so it picks a random word from a list of words.

1. Add a value called `dictionary` to the Game class. This will be a list of a few words: let's have "MAKERS", "CANDIES", "DEVELOPER", "LONDON", for a start.
2. Implement a method `getRandomWordFromDictionary` that picks a random word from this list.
3. Change the constructor of the `Game` class so it doesn't take any argument for the initial word. Instead, it should use the new method `getRandomWordFromDictionary` to assign the word to guess.



[Next Challenge](05_word_guessing_game_2.md)

<!-- BEGIN GENERATED SECTION DO NOT EDIT -->

---

**How was this resource?**  
[😫](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=challenges%2F04_word_guessing_game.md&prefill_Sentiment=😫) [😕](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=challenges%2F04_word_guessing_game.md&prefill_Sentiment=😕) [😐](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=challenges%2F04_word_guessing_game.md&prefill_Sentiment=😐) [🙂](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=challenges%2F04_word_guessing_game.md&prefill_Sentiment=🙂) [😀](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=challenges%2F04_word_guessing_game.md&prefill_Sentiment=😀)  
Click an emoji to tell us.

<!-- END GENERATED SECTION DO NOT EDIT -->
