# Control flow

_**This is a Makers Bite.** Bites are designed to train specific skills or
tools. They contain an intro, a demonstration video, some exercises with an
example solution video, and a challenge without a solution video for you to test
your learning. [Read more about how to use Makers
Bites.](https://github.com/makersacademy/course/blob/main/labels/bites.md)_

## Objective

Learn to use conditions and loops in Kotlin.

## Conditionals

Kotlin has a few ways to handle conditional statements, like `if` / `else` and `when` expressions.

```kotlin

// We use the type `Any`, so the argument
// could be any type.
fun whatIsThis(something: Any): String {

    // We can use a 'when' statement
    // to return a different value depending
    // on the type and value.
    val result = 
        when(something) {
            1 -> "One"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "Not a string"
            else -> "Something else"
        }

    return result
}
```

## Error handling

@TODO

## Exercise

Define a function `getNumberSign` that takes a number and returns either "zero", "positive" or "negative" depending on its sign. If the argument is not a number, the function should return `null`.

```kotlin
getNumberSign(3) // "positive"

getNumberSign(0) // "zero"

getNumberSign(-5) // "negative"

getNumberSign("not a number") // null
```

## Exercise

@TODO 

## What do to next

Bookmark the following links — don't read them all know, but they might be helpful as a reference for later.

 * [Control flow on the Kotlin manual](https://kotlinlang.org/docs/control-flow.html)

[Next Challenge](05_data_structures.md)

<!-- BEGIN GENERATED SECTION DO NOT EDIT -->

---

**How was this resource?**  
[😫](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=kotlin_bites%2F04_control_flow.md&prefill_Sentiment=😫) [😕](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=kotlin_bites%2F04_control_flow.md&prefill_Sentiment=😕) [😐](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=kotlin_bites%2F04_control_flow.md&prefill_Sentiment=😐) [🙂](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=kotlin_bites%2F04_control_flow.md&prefill_Sentiment=🙂) [😀](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=kotlin_bites%2F04_control_flow.md&prefill_Sentiment=😀)  
Click an emoji to tell us.

<!-- END GENERATED SECTION DO NOT EDIT -->
