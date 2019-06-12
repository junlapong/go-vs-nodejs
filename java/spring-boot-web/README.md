# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)


## Build

### Tomcat

	mvn clean package -Dmaven.test.skip

### Jetty

	mvn -f pom-jetty.xml clean package -Dmaven.test.skip

## Run

	java -jar target/spring-boot-web-0.0.1-SNAPSHOT.jar
