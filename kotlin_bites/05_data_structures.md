# Data structures

_**This is a Makers Bite.** Bites are designed to train specific skills or
tools. They contain an intro, a demonstration video, some exercises with an
example solution video, and a challenge without a solution video for you to test
your learning. [Read more about how to use Makers
Bites.](https://github.com/makersacademy/course/blob/main/labels/bites.md)_

## Objective

Learn to use data structures such as lists and maps in Kotlin.

## Lists

```kotlin
// Declaring an immutable list
// (we cannot modify it, e.g adding new elements)
val names = listOf("Andy", "Barbara", "Cat")

// Declaring a mutable list
// (elements can be added or removed)
val names = arrayListOf("Andy", "Barbara", "Cat")
names.add("Danny")
names.add("Erica")

// Sometimes we need to specify the type
// of the list elements. Here using the arrayListOf<TYPE> syntax.
val uppercaseNames = arrayListOf<String>()

// Looping through `names`:

names.forEach {
    // Below, `it` is a special variable 
    // referring to the current name 
    // in the loop.
    uppercaseNames.add(it.uppercase())
}
```

The last example above introduces a new syntax called a lambda — you'll learn more about this soon.

## Exercise

Use the function `getNumberSign` written in the previous section. Write a new function `getAllNumberSigns` which takes an array of numbers (`Int`), and returns an array of the corresponding number signs.

Here's the expected behaviour:

```kotlin
val numbers = listOf(2, -3, 5, 0)

val signs = getAllNumberSigns()
// ["positive", "negative", "positive", "zero"]
```

## Maps

```kotlin
// Declaring a map
val info = mapOf(
    "name" to "John Doe",
    "email" to "contact@mywebsite.com",
    "postcode" to "EC1 AAA",
    "phones" to listOf("0700000000", "071000000")
)

// Accessing values
val name = info["name"]
val email = info["email"]
val phones = info["phones"]

// Iterating over a map
info.forEach { key, value -> 
    println("${key} = ${value}")
}
```

You might have noticed that when accessing values, they will be of a "nullable" type `String?` instead of `String`. The key might not exist in the map, so Kotlin uses this nullable type, which means we need to check whether it contains a value of `null`:

```kotlin
val phones: List<String>? = info["phones"] as List<String>?

// This won't work, as phones might be null.
phones.count()

// Instead, we need to explictly check
// whether it is null or not:
if (phones == null) {
    // Do something with phones
    println(phones.count())
} else {
    // No 'name' in the map, do something else
}
```

### Do I always need to do this?

Yes. The compiler will be very strict and will complain if we forget to check for `null` when dealing with nullable types such as `String?` — so be warned.

## Exercises

_These exercises are marked with :hot_pepper: emojis to denote how challenging
they are. A single chilli :hot_pepper: is the most straightforward, and five
:hot_pepper::hot_pepper::hot_pepper::hot_pepper::hot_pepper: would be
challenging even for a professional engineer. Pick whichever you prefer._

* :hot_pepper: Define a list `numbers` containing a few numbers and print it using `println`
* :hot_pepper::hot_pepper: Define a function `printHelloMessages` which, for each name in the list given in argument, prints a hello message. You should use `map` in this function.
* :hot_pepper::hot_pepper: Rewrite your function `getAllNumberSigns` without using an extra array (hint: [can you use the `map` method?](https://kotlinlang.org/docs/collection-transformations.html#map))

## What to do next

Bookmark the following links — don't read them all know, but they might be helpful as a reference for later.
 * [Collections cheatsheet](https://devhints.io/kotlin#collections)

Then go on to the next section.

[Next Challenge](06_functions2.md)

<!-- BEGIN GENERATED SECTION DO NOT EDIT -->

---

**How was this resource?**  
[😫](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=kotlin_bites%2F05_data_structures.md&prefill_Sentiment=😫) [😕](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=kotlin_bites%2F05_data_structures.md&prefill_Sentiment=😕) [😐](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=kotlin_bites%2F05_data_structures.md&prefill_Sentiment=😐) [🙂](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=kotlin_bites%2F05_data_structures.md&prefill_Sentiment=🙂) [😀](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=kotlin_bites%2F05_data_structures.md&prefill_Sentiment=😀)  
Click an emoji to tell us.

<!-- END GENERATED SECTION DO NOT EDIT -->
