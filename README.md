A Simple Spring Boot docker-compose-mongodb example 

Steps
mvn clean install -DskipTests
docker build -t springboot-mongodb:1.0 .
docker-compose up

APIs
http://localhost:8080/book 
POST
{
    "id": 1,
    "name": "D1",
    "authorName": "A1"
}

http://localhost:8080/book
GET

Make sure docker installed 