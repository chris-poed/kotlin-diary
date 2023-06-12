package com.makers.diary

import java.util.*

fun main(args: Array<String>) {
    val diary = Diary()
    val entry = DiaryEntry("An entry", "Hello", Date())

    diary.addEntry(entry)

    println("Diary entries below:")
    println(diary.getAllEntries())
}