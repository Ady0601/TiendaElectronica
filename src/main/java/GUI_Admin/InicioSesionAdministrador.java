/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI_Admin;

import GUI_Cliente.MenuCliente;
import Helpers.HelperCifrado;
import Logica_Conexion.Conexion;
import Logica_Negocio.Administrador;
import Logica_Negocio.Cliente;
import Logica_Negocio.Usuario;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

/**
 *
 * @author 1002807593
 */
public class InicioSesionAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form InicioSesionAdministrador
     */
    public String pathc;
    public String s;
     
     Usuario usuAdmin;
     Usuario usuCliente;
     
     
   public InicioSesionAdministrador() {
        initComponents();
        Conexion.Conectar();
        Path currentRelativePath = Paths.get("");
         s = currentRelativePath.toAbsolutePath().toString();
         pathc = s + "\\Images\\"+"Background"+".jpg";
        establecerImagen();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    public void InicioSesion() {
       
        int res, res1;
        String usuario = jTextField1.getText();
        String contraseña = String.valueOf(jPasswordField1.getPassword());

        res = Helpers.HelperValidacion.ValidarTodo(usuario);
        res1 = Helpers.HelperValidacion.ValidarTodoContraseña(contraseña);

        if (res == 0 && res1 == 0) {
           
           
            String cifrarusu = HelperCifrado.CifrarSHA256(usuario);
            String cifrarcontra = HelperCifrado.CifrarSHA256(contraseña);

            System.out.println("usu ci inter" + "\t" + cifrarusu);
            System.out.println("usu con inter" + "\t" + cifrarcontra);
            System.out.println("Usu"+ cifrarusu);
            
            if (usuario.equals("Admin")){
                usuAdmin=new Administrador("Admin", "12345");
            }else if (usuario.equals("Cliente")){
                usuCliente=new Cliente("Cliente", "12345");
           }
            if (usuCliente instanceof Cliente){
                boolean rta1 = usuCliente.LogOn(cifrarusu, cifrarcontra);
                if (rta1) {
                    JOptionPane.showMessageDialog(null, "Bienvenido Cliente");
                    MenuCliente menu= new MenuCliente();
                    menu.setVisible(true);
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(null,"Usuario o contraseña invalida");
                }
                
            } else  if (usuAdmin instanceof Administrador){
           boolean rta = usuAdmin.LogOn(cifrarusu, cifrarcontra);

            if (rta) {
                JOptionPane.showMessageDialog(null,"Bienvenido Administrador");
                MenuAdministrador menu = new MenuAdministrador();
                menu.setVisible(true);
                dispose();

            } else {
                JOptionPane.showMessageDialog(null,"Usuario o contraseña invalida");
               
            }
        } else {
           
            jTextField1.setBorder(new LineBorder(Color.RED, 2));
            jPasswordField1.setBorder(new LineBorder(Color.RED, 2));
           
           
        }

    }
    }

public void establecerImagen() {
       
        Image img = null;
        try {
            File file = new File(pathc);
           img = ImageIO.read(new File(pathc));
            //5. Setear la imagen al JLabel
            jLabel4.setIcon(new ImageIcon(img));
        } catch (IOException ioexception) {
            System.err.println(ioexception);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("Inicio de Sesion Administrador");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 46, -1, -1));

        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 108, -1, -1));

        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setText("Contraseña");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 147, -1, -1));

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 144, 150, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 105, 150, -1));

        jButton1.setBackground(new java.awt.Color(0, 51, 255));
        jButton1.setForeground(new java.awt.Color(0, 204, 204));
        jButton1.setText("Iniciar Sesion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 215, -1, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        InicioSesion();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(InicioSesionAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesionAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesionAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesionAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSesionAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
