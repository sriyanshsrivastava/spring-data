# 🌱 Spring Data (Basic to Advanced)

This repository is a structured journey into **Spring Data** — starting from the basics and progressing to advanced concepts. It includes practical examples using **Spring Boot**, **Spring Data JPA**, and **PostgreSQL** as the database.

---

## 📚 What You’ll Learn

- ✅ Introduction to Spring Data JPA
- ✅ Setting up PostgreSQL with Spring Boot
- ✅ CRUD Operations with `JpaRepository`
- ✅ Custom Query Methods
- ✅ JPQL vs Native Queries
- ✅ Paging and Sorting
- ✅ Relationships: One-to-One, One-to-Many, Many-to-Many
- ✅ Transactions and Entity Lifecycle
- ✅ QueryDSL, Specifications (Advanced Filtering)
- ✅ Auditing, Soft Deletes
- ✅ Spring Data REST and Projections
- ✅ Integration with Spring Boot DevTools & Postman

---

## 🛠 Tech Stack

| Tool | Description |
|------|-------------|
| Java | 17+ (or 11+) |
| Spring Boot | 3.x |
| Spring Data JPA | For ORM |
| PostgreSQL | Relational database |
| Maven | Build tool |
| Lombok | To reduce boilerplate |
| Postman | API testing |
| IntelliJ / VSCode | IDE |

---

## 🧩 PostgreSQL Configuration

Update `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/your_db_name
spring.datasource.username=your_db_user
spring.datasource.password=your_db_password
spring.datasource.driver-class-name=org.postgresql.Driver

spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

---

## 📁 Project Structure (Examples)

```
src/
 └── main/
     ├── java/
     │    └── com/sriyansh/jpa/
     │         ├── models/
     │         ├── repository/
     │         ├── service/
     │         └── controller/
     └── resources/
           └── application.properties
```

---

## 🚀 How to Run

```bash
# Clone the repository
git clone https://github.com/your-username/spring-data.git

# Navigate into the project
cd spring-data

# Run using Maven
./mvnw spring-boot:run
```

Or open in IntelliJ/VSCode and run `SpringDataApplication.java`.

---

## 🧠 Tips for Learning

- Commit often with meaningful messages.
- Use Postman or Swagger to test endpoints.
- Use comments in code to document what you're learning.
- Gradually experiment with advanced features (e.g., native queries, projections, specifications).

---

## 📌 To-Do (Learning Plan)

- [x] Basic CRUD
- [x] Relationships
- [x] Pagination
- [ ] Advanced Queries
- [ ] Specifications
- [ ] Spring Data REST
- [ ] Unit Testing with Testcontainers

---

## 📖 References

- [Spring Data JPA Docs](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/)
- [Baeldung - Spring Data](https://www.baeldung.com/spring-data)
- [PostgreSQL JDBC Driver](https://jdbc.postgresql.org/)

---

## 💡 Author

**Sriyansh Srivastava**
