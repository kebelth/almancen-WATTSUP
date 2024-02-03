
package com.mycompany.partesproyecto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kebelth
 */
public class SqlUsuarios extends Conexion{
    
    public boolean registrar(usuarios usr) 
    {
        try{
        PreparedStatement ps= null;
        Connection con= getConexion();
        
        String sql = "INSER INTO usuarios (usuario, password, nombre, correo, id_tipo) VALUES(?,?,?,?,?)";
        ps = con.prepareStatement(sql);
        ps.setString(1, usr.getUsuario());
        ps.setString(2, usr.getPassword());
        ps.setString(3, usr.getNombre());
        ps.setString(4, usr.getCorreo());
        ps.setInt(5, usr.getId_tipo());
        ps.execute();
        return true;
        }catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    
    
    
    
    
    
    
}
