# {{PROBLEM}} Function Design Recipe

Copy this into a `recipe.md` in your project and fill it out.

## 1. Describe the problem

_Put or write the user story here. Add any clarifying notes you might have._

## 2. Design the function signature

_Include the name of the function, its arguments and  return value (and their types), and any side effects._

```kotlin
// EXAMPLE

// `extractUpper` extracts uppercase words from a string
//  The argument mixedWords is a String (e.g. "hello WORLD")
//  it returns a List of Strings (List<String>) (e.g. ["WORLD"])

// The function doesn't print anything or have any other side-effects

fun extractUpper(mixedWords: String): List<String>
```

## 3. Create Examples as Tests

_Make a list of examples of what the method will take and return._

```kotlin
// EXAMPLE

extractUppercase("hello WORLD") => ["WORLD"]
extractUppercase("HELLO WORLD") => ["HELLO", "WORLD"]
extractUppercase("hello world") => []
extractUppercase("hello WoRLD") => []
extractUppercase("hello WORLD!") => ["WORLD"]
extractUppercase("") => []
extractUppercase(null) => throws an Exception
```

_Encode each example as a test. You can add to the above list as you go._

## 4. Implement the Behaviour

_After each test you write, follow the test-driving process of red, green, refactor to implement the behaviour._


<!-- BEGIN GENERATED SECTION DO NOT EDIT -->

---

**How was this resource?**  
[😫](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=resources%2Fsingle_function_design_recipe.md&prefill_Sentiment=😫) [😕](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=resources%2Fsingle_function_design_recipe.md&prefill_Sentiment=😕) [😐](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=resources%2Fsingle_function_design_recipe.md&prefill_Sentiment=😐) [🙂](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=resources%2Fsingle_function_design_recipe.md&prefill_Sentiment=🙂) [😀](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=resources%2Fsingle_function_design_recipe.md&prefill_Sentiment=😀)  
Click an emoji to tell us.

<!-- END GENERATED SECTION DO NOT EDIT -->
