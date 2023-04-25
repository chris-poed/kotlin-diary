# Step 3 - Adding the Track class

## Challenge

Implement a new Kotlin data class `Track` with the following signature:

```kotlin
val track = Track(
    title: "All I know",
    artist: "Washed Out",
    duration: 230
)
```

Test-drive, one test at a time, the following changes to the `MusicLibrary` class:

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



### Do I need to modify the tests for `MusicLibrary`?

[Next Challenge](04_word_guessing_game.md)

<!-- BEGIN GENERATED SECTION DO NOT EDIT -->

---

**How was this resource?**  
[😫](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=challenges%2F03_adding_track_class.md&prefill_Sentiment=😫) [😕](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=challenges%2F03_adding_track_class.md&prefill_Sentiment=😕) [😐](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=challenges%2F03_adding_track_class.md&prefill_Sentiment=😐) [🙂](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=challenges%2F03_adding_track_class.md&prefill_Sentiment=🙂) [😀](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=challenges%2F03_adding_track_class.md&prefill_Sentiment=😀)  
Click an emoji to tell us.

<!-- END GENERATED SECTION DO NOT EDIT -->
