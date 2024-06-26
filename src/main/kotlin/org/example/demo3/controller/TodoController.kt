package org.example.demo3.controller

import com.sun.tools.javac.comp.Todo
import org.example.demo3.controller.request.CreateTodoRequest
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@Controller
class TodoController {
    @PostMapping("/todos")
    fun createTodo(
        @RequestBody request : CreateTodoRequest,
    ): ResponseEntity<Boolean> {
        return ResponseEntity.ok(true)
    }
}