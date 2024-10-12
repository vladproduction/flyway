# flyway-spring
**This project created for demonstration flyway tool with Spring Boot, MySql and Flyway;**
** ** 
- main aim is to show combination of Spring Boot and Flyway;
- also is how we can use scripts sql and java classes both at the same time of execution;

# Description (pom.xml):
* java 17
* spring-boot-starter-data-jpa
* spring-boot-starter-web
* mysql-connector-j
* flyway-core
* flyway-mysql
* spring-boot-starter-test

# idea:
* create db.migration package in resources section to hold sql scripts;
* create db.migration package in src/main/java section hold classes extends BaseJavaMigration (overridden migrate());
* application.properties hold settings for MySql, Hibernate;
* project contain three layers (repository, service, controller);
* crud operations is presented in REST API;

**  **