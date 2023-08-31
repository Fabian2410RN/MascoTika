/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Leer {
    
    Conexion conect = new Conexion();
    
    public ResultSet LeerUsuario() throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        
        String st = "select * from Usuario";
        ResultSet rs = conect.getConexion().createStatement().executeQuery(st);
        System.out.println("Corrió");
        
        return rs;
    }
    
    public ResultSet LeerVeterinario() throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        
        String st = "select * from Veterinario";
        ResultSet rs = conect.getConexion().createStatement().executeQuery(st);
        System.out.println("Corrió");
    
        return rs;
    }
    
    public ResultSet LeerCliente() throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        
        String st = "select * from Cliente";
        ResultSet rs = conect.getConexion().createStatement().executeQuery(st);
        System.out.println("Corrió");

        return rs;
    }
    
    public ResultSet LeerPaciente() throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        
        String st = "select * from Paciente";
        ResultSet rs = conect.getConexion().createStatement().executeQuery(st);
        System.out.println("Corrió");

        return rs;
    }
    
    public ResultSet LeerProcedimientos_Servicios() throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        
        String st = "select * from Procedimientos_Servicios";
        ResultSet rs = conect.getConexion().createStatement().executeQuery(st);
        System.out.println("Corrió");
        
        return rs;
    }
    
    public ResultSet LeerCategoriaServicio_Procedimiento() throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        
        String st = "select * from CategoriaServicio_Procedimiento";
        ResultSet rs = conect.getConexion().createStatement().executeQuery(st);
        System.out.println("Corrió");
        
        return rs;
    }
    
    public ResultSet LeerCitasMedicas() throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        
        String st = "select * from CitasMedicas";
        ResultSet rs = conect.getConexion().createStatement().executeQuery(st);
        System.out.println("Corrió");
        
        return rs;
    }
    
    public ResultSet LeerHistorialPaciente() throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        
        String st = "select * from HistorialPacientes";
        ResultSet rs = conect.getConexion().createStatement().executeQuery(st);
        System.out.println("Corrió");
        
        return rs;
    }
    
    public ResultSet LeerRedesSociales_Veterinario() throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        
        String st = "select * from RedesSociales_Veterinario";
        ResultSet rs = conect.getConexion().createStatement().executeQuery(st);
        System.out.println("Corrió");
        
        return rs;
    }
    
    public ResultSet LeerTelefonoVeterinario() throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        
        String st = "select * from TelefonoVeterinario";
        ResultSet rs = conect.getConexion().createStatement().executeQuery(st);
        System.out.println("Corrió");
    
        return rs;
    }
    
    public ResultSet LeerTelefonoCliente() throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        
        String st = "select * from TelefonoCliente";
        ResultSet rs = conect.getConexion().createStatement().executeQuery(st);
        System.out.println("Corrió");
    
        return rs;
    }
    
    public ResultSet LeerHorariosAtencion_Veterinario() throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        
        String st = "select * from HorariosAtencion_Veterinario";
        ResultSet rs = conect.getConexion().createStatement().executeQuery(st);
        System.out.println("Corrió");
        
        return rs;
    }
}
