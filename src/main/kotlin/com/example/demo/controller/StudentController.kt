package com.example.demo.controller

import com.example.demo.dto.StudentRequest
import com.example.demo.dto.StudentResponse
import com.example.demo.service.StudentService
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/students")
class StudentController(
    private val studentService: StudentService
) {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createStudent(@Valid @RequestBody request: StudentRequest): StudentResponse {
        return studentService.createStudent(request)
    }

    @GetMapping
    fun getAllStudents(): List<StudentResponse> {
        return studentService.getAllStudents()
    }
}
