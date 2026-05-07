package com.makers.diary

class Person(
    val firstName: String,
    val lastName: String,
    val age: Int? = null,
    val phoneNumber: String? = null,
    val hobbies: MutableList<String> = mutableListOf()
) {
    val fullName = "$firstName $lastName"
    fun getGreeting(): String {
        return "Hello there. I'm $fullName, how are you?"
    }
}