package com.makers.diary

class Reminder(
    val name: String,
    private var taskToRemind: String? = null
) {
    fun remindMeTo (task: String) {
        taskToRemind = task
    }

    fun remind(): String {
        if (taskToRemind == null) {
            return "No task to remind"
        } else {
            println("$taskToRemind, $name")
            return "$taskToRemind, $name"
        }

    }

}