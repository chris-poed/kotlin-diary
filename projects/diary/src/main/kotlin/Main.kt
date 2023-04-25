package com.makers.diary

import java.util.*

fun main(args: Array<String>) {
    val diary = Diary()
    val entry = DiaryEntry("An entry", "Hello", Date())

    diary.addEntry(entry)

    println("Diary entries below:")
    println(diary.getAllEntries())

    val info = mapOf(
        "name" to "John Doe",
        "email" to "contact@mywebsite.com",
        "postcode" to "EC1 AAA",
        "phones" to listOf("0700000000", "071000000")
    )

    info.forEach { t, value ->  println(value) }

    fun calculate(a: Int, b: Int, calculateFunction: (Int, Int) -> Int): Int {
        return calculateFunction(a, b)
    }

    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun multiply(a: Int, b: Int): Int {
        return a * b
    }

    println(calculate(2, 3, ::add)) // 2 + 3 = 5
}