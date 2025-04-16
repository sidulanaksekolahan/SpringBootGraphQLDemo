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














