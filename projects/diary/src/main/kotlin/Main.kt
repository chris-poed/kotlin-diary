package com.makers.diary
import org.http4k.core.Request
import org.http4k.core.Response
import org.http4k.core.Status
import org.http4k.server.Undertow
import org.http4k.server.asServer

import java.util.*

fun main() {
    val diary = Diary()
    val entry = DiaryEntry("An entry", "Hello", Date())

    diary.addEntry(entry)

    println("Diary entries below:")
    println(diary.getAllEntries())
    println("This is my own message")

    val reminder = Reminder("Chris")
    reminder.remindMeTo("Fit the hose")
    println(reminder.remind())

    val app = { request: Request ->
        Response(Status.OK)
            .body("Hello, ${request.query("name")}!")
    }

    app.asServer(Undertow(9000)).start()

}