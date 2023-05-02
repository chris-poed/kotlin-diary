# Classes

_**This is a Makers Bite.** Bites are designed to train specific skills or
tools. They contain an intro, a demonstration video, some exercises with an
example solution video, and a challenge without a solution video for you to test
your learning. [Read more about how to use Makers
Bites.](https://github.com/makersacademy/course/blob/main/labels/bites.md)_

## Objective

Learn to write classes in Kotlin.

## Classes

If you've learned to use classes in other languages, their behaviour is similar here.

In Kotlin, since everything is an object, creating a new class means we are creating a new type.

```kotlin
class Person(firstName: String, lastName: String, age: Int) {
    
    val fullName = "$firstName $lastName"

    fun getIntroduction(): String {
        return "Hi there, I'm ${fullName} - nice to meet you"
    }
}

// Creating an instance of the class
val person: Person = Person("John", "Doe", 40)

println(person.fullName)
println(person.getIntroduction())
```

### How to create a new class file?

Go into `src/main/kotlin` in the file tree. Right-click on the `kotlin` directory and select `New -> Kotlin Class`

## Data classes

Sometimes we need to crate a class just to hold some data, but without any logic inside it. We can use [Data classes](https://kotlinlang.org/docs/data-classes.html) for this:

```kotlin
data class User(val email: String, val name: String) {
    // Empty
}

val user = User("kat@myemail.org", "Kat")
val otherUser = User("james@myemail.org", "James")
```

## Packages and project organisation

Optionally, [a file can be set in a "package" by writing the package name](https://kotlinlang.org/docs/packages.html) at the top of its file:

```kotlin
// file: Diary.kt
package com.makers.diary

// ...
```

When using packages, a few rules to follow:
 * Write one class in its own file.
 * The directory structure follow the package, except for the "root" package.
 
For example, a file with package `com.makers.diary` will be at the root directory `src/main/kotlin`. A file with package `com.makers.diary.models` will be in the directory `src/main/kotlin/models`, and so on.

## Exercise

Write two classes `Item` and `ShoppingCart` (in their separate files) so the following code works:

```kotlin
val item = Item('Mars', 4.99)

item.getName() // 'Mars'
item.getPrice() // 4.99

val cart = ShoppingCart()
cart.getTotalPrice() // 0

cart.addItem(item)

cart.getTotalPrice() // 4.99

cart.addItem(Item('Skittle', 3.99))
cart.addItem(Item('Skittle', 3.99))

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
