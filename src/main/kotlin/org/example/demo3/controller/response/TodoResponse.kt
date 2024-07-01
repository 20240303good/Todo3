package org.example.demo3.controller.response

import java.time.ZonedDateTime

data class TodoResponse(id: Long, val title: String, val content: String, val writer: String, val createAt: Any) {
    val id : Long,
    val title: String,
    val content: String,
    val writer: String,
    val createAt: ZonedDateTime

}