# Writing tests

_**This is a Makers Bite.** Bites are designed to train specific skills or
tools. They contain an intro, a demonstration video, some exercises with an
example solution video, and a challenge without a solution video for you to test
your learning. [Read more about how to use Makers
Bites.](https://github.com/makersacademy/course/blob/main/labels/bites.md)_

## Objective

Learn to write unit tests in Kotlin.

## Test classes

In Kotlin, tests are written inside test classes. They are regular Kotlin classes, with two main differences:
 * they are created inside the `tests` folder
 * their methods are tagged with the special annotation `@Test`

Here is an example:

```kotlin
// file: GreeterTest.kt
import kotlin.test.Test

class GreeterTest {
    @Test fun testGreetsWithName() {
        val greeter = Greeter()

        assert(greeter.greet("Leo") == "Hi Leo!")
        assert(greeter.greet("Mary") == "Hi Mary!")
    }
}
```

```kotlin
// file: Greeter.kt

class Greeter {
    fun greet(name: String) = "Hi $name!"
}
```

## Running tests

## Exercise

Write some tests for the following class

```kotlin
class PhoneChecker {
    fun isPhoneValid(phone: String): Boolean {
        val regex = """^\s*(?:\+?(\d{1,3}))?[-. (]*(\d{3})[-. )]*(\d{3})[-. ]*(\d{4})(?: *x(\d+))?\s*$""".toRegex()
        return regex.matches(phone)
    }
}
```

## Exercise

Test-drive a class with the following behaviour

@TODO

[Next Challenge](09_using_gradle.md)

<!-- BEGIN GENERATED SECTION DO NOT EDIT -->

---

**How was this resource?**  
[😫](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=kotlin_bites%2F08_writing_tests.md&prefill_Sentiment=😫) [😕](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=kotlin_bites%2F08_writing_tests.md&prefill_Sentiment=😕) [😐](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=kotlin_bites%2F08_writing_tests.md&prefill_Sentiment=😐) [🙂](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=kotlin_bites%2F08_writing_tests.md&prefill_Sentiment=🙂) [😀](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=kotlin_bites%2F08_writing_tests.md&prefill_Sentiment=😀)  
Click an emoji to tell us.

<!-- END GENERATED SECTION DO NOT EDIT -->
