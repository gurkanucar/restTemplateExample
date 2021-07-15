# Spring Boot Rest Template Example

(just clone the project then run)

### Public API for example:

[https://jsonplaceholder.typicode.com](https://jsonplaceholder.typicode.com/)

## Routes

Base URL:

[http://localhost:8080/api](http://localhost:8080/api)

GET       [/restTemplate](http://localhost:8080/api/restTemplate)    →   returns all posts

GET       [/restTemplate/{id}](http://localhost:8080/api/restTemplate/1 )   →  returns post by given id

GET       [/restTemplate/search/{search}](http://localhost:8080/api/restTemplate/search/word) → returns  list of posts containing the given search words

POST     [/restTemplate](http://localhost:8080/api/restTemplate)   → returns postDTO after success creation



### Exception Handling

We are handling two different type of exceptions.

- Exceptions from server (Spring Boot Application)
- Exceptions from public API service ( [https://jsonplaceholder.typicode.com](https://jsonplaceholder.typicode.com/) )

We made override ResponseErrorHandler interface of RestTemplateResponseErrorHandler.

ResponseErrorHandler has two methods named "hasError" and "handleError". We can throw our custom exceptions in handle error method.

