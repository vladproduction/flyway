# flyway-project
**This project created for demonstration flyway tool with java;**
# Description:
* java 1.8
* mysql-connector-java
* flyway-core
# idea:
1)create db.migration package to hold sql scripts;  
2)Main contain jdbc connection to database (MySql);  
3)org.flywaydb.core.Flyway - import library;  
4)flyway.migrate() - is responsible for executing pending migrations to bring the database schema up to date;