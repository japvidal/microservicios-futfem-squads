# microservicios-futfem-squads

`microservicios-futfem-squads` manages squad information for the Tikitakas backend. It provides the dedicated REST API and persistence layer for squad-related records, helping the platform separate roster composition concerns from players, teams, and competitions while still integrating cleanly with the rest of the system.

The application is built with Java 21, Spring Boot, Spring Data JPA, MySQL, Springdoc OpenAPI, and Maven Wrapper. Common controller and service patterns come from `microservicios-common`, while Eureka and the gateway handle service discovery and routing. This keeps the repository focused on its domain while still fitting into the broader microservice ecosystem.

Typical local execution:

```bash
./mvnw spring-boot:run
```

Gateway route:

- `/api/futfem/squads/**`

In `v0.1.0`, the project is fully aligned with the current platform standards for testing, CI, Docker publishing, and Swagger behind the gateway. That means it can be built in Jenkins, published as a container image, and documented centrally through the gateway UI with correct external paths.

This repository is useful when squad data needs its own lifecycle, persistence model, and API surface rather than being embedded in team or player services.
