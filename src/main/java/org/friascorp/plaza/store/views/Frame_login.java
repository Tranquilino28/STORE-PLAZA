/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.friascorp.plaza.store.views;

import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import org.friascorp.plaza.store.views.controlframe.Control_framelogin;

/**
 *
 * @author ntnfr
 */
public class Frame_login extends javax.swing.JFrame {

    /**
     * Creates new form Frame_login
     */
    public Frame_login() {
        initComponents();
        
        new Control_framelogin(this);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lg_pcontenedor = new javax.swing.JPanel();
        lg_pusuario = new javax.swing.JPanel();
        lgp_txusuario = new javax.swing.JTextField();
        lgp_txcontraseña = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lgp_btninicioseccion = new javax.swing.JButton();
        lgp_btnregistrarse = new javax.swing.JButton();
        lg_labellogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lg_pcontenedor.setBackground(new java.awt.Color(23, 20, 86));

        lg_pusuario.setBackground(new java.awt.Color(255, 87, 51));

        lgp_txusuario.setBackground(new java.awt.Color(255, 87, 51));
        lgp_txusuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lgp_txusuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lgp_txusuario.setBorder(null);
        lgp_txusuario.setCaretColor(new java.awt.Color(0, 0, 102));

        lgp_txcontraseña.setBackground(new java.awt.Color(255, 87, 51));
        lgp_txcontraseña.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lgp_txcontraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lgp_txcontraseña.setText("jP");
        lgp_txcontraseña.setBorder(null);
        lgp_txcontraseña.setCaretColor(new java.awt.Color(0, 0, 102));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("USUARIO");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("CONTRASEÑA");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("LOGIN");

        lgp_btninicioseccion.setBackground(new java.awt.Color(0, 0, 153));
        lgp_btninicioseccion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lgp_btninicioseccion.setForeground(new java.awt.Color(204, 204, 204));
        lgp_btninicioseccion.setText("INICIAR SECCION");
        lgp_btninicioseccion.setBorder(null);

        lgp_btnregistrarse.setBackground(new java.awt.Color(0, 0, 153));
        lgp_btnregistrarse.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lgp_btnregistrarse.setForeground(new java.awt.Color(204, 204, 204));
        lgp_btnregistrarse.setText("REGISTRARSE");
        lgp_btnregistrarse.setBorder(null);

        javax.swing.GroupLayout lg_pusuarioLayout = new javax.swing.GroupLayout(lg_pusuario);
        lg_pusuario.setLayout(lg_pusuarioLayout);
        lg_pusuarioLayout.setHorizontalGroup(
            lg_pusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lg_pusuarioLayout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lg_pusuarioLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(lg_pusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(lg_pusuarioLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lgp_txcontraseña))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(lg_pusuarioLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lgp_txusuario))
                    .addGroup(lg_pusuarioLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lgp_btninicioseccion, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lgp_btnregistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );
        lg_pusuarioLayout.setVerticalGroup(
            lg_pusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lg_pusuarioLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(lg_pusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lgp_txusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(lg_pusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lgp_txcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(lg_pusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lgp_btninicioseccion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lgp_btnregistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        lg_labellogo.setForeground(new java.awt.Color(255, 255, 255));
        lg_labellogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lg_labellogo.setText("LOGO EMPRESARIAL");

        javax.swing.GroupLayout lg_pcontenedorLayout = new javax.swing.GroupLayout(lg_pcontenedor);
        lg_pcontenedor.setLayout(lg_pcontenedorLayout);
        lg_pcontenedorLayout.setHorizontalGroup(
            lg_pcontenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lg_pcontenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lg_labellogo, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lg_pusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lg_pcontenedorLayout.setVerticalGroup(
            lg_pcontenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lg_pcontenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lg_pcontenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lg_labellogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lg_pusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lg_pcontenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lg_pcontenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Frame_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JLabel lg_labellogo;
    private javax.swing.JPanel lg_pcontenedor;
    private javax.swing.JPanel lg_pusuario;
    public javax.swing.JButton lgp_btninicioseccion;
    public javax.swing.JButton lgp_btnregistrarse;
    public javax.swing.JPasswordField lgp_txcontraseña;
    public javax.swing.JTextField lgp_txusuario;
    // End of variables declaration//GEN-END:variables
}