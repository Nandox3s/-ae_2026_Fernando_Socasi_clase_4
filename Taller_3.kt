fun main() {
    val grade: Int = 85

    if (grade > 70) {
        println("Aprobado")
    } else {
        println("Reprobado")
    }

    val result: String = if (grade > 70) {
        "Aprobado"
    } else {
        "Reprobado"
    }

    println(result)
}
