/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author toshiba 2013
 */
public class interfaz extends javax.swing.JFrame {

    /**
     * Creates new form interfaz
     */
    public interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
public Image getIconImage(){
Image retValue=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/icono.png"));
return retValue;
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
        jButtonSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldUser = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButtonIniciarSesion = new javax.swing.JButton();
        nuevoUsuario = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Calisto MT", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Contraseña :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 210, 50));

        jButtonSalir.setBackground(new java.awt.Color(51, 51, 51));
        jButtonSalir.setForeground(new java.awt.Color(240, 240, 240));
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Calisto MT", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, -1, -1));

        jTextFieldUser.setBackground(new java.awt.Color(102, 102, 102));
        jTextFieldUser.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jTextFieldUser.setForeground(new java.awt.Color(240, 240, 240));
        getContentPane().add(jTextFieldUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 180, 30));

        jPasswordField1.setBackground(new java.awt.Color(102, 102, 102));
        jPasswordField1.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(240, 240, 240));
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 180, 30));

        jButtonIniciarSesion.setBackground(new java.awt.Color(0, 0, 0));
        jButtonIniciarSesion.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jButtonIniciarSesion.setText("Ingresar");
        jButtonIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonIniciarSesionMouseClicked(evt);
            }
        });
        jButtonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 240, 40));

        nuevoUsuario.setBackground(new java.awt.Color(0, 0, 0));
        nuevoUsuario.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        nuevoUsuario.setText("Crear usuario");
        nuevoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nuevoUsuarioMouseClicked(evt);
            }
        });
        nuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(nuevoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, 240, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/525201_107948892742356_961805602_n.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 680, -1));

        jLabelFondo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dumbbells_fitness_gym_113149_1920x1080.jpg"))); // NOI18N
        jLabelFondo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 699, 533));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonIniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonIniciarSesionMouseClicked
        // TODO add your handling code here:
        String usuario="javier";
        String contraseña="escudero";
        String pass=new String(jPasswordField1.getPassword());
        
        
        if(jTextFieldUser.getText().equals(usuario)&&pass.equals(contraseña)){
            JOptionPane.showMessageDialog(null, "Bienvenido: "+usuario);
        principal in=new principal();
        in.setVisible(true);
        dispose();
        
        
        }
        
        
        else{JOptionPane.showMessageDialog(null, "USUARIO O CONTRASEÑA INCORRECTA","ERROR",JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_jButtonIniciarSesionMouseClicked

    private void nuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoUsuarioActionPerformed
        // TODO add your handling code here:
                nuevaCuenta in=new nuevaCuenta();
        in.setVisible(true);
        
        
    }//GEN-LAST:event_nuevoUsuarioActionPerformed

    private void nuevoUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoUsuarioMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_nuevoUsuarioMouseClicked

    private void jButtonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonIniciarSesionActionPerformed

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
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIniciarSesion;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextFieldUser;
    private javax.swing.JButton nuevoUsuario;
    // End of variables declaration//GEN-END:variables
}