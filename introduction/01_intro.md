# Welcome to Kotlin

You're about to learn the Kotlin programming language — that's exciting! Although being quite a young language (its first version was released in 2011), Kotlin is today very popular to write different types of applications — from web servers to Android mobile apps.

The creators of the language also spent a great deal of time designing it to make it efficient, concise and enjoyable to use for its developers.

## What is the JVM?

You might read online that Kotlin works with the JVM (Java virtual machine) language, or that it integrates with Java. We won't get too much into it in this module, but it means that Kotlin benefits from the platform and the vast ecosystem built around the Java language in the last decades.

It's a bit like getting the best of both worlds — the ecosystem has been around for a while and is robust, and the language is a modern one, so benefits from years of shared learning in the software engineering community.

## Install a Java Development Kit

Because Kotlin relies heavily on the Java environment, you will need to install a Java Development Kit (JDK). It contains a bunch of tools that you need for running Kotlin code on your machine. The only thing to be aware of here is the version that you're downloading - right now, version 17 is the best choice even though there are more recent versions.

Luckily, you can install version 17 using homebrew:

```shell
; brew install openjdk@17
```

You'll need to run the command suggested by Homebrew after this:

```shell
sudo ln -sfn /opt/homebrew/opt/openjdk@17/libexec/openjdk.jdk /Library/Java/JavaVirtualMachines/openjdk-17.jdk
```

Then, do this to verify that everything worked

```shell
; java --version
```

And you should see output a bit like this

```shell
openjdk 17.0.5 2022-10-18
OpenJDK Runtime Environment Temurin-17.0.5+8 (build 17.0.5+8)
OpenJDK 64-Bit Server VM Temurin-17.0.5+8 (build 17.0.5+8, mixed mode)
```

>  the most important thing is that you have a version which starts with `17`. Other details might be different and that's fine.

## Ready?

In the next section, you'll open your first Kotlin project, and will start to get familiar with the editor you will use in this module: IntelliJ.

[Next Challenge](02_ide_tour.md)

<!-- BEGIN GENERATED SECTION DO NOT EDIT -->

---

**How was this resource?**  
[😫](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=introduction%2F01_intro.md&prefill_Sentiment=😫) [😕](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=introduction%2F01_intro.md&prefill_Sentiment=😕) [😐](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=introduction%2F01_intro.md&prefill_Sentiment=😐) [🙂](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=introduction%2F01_intro.md&prefill_Sentiment=🙂) [😀](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fkotlin-fundamentals&prefill_File=introduction%2F01_intro.md&prefill_Sentiment=😀)  
Click an emoji to tell us.

<!-- END GENERATED SECTION DO NOT EDIT -->
