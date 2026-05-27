# Java Spring Boot REST API

## Project Overview

This project is a REST API developed using Spring Boot. The application allows users to manage products by performing CRUD (Create, Read, Update, Delete) operations.

The project uses Spring Data JPA for database access, H2 as an in-memory database, and Swagger UI for API documentation and testing.

---

## Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database
- Swagger UI / OpenAPI
- Maven
- IntelliJ IDEA
- Postman

---

## Application Architecture

The application follows a layered architecture:

Controller
↓
Service
↓
Repository (JpaRepository)
↓
H2 Database

### Components

#### Controller

Handles incoming HTTP requests and returns HTTP responses.

#### Service

Contains the business logic of the application.

#### Repository

Communicates with the database using Spring Data JPA.

#### Entity

Represents database tables.

#### H2 Database

Stores product information while the application is running.

---

## API Endpoints

| Method | Endpoint | Description |
|----------|----------|----------|
| POST | /api/v1/products | Create a new product |
| GET | /api/v1/products | Get all products |
| GET | /api/v1/products/{id} | Get product by ID |
| PUT | /api/v1/products/{id} | Update product |
| DELETE | /api/v1/products/{id} | Delete product |

---

# Use Cases

## 1. Create Product

### Request

POST /api/v1/products

Request Body:

```json
{
  "name": "Laptop"
}
```

### Response

```json
{
  "id": 1,
  "name": "Laptop"
}
```

Status:

```text
201 Created
```

### Screenshot

<img width="1207" height="787" alt="image" src="https://github.com/user-attachments/assets/6b899c98-5a06-4afc-9f61-834a8e2a93b6" />


---

## 2. Get All Products

### Request

GET /api/v1/products

### Response

```json
[
  {
    "id": 1,
    "name": "Laptop"
  }
]
```

Status:

```text
200 OK
```

### Screenshot

Insert screenshot of GET ALL request and response.

---

## 3. Get Product By ID

### Request

GET /api/v1/products/1

### Response

```json
{
  "id": 1,
  "name": "Laptop"
}
```

Status:

```text
200 OK
```

### Screenshot

Insert screenshot of GET BY ID request and response.

---

## 4. Update Product

### Request

PUT /api/v1/products/1

Request Body:

```json
{
  "name": "Gaming Laptop"
}
```

### Response

```json
{
  "id": 1,
  "name": "Laptop"
}
```

Status:

```text
200 OK
```

### Screenshot

Insert screenshot of PUT request and response.

---

## 5. Delete Product

### Request

DELETE /api/v1/products/1

### Response

Status:

```text
204 No Content
```

### Screenshot

Insert screenshot of DELETE request and response.

---

## 6. Exception Handling

### Request

GET /api/v1/products/999

### Response

```json
{
  "message": "Product not found"
}
```

Status:

```text
404 Not Found
```

### Screenshot

Insert screenshot showing exception handling.

---

## Postman Testing

The API was tested using Postman.

The following HTTP methods were verified:

- POST
- GET
- PUT
- DELETE

### Screenshot

Insert screenshot of Postman collection or requests.

---

## Swagger UI

Swagger UI was used to visualize and test the API endpoints.

URL:

http://localhost:8080/swagger-ui/index.html

### Screenshot

Insert screenshot of Swagger UI.

---

## H2 Database

The application uses the H2 in-memory database.

H2 Console URL:

http://localhost:8080/console

Example query:

```sql
SELECT * FROM PRODUCT;
```

### Screenshot

Insert screenshot showing records stored in the PRODUCT table.

---

## Running the Project

1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3. Run `FirstRestApiApplication`.
4. Open Swagger UI:

```
http://localhost:8080/swagger-ui/index.html
```

5. Open H2 Console:

```
http://localhost:8080/console
```

---

## Author

Wasif Ashraf Khanday
