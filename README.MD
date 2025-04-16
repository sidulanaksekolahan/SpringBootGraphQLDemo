# This project is using Spring Boot 3 and MySQL as a Database

# How to test in Postman:

## 1. getAllBooks
### URL:
``` 
http://localhost:8080/graphql
```
### Method:
```
POST
```
### Header: 
```
Content-Type: application/json
```
### Body -> raw -> JSON:
```json
{
    "query": "query { getAllBooks { id title author } }"
}
```

## 2. getBookById
### URL:
```
http://localhost:8080/graphql
```
### Method:
```
POST
```
### Header:
```
Content-Type: application/json
```
### Body -> raw -> JSON:
``` 
{
    "query": "query { getBookById(id: 1) { title author } }"
}
```

## 3. createBook
### URL:
```
http://localhost:8080/graphql
```
### Method:
```
POST
```
### Header:
``` 
Content-Type: application/json
```
### Body -> raw -> JSON:
``` 
{
    "query": "mutation { createBook(input: {title: \"Atomic Habits\", author: \"James Clear\"}) { id title author } }"
}
```

## 4. updateBook
### URL:
``` 
http://localhost:8080/graphql
```
### Method:
``` 
POST
```
### Header:
``` 
Content-Type: application/json
```
### Body -> raw -> JSON:
``` 
{
    "query": "mutation { updateBook(id: 2, input: { title: \"Full Stack React and Spring Boot\", author: \"Chad Darby\"}) { id title author } }"
}
```

## 5. deleteBook
### URL:
``` 
Content-Type: application/json
```
### Method:
``` 
POST
```
### Header:
``` 
Content-Type: application/json
```
### Body -> raw -> JSON:
``` 
{
    "query": "mutation { deleteBook(id: 5) }"
}
```

***

# How to test in GraphiQL Playground

## 1. Open your browser and copy the link below:
``` 
http://localhost:8080/graphiql
```

## 2. getAllBooks
### Copy and paste the query below:
``` 
query {
  getAllBooks {
    id
    title
    author
  }
}
```

## 3. getBookById
### Copy and paste the query below:
``` 
query {
  getBookById(id: 1) {
    id
    title
    author
  }
}
```

## 4. createBook
### Copy and paste the query below:
``` 
mutation {
  createBook(input: {
    title: "Spring Security"
    author: "Muhammad Irfan"
  }) {
    id
    title
    author
  }
}
```

## 5. updateBook
### Copy and paste the query below:
``` 
mutation {
  updateBook(id: 7, input: {
    title: "Spring Boot Hibernate"
    author: "Muhammad Irfan"
  }) {
    id
    title
    author
  }
}
```

## 6. deleteBook
### Copy and paste the query below:
``` 
mutation {
  deleteBook(id: 7)
}
```












