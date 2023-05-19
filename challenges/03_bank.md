# Bank (Kotlin)

_**This is a Makers Wheel.** Wheels are designed to develop your skills
efficiently. They are organised around a central exercise, supported by a range
of resources including text, video, and external documentation. [Read more about
how to use Makers
Wheels.](https://github.com/makersacademy/course/blob/main/labels/wheels.md)_

In this exercise you'll test-drive Bank in using a paradigm called Functional programming.

- [Exercise](#exercise)
- [Supporting Materials](#supporting-materials)
    - [On functional programming](#on-functional-programming)
    - [Where to write my functions?](#where-to-put-functions)
    - [What is a "pure" function?](#what-is-a-pure-function)
    - [I'm not sure where to start](#im-not-sure-where-to-start)
    - [Exercises on Functional programming]()

## Exercise

_This is the exercise. You may or may not be able to do this yet. Use the
supporting materials below this exercise to help you._

Your task is to write an application that a user can call to make bank
transactions and then print a bank statement to the terminal.

Here are the requirements:

* Implement deposits and withdrawals
* Implement an account statement that prints a heading row, and the date, amount
  and balance of each transaction, most recent first.
* You don't need to implement a command-line or user interface, test-driving
  and calling it in your main method.
* Data can be kept in memory, doesn't need to be in a database.

Below is an example of how your code should be called, and what it should
output.

```kotlin
// file: src/main/kotlin/tech/makers/bank/Main.kt

// Note the package:
package tech.makers.bank

import java.time.LocalDate

fun main() {
    // Returns a list of Transaction objects
    // (you will need to implement this data class too).
    val transactions = createTransactionList()

    // Given a client makes a deposit of 1000 on 2021-01-10
    val transactions2 = addTransaction(
        transactions,
        createDepositOf(1000, LocalDate.of(2021, 1, 10))
    )
    
    // And a deposit of 2000 on 2021-01-13
    val transactions3 = addTransaction(
        transactions,
        createDepositOf(2000, LocalDate.of(2021, 1, 13))
    )

    // And a withdrawal of 500 on 2021-01-14
    val transactions4 = addTransaction(
        transactions,
        createWithdrawalOf(500, LocalDate.of(2021, 1, 14))
    )

    // When she prints her bank statement
    println(generateStatement(transactions4))
}
```

Then she would see:

```
date || credit || debit || balance
14/01/2021 || - || 500.00 || 2500.00
13/01/2021 || 2000.00 || - || 3000.00
10/01/2021 || 1000.00 || - || 1000.00
```

Building this challenge using [the Functional programming paradigm](#on-functional-programming) means that:
 * Your code should be defined in functions instead of classes (except for test classes).
 * You cannot use `var` to declare variables which can be reassigned.
 * Functions such as `createDepositOf` cannot mutate (change) the list of transactions they get in argument. They should return a freshly created, new list of transactions instead.
 * Functions need to be "pure" — for the same arguments, they should return the exact same result. **This means they cannot access data from outside. They should only use arguments to do their work.**

### Alternative solution

The code above is a bit annoying because we constantly have to reassign a new value for `transactions`. But remember that this is a key thing when writing functional code: we cannot reassign existing values, only create new ones. 

Below is a slightly more concise version of the final code. This one uses a new function `addTransactions`, which takes a list and registers all the transactions at once. Try to test-drive this new function when you're done with the first version of the exercise.

```kotlin
fun main() {
    val transactions = createTransactionList()

    val finalTransactions = addTransactions(
        transactions,
        listOf(
          createDepositOf(1000, LocalDate.of(2021, 1, 10)),
          createDepositOf(2000, LocalDate.of(2021, 1, 13)),
          createWithdrawalOf(500, LocalDate.of(2021, 1, 14))
        )
    )

    // When she prints her bank statement
    println(generateStatement(finalTransactions))
}
```

## Supporting Materials

### On Functional Programming

Functional programming is different from Object-oriented programming in a number of ways, but the main thing to have in mind is that you should avoid side-effects. This means that, ideally:
 * Functions should not rely on external state to do their work - only their arguments. They also shouldn't modify state outside.
 * You shouldn't reassign data to existing variables. Create new values instead. Prefer `val` to `var`.
 * Use `map`, `filter` and similar functions to iterate over lists and return new values, instead of `for`, `while` and similar.

Still, ideally — because a program having zero side effect would be a useless program (it wouldn't access databases, services, APIs, etc). The goal, when having a functional approach, is to try to keep the area of the code having side effects as minimal as possible — and the rest of the codebase as functional as possible.

```kotlin
// This is an unfunctional function:
var a = 0
fun increment(): Unit {
    a += 1
}

// This is a functional one:
fun increment2(a: Int): Int {
    return a + 1
}
```

Kotlin is a multi-paradigm language, which means it allows for a mix of Functional programming and Object-oriented programming, often in the same codebase — so there is no need to "pick a side" and stick to it. But the challenge of the exercise above is to aim to do most of the code in a functional way, instead of using classes and properties like you would do using OOP.

Below is an example of a class using a mixture of object-oriented code and more functional code:

```kotlin
data class Task(val name: String, val done: Boolean)

class Reminder() {
    private var tasks = arrayListOf<Task>()

    // The function `remindMe` is not pure,
    // as calling it has a side effect: it modifies
    // the state of the object by adding a new task.
    fun remindMe(newTask: Task) {
        tasks.add(newTask)
    }

    // The function `getAllPending` is pure
    // and returns the same thing even when 
    // called a hundred times, as long as the 
    // list of tasks doesn't change. 
    // It also uses `filter` instead of using 
    // additional variables to filter through tasks.
    fun getAllPending() = tasks.filter { !it.done }

    // The function `markAllDone` is not pure
    // as it changes the state of the tasks
    // by reassigning the property `tasks`.
    fun markAllDone() {

        // However this approach is more
        // functional, we are using `map`
        // to build  a new list of tasks
        // from the previous list of tasks.
        val newTasks = tasks.map {
            Task(it.name, true)
        }

        tasks = ArrayList<Task>(newTasks)
    }
}
```

### Where to put functions?

Kotlin functions can be defined outside of classes, so there's no need to create classes at all (except for test classes). You can start by creating functions in the main file `Main.kt`, before moving them into different files when the program gets more complex.

### What is a "pure" function?

```kotlin
// This function is not pure - it does
// change some state, calling it multiple
// times will have different results.
var a = 0
fun increment(): Unit {
    a += 1
}

// This function is pure
// If we send the same number to it,
// it will always return the same result.
fun increment2(a: Int): Int {
    return a + 1
}
```

### I'm not sure where to start...

Start by creating a test class containing a simple test case - for an empty list of transactions, we should get an "empty" statement (only the columns headers):

```kotlin
// file: src/test/kotlin/BankTest.kt

import kotlin.test.Test

class BankTest {

    @Test
    fun addDepositToTransactionList() {
        val transactions = createTransactionList()

        val expectedStatement = "date || credit || debit || balance"

        assert(generateStatement(finalTransactions) == expectedStatement)
    }
}
```

Start by test-driving the two functions `createTransactionList` and `generateStatement` from this test. These functions can be put together in the main file `Main.kt` for now.

Then, gradually add more tests to test-drive the remaining functions used to add new transactions to the list.

### Exercises on Functional programming

Update these Kotlin programs so they have a more functional approach. Make sure the code still works and behaves the same as before your changes.

#### 1

```kotlin

fun addNumbersUpTo(max: Int): Int {
    var sum = 0

    (1..max).forEach {
        sum += it
    }

    return sum
}

// Will print 55
println(addNumbersUpTo(10))
```

#### 2

```kotlin
fun invitationMessage(friends: List<String>): String {
    var message = "Hello "

    friends.forEach {
        message = message.plus(it).plus(", ")
    }

    message = message.plus("you are invited to my birthday party!")

    return message
}

// Will print "Hello Ana, Jo, Kat, you are invited to my birthday party!"
println(invitationMessage(listOf("Ana", "Jo", "Kat")))
```


[Next Challenge](04_word_guessing_game.md)

<!-- BEGIN GENERATED SECTION DO NOT EDIT -->

---

**How was this resource?**  
[😫](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=challenges%2F03_bank.md&prefill_Sentiment=😫) [😕](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=challenges%2F03_bank.md&prefill_Sentiment=😕) [😐](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=challenges%2F03_bank.md&prefill_Sentiment=😐) [🙂](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=challenges%2F03_bank.md&prefill_Sentiment=🙂) [😀](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=challenges%2F03_bank.md&prefill_Sentiment=😀)  
Click an emoji to tell us.

<!-- END GENERATED SECTION DO NOT EDIT -->
