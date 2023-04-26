# Types

_**This is a Makers Bite.** Bites are designed to train specific skills or
tools. They contain an intro, a demonstration video, some exercises with an
example solution video, and a challenge without a solution video for you to test
your learning. [Read more about how to use Makers
Bites.](https://github.com/makersacademy/course/blob/main/labels/bites.md)_

## Objective

Learn to explain and use data types in Kotlin.

## Video

[A video walkthrough of this section is available here.](https://www.youtube.com/watch?v=yjLo4_gBtn4)

## On Types

As you may already know, a program can manipulate different kind of values:
 * numbers (like `42` or `5.25`)
 * booleans (true or false)
 * strings (like `"Kotlin"`)
 * list of values (arrays, maps, etc)
 * etc.

If you've used a language such as Ruby or Python before, you might have not had to worry much about these. In Kotlin, though, types are an important element of the language, so it's worth spending some time learning about it.

You can try out by yourself most of the code examples below to check results.

## Declaring values

We can declare values with the keyword `val` as shown below.

```kotlin
// Declaring a variable of type String
val personName: String = "Anna"

// We can omit the type if the compiler
// is able to "guess" it from the value on the 
// right side of the = sign.
val otherName = "Sandy"

val a = 20

val isOverdue = true
```

When using the keyword `val`, a value cannot be modified later. If you really need it, you can use `var` instead.
```kotlin
// When declared with the keyword `val`,
// a variable cannot be updated later.
val text = "Some text"
text = "This is different" // won't work.

// Declare a variable with `var` to
// update it later (avoid this whenever possible).
var mutableText = "This text can be changed"
mutableText = "..."
```

You should use aim to `val` to declare immutable values most of the time. Why?

In short, using variables which can be reassigned can lead to all sort of bugs. Dealing with values which cannot be modified help make our code easier to read, and less error-prone.

## Member functions (methods) and properties

In Kotlin, almost everything is an object, which means you can call methods (also called "member functions" in Kotlin) on them. Properties can also be used.

```kotlin
val name = "Ollie"

// A property
println(name.length) // 5

// Calling member functions (methods)
println(name.uppercase()) // "OLLIE"

println(name.reversed()) // "eillO"
```

> IDE tip :bulb: When starting to type `name.`, the editor will display a list of possible properties and methods. This is helpful when you're not sure what is the exact property of method name you need to use, and want to browse a list of few different options.

## Nullable types

In Kotlin, `null` is a special value which represents... the absence of value (nothing) — in other languages, it might be called `nil` or `None`.

In other languages, doing something like this would probably be OK:

```kotlin
// Declaring a String and assign null to it.
val name: String = null
```

However, in Kotlin, this won't work, and will likely give you an error like this one:

> 
> Null can not be a value of a non-null type String
> 

A value which can hold `null` needs to have a special type, called a nullable type. Almost every type has its nullable counterpart. For example, `String` becomes `String?`, `Int` becomes `Int?`, and so on. 

Therefore, with a small change, the following would work:

```kotlin
// The type is now String?
val name: String? = null
```

> IDE tip :bulb: The IDE will usually give a warning when you forget to check for `null`, and will offer some suggestions on how to fix it.

## Generic types

In Kotlin, some types are "generic" — for example, the type `List` can contain different types of elements:
  * a list of integers (`Int`)
  * a list of strings (`String`)
  * a list of lists! etc.

We use the special type `List<TYPE>` to denote a list containing the type `TYPE`. Here are some examples:

```kotlin
val numbers: List<Number> = listOf(1, 3, 5)

val names: List<String> = listOf("Kat", "Marc", "Sophie")

// We can also use it alongside the "nullable" types
// Here, a list of strings, potentially containing
// null elements.
val otherNames: List<String?> = listOf("Kat", "Marc", null)
```

## Exercises

_These exercises are marked with :hot_pepper: emojis to denote how challenging
they are. A single chilli :hot_pepper: is the most straightforward, and five
:hot_pepper::hot_pepper::hot_pepper::hot_pepper::hot_pepper: would be
challenging even for a professional engineer. Pick whichever you prefer._

You can work through the following exercises in the same function `main` of the previous program, or in a new project. You might want to use the function `println` to check your results.

* :hot_pepper: Define a String `message` and assign the reversed version of it to a new value.
* :hot_pepper: The following code doesn't work - why? Modify it so it runs.
```kotlin
val aNumber = 2
aNumber = 4
```
* :hot_pepper: The following code doesn't work - why? Modify it so it runs.
```kotlin
val numbers: List<Number> = listOf(3, 4, null)
```
* :hot_pepper::hot_pepper: The following code doesn't work - why? Modify it so it runs.
```kotlin
val otherNames: List<String?> = listOf("Kat", "Marc", null)

// Loop on each name in the list
for (name in otherNames) {
    // Print the length
    println(otherNames.length)
}
```
* :hot_pepper::hot_pepper: The following code doesn't work - why? How would you fix it?
```kotlin
val number = "3" as Number
```
* :hot_pepper::hot_pepper: This might require a bit of research from you. How to fix the following code so we can create a list of both strings and numbers?
```kotlin
val listOfThings: List<Int> = listOf(3, "Hello", 4)
```

[Watch an explanation of these problems and their solutions in this video](https://www.youtube.com/watch?v=yjLo4_gBtn4&t=1637s)

## What do to next

Bookmark the following links — don't read them all know, but they might be helpful as a reference for later.
 * [Types reference on the Kotlin manual](https://kotlinlang.org/docs/basic-types.html)
 * [Kotlin cheatsheet](https://devhints.io/kotlin)

Then go on to the next section.

[Next Challenge](03_functions.md)

<!-- BEGIN GENERATED SECTION DO NOT EDIT -->

---

**How was this resource?**  
[😫](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=kotlin_bites%2F02_types.md&prefill_Sentiment=😫) [😕](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=kotlin_bites%2F02_types.md&prefill_Sentiment=😕) [😐](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=kotlin_bites%2F02_types.md&prefill_Sentiment=😐) [🙂](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=kotlin_bites%2F02_types.md&prefill_Sentiment=🙂) [😀](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=kotlin_bites%2F02_types.md&prefill_Sentiment=😀)  
Click an emoji to tell us.

<!-- END GENERATED SECTION DO NOT EDIT -->
