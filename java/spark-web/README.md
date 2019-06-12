# Spark App (jar package)

Spark - A tiny Sinatra inspired framework for creating web applications in Java 8 with minimal effort

 * http://sparkjava.com

## Maven

Add the dependency to your `pom.xml`

```xml
<dependency>
    <groupId>com.sparkjava</groupId>
    <artifactId>spark-core</artifactId>
    <version>2.9.1</version>
</dependency>
```

## Coding
```java
public class WebApp implements spark.servlet.SparkApplication {

    private static final Logger log = LoggerFactory.getLogger(WebApp.class);
    private static int COUNT = 1;

    @Override
    public void init() {

        log.debug("***** START *****");

        get("/hello", (request, response) -> {
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("message", "Hello World!");
            log.debug("{}", COUNT++);
            return new ModelAndView(attributes, "hello.ftl");
        }, new FreeMarkerEngine());
    }
}
```

### Run

please see `pom.xml`, you can test with mvn as example below

    mvn compile exec:java

or build jar package and run

    mvn clean package
    java -jar target/spark-app-01.jar
