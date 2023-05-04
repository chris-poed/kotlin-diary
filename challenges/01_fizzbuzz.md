# Fizzbuzz (Kotlin)

_**This is a Makers Wheel.** Wheels are designed to develop your skills
efficiently. They are organised around a central exercise, supported by a range
of resources including text, video, and external documentation. [Read more about
how to use Makers
Wheels.](https://github.com/makersacademy/course/blob/main/labels/wheels.md)_

In this exercise you will test-drive a Fizzbuzz function in Kotlin.

- [Exercise](#exercise)
- [Supporting Materials](#supporting-materials)
  - [Setting up a project](#setting-up-a-project)
  - [Creating a Method](#creating-a-method)
  - [Ifs and Loops](#ifs-and-loops)
  - [Strings](#strings)
  - [JUnit Tests](#writing-tests)

## Exercise

_This is the exercise. You may or may not be able to do this yet. Use the
supporting materials below this exercise to help you._

Your task is to test-drive a function that takes a max number and returns a
string. The string should list out the numbers counting up to and including the
given max number, substituting Fizz where the number is divisible by 3, Buzz
where it is divisible by 5, and FizzBuzz where it is divisible by both 3 and 5.

Here's an example:

```
CALLING:
  fizzbuzz(15)
SHOULD RETURN:
  "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz"
```

You're going to test drive this, which will be much easier if you avoid printing
to the terminal.

Here is a starting point in Kotlin

```kotlin
// file: src/test/kotlin/FizzbuzzTest.kt

class FizzbuzzTest {

    @Test
    fun testGenerateListsNumbersUpToOne() {
        val result = fizzbuzz(1)

        assertEquals("1", result)
    }

//    @Test
//    fun testGenerateListsNumbersUpToTwo() {
//        
//        val result = fizzbuzz(2)
//        assertEquals("1, 2", result)
//    }
}
```

```kotlin
// file: src/main/kotlin/Main.kt

fun fizzbuzz(number: Int): String {
    return "1"
}
```

You're done when your code passes the following acceptance criteria:

```
CALLING:
  fizzbuzz(100)
SHOULD RETURN:
  "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26, Fizz, 28, 29, FizzBuzz, 31, 32, Fizz, 34, Buzz, Fizz, 37, 38, Fizz, Buzz, 41, Fizz, 43, 44, FizzBuzz, 46, 47, Fizz, 49, Buzz, Fizz, 52, 53, Fizz, Buzz, 56, Fizz, 58, 59, FizzBuzz, 61, 62, Fizz, 64, Buzz, Fizz, 67, 68, Fizz, Buzz, 71, Fizz, 73, 74, FizzBuzz, 76, 77, Fizz, 79, Buzz, Fizz, 82, 83, Fizz, Buzz, 86, Fizz, 88, 89, FizzBuzz, 91, 92, Fizz, 94, Buzz, Fizz, 97, 98, Fizz, Buzz"
```

## Supporting Materials

### Setting up a project

[Follow this guidance](../kotlin_bites/01_first_program.md)

### Test-driving a function

If you'd like to use a design recipe to test-drive this function, [here's a function design recipe template adapted for Kotlin.](../resources/single_function_design_recipe.md)

### Functions

[Follow this guidance](../kotlin_bites/03_functions.md) on functions.

### Conditionals and loops

[Follow this guidance](../kotlin_bites/04_control_flow.md) on collections and loops.

> But how do I loop through a sequence of numbers?

A sequence of numbers is also a collection — in Kotlin, we can use a Range to create a collection which is a list of numbers from a low bound to a high bound.

```kotlin
val numbersToTen = (0..10) // Create a value of type IntRange

// Will print all numbers in the range
numbersToTen.forEach {
  println(it)
}
```

### Strings

Take a look at the official Kotlin documentation for [Strings](https://kotlinlang.org/docs/strings.html)

### Writing Tests

Take a look at the official Kotlin documentation for [How to write a test](https://kotlinlang.org/docs/jvm-test-using-junit.html#add-dependencies).



[Next Challenge](02_music_library.md)

<!-- BEGIN GENERATED SECTION DO NOT EDIT -->

---

**How was this resource?**  
[😫](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=challenges%2F01_fizzbuzz.md&prefill_Sentiment=😫) [😕](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=challenges%2F01_fizzbuzz.md&prefill_Sentiment=😕) [😐](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=challenges%2F01_fizzbuzz.md&prefill_Sentiment=😐) [🙂](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=challenges%2F01_fizzbuzz.md&prefill_Sentiment=🙂) [😀](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=challenges%2F01_fizzbuzz.md&prefill_Sentiment=😀)  
Click an emoji to tell us.

<!-- END GENERATED SECTION DO NOT EDIT -->
