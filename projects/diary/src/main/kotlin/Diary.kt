package com.makers.diary

import java.util.Date

class Diary {

    val entries = ArrayList<DiaryEntry>()

    fun addEntry(entry: DiaryEntry): Unit {
        entries.add(entry)
    }

    fun getAllEntries(): List<DiaryEntry> {
        return entries.toList()
    }

    fun getAllEntriesScheduledOn(scheduledOn: Date): List<DiaryEntry> {
        return entries.filter { it.scheduledAt == scheduledOn }.toList()
    }
}