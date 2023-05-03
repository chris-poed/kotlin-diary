# (More) Functions

_**This is a Makers Bite.** Bites are designed to train specific skills or
tools. They contain an intro, a demonstration video, some exercises with an
example solution video, and a challenge without a solution video for you to test
your learning. [Read more about how to use Makers
Bites.](https://github.com/makersacademy/course/blob/main/labels/bites.md)_

## Objective

Learn to use higher-order functions and lambdas.

## Video

[A video walkthrough of this section is available here.](https://www.youtube.com/watch?v=pNKrTz4Rx5I)

## Functions have types

Let's talk a bit more about types first.

In Kotlin, functions can be considered as values (like numbers, strings, etc), which means they also have their own type.

For example, the following function:

```kotlin
fun add(a: Int, b: Int): Int {
    return a + b
}
```

Has the following type:

```
(Int, Int) -> Int
```

In other words, it takes two arguments of type `Int`, and returns an `Int`.

Here are other examples:

```kotlin
// (String) -> String
fun greet(name: String) = "Hello $name!"

// (List<Int>) -> Int
fun sumAll(numbers: List<Int>): Int {
    return numbers.sum()
}

// A bit less obvious - this one
// takes a nullable String, and make
// sure it always returns a String 
// (if we give null, we get an empty String)

// (String?) -> String
fun ensureString(stringOrNull: String?): String {
    return stringOrNull ?: ""
}
```

## Higher-order functions

A function can take other functions as arguments.

Here is an example. Try to run the following code in a Kotlin file.

```kotlin
fun calculate(a: Int, b: Int, calculateFunction: (Int, Int) -> Int): Int {
    return calculateFunction(a, b)
}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun multiply(a: Int, b: Int): Int {
    return a * b
}

// We're not calling the function
// but referencing it, so we need to use
// `::` in front of their name.
calculate(2, 3, ::add) // 2 + 3 = 5
calculate(2, 4, ::multiply) // 2 * 4 = 8
```

This might be challenging to fully grasp, so don't hesitate to take it slow.

We can see that both `add` and `multiply` have the same type — they both take two `Int` arguments and return an `Int`. So in Kotlin land, their type is:

```
(Int, Int) -> Int
```

The function `calculate`'s third argument might seem a bit alien here. But note that this is exactly the same type:

```kotlin
fun calculate(
    a: Int,
    b: Int,
    // Third argument of type (Int, Int) -> Int
    // (Same as add and multiply!)
    calculateFunction: (Int, Int) -> Int
)
```

In other words, the function `calculate` accepts as a third argument a function which takes two `Int` and returns an `Int`. Therefore the `calculate` function doesn't need to know how to do the operation between the two numbers it gets — it can "delegate" the operation to the given function. As long as we give it a function of type `(Int, Int) -> Int`, this will work.

## Lambdas

When the last argument is a function, we can use the lambda syntax to declare the function "directly", without giving it a name beforehand:

```kotlin
calculate(2, 2) { a, b ->
    a - b
}

// If the lambda takes only
// one argument, we can use the `it`
// implicit value within the lambda body.
// You've already done this using `forEach`:

listOf("one", "two", "three").forEach {
    print(it.uppercased())
}
```

## Exercise

1. Implement a function `convertToCaps` which takes a string and returns the string converted to capital letters.
2. Implement a function `exclaim` which takes a string and returns the given string with an exclamation mark at the end.
3. Implement a function `greetWith` which we can call this way:

```kotlin
greetWith("Marco", convertToCaps) // "MARCO"

greetWith("Marco", exclaim) // "Marco!"
```

## Exercise

Call the previous function `greetWith` using a lambda instead of a named function.

## What to do next

Go on to the next section.

[Next Challenge](07_classes.md)

<!-- BEGIN GENERATED SECTION DO NOT EDIT -->

---

**How was this resource?**  
[😫](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=kotlin_bites%2F06_functions2.md&prefill_Sentiment=😫) [😕](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=kotlin_bites%2F06_functions2.md&prefill_Sentiment=😕) [😐](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=kotlin_bites%2F06_functions2.md&prefill_Sentiment=😐) [🙂](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=kotlin_bites%2F06_functions2.md&prefill_Sentiment=🙂) [😀](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=kotlin_bites%2F06_functions2.md&prefill_Sentiment=😀)  
Click an emoji to tell us.

<!-- END GENERATED SECTION DO NOT EDIT -->
