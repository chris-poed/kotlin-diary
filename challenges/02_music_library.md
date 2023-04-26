# Music Library (Kotlin)

_**This is a Makers Wheel.** Wheels are designed to develop your skills
efficiently. They are organised around a central exercise, supported by a range
of resources including text, video, and external documentation. [Read more about
how to use Makers
Wheels.](https://github.com/makersacademy/course/blob/main/labels/wheels.md)_

In this exercise you will test-drive a Music library class in Kotlin

- [Exercise](#exercise)
- [Supporting Materials](#supporting-materials)
  - [Setting up a project](#setting-up-a-project)
  - [Test-driving a class](#test-driving-a-class)

## Exercise

_This is the exercise. You may or may not be able to do this yet. Use the
supporting materials below this exercise to help you._

### Step 1

Test-drive a Kotlin class with the following behaviour:

```kotlin
val library = MusicLibrary()

library.getTrack(0) // => null

library.addTrack('Voices - Elkka')
library.addTrack('Wild - The Japanese House')

library.getTrack(0) // => 'Voices - Elkka'
library.getTrack(1) // => 'Wild - The Japanese House'

library.getTracks() // => ('Voices - Elkka', 'Wild - The Japanese House')

```

### Step 2


Implement a new Kotlin [data class](../kotlin_bites/07_classes.md#data-classes) `Track` with the following properties:

```kotlin
val track = Track(
    title: "All I know",
    artist: "Washed Out",
    duration: 230
)
```

Test-drive and implement, updating one test at a time, the following changes to the `MusicLibrary` class:

```kotlin
val library = MusicLibrary()

library.getTrack(0) // => null

val track = Track(
    title: "All I know",
    artist: "Washed Out",
    duration: 230
)

library.addTrack(track)

library.getTrack(0) // => track object
```

### Organising your classes

Remember that each class should be in its own file. For example, a class `Reminder` would be in a file `Reminder.kt`, etc.

## Supporting Materials

### Setting up a project

[Follow this guidance](../kotlin_bites/01_first_program.md)

### Test-driving a class

[Follow this guidance on how to write classes (and data classes)](../kotlin_bites/07_classes.md)

If you'd like to use a design recipe to test-drive this class, [here's a Single-class Design recipe template adapted for Kotlin.](../resources/single_class_design_recipe.md)


[Next Challenge](03_bank.md)

<!-- BEGIN GENERATED SECTION DO NOT EDIT -->

---

**How was this resource?**  
[😫](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=challenges%2F02_music_library.md&prefill_Sentiment=😫) [😕](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=challenges%2F02_music_library.md&prefill_Sentiment=😕) [😐](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=challenges%2F02_music_library.md&prefill_Sentiment=😐) [🙂](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=challenges%2F02_music_library.md&prefill_Sentiment=🙂) [😀](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=challenges%2F02_music_library.md&prefill_Sentiment=😀)  
Click an emoji to tell us.

<!-- END GENERATED SECTION DO NOT EDIT -->
