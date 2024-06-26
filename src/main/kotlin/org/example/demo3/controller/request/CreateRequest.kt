package org.example.demo3.controller.request

data class CreateTodoRequest {
    val title : String,
    val content: String,
    val writer: String
}