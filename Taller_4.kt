data class Student(
    val id: Long,
    val name: String,
    val email: String,
    val grade: Int,
    val isActive: Boolean
)

fun main() {

    val jorge = Student(
        id = 1,
        name = "Jorge",
        email = "jorge@puce.com",
        grade = 8,
        isActive = true
    )

    println(jorge)
}