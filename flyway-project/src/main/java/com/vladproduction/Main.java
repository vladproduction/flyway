package com.vladproduction;

import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.MigrationInfo;
import org.flywaydb.core.api.MigrationInfoService;


public class Main {

    public static void main(String[] args) {
        // Configure Flyway
        Flyway flyway = new Flyway();
        flyway.setDataSource("jdbc:mysql://localhost:3306/flyway", "root", "11111111");


        // Apply pending migrations
        int pending_migrations = flyway.migrate();
        System.out.println("Number of pending migrations: " + pending_migrations);

        // Get migration info
        MigrationInfoService info = flyway.info();
        MigrationInfo[] appliedMigrations = info.applied();
        int appliedCount = appliedMigrations.length;
        System.out.println("Number of applied migrations: " + appliedCount);

    }
}
