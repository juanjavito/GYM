/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import SQL.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author toshiba 2013
 */
public class nuevaCuenta extends javax.swing.JFrame {

    /**
     * Creates new form nuevaCuenta
     */
Conexion conecion=new Conexion();
Connection cin = conecion.Entrar();//llamamos al metodo connect

    PreparedStatement ps;

void Registrar(){//creo metodo vacio
String insertar="insert into usuario (Usuario,Contraseña)values(?,?)";

    try {
        ps = cin.prepareCall(insertar);
        ps.setString(1, txtUsuario.getText());
        ps.setString(2, txtContra.getText());
        int registro=ps.executeUpdate();
        if(registro>0){
        JOptionPane.showMessageDialog(null, "USUARIO CREADO...");
        }
        else{JOptionPane.showMessageDialog(null, "Hubo un error, intenta de nuevo");}
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "ERROR EN : "+e);
    }
}

    public nuevaCuenta() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtRepetirContra = new javax.swing.JPasswordField();
        txtContra = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JTextField();
        botonAceptar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        jLabel1.setText("USUARIO :");

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        jLabel2.setText("CONTRASEÑA :");

        jLabel3.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        jLabel3.setText("REPETIR CONTRASEÑA :");

        jLabel4.setFont(new java.awt.Font("Arial Unicode MS", 0, 24)); // NOI18N
        jLabel4.setText("NUEVO USUARIO");

        txtUsuario.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        botonAceptar.setText("Aceptar");
        botonAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAceptarMouseClicked(evt);
            }
        });
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel4))
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addGap(6, 6, 6)
                .addComponent(txtRepetirContra, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(botonAceptar)
                .addGap(6, 6, 6)
                .addComponent(botonCancelar))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtRepetirContra, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonAceptar)
                    .addComponent(botonCancelar)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        // TODO add your handling code here:
     String ClaveSegura = "aquiles2017leo";
     String ClaveSeguraUsuario = JOptionPane.showInputDialog("Por razones de seguridad, para crear un usuario \n Ingrese clave segura");
     
     if(ClaveSegura.equals(ClaveSeguraUsuario)){
     if(txtRepetirContra.getText().equals(txtContra.getText())==false){
     JOptionPane.showMessageDialog(null, "No coinciden las contraseñas"); 
        
     }else{Registrar();
            dispose();}
     }else{JOptionPane.showMessageDialog(null, "Buen intento ;)");}  
    }//GEN-LAST:event_botonAceptarActionPerformed
    
    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        // TODO add your handling code here:
        int salir;
        salir=JOptionPane.showConfirmDialog(null,"¿Esta Seguro?","confirme",JOptionPane.YES_NO_OPTION);
        if(salir==0){dispose();} //dispose cierra la ventana
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAceptarMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_botonAceptarMouseClicked

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
            java.util.logging.Logger.getLogger(nuevaCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nuevaCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nuevaCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nuevaCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nuevaCuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JPasswordField txtRepetirContra;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
