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

<img width="1097" height="862" alt="image" src="https://github.com/user-attachments/assets/495760d6-c3b6-4a20-8281-e54057e70d20" />


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
<img width="1101" height="812" alt="image" src="https://github.com/user-attachments/assets/628ae53f-9815-4953-9e9b-255c28c1db34" />


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

<img width="1077" height="818" alt="image" src="https://github.com/user-attachments/assets/f9956ded-4008-4b31-a6ac-71a229520c23" />


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

<img width="1231" height="768" alt="image" src="https://github.com/user-attachments/assets/bd656e47-32c7-49d5-b91e-49ce4c9601ec" />


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

<img width="1132" height="765" alt="image" src="https://github.com/user-attachments/assets/7459224b-def1-4dd9-a484-7d5e9f396f30" />


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

<img width="1103" height="762" alt="image" src="https://github.com/user-attachments/assets/d6418d5d-88c4-4407-a349-46f9940c8b45" />


---

## Postman Testing

The API was tested using Postman.

The following HTTP methods were verified:

- POST
- GET
- PUT
- DELETE

## Swagger UI

Swagger UI was used to visualize and test the API endpoints.

URL:

http://localhost:8080/swagger-ui/index.html

### Screenshot

<img width="1910" height="1042" alt="image" src="https://github.com/user-attachments/assets/d9567c1a-6490-4bea-b565-8e5a2ec3c3be" />


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

<img width="1906" height="1025" alt="image" src="https://github.com/user-attachments/assets/1559331c-bbcc-47d4-89d2-d5678cffd78e" />


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
