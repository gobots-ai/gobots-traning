package com.example.demo

import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "users")
data class User(
    val username: String,
    val name: String,
    val password: String,
    val balance: Double,
    val nickname: String,
    val age: Int,
    val email: String,
    val address: Address,
    val cpf: String
) {
    var id: String? = null
}

data class Address (
    val streetName: String,
    val number: Int,
    val complement: String?
)