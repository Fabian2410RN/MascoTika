/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.SQLException;

/**
 *
 * @author luigy
 */
public class Actualizar {
    
    Conexion conect = new Conexion();
    
    public void ActualizarString(String Tabla, String Atributo, String NuevoValor, String Bandera, String valorBusqueda) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        
        String st = "update "+Tabla+" set "+Atributo+" = '"+NuevoValor+"' where "+Bandera+" = '"+valorBusqueda+"';";
        conect.getConexion().createStatement().execute(st);
        System.out.println("Se modificó");
    }
    
    public void ActualizarInt(String Tabla, String Atributo, int NuevoValor, String Bandera, String valorBusqueda) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        
        String st = "update " + Tabla + " set " + Atributo + " = " + NuevoValor + " where " + Bandera + " = '" + valorBusqueda + "';";
        conect.getConexion().createStatement().execute(st);
        System.out.println("Se modificó");
    }
    
    public void ActualizarInt2(String Tabla, String Atributo, int NuevoValor, String Bandera, int valorBusqueda) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        
        String st = "update "+Tabla+" set "+Atributo+" = "+NuevoValor+" where "+Bandera+" = "+valorBusqueda+";";
        conect.getConexion().createStatement().execute(st);
        System.out.println("Se modificó");
    }
    
    public void ActualizarString2(String Tabla, String Atributo, String NuevoValor, String Bandera, int valorBusqueda) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        
        String st = "update "+Tabla+" set "+Atributo+" = '"+NuevoValor+"' where "+Bandera+" = "+valorBusqueda+";";
        conect.getConexion().createStatement().execute(st);
        System.out.println("Se modificó");
    }
}
