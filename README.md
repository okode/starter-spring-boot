# Starter Spring Boot App

Created with Spring Initializr (https://start.spring.io)

* Gradle Project
* Language Java 14
* Spring Boot version 2.3.2
* Packaging JAR
* Dependencies
  - Lombok
  - Spring Reactive Web
  - Spring Boot DevTools

## Testing

```
./gradlew check
```

## Building

Local build:

```
./gradlew bootJar
```

Docker build:

```
docker build -t starter-spring-boot .
```

## Running

Local run:

```
./gradlew bootRun
```

Docker run:

```
docker run -ti -p 8080:8080 starter-spring-boot
```

Open http://localhost:8080/swagger-ui/index.html

## Bumping Gradle Version

```
./gradlew wrapper --gradle-version [VERSION]
```
