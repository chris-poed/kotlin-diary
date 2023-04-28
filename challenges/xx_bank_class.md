# Bank (Kotlin)

_**This is a Makers Wheel.** Wheels are designed to develop your skills
efficiently. They are organised around a central exercise, supported by a range
of resources including text, video, and external documentation. [Read more about
how to use Makers
Wheels.](https://github.com/makersacademy/course/blob/main/labels/wheels.md)_

In this exercise you'll test-drive Bank. Where Fizzbuzz introduced you to the
rudimentary conditions and loops of the language, Bank introduces you to
way modules of code are organised in a language.

- [Exercise](#exercise)
- [Supporting Materials](#supporting-materials)
  - [Kotlin's Paradigm](#kotlins-paradigm)
  - [Kotlin Classes](#kotlin-classes)
  - [Kotlin Lists & Generics](#kotlin-lists--generics)

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
    val bankAccount = BankAccount()

    // Given a client makes a deposit of 1000 on 2021-01-10
    bankAccount.deposit(1000, LocalDate.of(2021, 1, 10))

    // And a deposit of 2000 on 2021-01-13
    bankAccount.deposit(2000, LocalDate.of(2021, 1, 13))

    // And a withdrawal of 500 on 2021-01-14
    bankAccount.withdraw(500, LocalDate.of(2021, 1, 14))

    // When she prints her bank statement
    println(bankAccount.generateStatement())
}
```

Then she would see:

```
date || credit || debit || balance
14/01/2021 || - || 500.00 || 2500.00
13/01/2021 || 2000.00 || - || 3000.00
10/01/2021 || 1000.00 || - || 1000.00
```

## Supporting Materials

### Kotlin's paradigm

Kotlin is a statically typed. It means you are responsible for telling the compiler what type all of the variables are.

Here's an example of a secret diary program. Take a careful read of it to
understand what it is doing and compare it to languages you know.

```java
// For: src/main/java/tech/makers/diary/Diary.java

// You'll see the above in IntelliJ as src/main/java/tech.makers.bank/Diary
// The `tech.makers.bank` is called a package, it separates your code from
// the code of other libraries, and it's best practice to use one.
// It's also specified in the code:
package tech.makers.diary;

public class Diary {

//  Below is an instance variable.
    private String contents;
//          ^^^^^^-- We have to explicitly define the type of the variable.

//  In Java, you define the constructor as a method with the same name as
//  the class. It will be called automatically when `new Diary()` is called.
    public Diary(String contents) {
        this.contents = contents;
//      ^^^^^-- We use `this.` to write to instance variables if there's
//              a local variable or parameter of the same name.
    }

//  vvvvvv-- Here we define that this is a public method, a method that can be
//           called from outside the class.
    public String read() {
//         ^^^^^^ We have to define the return value of every method. And then
//                we absolutely have to return an object of that type!
        return contents;
    }
}
```

```java
// For: src/main/java/tech/makers/diary/SecretDiary.java
package tech.makers.diary;

public class SecretDiary {
    private Diary diary;
    private Boolean locked;

    public SecretDiary(Diary diary) {
        this.diary = diary;
        locked = true;
    }

    public void unlock() {
//         ^^^^-- A `void` return type means 'I won't return anything'.
        locked = false;
    }

    public void lock() {
        locked = true;
    }

    public String read() {
        if (locked) {
            return "Go away!";
        } else {
            return diary.read();
//                           ^^^^^^^-- Here we call the `read` method on `Diary`
        }
    }
}
```

```java
// For: src/main/java/tech/makers/diary/Main.java
package tech.makers.diary;

public class Main {
    public static void main(String[] args) {
        Diary diary = new Diary("Eric Cantona is the best footballer!");
        SecretDiary secretDiary = new SecretDiary(diary);

        System.out.println(secretDiary.read());
        // Prints: "Go away!"

        secretDiary.unlock();
        System.out.println(secretDiary.read());
        // Prints: "Eric Cantona is the best footballer!"
    }
}
```


### Kotlin Classes

Take a look at the official Kotlin documentation for [Kotlin Classes](https://kotlinlang.org/docs/classes.html).

### Kotlin Lists & Generics

Lists in Kotlin are fundamentally similar to other languages. However, in a
statically typed language we need to do a bit more work.

Here's a simple example of a list:

```kotlin
fun main() {
    val list = arrayListOf("Hello")
    list.add("world")

    println(list.get(0))
    // Prints out "Hello"
    println(list.get(1))
    // Prints out "world"
}
```

Here's another example:

```kotlin

fun main() {
    val list = listOf(1, 2)

    println(list.get(0)) // Prints out 1
}

```

But if you try to add an item to that list...

```kotlin
fun main() {
    val list = listOf(1, 2)
    list.add(3)

    println(list.get(0))
}
```

You'll get an error! Why? 

There are many different kinds of lists in Kotlin. They are efficient at different
tasks, and they can do different sorts of things. `ArrayList`s (created with `arrayListOf`) are **mutable** —
that means you can change them after creation. Lists (of type `List`) produced by `listOf` are
**immutable** — that means you can't change them after creation.

That's useful if you want to make sure nothing ever changes your list. But for
most of our purposes we'll need mutable data structures, and so most of the time
you should be using `ArrayList`.


<!-- BEGIN GENERATED SECTION DO NOT EDIT -->

---

**How was this resource?**  
[😫](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=challenges%2Fxx_bank_class.md&prefill_Sentiment=😫) [😕](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=challenges%2Fxx_bank_class.md&prefill_Sentiment=😕) [😐](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=challenges%2Fxx_bank_class.md&prefill_Sentiment=😐) [🙂](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=challenges%2Fxx_bank_class.md&prefill_Sentiment=🙂) [😀](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=challenges%2Fxx_bank_class.md&prefill_Sentiment=😀)  
Click an emoji to tell us.

<!-- END GENERATED SECTION DO NOT EDIT -->
