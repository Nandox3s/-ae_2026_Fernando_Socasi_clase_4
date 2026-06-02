package com.example.demo.service

import com.example.demo.dto.StudentRequest
import com.example.demo.dto.StudentResponse
import com.example.demo.entity.Student
import com.example.demo.repository.StudentRepository
import org.springframework.stereotype.Service

@Service
class StudentService(
    private val studentRepository: StudentRepository
) {
    fun createStudent(request: StudentRequest): StudentResponse {
        val student = Student(
            name = request.name,
            email = request.email
        )

        val savedStudent = studentRepository.save(student)
        return savedStudent.toResponse()
    }

    fun getAllStudents(): List<StudentResponse> {
        return studentRepository.findAll().map { it.toResponse() }
    }

    private fun Student.toResponse(): StudentResponse {
        return StudentResponse(
            id = requireNotNull(id) { "Student id should not be null after persistence" },
            name = name,
            email = email
        )
    }
}
