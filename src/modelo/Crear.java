/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.SQLException;
import javax.swing.JTextField;

/**
 *
 * @author luigy
 */
public class Crear {
    
    Conexion conect = new Conexion();
    
    public void crearUsuario(String NombreUsuario, String Contraseña, String Rol, String Correo) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        
        String st = "insert into Usuario values ('"+NombreUsuario+"', '"+Contraseña+"', '"+Rol+"', '"+Correo+"');";
        conect.getConexion().createStatement().execute(st);
        System.out.println("Se creó Usuario");
        
    }
    
    
    public void crearVeterinario(int IDVeterinario, String NombreVeterinario, int Calificacion, String Correo, String SitioWeb, String Distrito, String Canton, String Provincia, String Señas, int UGoogleMaps, String Estado, String NombreUsuario) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        
        String st = "insert into Veterinario values ("+IDVeterinario+", '"+NombreVeterinario+"', "+Calificacion+", '"+Correo+"', '"+SitioWeb+"', '"+Distrito+"', '"+Canton+"', '"+Provincia+"', '"+Señas+"', "+UGoogleMaps+", '"+Estado+"', '"+NombreUsuario+"');";
        conect.getConexion().createStatement().execute(st);
        System.out.println("Se creó Veterinario");
        
    }
    
    public void crearCliente(int CedulaCliente, String NombreCliente, String Contraseña, String Provincia, String Canton, String Distrito, String OtraSeñas, String NombreUsuario, String Correo, int UGoogleMaps) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        
        String st = "insert into Cliente values ("+CedulaCliente+", '"+NombreCliente+"', '"+Contraseña+"', '"+Provincia+"', '"+Canton+"', '"+Distrito+"', '"+OtraSeñas+"', '"+NombreUsuario+"', '"+Correo+"', "+UGoogleMaps+");";
        conect.getConexion().createStatement().execute(st);
        System.out.println("Se creó Cliente");
        
    }
    
    public void crearPaciente(String NombrePaciente, String Raza, String FechaNacimiento, int CedulaCliente ) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        
        String st = "insert into Paciente values ('"+NombrePaciente+"', '"+Raza+"', '"+FechaNacimiento+"', "+CedulaCliente+");";
        conect.getConexion().createStatement().execute(st);
        System.out.println("Se creó Paciente");
        
    }
    
    public void crearProcedimientos_Servicios(String NombreProcedimiento, String Descripcion, String Tipo, int MontoUnitario, int MontoServicioDomicilio, int IDCategoria, String UsuarioVeterinario) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        
        String st = "insert into Procedimientos_Servicios values ('"+NombreProcedimiento+"', '"+Descripcion+"', '"+Tipo+"', "+MontoUnitario+", "+MontoServicioDomicilio+", "+IDCategoria+", '"+UsuarioVeterinario+"');";
        conect.getConexion().createStatement().execute(st);
        System.out.println("Se creó Procedimiento");
    }
    
    public void crearCategoriaServicio_Procedimiento(String NombreCategoria, String Descripcion, String Estado) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        
        String st = "insert into CategoriaServicio_Procedimiento values ('"+NombreCategoria+"', '"+Descripcion+"', '"+Estado+"');";
        conect.getConexion().createStatement().execute(st);
        System.out.println("Se creó Categoria");
        
    }
    
    public void crearCitasMedicas(String Fecha, String Domicilio, String NombreUsuario, int IDProcedimiento, String Estado, int numFactura, int IDPaciente_Cita, String nombreUsuarioCliente) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        
        String st = "insert into CitasMedicas values ('"+Fecha+"', '"+Domicilio+"', '"+NombreUsuario+"', "+IDProcedimiento+", '"+Estado+"', "+numFactura+", '"+IDPaciente_Cita+"', '"+nombreUsuarioCliente+"');";
        conect.getConexion().createStatement().execute(st);
        System.out.println("Se creó CitasMedicas");
        
    }
    
    public void crearHistorialPaciente(int IDPaciente, String Tipo, String Diagnostico, String Domicilio, int Monto, String Descripcion, String Tratamientos, String FechaRealizacion, int idCita, String usuarioVeterinario) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        
        String st = "insert into HistorialPacientes values ("+IDPaciente+", '"+Tipo+"', '"+Diagnostico+"', '"+Domicilio+"', "+Monto+", '"+Descripcion+"', '"+Tratamientos+"', '"+FechaRealizacion+"', "+idCita+", '"+usuarioVeterinario+"');";
        conect.getConexion().createStatement().execute(st);
        System.out.println("Se creó CitasMedicas");
        
    }
    
    public void crearRedesSociales_Veterinario(int CedulaVeterinario, String RedSocial, String Usuario) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        
        String st = "insert into RedesSociales_Veterinario values ('"+CedulaVeterinario+"', '"+RedSocial+"', '"+Usuario+"');";
        conect.getConexion().createStatement().execute(st);
        System.out.println("Se creó RedesSociales_Veterinario");
        
    }
    
    public void crearTelefonoVeterinario(int IDVeterinario, int Telefono) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        
        String st = "insert into TelefonoVeterinario values ('"+IDVeterinario+"', "+Telefono+");";
        conect.getConexion().createStatement().execute(st);
        System.out.println("Se creó TelefonoVeterinario");
        
    }
    
    public void crearTelefonoCliente(int CedulaCliente, int Telefono) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        
        String st = "insert into TelefonoCliente values ("+CedulaCliente+", "+Telefono+");";
        conect.getConexion().createStatement().execute(st);
        System.out.println("Se creó TelefonoCliente");
        
    }
    
    public void crearHorariosAtencion_Veterinario(int IDVeterinario, String Dia, String HoraInicio, String HoraFinal) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        
        String st = "insert into HorariosAtencion_Veterinario values ("+IDVeterinario+", '"+Dia+"', '"+HoraInicio+"', '"+HoraFinal+"');";
        conect.getConexion().createStatement().execute(st);
        System.out.println("Se creó HorariosAtencion_Veterinario");
        
    }
}
