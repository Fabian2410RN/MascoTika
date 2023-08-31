/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import static vista.CRUDProcedimientoServicio.txtUsuarioPro;

public class CRUDHistorial extends javax.swing.JFrame {
    
    Controlador controlador = new Controlador();
    

    public CRUDHistorial() {
        initComponents();
        setLocationRelativeTo(null);
                
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        Lista1 = new javax.swing.JButton();
        btnCrearHistorialCita = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        panelDatos1 = new javax.swing.JPanel();
        lbl10 = new javax.swing.JLabel();
        txtUsuarioVeterinarionHistorial = new javax.swing.JTextField();
        lbl8 = new javax.swing.JLabel();
        txtTratamientoHistorial = new javax.swing.JTextField();
        lbl7 = new javax.swing.JLabel();
        txtDescripcionHistorial = new javax.swing.JTextField();
        lbl6 = new javax.swing.JLabel();
        txtMontoHistorial = new javax.swing.JTextField();
        lbl2 = new javax.swing.JLabel();
        btnDomicilioHistorial = new javax.swing.JComboBox<>();
        lbl4 = new javax.swing.JLabel();
        txtDiagnosticoHistorial = new javax.swing.JTextField();
        lbl3 = new javax.swing.JLabel();
        cboTipoHistorial = new javax.swing.JComboBox<>();
        lbl1 = new javax.swing.JLabel();
        txtIDPacienteHistorial = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtIDCitaHistorial = new javax.swing.JTextField();

        jRadioButton1.setText("jRadioButton1");

        Lista1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lista1.setText("Procedimientos");
        Lista1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lista1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCrearHistorialCita.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCrearHistorialCita.setText("Crear");
        btnCrearHistorialCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearHistorialCitaActionPerformed(evt);
            }
        });

        btnVolver.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Resultados de cita ");

        panelDatos1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        lbl10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl10.setText("Veterinario");

        txtUsuarioVeterinarionHistorial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbl8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl8.setText("Tratamientos");

        txtTratamientoHistorial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbl7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl7.setText("Descripcion");

        txtDescripcionHistorial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbl6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl6.setText("Monto");

        txtMontoHistorial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMontoHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoHistorialActionPerformed(evt);
            }
        });

        lbl2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl2.setText("Domicilio");

        btnDomicilioHistorial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDomicilioHistorial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        lbl4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl4.setText("Diagnostico");

        txtDiagnosticoHistorial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbl3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl3.setText("Tipo");

        cboTipoHistorial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboTipoHistorial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Servicio", "Procedimiento" }));

        lbl1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl1.setText("ID del Paciente");

        txtIDPacienteHistorial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("ID Cita");

        txtIDCitaHistorial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout panelDatos1Layout = new javax.swing.GroupLayout(panelDatos1);
        panelDatos1.setLayout(panelDatos1Layout);
        panelDatos1Layout.setHorizontalGroup(
            panelDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatos1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatos1Layout.createSequentialGroup()
                        .addGroup(panelDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDatos1Layout.createSequentialGroup()
                                .addComponent(lbl7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDescripcionHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelDatos1Layout.createSequentialGroup()
                                .addComponent(lbl10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtUsuarioVeterinarionHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelDatos1Layout.createSequentialGroup()
                                .addComponent(lbl8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(txtTratamientoHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelDatos1Layout.createSequentialGroup()
                                .addComponent(lbl6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtMontoHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelDatos1Layout.createSequentialGroup()
                                .addComponent(lbl4)
                                .addGap(43, 43, 43)
                                .addComponent(txtDiagnosticoHistorial))
                            .addGroup(panelDatos1Layout.createSequentialGroup()
                                .addComponent(lbl2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDomicilioHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatos1Layout.createSequentialGroup()
                                .addGroup(panelDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtIDPacienteHistorial, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cboTipoHistorial, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtIDCitaHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(19, 19, 19))
                    .addGroup(panelDatos1Layout.createSequentialGroup()
                        .addComponent(lbl1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelDatos1Layout.setVerticalGroup(
            panelDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatos1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(panelDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIDCitaHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl1)
                    .addComponent(txtIDPacienteHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(panelDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl3)
                    .addComponent(cboTipoHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl4)
                    .addComponent(txtDiagnosticoHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl2)
                    .addComponent(btnDomicilioHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl6)
                    .addComponent(txtMontoHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl7)
                    .addComponent(txtDescripcionHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl8)
                    .addComponent(txtTratamientoHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl10)
                    .addComponent(txtUsuarioVeterinarionHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelDatos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCrearHistorialCita, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVolver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(panelDatos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(btnCrearHistorialCita)
                        .addGap(18, 18, 18)
                        .addComponent(btnVolver)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearHistorialCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearHistorialCitaActionPerformed
        Calendar fecha = new GregorianCalendar();
        int año = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        
        String sA = String.valueOf(año);
        String sB = String.valueOf(mes+1);        
        String sC = String.valueOf(dia);
        
        String res = sA+"-"+ sB+"-"+sC;
        //int idCita = Integer.parseInt(this.txtIdCita.getText());
        int idPaciente = Integer.parseInt(this.txtIDPacienteHistorial.getText());
        int monto = Integer.parseInt(this.txtMontoHistorial.getText());
        int idCitaHistorial = Integer.parseInt(this.txtIDCitaHistorial.getText());
        
         
        //String user = this.txtUsuarioPro.getText();
        try {
            controlador.RegistrarHistorialPaciente(idPaciente, this.cboTipoHistorial.getSelectedItem().toString(), this.txtDiagnosticoHistorial.getText(), this.btnDomicilioHistorial.getSelectedItem().toString(), monto, this.txtDescripcionHistorial.getText(), this.txtTratamientoHistorial.getText(), res, idCitaHistorial, this.txtUsuarioVeterinarionHistorial.getText());
          limpiarTxt();
        } catch (SQLException | ClassNotFoundException | IllegalAccessException | InstantiationException ex) {
            Logger.getLogger(CRUDHistorial.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnCrearHistorialCitaActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        MenuVeterinario ru = new MenuVeterinario();
        ru.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtMontoHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoHistorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoHistorialActionPerformed

    private void Lista1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lista1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Lista1ActionPerformed
    
    
    private void limpiarTxt(){
        txtIDPacienteHistorial.setText("");
        txtDiagnosticoHistorial.setText("");
        txtDescripcionHistorial.setText("");
        txtMontoHistorial.setText("");
        txtTratamientoHistorial.setText("");
        txtUsuarioVeterinarionHistorial.setText("");
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
            java.util.logging.Logger.getLogger(CRUDHistorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUDHistorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUDHistorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUDHistorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUDHistorial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Lista1;
    private javax.swing.JButton btnCrearHistorialCita;
    public static javax.swing.JComboBox<String> btnDomicilioHistorial;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cboTipoHistorial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JPanel panelDatos1;
    private javax.swing.JTextField txtDescripcionHistorial;
    public static javax.swing.JTextField txtDiagnosticoHistorial;
    public static javax.swing.JTextField txtIDCitaHistorial;
    private javax.swing.JTextField txtIDPacienteHistorial;
    private javax.swing.JTextField txtMontoHistorial;
    private javax.swing.JTextField txtTratamientoHistorial;
    public static javax.swing.JTextField txtUsuarioVeterinarionHistorial;
    // End of variables declaration//GEN-END:variables
}
