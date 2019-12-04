package com.example.demo

import com.github.kittinunf.fuel.httpGet
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.data.mongodb.core.aggregation.Aggregation
import org.springframework.data.mongodb.core.aggregation.Aggregation.*
import org.springframework.data.mongodb.core.findOne
import org.springframework.data.mongodb.core.query.Criteria
import org.springframework.data.mongodb.core.query.Query
import org.springframework.data.mongodb.core.query.isEqualTo
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/kotlin")
class Controller(
    private val userRepository: UserRepository,
    private val mongoTemplate: MongoTemplate
) {

    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    fun createUser(
        @RequestBody user: User
    ): User {
        return userRepository.save(user)
    }

    @GetMapping("/users/{username}")
    fun getUserByEmail(@PathVariable username: String): User? {
        return mongoTemplate.findOne(
            Query.query(
                Criteria.where("username").isEqualTo(username)
            )
        )
    }

    @PostMapping
    fun listNumbers(
        @RequestBody request: Corpo
    ): String {

        return "https://api.openweathermap.org/data/2.5/weather?q=${request.city},${request.country}&appid=47040de8f4cef6fedd407ba4e9decbf7"
            .httpGet()
            .responseString()
            .third.get()
    }

}

data class Corpo(
    val city: String,
    val country: String
)

enum class Roles {
    ROLE_ADMIN,
    ROLE_USER
}

// localhost:8080/kotlin

// GET
// POST
// PUT
/*
* PATCH
* DELETE
*
* */
