/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.friascorp.plaza.store.views;

import org.friascorp.plaza.store.views.controlframe.Control_framework;

/**
 *
 * @author ntnfr
 */
public class Frame_work extends javax.swing.JFrame {

    /**
     * Creates new form Frame_work
     */
    public Frame_work() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        new Control_framework(this);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        wr_pcalco = new javax.swing.JPanel();
        wr_contcabecera = new javax.swing.JPanel();
        wr_pcabecera = new javax.swing.JPanel();
        wr_lfecha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        wr_psecciones = new javax.swing.JPanel();
        wr_btnventas = new javax.swing.JButton();
        wr_btnempleados = new javax.swing.JButton();
        wr_btnclientes = new javax.swing.JButton();
        wr_btningresosEgresos = new javax.swing.JButton();
        wr_btninventarios = new javax.swing.JButton();
        wr_btndasboard = new javax.swing.JButton();
        wr_btnprovedores = new javax.swing.JButton();
        wr_framecontenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        wr_pcalco.setBackground(new java.awt.Color(0, 0, 102));

        wr_contcabecera.setLayout(new java.awt.BorderLayout());

        wr_pcabecera.setBackground(new java.awt.Color(204, 204, 204));

        wr_lfecha.setBackground(new java.awt.Color(0, 0, 153));
        wr_lfecha.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        wr_lfecha.setForeground(new java.awt.Color(0, 51, 153));
        wr_lfecha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        wr_lfecha.setText("dd-mm-aaaa 00:00:00");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Rol : ");

        wr_psecciones.setBackground(new java.awt.Color(102, 102, 102));

        wr_btnventas.setText("VENTAS");
        wr_btnventas.setBorder(null);

        wr_btnempleados.setText("EMPLEADOS");
        wr_btnempleados.setBorder(null);
        wr_btnempleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wr_btnempleadosActionPerformed(evt);
            }
        });

        wr_btnclientes.setText("CLIENTES");
        wr_btnclientes.setBorder(null);

        wr_btningresosEgresos.setText("INGRESOS / EGRESOS");
        wr_btningresosEgresos.setBorder(null);

        wr_btninventarios.setText("INVENTARIO");
        wr_btninventarios.setBorder(null);

        wr_btndasboard.setText("DASHBOARD");
        wr_btndasboard.setBorder(null);

        wr_btnprovedores.setText("PROVEDORES");
        wr_btnprovedores.setBorder(null);

        javax.swing.GroupLayout wr_pseccionesLayout = new javax.swing.GroupLayout(wr_psecciones);
        wr_psecciones.setLayout(wr_pseccionesLayout);
        wr_pseccionesLayout.setHorizontalGroup(
            wr_pseccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wr_pseccionesLayout.createSequentialGroup()
                .addComponent(wr_btnventas, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(wr_btnempleados, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wr_btnclientes, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(wr_btningresosEgresos, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(wr_btninventarios, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wr_btndasboard, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(wr_btnprovedores, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        wr_pseccionesLayout.setVerticalGroup(
            wr_pseccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wr_btnprovedores, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
            .addComponent(wr_btndasboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(wr_btninventarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(wr_btningresosEgresos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(wr_btnclientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(wr_btnempleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(wr_btnventas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout wr_pcabeceraLayout = new javax.swing.GroupLayout(wr_pcabecera);
        wr_pcabecera.setLayout(wr_pcabeceraLayout);
        wr_pcabeceraLayout.setHorizontalGroup(
            wr_pcabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wr_pcabeceraLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(wr_lfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(wr_psecciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        wr_pcabeceraLayout.setVerticalGroup(
            wr_pcabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wr_pcabeceraLayout.createSequentialGroup()
                .addGroup(wr_pcabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(wr_lfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(wr_psecciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        wr_contcabecera.add(wr_pcabecera, java.awt.BorderLayout.PAGE_START);

        wr_framecontenedor.setBackground(new java.awt.Color(51, 51, 51));
        wr_framecontenedor.setPreferredSize(new java.awt.Dimension(800, 400));
        wr_framecontenedor.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout wr_pcalcoLayout = new javax.swing.GroupLayout(wr_pcalco);
        wr_pcalco.setLayout(wr_pcalcoLayout);
        wr_pcalcoLayout.setHorizontalGroup(
            wr_pcalcoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wr_framecontenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
            .addComponent(wr_contcabecera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        wr_pcalcoLayout.setVerticalGroup(
            wr_pcalcoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wr_pcalcoLayout.createSequentialGroup()
                .addComponent(wr_contcabecera, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wr_framecontenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wr_pcalco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wr_pcalco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void wr_btnempleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wr_btnempleadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wr_btnempleadosActionPerformed

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
            java.util.logging.Logger.getLogger(Frame_work.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_work.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_work.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_work.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_work().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    public javax.swing.JButton wr_btnclientes;
    public javax.swing.JButton wr_btndasboard;
    public javax.swing.JButton wr_btnempleados;
    public javax.swing.JButton wr_btningresosEgresos;
    public javax.swing.JButton wr_btninventarios;
    public javax.swing.JButton wr_btnprovedores;
    public javax.swing.JButton wr_btnventas;
    private javax.swing.JPanel wr_contcabecera;
    public javax.swing.JPanel wr_framecontenedor;
    public javax.swing.JLabel wr_lfecha;
    private javax.swing.JPanel wr_pcabecera;
    private javax.swing.JPanel wr_pcalco;
    private javax.swing.JPanel wr_psecciones;
    // End of variables declaration//GEN-END:variables
}
