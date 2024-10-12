# Spring Boot JPA Flyway Movies & Actors
**This project demonstrates the integration of Flyway with Spring Boot, MySQL, and Flyway.**  
**The main aim is to showcase the combination of Spring Boot and Flyway for managing database migrations alongside JPA.**

### Project Dependencies (pom.xml):
* Java 17
* spring-boot-starter-data-jpa
* spring-boot-starter-web
* mysql-connector-j
* lombok
* flyway-core
* flyway-mysql
* spring-boot-starter-test

### Plugins:
* flyway-maven-plugin: For managing Flyway migrations.
* spring-boot-maven-plugin: For packaging and running the Spring Boot application.

### Project Structure:
* A db/migration package in the resources section holds the SQL migration scripts.
* application.properties file configures settings for MySQL and Flyway.
* The project utilizes Spring Boot JPA for database operations.
* The architecture includes layers such as repository and controller.

### Maven Goals:
1. To run Flyway migrations:
   ```bash
   ./mvnw flyway:migrate
   
2. To define properties in the project's POM and pass values from the command line:
   ```bash
   ./mvnw -D database.username=root -D database.password=11111111 flyway:migrate
   
3. Running the Migrations:
- When app starts, Flyway will automatically check the db/migration directory;
- Any new migrations that have not yet been applied to the database will be applied in version order; 

- To **RUN** the App:
     ```bash
    ./mvnw spring-boot:run
   
- To access the movies API: [http://localhost:8080/api/1.0/movies](http://localhost:8080/api/1.0/movies)


- To **STOP** the running Spring Boot application, use the following keyboard shortcut:
     
    **ctrl + c** and: Terminate batch job (Y/N)? print properly and press Enter

- To check which process is using port 8080:
  ```bash
    netstat -ano | findstr :8080

- To Terminate the process ([PID] --> mutable current running id):
  ```bash
    taskkill /PID [PID] /F
