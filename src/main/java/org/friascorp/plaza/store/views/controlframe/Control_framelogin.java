/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.friascorp.plaza.store.views.controlframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import org.friascorp.plaza.store.otras.Loaderimg_logo;
import org.friascorp.plaza.store.otras.Security_tools;
import org.friascorp.plaza.store.views.Frame_login;
import org.friascorp.plaza.store.views.Frame_work;

/**
 *
 * @author ntnfr
 */
public class Control_framelogin implements ActionListener, MouseListener, KeyListener {

    Frame_login framelogin;

    public Control_framelogin(Frame_login framelogin) {
        this.framelogin = framelogin;
        this.framelogin.setLocationRelativeTo(null);
        this.framelogin.setSize(800, 450);
        //this.framelogin.setIconImage(new ImageIcon(getClass().getResource("/com/ISoftware/icons/logo (2).png")).getImage());
        this.framelogin.setTitle("(Plaza Store) Frias-Corporation S.A.S");

        Loaderimg_logo.loadImages(this.framelogin.lg_labellogo);

        this.framelogin.lgp_btninicioseccion.addActionListener(this);
        this.framelogin.lgp_btnregistrarse.addActionListener(this);

        //configurando listener para las acciones del mouse en las cajas de texto
        this.framelogin.lgp_txusuario.addMouseListener(this);
        this.framelogin.lgp_txcontraseña.addMouseListener(this);

        //configurando listener para las acciones del mouse en los botones
        this.framelogin.lgp_btninicioseccion.addMouseListener(this);
        this.framelogin.lgp_btnregistrarse.addMouseListener(this);

        //configurando listener para las acciones del teclado en las cajas de texto
        this.framelogin.lgp_btninicioseccion.addKeyListener(this);
        this.framelogin.lgp_btnregistrarse.addKeyListener(this);
        barPro_start();
    }

    void barPro_start() {
        for (int i = 0; i <= 50; i++) {
            try {
                // Realiza alguna tarea
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Control_framelogin.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.framelogin.barrpro.setValue(i);
            this.framelogin.barrpro.setText(i+"%");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == framelogin.lgp_btninicioseccion) {
            new Frame_work().setVisible(true);
            this.framelogin.dispose();
        }
        if (e.getSource() == framelogin.lgp_btnregistrarse) {

        }

    }

// metodos del para el control y acciones del mause
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == framelogin.lgp_btninicioseccion) {
            Security_tools.validarcapo(framelogin.lgp_txusuario);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

// metodos del para el control y acciones del teclado
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
