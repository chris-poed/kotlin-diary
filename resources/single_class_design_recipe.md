# {{PROBLEM}} Class Design Recipe (Kotlin)

## 1. Describe the Problem

_Put or write the user story here. Add any clarifying notes you might have._

## 2. Design the Class Interface

_Include the constructor and public methods with all arguments and return values (and their types)._

```kotlin
// EXAMPLE

class Reminder(name: String) {

  fun remindMeTo(task: String): Unit {
    // No return value
  }

  fun remind(): String? {
    // Returns null if no task is set
    // Otherwise, returns a String reminding the user to do the task
  }
}
```

## 3. Create Examples as Tests

_Make a list of examples of how the class will behave in different situations._

```kotlin
// EXAMPLE

// 1
reminder = Reminder("Kay")
reminder.remindMeTo("Walk the dog")
reminder.remind() // => "Walk the dog, Kay!"

// 2
reminder = Reminder("Kay")
reminder.remind() // fails with "No task set."

// 3
reminder = Reminder("Kay")
reminder.remindMeTo("")
reminder.remind() // => ", Kay!"
```

_Encode each example as a test. You can add to the above list as you go._

## 4. Implement the Behaviour

_After each test you write, follow the test-driving process of red, green, refactor to implement the behaviour._


<!-- BEGIN GENERATED SECTION DO NOT EDIT -->

---

**How was this resource?**  
[😫](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=resources%2Fsingle_class_design_recipe.md&prefill_Sentiment=😫) [😕](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=resources%2Fsingle_class_design_recipe.md&prefill_Sentiment=😕) [😐](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=resources%2Fsingle_class_design_recipe.md&prefill_Sentiment=😐) [🙂](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=resources%2Fsingle_class_design_recipe.md&prefill_Sentiment=🙂) [😀](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=resources%2Fsingle_class_design_recipe.md&prefill_Sentiment=😀)  
Click an emoji to tell us.

<!-- END GENERATED SECTION DO NOT EDIT -->
