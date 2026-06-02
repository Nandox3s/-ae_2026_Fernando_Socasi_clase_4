package com.example.demo.dto

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank

data class StudentRequest(
    @field:NotBlank(message = "Name is required")
    val name: String,

    @field:NotBlank(message = "Email is required")
    @field:Email(message = "Email format is invalid")
    val email: String
)
