/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import SQL.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 *
 * @author toshiba 2013
 */
public class nuevoUsuario extends javax.swing.JFrame {

    /**
     * Creates new form nuevoUsuario
     * 
     * 
     * 
     */
    
    
        Calendar c1 = Calendar.getInstance(TimeZone.getDefault());
    Calendar c2 = new GregorianCalendar();

    String dia=Integer.toString(c1.get(Calendar.DATE));
    String mes= Integer.toString(c2.get(Calendar.MONTH)+1);
    String annio = Integer.toString(c1.get(Calendar.YEAR));
    String fecha=dia+"/"+mes+"/"+annio;
 
    
    
    
    
    
    
    Conexion conecion = new Conexion();
    Connection cin= conecion.Entrar();
    PreparedStatement ps;
    String insertar="INSERT INTO cliente(Nombre,Apellido,Edad,Objetivo,Patologia,Peso,Talla,Sexo,FechaInscripcion,Vencimiento,correo) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
    void Registrar(){
        try {
            ps = cin.prepareCall(insertar);
                           String[] valores={jTextFieldNombre.getText(),jTextFieldApellido.getText(),jTextFieldEdad.getText(),
                           jTextFieldObjetivos.getText(),txtCual.getText(),jTextFieldPeso.getText(),jTextFieldTalla.getText()};
            for (int i = 0; i <7; i++) {
             ps.setString(i+1, valores[i]);
            }
            ps.setObject(8, jComboBoxSexo.getSelectedItem());
            ps.setObject(9, fecha);
            ps.setObject(10,jDateChooser1.getDate());
            ps.setObject(11, txtCorreo.getText());
            int registro=ps.executeUpdate();
            if (registro>0){JOptionPane.showMessageDialog(null, "Registrado con exito");
            
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en "+e);
        }
    
    
    }
    
    public nuevoUsuario() {
         
        initComponents();
        this.setLocationRelativeTo(null);
//                    jTextFieldEdad = new JTextField(10);
//    jTextFieldEdad.addKeyListener(new
//            KeyAdapter() {
//                public void keyTyped(KeyEvent e)
//                {char caracter=e.getKeyChar();
//                if(((caracter<'0')||
//                        (caracter>'9'))&&
//                                (caracter !='\b'))
//                {
//                    e.consume();
//                }}});
    txtCual.setVisible(false);
    jLabelPatologia.setVisible(false);
      
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellido = new javax.swing.JTextField();
        jTextFieldEdad = new javax.swing.JTextField();
        jTextFieldObjetivos = new javax.swing.JTextField();
        CheckNo = new javax.swing.JCheckBox();
        CheckSi = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldPeso = new javax.swing.JTextField();
        jTextFieldTalla = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxSexo = new javax.swing.JComboBox<>();
        txtCual = new javax.swing.JTextField();
        jLabelPatologia = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabelFondoNuevoUsr = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 390, 80, -1));

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 390, 80, -1));

        jLabel1.setFont(new java.awt.Font("Calisto MT", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre/s :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 130, -1));

        jLabel2.setFont(new java.awt.Font("Calisto MT", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apellido/s:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Calisto MT", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Edad :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Calisto MT", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Objetivos :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        jTextFieldNombre.setBackground(new java.awt.Color(102, 102, 102));
        jTextFieldNombre.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jTextFieldNombre.setForeground(new java.awt.Color(204, 204, 204));
        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 270, 30));

        jTextFieldApellido.setBackground(new java.awt.Color(102, 102, 102));
        jTextFieldApellido.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jTextFieldApellido.setForeground(new java.awt.Color(204, 204, 204));
        jTextFieldApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldApellidoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 270, 30));

        jTextFieldEdad.setBackground(new java.awt.Color(102, 102, 102));
        jTextFieldEdad.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jTextFieldEdad.setForeground(new java.awt.Color(204, 204, 204));
        jTextFieldEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEdadActionPerformed(evt);
            }
        });
        jTextFieldEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldEdadKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 270, 30));

        jTextFieldObjetivos.setBackground(new java.awt.Color(102, 102, 102));
        jTextFieldObjetivos.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jTextFieldObjetivos.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jTextFieldObjetivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 270, 30));

        CheckNo.setForeground(new java.awt.Color(255, 255, 255));
        CheckNo.setText("No");
        CheckNo.setContentAreaFilled(false);
        CheckNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckNoMouseClicked(evt);
            }
        });
        CheckNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckNoActionPerformed(evt);
            }
        });
        getContentPane().add(CheckNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));

        CheckSi.setForeground(new java.awt.Color(255, 255, 255));
        CheckSi.setText("Si");
        CheckSi.setContentAreaFilled(false);
        CheckSi.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CheckSiStateChanged(evt);
            }
        });
        CheckSi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckSiMouseClicked(evt);
            }
        });
        CheckSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckSiActionPerformed(evt);
            }
        });
        getContentPane().add(CheckSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, -1, -1));

        jLabel5.setFont(new java.awt.Font("Calisto MT", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("¿Tiene alguna patologia? :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));

        jLabel6.setFont(new java.awt.Font("Calisto MT", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Peso (kg):");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        jLabel7.setFont(new java.awt.Font("Calisto MT", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Talla (cm):");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, -1));

        jTextFieldPeso.setBackground(new java.awt.Color(102, 102, 102));
        jTextFieldPeso.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N
        jTextFieldPeso.setForeground(new java.awt.Color(204, 204, 204));
        jTextFieldPeso.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(jTextFieldPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 110, 30));

        jTextFieldTalla.setBackground(new java.awt.Color(102, 102, 102));
        jTextFieldTalla.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N
        jTextFieldTalla.setForeground(new java.awt.Color(204, 204, 204));
        jTextFieldTalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(jTextFieldTalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 110, 30));

        jLabel8.setFont(new java.awt.Font("Calisto MT", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Sexo :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, -1));

        jComboBoxSexo.setBackground(new java.awt.Color(102, 102, 102));
        jComboBoxSexo.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N
        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        jComboBoxSexo.setToolTipText("");
        getContentPane().add(jComboBoxSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 100, 20));

        txtCual.setBackground(new java.awt.Color(102, 102, 102));
        txtCual.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N
        txtCual.setForeground(new java.awt.Color(204, 204, 204));
        txtCual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCualActionPerformed(evt);
            }
        });
        getContentPane().add(txtCual, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 180, 30));

        jLabelPatologia.setFont(new java.awt.Font("Calisto MT", 0, 24)); // NOI18N
        jLabelPatologia.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPatologia.setText("¿Cual?");
        getContentPane().add(jLabelPatologia, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, -1, -1));

        jDateChooser1.setBackground(new java.awt.Color(0, 0, 0));
        jDateChooser1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jDateChooser1.setDateFormatString("dd-MM-yyyy");
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, -1, -1));

        jLabel9.setFont(new java.awt.Font("Calisto MT", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Vencimiento :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, -1, -1));

        jLabel10.setFont(new java.awt.Font("Calisto MT", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Correo:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, -1, -1));

        txtCorreo.setBackground(new java.awt.Color(102, 102, 102));
        txtCorreo.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(204, 204, 204));
        txtCorreo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 120, 30));

        jLabelFondoNuevoUsr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/orig_369892.jpg"))); // NOI18N
        getContentPane().add(jLabelFondoNuevoUsr, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          principal in=new principal();
        in.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jTextFieldApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldApellidoActionPerformed

    private void CheckNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckNoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Registrar();
        txtCual.setText("");
        jTextFieldEdad.setText("");
        jTextFieldApellido.setText("");
        jTextFieldObjetivos.setText("");
        jTextFieldPeso.setText("");
        jTextFieldNombre.setText("");
        jTextFieldTalla.setText("");
        txtCorreo.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEdadActionPerformed
        // TODO add your handling code here:


            
    }//GEN-LAST:event_jTextFieldEdadActionPerformed

    private void jTextFieldEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEdadKeyTyped
        // TODO add your handling code here:

                
                
    }//GEN-LAST:event_jTextFieldEdadKeyTyped

    private void CheckSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckSiActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_CheckSiActionPerformed

    private void txtCualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCualActionPerformed
        // TODO add your handling code here:
      
        
    }//GEN-LAST:event_txtCualActionPerformed

    private void CheckSiStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_CheckSiStateChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_CheckSiStateChanged

    private void CheckNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckNoMouseClicked
        // TODO add your handling code here:
        if(CheckNo.isSelected()){txtCual.setVisible(false);
                                   jLabelPatologia.setVisible(false);}
        CheckSi.setSelected(false);
    }//GEN-LAST:event_CheckNoMouseClicked

    private void CheckSiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckSiMouseClicked
        // TODO add your handling code here:
        if(CheckSi.isSelected()){txtCual.setVisible(true); 
                                jLabelPatologia.setVisible(true);}
        else{txtCual.setVisible(false);
             jLabelPatologia.setVisible(false);}
        CheckNo.setSelected(false);

    }//GEN-LAST:event_CheckSiMouseClicked

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
            java.util.logging.Logger.getLogger(nuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nuevoUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckNo;
    private javax.swing.JCheckBox CheckSi;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBoxSexo;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFondoNuevoUsr;
    private javax.swing.JLabel jLabelPatologia;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldEdad;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldObjetivos;
    private javax.swing.JTextField jTextFieldPeso;
    private javax.swing.JTextField jTextFieldTalla;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCual;
    // End of variables declaration//GEN-END:variables
}
