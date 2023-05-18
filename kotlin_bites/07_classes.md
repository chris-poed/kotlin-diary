# Classes

_**This is a Makers Bite.** Bites are designed to train specific skills or
tools. They contain an intro, a demonstration video, some exercises with an
example solution video, and a challenge without a solution video for you to test
your learning. [Read more about how to use Makers
Bites.](https://github.com/makersacademy/course/blob/main/labels/bites.md)_

## Objective

Learn to write classes in Kotlin.

## Video

[A video walkthrough of this section is available here.](https://www.youtube.com/watch?v=xvLReE3HPXo)

## Classes

If you've learned to use classes in other languages, their behaviour is similar here. A class is a blueprint to create objects so they have data (properties) and behaviour (member functions).

In Kotlin, everything is an object. Even a string is actually an object created from the class `String`:

```kotlin
// Creating an empty String
val name = String()

name.length // 0
```

Since everything is an object, creating a new class means we are creating a new type.

The syntax in Kotlin is quite flexible and allows us to define (or not):
 * its constructor (the special function of a class  executed whenever we create new objects of that class)
 * its properties, if any
 * its member functions (or methods), if any

```kotlin
// Defining an "empty" class
class Person

// Kotlin automatically creates a default constructor
// with no arguments
val someone = Person()

// Defining a class and its properties.
// The constructor now takes two (required) arguments
class Person(val firstName: String, val lastName: String)

val someone = Person("John", "Doe")
```

Below is a more complex example:

```kotlin
// Defining a cless, its constructor, properties and member functions
class Person(
    val firstName: String,
    val lastName: String,
    val age: Int,
    // This property will have a default value
    // so we don't need to pass the constructor argument.
    val hobbies: List<String> = listOf()
) {
    
    // The property fullName
    // is set from the two other properties
    // firstName and lastName.
    // It's a "val", so it cannot be changed later.
    val fullName = "$firstName $lastName"

    fun getIntroduction(): String {
        return "Hi there, I'm ${fullName} - nice to meet you"
    }
}

// Creating a new object from this class
val person: Person = Person("John", "Doe", 40)

// Accessing properties
println(person.fullName)
println(person.hobbies)

// Calling member functions
println(person.getIntroduction())
```

### How to create a new class file?

Go into `src/main/kotlin` in the file tree. Right-click on the `kotlin` directory and select `New -> Kotlin Class`

## Data classes

Sometimes we need to create a class just to hold some data, but without any logic inside it. We can use [Data classes](https://kotlinlang.org/docs/data-classes.html) for this:

```kotlin
data class User(val email: String, val name: String) {
    // Empty
}

val user = User("kat@myemail.org", "Kat")
val otherUser = User("james@myemail.org", "James")
```

## Packages and project organisation

The best practice is often to put each file in its own file. For example, classes `DiaryEntry` and `Diary` would go in files named `DiaryEntry.kt` and `Diary.kt`.

Optionally, [a file can be set in a "package" by writing the package name](https://kotlinlang.org/docs/packages.html) at the top of its file:

```kotlin
// file: DiaryEntry.kt
package com.makers.diary

data class DiaryEntry(val name: String)
```

```kotlin
// file: Diary.kt
package com.makers.diary

class Diary(val entries: List<DiaryEntry>) {
    // ...
}
```

When using packages, a few rules to follow:
 * Write one class in its own file.
 * The directory structure follow the package naming, except for the "root" package.
 
For example, a file with package `com.makers.diary` will be at the root directory `src/main/kotlin`. A file with package `com.makers.diary.models` will be in the directory `src/main/kotlin/models`, and so on.

## Exercise

Write two classes `Item` and `ShoppingCart` (in their separate files) so the following code works:

```kotlin
val item = Item("Mars", 4.99)

item.getName() // 'Mars'
item.getPrice() // 4.99

val cart = ShoppingCart()
cart.getTotalPrice() // 0.0

cart.addItem(item)

cart.getTotalPrice() // 4.99

cart.addItem(Item("Skittle", 3.99))
cart.addItem(Item("Skittle", 3.99))

cart.getTotalPrice() // 12.97
```

## What to do next

Bookmark the following links — don't read them all right now, but they might be helpful as a reference for later.
 * [Classes reference on the Kotlin manual](https://kotlinlang.org/docs/classes.html)

Then go on to the next section.

[Next Challenge](08_writing_tests.md)

<!-- BEGIN GENERATED SECTION DO NOT EDIT -->

---

**How was this resource?**  
[😫](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=kotlin_bites%2F07_classes.md&prefill_Sentiment=😫) [😕](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=kotlin_bites%2F07_classes.md&prefill_Sentiment=😕) [😐](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=kotlin_bites%2F07_classes.md&prefill_Sentiment=😐) [🙂](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=kotlin_bites%2F07_classes.md&prefill_Sentiment=🙂) [😀](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=kotlin_bites%2F07_classes.md&prefill_Sentiment=😀)  
Click an emoji to tell us.

<!-- END GENERATED SECTION DO NOT EDIT -->
