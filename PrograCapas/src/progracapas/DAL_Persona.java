package progracapas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DAL_Persona {
    
    private String url = "jdbc:mysql://localhost:3306/testing?zeroDateTimeBehavior=convertToNull";
    private String username = "root";
    private String password = "";
    private Connection connection = null;
    
     public DAL_Persona(){}
    
     public void insertPersona(String nombre) throws SQLException
    {
        connection =  DriverManager.getConnection(url, username, password);
        Statement stmt = connection.createStatement();
        stmt.execute("insert into Persona(Nombre) "
                + "values ('" + nombre + "')",0);
            
    }
     
    public void DeletePersona(String nombre) throws SQLException
    {
        connection =  DriverManager.getConnection(url, username, password);
        Statement stmt = connection.createStatement();
        stmt.execute("DELETE FROM persona where Nombre = '" + nombre + "'",0);
            
    }
     
}
