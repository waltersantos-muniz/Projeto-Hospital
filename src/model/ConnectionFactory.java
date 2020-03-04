
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
    public Connection getConnection() {
     try {    
         return DriverManager.getConnection(
            "jdbc:mysql://localhost:3308/hospital","root","usbw");
     } catch (SQLException e) {
       throw new RuntimeException(e);
     }
    }
}