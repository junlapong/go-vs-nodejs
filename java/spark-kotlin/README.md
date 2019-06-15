# spark-kotlin

Source code for the Spark + Kotlin tutorial at sparktutorials.github.io:
 - https://sparktutorials.github.io/2017/01/28/using-spark-with-kotlin.html

## Build

    mvn clean package

## Run

    java -jar target/spark-kotlin-1.0.jar

## Test

use [httpie](https://httpie.org/) for test request

```term
$ http http://localhost:4567/users

HTTP/1.1 200 OK
Content-Type: text/html;charset=utf-8
Date: Mon, 27 May 2019 10:17:18 GMT
Server: Jetty(9.3.z-SNAPSHOT)
Transfer-Encoding: chunked
```
```json
{
    "0": {
        "email": "alice@alice.kt",
        "id": 0,
        "name": "Alice"
    },
    "1": {
        "email": "bob@bob.kt",
        "id": 1,
        "name": "Bob"
    },
    "2": {
        "email": "carol@carol.kt",
        "id": 2,
        "name": "Carol"
    },
    "3": {
        "email": "dave@dave.kt",
        "id": 3,
        "name": "Dave"
    }
}
```
