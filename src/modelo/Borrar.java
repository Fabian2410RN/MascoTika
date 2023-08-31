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
public class Borrar {
    
    Conexion conect = new Conexion();
    
    public void borrarUsuario(String NombreUsuario) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        
        String st = "delete from Usuario where NombreUsuario = '"+NombreUsuario+"';";
        conect.getConexion().createStatement().execute(st);
        System.out.println("Se borró Usuario");
        
    }
    
    public void borrarVeterinario(int CedulaVeterinario) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        
        String st = "delete from Veterinario where Cedula = ‘"+CedulaVeterinario+"’;";
        conect.getConexion().createStatement().execute(st);
        System.out.println("Se borró Veterinario");
        
    }
    
    public void borrarCliente(int CedulaCliente) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        
        String st = "delete from Cliente where CedulaCliente = "+CedulaCliente+";";
        conect.getConexion().createStatement().execute(st);
        System.out.println("Se borró Cliente");
        
    }
    
    public void borrarPaciente(int IDPaciente) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        
        String st = "delete from Paciente where IDPaciente = "+IDPaciente+";";
        conect.getConexion().createStatement().execute(st);
        System.out.println("Se borró Paciente");
        
    }
    
    public void borrarProcedimientos_Servicios(int IDProcedimiento) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        
        String st = "delete from Procedimientos_Servicios where IDProcedimiento_Servicio = "+IDProcedimiento+";";
        conect.getConexion().createStatement().execute(st);
        System.out.println("Se borró ProductoServicio");
        
    }
    
    public void borrarCategoriaServicio_Procedimiento(int IDCategoria) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        
        String st = "delete from CategoriaServicio_Procedimiento where IDCategoria = "+IDCategoria+";";
        conect.getConexion().createStatement().execute(st);
        System.out.println("Se borró Categoria");
        
    }
    
    public void borrarCitasMedicas(int IDCita) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        
        String st = "delete from CitasMedicas where IDCita = "+IDCita+";";
        conect.getConexion().createStatement().execute(st);
        System.out.println("Se borró Cita");
        
    }
    
    public void borrarHistorialPaciente(int IDPaciente) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        
        String st = "delete from CitasMedicas where IDCita = "+IDPaciente+";";
        conect.getConexion().createStatement().execute(st);
        System.out.println("Se borró la cita del historial");
        
    }
    
    public void borrarRedSociales_Veterinario(String RedSocial) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        
        String st = "delete from RedesSociales_Veterinario where RedSocial = '"+RedSocial+"';";
        conect.getConexion().createStatement().execute(st);
        System.out.println("Se borró RedSociales_Veterinario");
        
    }
    
    public void borrarRedesSociales_Veterinario(int IDVeterinario) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        
        String st = "delete from RedesSociales_Veterinario where IDVeterinario = '"+IDVeterinario+"';";
        conect.getConexion().createStatement().execute(st);
        System.out.println("Se borró RedesSociales_Veterinario");
        
    }
    
    public void borrarTelefonosVeterinario(int IDVeterinario) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        
        String st = "delete from TelefonoVeterinario where idVeterinario = '"+IDVeterinario+"';";
        conect.getConexion().createStatement().execute(st);
        System.out.println("Se eliminó Telefono idVeterinario");
        
    }
    
    public void borrarTelefonoVeterinario(int Telefono) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        
        String st = "delete from TelefonoVeterinario where Telefono = "+Telefono+";";
        conect.getConexion().createStatement().execute(st);
        System.out.println("Se eliminó Telefono Telefono");
        
    }
    
    public void borrarTelefonosCliente(int Cedula) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        
        String st = "delete from TelefonoCliente where Cedula = "+Cedula+";";
        conect.getConexion().createStatement().execute(st);
        System.out.println("Se eliminó Telefono Cedula");
        
    }
    
    public void borrarTelefonoCliente(int Telefono) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        
        String st = "delete from TelefonoCliente where Telefono = "+Telefono+";";
        conect.getConexion().createStatement().execute(st);
        System.out.println("Se eliminó Telefono Telefono");
        
    }
    
    public void borrarHorarioAtencion_Veterinario(String Dia) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        
        String st = "delete from HorariosAtencion_Veterinario where Dia = '"+Dia+"';";
        conect.getConexion().createStatement().execute(st);
        System.out.println("Se borraron los Horarios Atencion_Veterinario");
        
    }
    
    public void borrarHorariosAtencion_Veterinario(int IDVeterinario) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        
        String st = "delete from HorariosAtencion_Veterinario where IDVeterinario = '"+IDVeterinario+"';";
        conect.getConexion().createStatement().execute(st);
        System.out.println("Se borraron los Horarios Atencion_Veterinario");
        
    }
}
