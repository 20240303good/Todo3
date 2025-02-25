package org.example.demo3.repository

import org.example.demo3.controller.request.CreateTodoRequest
import org.example.demo3.repository.model.Todo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository

    interface TodoRepository: JpaRepository <Todo, Long> {
        @Repository
            fun createTodo(request: CreateTodoRequest): Todo


    }
