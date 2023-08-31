/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import vista.Login;

/**
 *
 * @author estadm
 */
public class Conexion {
    
    public static Connection getConexion(){
        Connection con = null;
        
        
        String password = "123";
        String user = "sa";
        String BD = "MascoTika";
        
        String url = "jdbc:sqlserver://localhost:1433;databaseName="+BD
                            +";user="+user+";password="+password;
        
        try {
            con = DriverManager.getConnection(url,user,password);
            if (con != null){
                System.out.println("~ CONECTADO A LA BASE DE DATOS: "+BD+" ~");
            }
        }catch (SQLException e){
            System.out.println("No se pudo conectar.....");
            e.printStackTrace();
        }
        return con;
    }
    public static void main (String [] args){
        getConexion();
    }
    
}
