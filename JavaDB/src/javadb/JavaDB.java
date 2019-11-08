/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author TEMPO
 */
public class JavaDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testing?zeroDateTimeBehavior=convertToNull";
        String username = "root";
        String password = "";
        
        
        
        String nombre = "Allan";

        System.out.println("Connecting database...");

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Database connected!");
            
            Statement stmt = connection.createStatement();
            stmt.execute("insert into Persona(Nombre) values ('allan')",0);
            
           
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }
        
    // Do something with the Connection


        
        
    }
    
}
