package org.example.demo3.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository

    interface TodoRepository: JpaRepository <Todo, Long> {
        
    }
