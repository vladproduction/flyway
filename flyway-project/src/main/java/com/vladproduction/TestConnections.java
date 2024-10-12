package com.vladproduction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnections {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/flyway";
        String user = "root";
        String password = "11111111";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connection successful!");
        } catch (SQLException e) {
            System.err.println("Connection failed: " + e.getMessage());
        }
    }
}
