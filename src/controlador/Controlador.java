/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
/*
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
*/
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import modelo.Crear;
import modelo.Leer;
import modelo.Actualizar;
import modelo.Borrar;

import vista.MenuAdministrador;
import vista.MenuVeterinario;
import vista.MenuCliente;
import vista.Login;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;
import vista.CRUDVeterinario;
*/


/**
 *
 * @author luigy
 */
public class Controlador {
    //listo
    Leer leer = new Leer();
    Borrar borrar = new Borrar();
    Crear crear = new Crear();
    Actualizar actualizar = new Actualizar();
    
    public String Desencriptar(char [] Password){
        String pass = "";
        for(int x = 0; x < Password.length; x++){
            pass = pass + Password[x];
        }
        return pass;
    }
    
    public String Login(String NombreUsuario, String Contraseña, String rol) throws SQLException, IllegalAccessException, InstantiationException, ClassNotFoundException{
        ResultSet rs = leer.LeerUsuario();
        int valor = 0;
        while (rs.next()){
            if(NombreUsuario.equals(rs.getString(1)) && Contraseña.equals(rs.getString(2))){
                if(rol.equals(rs.getString(3))){
                    if("Veterinario".equals(rol)){
                    MenuVeterinario a = new MenuVeterinario();
                    a.setVisible(true);
                    MenuVeterinario.txtPruebaUsuario.setText(NombreUsuario);
                    MenuVeterinario.txtRolInicio.setText(rol);
                    
                }else if("Cliente".equals(rol)){
                    MenuCliente a = new MenuCliente();
                    a.setVisible(true);
                    MenuCliente.txtRolEnviarCitas.setText(rol);
                    MenuCliente.txtEnviarUsuario.setText(NombreUsuario);
                    MenuCliente.txtEnviarContra.setText(Contraseña);
                    
                }else if("Administrador".equals(rol)){
                    MenuAdministrador a = new MenuAdministrador();
                    a.setVisible(true);
                    MenuAdministrador.txtNombreUsuario.setText(NombreUsuario);
                    MenuAdministrador.txtOBtenerRol.setText(rol);
                }
                    valor = 1;
                }
            }
            }
        if(valor != 1){
            //JOptionPane.showMessageDialog(null, "El usuario no existe", "Error", JOptionPane.WARNING_MESSAGE);
        }
        return null;
    }
    

    //Usuario
    
    public void BorrarUsuario(String NombreUsuario) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        borrar.borrarUsuario(NombreUsuario);
    }
    
    public void RegistrarUsuario(String NombreUsuario, String Contraseña, String Rol, String Correo) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        crear.crearUsuario(NombreUsuario, Contraseña, Rol, Correo);
    }
    
    public ResultSet LeerUsuario() throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        ResultSet rs = leer.LeerUsuario();
        //System.out.println(rs.getString(1));
        return rs;
    }
    
    public void ActualizarUsuario(String NombreUsuario, String Contraseña, String Rol, String Correo) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        actualizar.ActualizarString("Usuario", "Contraseña", Contraseña, "NombreUsuario", NombreUsuario);
        actualizar.ActualizarString("Usuario", "Rol", Rol, "NombreUsuario", NombreUsuario);
        actualizar.ActualizarString("Usuario", "Correo", Correo, "NombreUsuario", NombreUsuario);
    }
    
    //Veterinario
    
    public void BorrarVeterinario(int IDVeterinario) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        borrar.borrarVeterinario(IDVeterinario);
    }
    
    public void RegistrarVeterinario(int IDVeterinario, String NombreVeterinario, int Calificacion, String Correo, String SitioWeb, String Distrito, String Canton, String Provincia, String Señas, int UGoogleMaps, String Estado, String NombreUsuario) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        crear.crearVeterinario(IDVeterinario, NombreVeterinario, Calificacion, Correo, SitioWeb, Distrito, Canton, Provincia, Señas, UGoogleMaps, Estado, NombreUsuario);
    }
    
    public ResultSet LeerVeterinario() throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        ResultSet rs = leer.LeerVeterinario();
        return rs;
    }
    
    public void ActualizarVeterinario(int IDVeterinario, String NombreVeterinario, int Calificacion, String Correo, String SitioWeb, String Distrito, String Canton, String Provincia, String Señas, int UGoogleMaps, String Estado, String NombreUsuario) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        actualizar.ActualizarString2("Cliente", "NombreVeterinario", NombreVeterinario, "Cedula", IDVeterinario);
        actualizar.ActualizarInt2("Cliente", "Calificacion", Calificacion, "IDVeterinario", IDVeterinario);
        actualizar.ActualizarString2("Cliente", "Correo", Correo, "IDVeterinario", IDVeterinario);
        actualizar.ActualizarString2("Cliente", "SitioWeb", SitioWeb, "IDVeterinario", IDVeterinario);
        actualizar.ActualizarString2("Cliente", "Provincia", Provincia, "IDVeterinario", IDVeterinario);
        actualizar.ActualizarString2("Cliente", "Canton", Canton, "IDVeterinario", IDVeterinario);
        actualizar.ActualizarString2("Cliente", "Distrito", Distrito, "IDVeterinario", IDVeterinario);
        actualizar.ActualizarString2("Cliente", "Señas", Señas, "Cedula", IDVeterinario);
        actualizar.ActualizarInt2("Cliente", "UGoogleMaps", UGoogleMaps, "IDVeterinario", IDVeterinario);
        actualizar.ActualizarString2("Cliente", "Estado", Estado, "IDVeterinario", IDVeterinario);
        actualizar.ActualizarString2("Cliente", "NombreUsuario", NombreUsuario, "IDVeterinario", IDVeterinario);
    }
    
    //Telefono Veterinario
    
    public void RegistrarTelefonoVeterinario(int IDVeterinario, int Telefono) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        crear.crearTelefonoVeterinario(IDVeterinario, Telefono);
    }
    
    public void BorrarTelefonosVeterinario(int IDVeterinario) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        borrar.borrarTelefonosVeterinario(IDVeterinario);
    }
    
    public void BorrarTelefonoVeterinario(int Telefono) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        borrar.borrarTelefonoVeterinario(Telefono);
    }
    
    public ResultSet LeerTelefonoVeterinario() throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        ResultSet rs = leer.LeerTelefonoVeterinario();
        return rs;
    }
    
    public void ActualizarTelefonoVeterinario(int IDVeterinario, int Telefono) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        actualizar.ActualizarInt2("TelefonoVeterinario", "Telefono", Telefono, "IDVeterinario", IDVeterinario);
    }
    
    //Redes sociales Veterinario
    
    public void RegistrarRedesSociales_Veterinario(int IDVeterinario, String RedSocial, String Usuario) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        crear.crearRedesSociales_Veterinario(IDVeterinario, RedSocial, Usuario);
    }
    
    public void BorrarRedesSociales_Veterinario(int IDVeterinario) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        borrar.borrarRedesSociales_Veterinario(IDVeterinario);
    }
    
    public void BorrarRedSociales_Veterinario(String Usuario) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        borrar.borrarRedSociales_Veterinario(Usuario);
    }
    
    public ResultSet LeerRedesSociales_Veterinario() throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        ResultSet rs = leer.LeerRedesSociales_Veterinario();
        return rs;
    }
    
    public void ActualizarRedesSociales_Veterinario(int IDVeterinario, String RedSocial, String Usuario) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        actualizar.ActualizarString2("RedesSociales_Veterinario", "RedSocial", RedSocial, "IDVeterinario", IDVeterinario);
        actualizar.ActualizarString2("RedesSociales_Veterinario", "Usuario", Usuario, "IDVeterinario", IDVeterinario);
    }
    
    //Horarios Veterinario
    
    public void RegistrarHorariosAtencion_Veterinario(int IDVeterinario, String Dia, String HoraInicio, String HoraFinal) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        crear.crearHorariosAtencion_Veterinario(IDVeterinario, Dia, HoraInicio, HoraFinal);
    }
    
    public void BorrarHorariosAtencion_Veterinario(int IDVeterinario) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        borrar.borrarHorariosAtencion_Veterinario(IDVeterinario);
    }
    
    public void BorrarHorarioAtencion_Veterinario(String Dia) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        borrar.borrarHorarioAtencion_Veterinario(Dia);
    }
    
    public ResultSet LeerHorariosAtencion_Veterinario() throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        ResultSet rs = leer.LeerHorariosAtencion_Veterinario();
        return rs;
    }
    
    public void ActualizarHorariosAtencion_Veterinario(int IDVeterinario, String Dia, String HoraInicio, String HoraFinal) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        actualizar.ActualizarString2("HorariosAtencion_Veterinario", "Dia", Dia, "IDVeterinario", IDVeterinario);
        actualizar.ActualizarString2("HorariosAtencion_Veterinario", "HoraInicio", HoraInicio, "IDVeterinario", IDVeterinario);
        actualizar.ActualizarString2("HorariosAtencion_Veterinario", "HoraFinal", HoraFinal, "IDVeterinario", IDVeterinario);
    }
    
    //Cliente
    
    public void BorrarCliente(int Cedula) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        borrar.borrarCliente(Cedula);
    }
    
    public void RegistrarCliente(int CedulaCliente, String NombreCliente, String Contraseña, String Provincia, String Canton, String Distrito, String OtraSeñas, String NombreUsuario, String Correo, int UGoogleMaps) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        crear.crearCliente( CedulaCliente, NombreCliente, Contraseña, Provincia, Canton, Distrito, OtraSeñas, NombreUsuario, Correo, UGoogleMaps);
    }
    
    public ResultSet LeerCliente() throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        ResultSet rs = leer.LeerCliente();
        return rs;
    }
    
    public void ActualizarCliente(int CedulaCliente, String NombreCliente, String Contraseña, String Provincia, String Canton, String Distrito, String OtraSeñas, String NombreUsuario, String Correo, int UGoogleMaps) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        actualizar.ActualizarString2("Cliente", "NombreCliente", NombreCliente, "CedulaCliente", CedulaCliente);
        actualizar.ActualizarString2("Cliente", "Contraseña", Contraseña, "CedulaCliente", CedulaCliente);
        actualizar.ActualizarString2("Cliente", "Provincia", Provincia, "CedulaCliente", CedulaCliente);
        actualizar.ActualizarString2("Cliente", "Canton", Canton, "CedulaCliente", CedulaCliente);
        actualizar.ActualizarString2("Cliente", "Distrito", Distrito, "CedulaCliente", CedulaCliente);
        actualizar.ActualizarString2("Cliente", "OtraSeñas", OtraSeñas, "CedulaCliente", CedulaCliente);
        actualizar.ActualizarString2("Cliente", "NombreUsuario", NombreUsuario, "CedulaCliente", CedulaCliente);
        actualizar.ActualizarString2("Cliente", "Correo", Correo, "CedulaCliente", CedulaCliente);
        actualizar.ActualizarInt2("Cliente", "UGoogleMaps", UGoogleMaps, "CedulaCliente", CedulaCliente);
    }
    
    //Telefono Cliente
    
    public void RegistrarTelefonoCliente(int Cedula, int telefono) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        crear.crearTelefonoCliente(Cedula, telefono);
    }
    
    public void BorrarTelefonosCliente(int Cedula) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        borrar.borrarTelefonosCliente(Cedula);
    }
    
    public void BorrarTelefonoCliente(int Telefono) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        borrar.borrarTelefonoCliente(Telefono);
    }
    
    public ResultSet LeerTelefonoCliente() throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        ResultSet rs = leer.LeerTelefonoCliente();
        return rs;
    }
    
    public void ActualizarTelefonoCliente(int Cedula, int Telefono) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        actualizar.ActualizarInt2("TelefonoCliente", "Telefono", Telefono, "Cedula", Cedula);
    }
    
    //Paciente
    
    public void BorrarPaciente(int IDPaciente) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        borrar.borrarPaciente(IDPaciente);
    }
    
    public void RegistrarPaciente(String NombrePaciente, String Raza, String FechaNacimiento, int CedulaCliente ) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        crear.crearPaciente(NombrePaciente, Raza, FechaNacimiento, CedulaCliente);
    }
    
    public ResultSet LeerPaciente() throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        ResultSet rs = leer.LeerPaciente();
        return rs;
    }
    
    public void ActualizarPaciente(int IDPaciente, String NombrePaciente, String Raza, String FechaNacimiento, int CedulaCliente) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        actualizar.ActualizarString2("Paciente", "NombrePaciente", NombrePaciente, "IDPaciente", IDPaciente);
        actualizar.ActualizarString2("Paciente", "Raza", Raza, "IDPaciente", IDPaciente);
        actualizar.ActualizarString2("Paciente", "FechaNacimiento", FechaNacimiento, "IDPaciente", IDPaciente);
        actualizar.ActualizarInt2("Paciente", "CedulaCliente", CedulaCliente, "IDPaciente", IDPaciente);
    }
    
    //Procedimientos_Servicios
    
    public void BorrarProcedimientos_Servicios(int idProductoServicio) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        borrar.borrarProcedimientos_Servicios(idProductoServicio);
    }
    
    public void RegistrarProcedimientos_Servicios(String NombreProcedimiento, String Descripcion, String Tipo, int MontoUnitario, int MontoServicioDomicilio, int IDCategoria, String UsuarioVeterinario) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        crear.crearProcedimientos_Servicios(NombreProcedimiento, Descripcion, Tipo, MontoUnitario, MontoServicioDomicilio, IDCategoria, UsuarioVeterinario);
    }
    
    public ResultSet LeerProcedimientos_Servicios() throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        ResultSet rs = leer.LeerProcedimientos_Servicios();
        return rs;
    }
    
    public void ActualizarProcedimientoServicio(int idProductoServicio, String Nombre, String Descripcion, String Tipo, int MontoUnitario, int MontoADomicilio, int idCategoria) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        actualizar.ActualizarString2("Procedimientos_Servicios", "NombreProcedimiento", Nombre, "IDProcedimiento_Servicio", idProductoServicio);
        actualizar.ActualizarString2("Procedimientos_Servicios", "Descripcion", Descripcion, "IDProcedimiento_Servicio", idProductoServicio);
        actualizar.ActualizarString2("Procedimientos_Servicios", "Tipo", Tipo, "IDProcedimiento_Servicio", idProductoServicio);
        actualizar.ActualizarInt2("Procedimientos_Servicios", "MontoUnitario", MontoUnitario, "IDProcedimiento_Servicio", idProductoServicio);
        actualizar.ActualizarInt2("Procedimientos_Servicios", "MontoServicioDomicilio", MontoADomicilio, "IDProcedimiento_Servicio", idProductoServicio);
        actualizar.ActualizarInt2("Procedimientos_Servicios", "IDCategoria", idCategoria, "IDProcedimiento_Servicio", idProductoServicio);
    }
    
    //Citas
    
    public void BorrarCitaMedica(int IDCita ) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        borrar.borrarCitasMedicas(IDCita);
    }
    
    public void RegistrarCitaMedica(String Fecha, String Domicilio, String NombreUsuario, int IDProcedimiento, String Estado, int numFactura, int cedulaCliente, String nombreUsuarioCliente) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        crear.crearCitasMedicas(Fecha, Domicilio, NombreUsuario, IDProcedimiento, Estado, numFactura, cedulaCliente, nombreUsuarioCliente);
    }
    
    public ResultSet LeerCitaMedica() throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        ResultSet rs = leer.LeerCitasMedicas();
        return rs;
    }
    
    public void ActualizaCitaMedica(int IDCita, String Domicilio,String usuarioVeterinario,int idProcedimiento , String Estado, int numFactura, int cedulaCleinte, String fecha) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        actualizar.ActualizarString2("CitasMedicas", "Domicilio", Domicilio, "IDCita", IDCita);
        actualizar.ActualizarString2("CitasMedicas", "Estado", Estado, "IDCita", IDCita);
        actualizar.ActualizarInt2("CitasMedicas", "numFactura", numFactura, "IDCita", IDCita);
        actualizar.ActualizarInt2("CitasMedicas", "CedulaCliente", cedulaCleinte, "IDCita", IDCita);
        actualizar.ActualizarString2("CitasMedicas", "NombreUsuario", usuarioVeterinario, "IDCita", IDCita);
        actualizar.ActualizarInt2("CitasMedicas", "IDProcedimiento_Servicio", idProcedimiento, "IDCita", IDCita);
        actualizar.ActualizarString2("CitasMedicas", "Fecha", fecha, "IDCita", IDCita);
    }
    
    //HistorialPaciente
    
    public void BorrarHistorialPaciente(int IDPaciente) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        borrar.borrarHistorialPaciente(IDPaciente);
    }
    
    public void RegistrarHistorialPaciente(int IDPaciente, String Tipo, String Diagnostico, String Domicilio, int Monto, String Descripcion, String Tratamientos, String FechaRealizacion, int idCita, String usuarioVeterinario) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        crear.crearHistorialPaciente(IDPaciente, Tipo, Diagnostico, Domicilio, Monto, Descripcion, Tratamientos, FechaRealizacion, idCita, usuarioVeterinario);
    }
    
    public ResultSet LeerHistorialPaciente() throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        ResultSet rs = leer.LeerHistorialPaciente();
        return rs;
    }
    
    public void ActualizarHistorialPaciente(int IDPaciente, String Tipo, String Diagnostico, String Domicilio, int Monto, String Descripcion, String Tratamientos, String FechaRealizacion, String UsuarioVeterinario) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        actualizar.ActualizarString2("HistorialPacientes", "Tipo", Tipo, "IDPaciente", IDPaciente);
        actualizar.ActualizarString2("HistorialPacientes", "Diagnostico", Diagnostico, "IDPaciente", IDPaciente);
        actualizar.ActualizarString2("HistorialPacientes", "Domicilio", Domicilio, "IDPaciente", IDPaciente);
        actualizar.ActualizarInt2("HistorialPacientes", "Monto", Monto, "IDPaciente", IDPaciente);
        actualizar.ActualizarString2("HistorialPacientes", "Descripcion", Descripcion, "IDPaciente", IDPaciente);
        actualizar.ActualizarString2("HistorialPacientes", "Tratamientos", Tratamientos, "IDPaciente", IDPaciente);
        actualizar.ActualizarString2("HistorialPacientes", "FechaRealizacion", FechaRealizacion, "IDPaciente", IDPaciente);
        actualizar.ActualizarString2("HistorialPacientes", "UsuarioVeterinario", UsuarioVeterinario, "IDPaciente", IDPaciente);
    }
    
    //Categoria
    
    public void BorrarCategoriaServicio_Procedimiento(int IDCategoria ) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        borrar.borrarCategoriaServicio_Procedimiento(IDCategoria);
    }
    
    public void RegistrarCategoriaServicio_Procedimiento(String NombreCategoria, String Descripcion, String Estado) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        crear.crearCategoriaServicio_Procedimiento(NombreCategoria, Descripcion, Estado);
    }
    
    public ResultSet LeerCategoriaServicio_Procedimiento() throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        ResultSet rs = leer.LeerCategoriaServicio_Procedimiento();
        return rs;
    }
    
    public void ActualizarCategoria(int idCategoria, String Nombre, String Descripcion, String Estado) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        actualizar.ActualizarString2("Categoria", "Nombre", Nombre, "idCategoria", idCategoria);
        actualizar.ActualizarString2("Categoria", "Descripcion", Descripcion, "idCategoria", idCategoria);
        actualizar.ActualizarString2("Categoria", "Estado", Estado, "idCategoria", idCategoria);
    }
    /*
    public void pdf(String CedulaCliente, String Cita, String Servicio, String Veterinario) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException, IOException{
        try{
            FileOutputStream archivo;
            File file = new File("src/pdf/venta.pdf");
            archivo = new FileOutputStream(file);
            Document doc = new Document(); 
            PdfWriter.getInstance(doc, archivo);
            doc.open();
            Image img = Image.getInstance("src/img/1.jpg");


            Paragraph fecha = new Paragraph();
            Font negrita = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, BaseColor.BLUE);
            fecha.add(Chunk.NEWLINE);
            Date date = new Date();
            fecha.add("Fecha: "+ new SimpleDateFormat("dd/MM/YYYY").format(date)+"\n\n");

            PdfPTable Encabezado = new PdfPTable(4);
            Encabezado.setWidthPercentage(100);
            Encabezado.getDefaultCell().setBorder(0);
            float[] ColumnaEncabezado = new float[]{20f, 30f, 70f, 40f};
            Encabezado.setWidths(ColumnaEncabezado);
            Encabezado.setHorizontalAlignment(Element.ALIGN_LEFT);

            

            String nom = "MascoTika";
            String tel = "83173382";
            String dir = "Santa Barbara, Heredia";

            Encabezado.addCell(fecha);
            Encabezado.addCell("");
            Encabezado.addCell("\n"+nom+ "\n\nTeléfono: "+tel+ "\n\nDirección: "+dir+ "\n\nSebastian Hernández" + "\nFabián Ríos" + "\nJafet Chavarría");
            
            Encabezado.addCell(img);
            doc.add(Encabezado);

            Paragraph cli = new Paragraph();
            cli.add(Chunk.NEWLINE);
            cli.add("Factura electrónica"+"\n\n");
            doc.add(cli);

            PdfPTable tablacli = new PdfPTable(4);
            tablacli.setWidthPercentage(100);
            tablacli.getDefaultCell().setBorder(0);
            float[] Columnacli = new float[]{20f, 20f, 30f, 20f};
            tablacli.setWidths(Columnacli);
            tablacli.setHorizontalAlignment(Element.ALIGN_LEFT);
            PdfPCell cl1 = new PdfPCell(new Phrase("Cédula"));
            PdfPCell cl2 = new PdfPCell(new Phrase("Cita"));
            PdfPCell cl3 = new PdfPCell(new Phrase("Procedimiento/Servicio"));
            PdfPCell cl4 = new PdfPCell(new Phrase("Veterinario"));
            cl1.setBorder(0);
            cl2.setBorder(0);
            cl3.setBorder(0);
            cl4.setBorder(0);
            tablacli.addCell(cl1);
            tablacli.addCell(cl2);
            tablacli.addCell(cl3);
            tablacli.addCell(cl4);
            tablacli.addCell(CedulaCliente);
            tablacli.addCell(Cita);
            tablacli.addCell(Servicio);
            tablacli.addCell(Veterinario);

            doc.add(tablacli);


            doc.close();
            archivo.close();


        } catch (DocumentException e){

        }

        try {
                Properties props = new Properties();
                props.setProperty("mail.smtp.host", "smtp.gmail.com");
                props.setProperty("mail.smtp.starttls.enable", "true");
                props.setProperty("mail.smtp.port", "587");
                props.setProperty("mail.smtp.auth", "true");

                Session session = Session.getDefaultInstance(props);

                String correoRemitente = "tikamasco@gmail.com";
                String passwordRemitente = "123Mastika";
                String correoReceptor = "fabianriosn26@gmail.com"; 
                String asunto = "Factura MascoTika";
                String mensaje = "Factura de los servicios realizados. \n¡Gracias por su visita!";

                BodyPart texto = new MimeBodyPart();
                texto.setContent(mensaje, "text/html");

                BodyPart adjunto = new MimeBodyPart();
                adjunto.setDataHandler(new DataHandler(new FileDataSource("C:\\Users\\estadm\\Documents\\NetBeansProjects\\MascoTika11\\src\\pdf\\venta.pdf")));
                adjunto.setFileName("Factura.pdf");

                MimeMultipart miltiParte = new MimeMultipart();
                miltiParte.addBodyPart(texto);
                miltiParte.addBodyPart(adjunto);

                MimeMessage message = new MimeMessage(session);
                message.setFrom(new InternetAddress(correoRemitente));

                message.addRecipient(Message.RecipientType.TO, new InternetAddress(correoReceptor));
                message.setSubject(asunto);
                message.setContent(miltiParte);

                Transport t = session.getTransport("smtp");
                t.connect(correoRemitente, passwordRemitente);
                t.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
                t.close();

                JOptionPane.showMessageDialog(null, "Correo Electronico Enviado");

            } catch (AddressException ex) {} catch (MessagingException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    public static void main(String[] args){
        Login l = new Login();
        l.setVisible(true);
    }*/
    
}
