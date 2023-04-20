/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.friascorp.plaza.store.views.panels.controlpanels;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import org.friascorp.plaza.store.otras.Loaderimg_logo;
import org.friascorp.plaza.store.otras.Security_tools;
import org.friascorp.plaza.store.views.Frame_login;
import org.friascorp.plaza.store.views.Frame_work;
import org.friascorp.plaza.store.views.panels.P_login;

/**
 *
 * @author B8
 */
public class Control_plogin implements ActionListener,MouseListener,KeyListener{

   P_login plogin;

   
    public Control_plogin(P_login plogin) {
        this.plogin = plogin;
        
      Loaderimg_logo.loadImages(this.plogin.lg_labellogo);
        
       this.plogin.lgp_btninicioseccion.addActionListener(this);
       this.plogin.lgp_btnregistrarse.addActionListener(this);
       
       //configurando listener para las acciones del mouse en las cajas de texto
       this.plogin.lgp_txusuario.addMouseListener(this);
       this.plogin.lgp_txcontraseña.addMouseListener(this);
       
       //configurando listener para las acciones del mouse en los botones
       this.plogin.lgp_btninicioseccion.addMouseListener(this);
       this.plogin.lgp_btnregistrarse.addMouseListener(this);
       
       //configurando listener para las acciones del teclado en las cajas de texto
       this.plogin.lgp_btninicioseccion.addKeyListener(this);
       this.plogin.lgp_btnregistrarse.addKeyListener(this);
        
       
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == plogin.lgp_btninicioseccion){
        new Frame_work().setVisible(true);
        //this.plogin.dispose();
        }
        if(e.getSource() == plogin.lgp_btnregistrarse){
           
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
        if(e.getSource() == plogin.lgp_btninicioseccion){
            Security_tools.validarcapo(plogin.lgp_txusuario);
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
