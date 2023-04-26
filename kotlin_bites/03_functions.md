# Functions

_**This is a Makers Bite.** Bites are designed to train specific skills or
tools. They contain an intro, a demonstration video, some exercises with an
example solution video, and a challenge without a solution video for you to test
your learning. [Read more about how to use Makers
Bites.](https://github.com/makersacademy/course/blob/main/labels/bites.md)_

## Objective

Learn to write Kotlin functions

## Function syntax

Like in other languages, a Kotlin function can take arguments, do some work, and return a result. For example, a function `add` to sum two numbers:

```kotlin
val result = add(2, 3) // 5
```

When defining a function, we need to specify the type for the arguments and return value.

```kotlin
// getHelloMessage takes one String argument, 
// and returns a String
fun getHelloMessage(name: String): String {
    return "Hello ${name}"
}

val helloMessage = getHelloMessage("Leo")

// We can use a shorter syntax
// without the body between brackets
fun add(a: Int, b: Int): Int = a + b

// When using the shorter syntax, the return type
// can be "guessed" by the compiler (here, String)
fun getHelloMessage(name: String) = "Hello ${name}"

val message = getHelloMessage("James")
```

## Returning `Unit`

@TODO (do they need to know this?)

## Returning `null`

As seen in the previous section, a value of type `String` cannot be null.

However, a value of type `String?` can be. Therefore, if a function might return `null`, its return type needs to allow for it:

```kotlin
fun findAddress(name): String {
    // This won't be allowed by the compiler
    return null
}
```

 > IDE tip :bulb: Point your mouse cursor on a function call in your code — the IDE will display its signature (including the argument types, and the return type).

## Exercises

_These exercises are marked with :hot_pepper: emojis to denote how challenging
they are. A single chilli :hot_pepper: is the most straightforward, and five
:hot_pepper::hot_pepper::hot_pepper::hot_pepper::hot_pepper: would be
challenging even for a professional engineer. Pick whichever you prefer._

You can work through the following exercises in the same function `main` of the previous program, or in a new project. You might want to use the function `println` to check your results.

* :hot_pepper: Define a new function `add` which adds two numbers and return the result.
    ```kotlin
    val result = add(2, 3) // 5
    ```
* :hot_pepper: Define a function `revealSecret` which takes a passcode in argument, and returns a secret string "The cookies are in the desk drawer" only if the given passcode is the string `"HUNGRY"`. If the given passcode is something else, the function should return `null`. What should be the return value type of this function?
    ```kotlin
    val secret = revealSecret("HUNGRY") 
    println(secret) // "The cookies are in the desk drawer"

    val secret = revealSecret("Hi") 
    println(secret) // null
    ```

## What do to next

Bookmark the following links — don't read them all know, but they might be helpful as a reference for later.

 * [Functions reference on the Kotlin manual](https://kotlinlang.org/docs/functions.html)

Then go on to the next section.

[Next Challenge](04_control_flow.md)

<!-- BEGIN GENERATED SECTION DO NOT EDIT -->

---

**How was this resource?**  
[😫](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=kotlin_bites%2F03_functions.md&prefill_Sentiment=😫) [😕](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=kotlin_bites%2F03_functions.md&prefill_Sentiment=😕) [😐](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=kotlin_bites%2F03_functions.md&prefill_Sentiment=😐) [🙂](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=kotlin_bites%2F03_functions.md&prefill_Sentiment=🙂) [😀](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=kotlin_bites%2F03_functions.md&prefill_Sentiment=😀)  
Click an emoji to tell us.

<!-- END GENERATED SECTION DO NOT EDIT -->
