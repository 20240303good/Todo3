package org.example.demo3.controller

import org.example.demo3.controller.request.CreateTodoRequest
import org.example.demo3.service.TodoService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class TodoController(
    val todoService: TodoService
) {
    @PostMapping("/todos")
    fun CreateTodo(
        @RequestBody request : CreateTodoRequest,
    ): ResponseEntity<Boolean> {
        return ResponseEntity.ok(
            todoService.createTodo(
                request
            )
        )
    }
}