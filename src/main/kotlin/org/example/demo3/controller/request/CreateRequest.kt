package org.example.demo3.controller.request

data class CreateRequest (
    val title : String,
    val content: String,
    val writer: String
)