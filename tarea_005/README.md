# API REST de Estudiantes - Spring Boot + Kotlin + H2

Proyecto desarrollado con arquitectura por capas para gestionar estudiantes.

## Tecnologias

- Spring Boot
- Kotlin
- Gradle
- Spring Data JPA
- H2 Database

## Estructura del proyecto

```text
src/main/kotlin/com/example/demo
├── controller
│   └── StudentController.kt
├── service
│   └── StudentService.kt
├── repository
│   └── StudentRepository.kt
├── entity
│   └── Student.kt
├── dto
│   ├── StudentRequest.kt
│   └── StudentResponse.kt
└── DemoApplication.kt
```

## Configuracion H2

- URL JDBC: `jdbc:h2:mem:studentdb`
- Consola H2: `http://localhost:8080/h2-console`
- JDBC URL en consola: `jdbc:h2:mem:studentdb`
- User: `sa`
- Password: (vacio)

## Como ejecutar

1. Tener Java 17 instalado.
2. Ejecutar:

```bash
./gradlew bootRun
```

En Windows PowerShell:

```powershell
.\gradlew.bat bootRun
```

La API inicia en `http://localhost:8080`.

## Endpoints

### 1) Crear estudiante

- Metodo: `POST`
- URL: `/students`

Body ejemplo:

```json
{
  "name": "Ana Torres",
  "email": "ana.torres@email.com"
}
```

Respuesta esperada (201):

```json
{
  "id": 1,
  "name": "Ana Torres",
  "email": "ana.torres@email.com"
}
```

### 2) Listar estudiantes

- Metodo: `GET`
- URL: `/students`

Respuesta esperada (200):

```json
[
  {
    "id": 1,
    "name": "Ana Torres",
    "email": "ana.torres@email.com"
  }
]
```

## Pruebas rapidas con curl

Crear estudiante:

```bash
curl -X POST http://localhost:8080/students \
  -H "Content-Type: application/json" \
  -d '{"name":"Ana Torres","email":"ana.torres@email.com"}'
```

Listar estudiantes:

```bash
curl http://localhost:8080/students
```

## Coleccion Postman

La coleccion se encuentra en:

- `postman/Student API.postman_collection.json`

## Entregables

- Repositorio GitHub: https://github.com/Nandox3s/-ae_2026_Fernando_Socasi_clase_4.git.
- Coleccion Postman: incluida en la carpeta `postman`.
