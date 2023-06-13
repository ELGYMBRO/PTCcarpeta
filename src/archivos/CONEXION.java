/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivos;

import java.sql.*;

public class CONEXION {
    
        public static Connection getConexion(){
            String url = "jdbc:sqlserver://localhost:49751;" +
            "DatabaseName = medicolen2;" +
            "user = sa;" +
            "password = itr2023;" +
            "encrypt = true; trustServerCertificate = true";
            
            try {
                Connection conn = DriverManager.getConnection(url);
                return conn;
                
            } 
            catch (SQLException e) {
                System.out.println(e.toString());
                return null;
            }
                    
        }
}
