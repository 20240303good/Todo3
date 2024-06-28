package org.example.demo3.repository.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.ZonedDateTime

@Entity(name = "todo")
data class Todo (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id : Long? = null ,
    var title :String = "" ,
    var content:String = "" ,
    var writer:String = "" ,
    var createAt: ZonedDateTime = ZonedDateTime.now()
) {

}