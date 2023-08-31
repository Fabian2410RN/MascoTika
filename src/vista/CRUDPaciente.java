
package vista;

import controlador.Controlador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import static vista.MenuVeterinario.txtPruebaUsuario;

public class CRUDPaciente extends javax.swing.JFrame {
    Controlador controlador = new Controlador();
    
    public CRUDPaciente() {
        initComponents();
        setLocationRelativeTo(null);
        txtRolPrincipal.setVisible(false);
        txtUsuarioVeterinarioGestionPacientes.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HistorialPacientes1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NombrePaciente = new javax.swing.JTextField();
        Raza = new javax.swing.JTextField();
        CedulaCliente = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        FechaNacimiento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtIdPaciente = new javax.swing.JTextField();
        txtRolPrincipal = new javax.swing.JTextField();
        txtUsuarioVeterinarioGestionPacientes = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPacientes = new javax.swing.JTable();
        btnPacientesAtendidos = new javax.swing.JButton();
        HistorialPaciente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHistorialPaciente = new javax.swing.JTable();
        txtVolver = new javax.swing.JButton();

        HistorialPacientes1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        HistorialPacientes1.setText("Ver historial médico");
        HistorialPacientes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistorialPacientes1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Gestión de pacientes");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre del paciente");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Raza");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Fecha de nacimiento");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Cedula del cliente");

        NombrePaciente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Raza.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        CedulaCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnConsultar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnConsultar.setText("Buscar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        FechaNacimiento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("ID del paciente");

        txtIdPaciente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtIdPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRolPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                            .addComponent(txtUsuarioVeterinarioGestionPacientes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                        .addGap(124, 124, 124))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CedulaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(Raza)
                                    .addComponent(FechaNacimiento)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel8))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtIdPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(95, 95, 95))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtIdPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2))
                    .addComponent(NombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Raza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnConsultar)
                            .addComponent(btnGuardar))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminar)
                            .addComponent(btnModificar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtRolPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(txtUsuarioVeterinarioGestionPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(154, 154, 154))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pacientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14)));

        tblPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "IDPaciente", "NombrePaciente", "Raza", "FechaNacimiento", "CedulaCliente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPacientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPacientes);
        if (tblPacientes.getColumnModel().getColumnCount() > 0) {
            tblPacientes.getColumnModel().getColumn(0).setResizable(false);
            tblPacientes.getColumnModel().getColumn(1).setResizable(false);
            tblPacientes.getColumnModel().getColumn(2).setResizable(false);
            tblPacientes.getColumnModel().getColumn(3).setResizable(false);
            tblPacientes.getColumnModel().getColumn(4).setResizable(false);
        }

        btnPacientesAtendidos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPacientesAtendidos.setText("Ver pacientes atendidos");
        btnPacientesAtendidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPacientesAtendidosActionPerformed(evt);
            }
        });

        HistorialPaciente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        HistorialPaciente.setText("Ver historial médico");
        HistorialPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistorialPacienteActionPerformed(evt);
            }
        });

        tblHistorialPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "IDPaciente", "Tipo", "Diagnostico", "Domicilio", "Monto", "Descripcion", "Tratamientos", "FechaRealizacion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHistorialPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHistorialPacienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblHistorialPaciente);
        if (tblHistorialPaciente.getColumnModel().getColumnCount() > 0) {
            tblHistorialPaciente.getColumnModel().getColumn(0).setResizable(false);
            tblHistorialPaciente.getColumnModel().getColumn(1).setResizable(false);
            tblHistorialPaciente.getColumnModel().getColumn(2).setResizable(false);
            tblHistorialPaciente.getColumnModel().getColumn(3).setResizable(false);
            tblHistorialPaciente.getColumnModel().getColumn(4).setResizable(false);
            tblHistorialPaciente.getColumnModel().getColumn(5).setResizable(false);
            tblHistorialPaciente.getColumnModel().getColumn(6).setResizable(false);
            tblHistorialPaciente.getColumnModel().getColumn(7).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(HistorialPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(btnPacientesAtendidos, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPacientesAtendidos)
                    .addComponent(HistorialPaciente))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        txtVolver.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtVolver.setText("Volver");
        txtVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(txtVolver)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVolver)
                .addContainerGap())
        );

        jPanel2.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int cedulaCiente = Integer.parseInt(this.CedulaCliente.getText());
        //int id = Integer.parseInt(this.IDPaciente.getText());
        //String user = this.IDVeterinario.getText();
        
        if(ValidaCliente(cedulaCiente)!=1){
            try {
            controlador.RegistrarPaciente(this.NombrePaciente.getText(), this.Raza.getText(), this.FechaNacimiento.getText(), cedulaCiente);
          limpiarTxt();
        } catch (SQLException | ClassNotFoundException | IllegalAccessException | InstantiationException ex) {
            Logger.getLogger(CRUDPaciente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "La cédula NO está en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        }
         
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        cargarTablaPaciente();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void tblPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPacientesMouseClicked
        try{
            int fila = tblPacientes.getSelectedRow();
            int id = Integer.parseInt(tblPacientes.getValueAt(fila, 0).toString());
            PreparedStatement ps;
            ResultSet rs;
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT IDPaciente, NombrePaciente, Raza, FechaNacimiento, CedulaCliente FROM Paciente WHERE IDPaciente=?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while(rs.next()){
                txtIdPaciente.setText(String.valueOf(id));
                NombrePaciente.setText(rs.getString("NombrePaciente"));
                Raza.setText(rs.getString("Raza")); 
                CedulaCliente.setText(rs.getString("CedulaCliente"));                
                FechaNacimiento.setText(rs.getString("FechaNacimiento"));
                          
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_tblPacientesMouseClicked

    private void txtIdPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdPacienteActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int id = Integer.parseInt(this.txtIdPaciente.getText());
        int cedula = Integer.parseInt(this.CedulaCliente.getText());
        try {
            controlador.ActualizarPaciente(id, this.NombrePaciente.getText(), this.Raza.getText(), this.FechaNacimiento.getText(), cedula);
        JOptionPane.showMessageDialog(null, "Registro modificado correctamente");
        limpiarTxt();
        } catch (SQLException | ClassNotFoundException | IllegalAccessException | InstantiationException ex) {
            Logger.getLogger(CRUDPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int id = Integer.parseInt(this.txtIdPaciente.getText());
        try {
            controlador.BorrarProcedimientos_Servicios(id);
        } catch (SQLException | ClassNotFoundException | IllegalAccessException | InstantiationException ex) {
            Logger.getLogger(CRUDPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnPacientesAtendidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacientesAtendidosActionPerformed
        cargarTablaHistorialAtendidos();
    }//GEN-LAST:event_btnPacientesAtendidosActionPerformed

    private void cargarTablaHistorialAtendidos(){
        DefaultTableModel modeloTabla = (DefaultTableModel) tblHistorialPaciente.getModel();
        modeloTabla.setRowCount(0);
        
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rmsd;
        int columnas;
        
        int[] anchos = {25, 50, 50, 50, 50, 50, 50, 50};
        for(int i = 0; i < tblHistorialPaciente.getColumnCount();i++){
            tblHistorialPaciente.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }
        String user = txtUsuarioVeterinarioGestionPacientes.getText();
        try{
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT IDPaciente, Tipo, Diagnostico, Domicilio, Monto, Descripcion, Tratamientos, FechaRealizacion  FROM HistorialPacientes WHERE usuarioVeterinario = ?");
            ps.setString(1, user);
            rs = ps.executeQuery();
            rmsd = rs.getMetaData();
            columnas = rmsd.getColumnCount();
            
            while(rs.next()){
                Object[] fila = new Object[columnas];
                for(int indice = 0; indice < columnas; indice++){
                    fila[indice] = rs.getObject(indice+1);
                }
                modeloTabla.addRow(fila);
                
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    private void HistorialPacientes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistorialPacientes1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HistorialPacientes1ActionPerformed

    private void HistorialPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistorialPacienteActionPerformed
        cargarTablaHistorialPaciente();
    }//GEN-LAST:event_HistorialPacienteActionPerformed

    private void cargarTablaHistorialPaciente(){
        DefaultTableModel modeloTabla = (DefaultTableModel) tblHistorialPaciente.getModel();
        modeloTabla.setRowCount(0);
        
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rmsd;
        int columnas;
        int[] anchos = {25, 50, 50, 50, 50, 50, 50, 50};
        for(int i = 0; i < tblHistorialPaciente.getColumnCount();i++){
            tblHistorialPaciente.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }
        String user = txtIdPaciente.getText();
        try{
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT IDPaciente, Tipo, Diagnostico, Domicilio, Monto, Descripcion, Tratamientos, FechaRealizacion, UsuarioVeterinario  FROM HistorialPacientes WHERE IDPaciente = ?");
            ps.setString(1, user);
            rs = ps.executeQuery();
            rmsd = rs.getMetaData();
            columnas = rmsd.getColumnCount();
            
            while(rs.next()){
                Object[] fila = new Object[columnas];
                for(int indice = 0; indice < columnas; indice++){
                    fila[indice] = rs.getObject(indice+1);
                }
                modeloTabla.addRow(fila);
                
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    private void tblHistorialPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHistorialPacienteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblHistorialPacienteMouseClicked

    private void txtVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVolverActionPerformed
        String nn = this.txtUsuarioVeterinarioGestionPacientes.getText();
        String ne = this.txtRolPrincipal.getText();
        MenuVeterinario ru = new MenuVeterinario();
        ru.setVisible(true);
        this.dispose();
        MenuVeterinario.txtPruebaUsuario.setText(nn);
        MenuVeterinario.txtRolInicio.setText(ne);
        
    }//GEN-LAST:event_txtVolverActionPerformed

    private void limpiarTxt(){
        NombrePaciente.setText("");
        Raza.setText("");
        FechaNacimiento.setText("");
        CedulaCliente.setText("");
      }
    private void cargarTablaPaciente(){
        DefaultTableModel modeloTabla = (DefaultTableModel) tblPacientes.getModel();
        modeloTabla.setRowCount(0);
        
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rmsd;
        int columnas;
        
        int[] anchos = {25, 150, 100, 150, 100};
        for(int i = 0; i < tblPacientes.getColumnCount();i++){
            tblPacientes.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }
        String user = txtIdPaciente.getText();
        try{
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT IDPaciente, NombrePaciente, Raza, FechaNacimiento, CedulaCliente FROM Paciente WHERE IDPaciente = ?");
            ps.setString(1, user);
            rs = ps.executeQuery();
            rmsd = rs.getMetaData();
            columnas = rmsd.getColumnCount();
            
            while(rs.next()){
                Object[] fila = new Object[columnas];
                for(int indice = 0; indice < columnas; indice++){
                    fila[indice] = rs.getObject(indice+1);
                }
                modeloTabla.addRow(fila);
                
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    public int ValidaCliente(int cedula) {
       
        int expedienteKCPro;
        boolean existe = false; //variable bandera para comprobar si NO existe el expediente en la BD
        PreparedStatement pstm;
        ResultSet res;
        int resultado = 1;
        
        try{
            Connection con = Conexion.getConexion();            
            pstm = con.prepareStatement("SELECT CedulaCliente FROM Cliente WHERE CedulaCliente = '" + cedula+ "'");            
            res = pstm.executeQuery();                        
            while(res.next()){
                existe = true;
                if(existe == true){
                    expedienteKCPro = res.getInt("CedulaCliente");              
                    if ( cedula == expedienteKCPro){                
                        resultado = 0;
                    }
                }    
            } //fin while res.next
            if ( existe == false ) {
                return resultado;
            }
            res.close();                        
           
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
          }
        return 0;
       
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CRUDPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUDPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUDPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUDPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUDPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CedulaCliente;
    private javax.swing.JTextField FechaNacimiento;
    private javax.swing.JButton HistorialPaciente;
    private javax.swing.JButton HistorialPacientes1;
    private javax.swing.JTextField NombrePaciente;
    private javax.swing.JTextField Raza;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnPacientesAtendidos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblHistorialPaciente;
    private javax.swing.JTable tblPacientes;
    private javax.swing.JTextField txtIdPaciente;
    public static javax.swing.JTextField txtRolPrincipal;
    public static javax.swing.JTextField txtUsuarioVeterinarioGestionPacientes;
    private javax.swing.JButton txtVolver;
    // End of variables declaration//GEN-END:variables
}
