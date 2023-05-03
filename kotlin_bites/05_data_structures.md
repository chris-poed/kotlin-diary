# Collections and loops

_**This is a Makers Bite.** Bites are designed to train specific skills or
tools. They contain an intro, a demonstration video, some exercises with an
example solution video, and a challenge without a solution video for you to test
your learning. [Read more about how to use Makers
Bites.](https://github.com/makersacademy/course/blob/main/labels/bites.md)_

## Objective

Learn to use collections such as lists and maps in Kotlin.

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

## Maps

Maps are another data structure which associates keys with values, similar to "dictionaries" or "hashes" in other languages.

Make sure to not mix up `Map`, which is the type name in Kotlin, with (lowercase) `map`, which is a function you'll see in a bit.

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

## Useful functions

### `map`

The member function `map` works on any "collection" — `List`s or `Map`s and other types. It is useful when you want to create a new list from another list.

For example, the following code creates a new `List` of uppercased words, from an initial `List` of words.

```kotlin
val words = listOf("music", "cheese", "house")

// .map takes a "lambda" function
// which is called for each element of the list
// and needs to return the element for the new list.
val uppercasedWords = words.map {
    // Note the "return" keyword
    // is not used in lambdas
    it.uppercase()
}
```

### `filter`

The member function `filter` works on any "collection" — `List`s or `Map`s and other types. It is useful when you want to filter out elements from a list.

For example, the following code creates a new `List` of only positive numbers, by filtering a list of numbers.

```kotlin
val numbers = listOf(10, -5, 4, -1, 7)

// .filter takes a "lambda" function
// which is called for each element of the list
// and needs to return a boolean.
val positiveNumbers = words.filter {
    it > 0
}
```

## Exercises

### 1

Define a function `printHelloMessages` which, for each name in the list given in argument, prints a hello message. You should use `map` in this function.

### 2

Use the function `getNumberSign` written in the previous section. Write a new function `getAllNumberSigns` which takes an array of numbers (`Int`), and returns an array of the corresponding number signs.

Here's the expected behaviour:

```kotlin
val numbers = listOf(2, -3, 5, 0)

val signs = getAllNumberSigns()
// ["positive", "negative", "positive", "zero"]
```

You should use the function `map` in this function.

## What to do next

Bookmark the following links — don't read them all right now, but they might be helpful as a reference for later.
 * [Collections cheatsheet](https://devhints.io/kotlin#collections)

Then go on to the next section.

[Next Challenge](06_functions2.md)

<!-- BEGIN GENERATED SECTION DO NOT EDIT -->

---

**How was this resource?**  
[😫](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=kotlin_bites%2F05_data_structures.md&prefill_Sentiment=😫) [😕](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=kotlin_bites%2F05_data_structures.md&prefill_Sentiment=😕) [😐](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=kotlin_bites%2F05_data_structures.md&prefill_Sentiment=😐) [🙂](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=kotlin_bites%2F05_data_structures.md&prefill_Sentiment=🙂) [😀](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=kotlin_bites%2F05_data_structures.md&prefill_Sentiment=😀)  
Click an emoji to tell us.

<!-- END GENERATED SECTION DO NOT EDIT -->
