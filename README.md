# Rest Assured API Automation Demo

A Java Maven project for the **Rest Assured API Automation**.

## What this demo shows

1. **Rest Assured** sends a GET request.
2. **Jackson** deserializes the JSON response into a Java POJO.
3. **TestNG** verifies one attribute.

The demo uses this free public endpoint:

- `https://jsonplaceholder.typicode.com/todos/1`

Expected JSON:

```json
{
  "userId": 1,
  "id": 1,
  "title": "delectus aut autem",
  "completed": false
}
```

## Project structure

```text
rest-assured-api-demo
├── pom.xml
├── README.md
├── src
│   ├── main
│   │   └── java
│   │       └── demo
│   │           └── model
│   │               └── Todo.java
│   └── test
│       └── java
│           └── demo
│               └── tests
│                   └── TodoApiTest.java
```

## Prerequisites

- Java 11
- Maven 3.9+
