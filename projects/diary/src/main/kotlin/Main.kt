package com.makers.diary

import java.util.*

fun main() {
    val diary = Diary()
    val entry = DiaryEntry("An entry", "Hello", Date())

    diary.addEntry(entry)

    println("Diary entries below:")
    println(diary.getAllEntries())
    println("This is my own message")
}