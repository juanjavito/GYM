/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import Entidades.Persona;
import Logico.PersonaLog;
import ModeloTabla.ModeloTablaPersona;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author toshiba 2013
 */
public class TablaUsuarios extends javax.swing.JFrame {

PersonaLog personas;
Persona per;
    
    public TablaUsuarios() {
        initComponents();
        this.setLocationRelativeTo(null);
        personas = new PersonaLog();
        ListarTabla();
    }

    public void ListarTabla(){
        List<Persona> listas = personas.listado();
        jTable1.setModel(new ModeloTablaPersona(listas));
        jTable1.getRowSorter();
    
    }
    public void Limpiar(){
        txtAltura.setText("");
        txtApellido.setText("");
        txtEdad.setText("");
        txtNombre.setText("");
        txtObjetivo.setText("");
        txtPatologia.setText("");
        txtPeso.setText("");
        txtSexo.setText("");
        txtCorreo.setText("");
        jDateChooser1.setDate(null);
}
       public void ListarTablaInactivos(){
        List<Persona> listas = personas.listadoInactivos();
        jTable1.setModel(new ModeloTablaPersona(listas));
        jTable1.getRowSorter();
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtObjetivo = new javax.swing.JTextField();
        txtPatologia = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        txtAltura = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuActualizar = new javax.swing.JMenuItem();
        jMenuMarcarInactivo = new javax.swing.JMenuItem();
        jMenuReintegrar = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuVerInactivos = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jTable1.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Arial Unicode MS", 0, 24)); // NOI18N
        jLabel1.setText("Clientes AQUILES ");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("Edad");

        jLabel5.setText("Objetivo");

        jLabel6.setText("Patologia");

        jLabel7.setText("Peso");

        jLabel8.setText("Altura");

        jLabel9.setText("Sexo");

        jLabel10.setText("Correo");

        jDateChooser1.setDateFormatString("yyyy-MM-dd");

        jLabel11.setText("Vencimiento ");

        jMenu1.setText("Opciones");

        jMenuActualizar.setText("Actualizar");
        jMenuActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuActualizarActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuActualizar);

        jMenuMarcarInactivo.setText("Marcar Inactivo");
        jMenuMarcarInactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuMarcarInactivoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuMarcarInactivo);

        jMenuReintegrar.setText("Reintegrar");
        jMenuReintegrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuReintegrarActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuReintegrar);

        jMenuItem3.setText("Ver activos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuVerInactivos.setText("Ver inactivos ");
        jMenuVerInactivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuVerInactivosActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuVerInactivos);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Mas");

        jMenu2.setText("Salir...");

        jMenuItem4.setText("Cerrar Sesion");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Cerrar Aplicacion");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenu4.add(jMenu2);

        jMenuItem2.setText("Regresar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtApellido))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(35, 35, 35)
                                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(txtObjetivo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPeso)
                            .addComponent(txtSexo, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(txtPatologia))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(txtObjetivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtPatologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuActualizarActionPerformed
        // TODO add your handling code here:
        
        
        per.setNombre(txtNombre.getText());
        per.setApellido(txtApellido.getText());
        per.setObjetivo(txtObjetivo.getText());
        per.setPatologia(txtPatologia.getText());
        per.setSexo(txtSexo.getText());
        per.setEdad(Integer.parseInt(txtEdad.getText()));
        per.setPeso(Integer.parseInt(txtPeso.getText()));
        per.setAltura(Integer.parseInt(txtAltura.getText()));
        per.setCorreo(txtCorreo.getText());
        per.setDate(jDateChooser1.getDate());
        boolean resp = personas.UpdatePersona(per);
        if(resp==false){
            JOptionPane.showMessageDialog(null, "Actualizado!");
         ListarTabla();
         Limpiar();
        }else{JOptionPane.showMessageDialog(null, "Error...");}
        
    }//GEN-LAST:event_jMenuActualizarActionPerformed

    private void jMenuMarcarInactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuMarcarInactivoActionPerformed
        // TODO add your handling code here:
        boolean resp = personas.Inactivo(per);
        if(resp==false){
        JOptionPane.showMessageDialog(null, "Pasado a Inactivos");
        ListarTabla();
        Limpiar();
        }else{JOptionPane.showMessageDialog(null, "Error....");}
    }//GEN-LAST:event_jMenuMarcarInactivoActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        per = ((ModeloTablaPersona) jTable1.getModel()).DamePersona(jTable1.getSelectedRow());
        txtAltura.setText(""+per.getAltura());
        txtApellido.setText(per.getApellido());
        txtEdad.setText(""+per.getEdad());
        txtNombre.setText(per.getNombre());
        txtObjetivo.setText(per.getObjetivo());
        txtPatologia.setText(per.getPatologia());
        txtPeso.setText(""+per.getPeso());
        txtSexo.setText(per.getSexo());
        txtCorreo.setText(per.getCorreo());
        jDateChooser1.setDate(per.getDate());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jMenuVerInactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuVerInactivosActionPerformed
        // TODO add your handling code here:
        ListarTablaInactivos();
    }//GEN-LAST:event_jMenuVerInactivosActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        ListarTabla();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuReintegrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuReintegrarActionPerformed
        // TODO add your handling code here:
        boolean resp = personas.Reintegro(per);
        if(resp==false){
            JOptionPane.showMessageDialog(null, "Pasado a Activos...");
            ListarTablaInactivos();
            Limpiar();
        }else{
            JOptionPane.showMessageDialog(null, "Error... ");
        }
    }//GEN-LAST:event_jMenuReintegrarActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        interfaz in = new interfaz();
        in.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        principal pr = new principal();
        pr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(TablaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TablaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TablaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TablaUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem jMenuActualizar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuMarcarInactivo;
    private javax.swing.JMenuItem jMenuReintegrar;
    private javax.swing.JMenuItem jMenuVerInactivos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtObjetivo;
    private javax.swing.JTextField txtPatologia;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtSexo;
    // End of variables declaration//GEN-END:variables
}
