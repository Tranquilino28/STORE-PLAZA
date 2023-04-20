/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.friascorp.plaza.store.views.panels;

import org.friascorp.plaza.store.views.panels.controlpanels.Control_plogin;

/**
 *
 * @author B8
 */
public class P_login extends javax.swing.JPanel {

    /**
     * Creates new form P_login
     */
    public P_login() {
        initComponents();
         new Control_plogin(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

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

        setBackground(new java.awt.Color(23, 20, 86));

        lg_pusuario.setBackground(new java.awt.Color(255, 87, 51));
        lg_pusuario.setLayout(new java.awt.GridBagLayout());

        lgp_txusuario.setBackground(new java.awt.Color(255, 87, 51));
        lgp_txusuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lgp_txusuario.setForeground(java.awt.Color.white);
        lgp_txusuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lgp_txusuario.setBorder(null);
        lgp_txusuario.setCaretColor(new java.awt.Color(255, 255, 255));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 281;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(57, 25, 0, 0);
        lg_pusuario.add(lgp_txusuario, gridBagConstraints);

        lgp_txcontraseña.setBackground(new java.awt.Color(255, 87, 51));
        lgp_txcontraseña.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lgp_txcontraseña.setForeground(java.awt.Color.white);
        lgp_txcontraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lgp_txcontraseña.setText("jP");
        lgp_txcontraseña.setBorder(null);
        lgp_txcontraseña.setCaretColor(new java.awt.Color(255, 255, 255));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 280;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(46, 25, 0, 0);
        lg_pusuario.add(lgp_txcontraseña, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 280;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 25, 0, 0);
        lg_pusuario.add(jSeparator1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 280;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 25, 0, 0);
        lg_pusuario.add(jSeparator2, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("USUARIO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 115, 0, 0);
        lg_pusuario.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("CONTRASEÑA");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 95, 0, 0);
        lg_pusuario.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("LOGIN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 139, 0, 0);
        lg_pusuario.add(jLabel4, gridBagConstraints);

        lgp_btninicioseccion.setBackground(new java.awt.Color(0, 0, 153));
        lgp_btninicioseccion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lgp_btninicioseccion.setForeground(java.awt.Color.white);
        lgp_btninicioseccion.setText("INICIAR");
        lgp_btninicioseccion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 82;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 25, 24, 0);
        lg_pusuario.add(lgp_btninicioseccion, gridBagConstraints);

        lgp_btnregistrarse.setBackground(new java.awt.Color(0, 0, 153));
        lgp_btnregistrarse.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lgp_btnregistrarse.setForeground(java.awt.Color.white);
        lgp_btnregistrarse.setText("REGISTRARSE");
        lgp_btnregistrarse.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 53;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 6, 24, 31);
        lg_pusuario.add(lgp_btnregistrarse, gridBagConstraints);

        lg_labellogo.setForeground(new java.awt.Color(255, 255, 255));
        lg_labellogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lg_labellogo, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lg_pusuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lg_pusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 357, Short.MAX_VALUE)
                    .addComponent(lg_labellogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JLabel lg_labellogo;
    private javax.swing.JPanel lg_pusuario;
    public javax.swing.JButton lgp_btninicioseccion;
    public javax.swing.JButton lgp_btnregistrarse;
    public javax.swing.JPasswordField lgp_txcontraseña;
    public javax.swing.JTextField lgp_txusuario;
    // End of variables declaration//GEN-END:variables
}
