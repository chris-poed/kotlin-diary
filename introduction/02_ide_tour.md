# A tour of the IntelliJ IDE

## Objective

Learn to use the IntelliJ to write and navigate Kotlin code.

## Installing the IDE

In this module, you'll learn to use an IDE (short for _Integrated Development Environment_) called IntelliJ. If you've used VS Code or Atom previously, it is similar, but offers a lot more features to help us being more productive while working with Kotlin code. 

[To install it, head to the downloads page of the IntelliJ website](https://www.jetbrains.com/idea/download). Make sure you download the "Community Edition", which is free.

## Starter program

We'll use the starter program provided in this repository, in `projects/diary`. To download it, clone this repository:

```bash
git clone git@github.com:makers-academy/kotlin-fundamentals

cd kotlin-fundamentals/projects/diary

# This will open the project in your MacOS finder
open .
```

You can now open the project in IntelliJ. It might take a few minutes for it to load before you can use the editor.

## Video

[A video tour of the IDE is available here]()

Otherwise, you can follow steps in the written guidance below.

## Running the program

You can use the file explorer on the left of the editor to browse the project file structure.

The program contains a file named `Main.kt` (in `src/main/kotlin`). Double click on this file in the project explorer to open it in the editor.

A small "play" button is next to the `main` function declaration. Click on it and select "Run 'MainKt'" to run the program.

You should then get an output similar to the one below in the bottom section of the editor:

```
[DiaryEntry(title=An entry, content=Hello, scheduledAt=Mon Apr 24 09:59:48 BST 2023)]

Process finished with exit code 0
```

If you have any problem running the code at this point, reach out to your coach.

### Exercise

The program uses the function `println` to print the list of diary entries.

Add another call to `println` in the `main` function to print a message of your choice, and run the program again to see the new message in the output logs.

> IDE tip :bulb: You can also use the keyboard shortcut `Control+R` to run the program.

## Running the tests

Use the file explorer to open the file `DiaryTest.kt` in the directory `src/test/kotlin`.

This file contains a Kotlin class (more on this later) which contains some tests. You can use the "play" button next to the first test (`testAddEntry`) to run it.

### Exercise

Run another test.

## Resolving problems

One benefit of using the IDE is that it can helps us resolve problems in the code and make it easier to maintain.

Head to the file `Diary.kt` in `src/main/kotlin`. A small yellow warning sign will be shown in the top-right corner of the editor. Click on it to show a description of the problems.

Click on the lightbulb :bulb: icon and the IDE will offer an option to automatically fix this warning. This will edit your code for you, so make sure you pay attention to what's being changed.

### Exercise

The file `Main.kt` contains another problem — find out what it is and fix it using the quick-fix suggested by the IDE.

## What is the "compiler"?

In this module, and more generally while working with Kotlin or researching online, you may see sentences such as:
 * "The compiler won't allow it"
 * "This will not compile"
 * "This will raise a compiler error"

...


<!-- BEGIN GENERATED SECTION DO NOT EDIT -->

---

**How was this resource?**  
[😫](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=introduction%2F02_ide_tour.md&prefill_Sentiment=😫) [😕](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=introduction%2F02_ide_tour.md&prefill_Sentiment=😕) [😐](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=introduction%2F02_ide_tour.md&prefill_Sentiment=😐) [🙂](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=introduction%2F02_ide_tour.md&prefill_Sentiment=🙂) [😀](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=introduction%2F02_ide_tour.md&prefill_Sentiment=😀)  
Click an emoji to tell us.

<!-- END GENERATED SECTION DO NOT EDIT -->
