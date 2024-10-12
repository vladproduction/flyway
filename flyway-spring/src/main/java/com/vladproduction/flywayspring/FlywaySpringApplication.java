package com.vladproduction.flywayspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
public class FlywaySpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlywaySpringApplication.class, args);
    }

}
