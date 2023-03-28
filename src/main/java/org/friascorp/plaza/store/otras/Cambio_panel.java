/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.friascorp.plaza.store.otras;

import javax.swing.JPanel;

/**
 *
 * @author ntnfr
 */
public class Cambio_panel {
    
    public static void next_panel(JPanel contenedor, JPanel panel){
        //panel.setSize(contenedor.getSize());
        
        panel.setLocation(0, 0);
            
            contenedor.removeAll();
            contenedor.add(panel);
            contenedor.revalidate();
            contenedor.repaint();
        
    }
}
