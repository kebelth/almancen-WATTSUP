
package com.mycompany.partesproyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {
    
    private final String base= "usuarios";
    private final String user= "root";
    private final String password= "12345";
    private final String url= "jdbc:mysql://localhost:3306/usuarios?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC]";
    private Connection con= null;
    
    
    
    
    public Connection getConexion(){
        
        try {          
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection(url, user, password);
            System.out.println("Se CONECTO A LA BASE DE DATOS");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
             System.out.println("NO SE CONECTO A LA BASE DE DATOS");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
            
    }
    
    
    
}