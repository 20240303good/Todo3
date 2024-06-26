package org.example.demo3.controller

import org.example.demo3.controller.request.CreateTodoRequest
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class TodoController {
    @PostMapping("/todos")
    fun CreateTodo(
        @RequestBody request : CreateTodoRequest,
    ): ResponseEntity<Boolean> {
        return ResponseEntity.ok(true)
    }
}