/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/demo";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    public static Connection getConnnection() {
        Connection conn = null;
        
        try {
            Class.forName("com.mysql.jbdc.Driver");
            
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            return conn;
        } catch (Exception ex) {
            System.out.println("There were errors while connecting to db!");
            return null;
        }
    }
}
