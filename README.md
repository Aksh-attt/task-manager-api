


# Task Manager REST API

A structured backend project built using Spring Boot and MySQL.

# Features
- CRUD operations (Create, Read, Update, Delete)
- Layered architecture (Controller → Service → Repository)
- Global exception handling (400, 404)
- Request validation
- Auto-managed timestamps (createdAt, updatedAt)
- Proper HTTP status codes

# Tech Stack
- Java 17
- Spring Boot 3.4.5
- Spring Data JPA
- MySQL
- Maven

# API Endpoints
GET    /tasks  
GET    /tasks/{id}  
POST   /tasks  
PUT    /tasks/{id}  
DELETE /tasks/{id}  

# How to Run
1. Create a MySQL database named `taskmanager`
2. Update DB credentials in application.properties
3. Run the application

Server runs at:
http://localhost:8080

