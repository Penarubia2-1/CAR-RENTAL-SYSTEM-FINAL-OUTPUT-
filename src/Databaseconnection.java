/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 639319165346
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Databaseconnection {

    public static void main(String[] args) {
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3307/Jurie";
        String user = "Jurie";
        String password = "12345";

        try {
            // Step 1: Register JDBC Driver
            Class.forName("jdbc:mysql://127.0.0.1:3307/?user=Jurie");

            // Step 2: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(url, user, password);

            System.out.println("Connected successfully!");

            // Do something with the connection (e.g., execute SQL queries)

        } catch (SQLException se) {
            // Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            // Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            // Finally block to close resources
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }
}
