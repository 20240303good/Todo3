package org.example.demo3.service

import org.example.demo3.controller.request.CreateTodoRequest
import org.example.demo3.repository.TodoRepository
import org.example.demo3.repository.model.Todo
import org.springframework.stereotype.Service

@Service
class TodoService(
    val todoRepository: TodoRepository
) {
    fun createTodo(request: CreateTodoRequest): Boolean{

        return try{
            todoRepository.save(
                Todo(
                    title = request.title,
                    content = request.content,
                    writer = request.writer,
                    id = null
                )
            )
            true
        }catch (e:Exception) {
            false
        }

    }
}

