/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import dbconn.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author eabr1
 */
public class Empleados extends javax.swing.JFrame {

    /**
     * Creates new form Empleados
     */
    public Empleados() {
        initComponents();
        limpiarCombobox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbCampus = new javax.swing.JComboBox<>();
        txtEncargado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbCafeteria = new javax.swing.JComboBox<>();
        cbHabilitado = new javax.swing.JCheckBox();
        btnEliminar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtDescripcion1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtDescripcion2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Tanda:");

        cbCampus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Cedula:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Buscar Empleado");

        cbCafeteria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbHabilitado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbHabilitado.setText("Habilitado");

        btnEliminar.setText("Modificar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Fecha:");

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Empleados");

        txtDescripcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcion2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Comision:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(181, 181, 181))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(cbHabilitado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDescripcion1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                    .addComponent(txtDescripcion2, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addComponent(cbCampus, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEncargado)))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbCafeteria, javax.swing.GroupLayout.Alignment.LEADING, 0, 281, Short.MAX_VALUE)
                            .addComponent(btnEliminar))
                        .addGap(31, 31, 31))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCafeteria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cbCampus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtDescripcion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDescripcion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbHabilitado)
                    .addComponent(jButton1))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        int selectedIndex = cbCafeteria.getSelectedIndex();

        if(selectedIndex == -1){
            JOptionPane.showMessageDialog(Empleados.this, "Debe seleccionar un elemento.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        //        else if(contrasenaUsuario == null || contrasenaUsuario.length() == 0){
            //            JOptionPane.showMessageDialog(UsuariosTipos.this, "El campo Clave no puede estar vacio.", "Error", JOptionPane.ERROR_MESSAGE);
            //        }
        //
        //        else if(contrasenaUsuario2 == null || contrasenaUsuario2.length() == 0){
            //            JOptionPane.showMessageDialog(UsuariosTipos.this, "El campo Confirmar no puede estar vacio.", "Error", JOptionPane.ERROR_MESSAGE);
            //        }
        //
        //        else if(!contrasenaUsuario.equals(contrasenaUsuario2)){
            //            JOptionPane.showMessageDialog(UsuariosTipos.this, "Las claves no coinciden.", "Error", JOptionPane.ERROR_MESSAGE);
            //        }
        else{
            Object selectedItem = cbCafeteria.getSelectedItem();

            String nombreUsuario = selectedItem.toString();
            try {
                // Obtener una conexión de la base de datos
                Connection conexion = ConexionBD.obtenerConexion();

                // Consulta SQL para verificar el inicio de sesión
                String consulta = "DELETE FROM ISO610.Cafeteria Where descripcion = ?";
                PreparedStatement preparedStatement = conexion.prepareStatement(consulta);
                preparedStatement.setString(1, nombreUsuario);

                int filasInsertadas = preparedStatement.executeUpdate();

                JOptionPane.showMessageDialog(Empleados.this, "Cafeteria eliminado correctamente.", "Completado", JOptionPane.INFORMATION_MESSAGE);
                limpiarCombobox();

                // Cerrar recursos
                preparedStatement.close();
                ConexionBD.cerrarConexion(conexion);

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String descrip = txtDescripcion.getText();
        String Encar = txtEncargado.getText();

        int selectedIndex = cbCampus.getSelectedIndex();

        if(descrip == null || descrip.length() == 0){
            JOptionPane.showMessageDialog(Empleados.this, "El campo Descripción no puede estar vacio.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if (selectedIndex == -1)
        JOptionPane.showMessageDialog(Empleados.this, "El campo Campus no puede estar vacio.", "Error", JOptionPane.ERROR_MESSAGE);
        else if(Encar == null || Encar.length() == 0){
            JOptionPane.showMessageDialog(Empleados.this, "El campo Encargado no puede estar vacio.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            int Habilitado = 0;

            if(cbHabilitado.isSelected()){
                Habilitado = 1;
            }

            try {

                Object selectedItem = cbCampus.getSelectedItem();

                String Campus = selectedItem.toString();

                // Obtener una conexión de la base de datos
                Connection conexion = ConexionBD.obtenerConexion();

                // Consulta SQL para verificar el inicio de sesión
                String consulta = "IF NOT EXISTS (SELECT TOP 1 1 FROM iso610.Cafeteria WHERE Descripcion = ? ) BEGIN INSERT INTO iso610.Cafeteria (Descripcion, IdCampus,Encargado,Estado) VALUES (?,(select idcampus FROM ISO610.Campus Where descripcion = ?),?,?) END";
                PreparedStatement preparedStatement = conexion.prepareStatement(consulta);
                preparedStatement.setString(1, descrip);
                preparedStatement.setString(2, descrip);
                preparedStatement.setString(3, Campus);
                preparedStatement.setString(4, Encar);
                preparedStatement.setInt(5, Habilitado);

                int filasInsertadas = preparedStatement.executeUpdate();

                JOptionPane.showMessageDialog(Empleados.this, "Cafeteria agregada correctamente.", "Completado", JOptionPane.INFORMATION_MESSAGE);
                limpiarCombobox();
                // Cerrar recursos
                preparedStatement.close();
                ConexionBD.cerrarConexion(conexion);

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtDescripcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcion2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcion2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cbCafeteria;
    private javax.swing.JComboBox<String> cbCampus;
    private javax.swing.JCheckBox cbHabilitado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDescripcion1;
    private javax.swing.JTextField txtDescripcion2;
    private javax.swing.JTextField txtEncargado;
    // End of variables declaration//GEN-END:variables

    private void limpiarCombobox() {
        cbCafeteria.removeAllItems();               
        cbCampus.removeAllItems();       
        
    }
}
