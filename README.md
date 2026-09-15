## Spring Boot 4 (Spring Framework 7)
Sandbox project for experimenting with the features of Spring 7 and Spring Boot 4.

### Official Release Notes

https://github.com/spring-projects/spring-framework/wiki/Spring-Framework-7.0-Release-Notes

https://spring.io/blog/2025/11/13/spring-framework-7-0-general-availability

## Spring 7 - Minimum Requirements
- **`Java 17+`**
- **`Jakarta EE 11`**
- **`JUnit 6`**
- **`JPA 3.2 (Hibernate ORM 7.1/7.2)`**
- **`Servlet 6.1 (Tomcat 11.0)`**

## Spring 7 - Features

### Resilience

- **`@Retryable`**: Method-level annotation that retries a method if it fails.
- **`@ConcurrencyLimit`**: Allows you to limit the number of threads that can execute a method at the same time.
- **`RetryTemplate`**: Provides programmatic retry support.

### API Versioning
- Built-in versioning support for APIs