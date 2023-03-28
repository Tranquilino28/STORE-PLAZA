/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.friascorp.plaza.store.views.panels.controlpanels;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.friascorp.plaza.store.otras.Cambio_panel;
import org.friascorp.plaza.store.views.panels.Panel_ingresosEgresos;
import org.friascorp.plaza.store.views.panels.Pie_egresos;
import org.friascorp.plaza.store.views.panels.Pie_ingresos;

/**
 *
 * @author ntnfr
 */
public class Control_pingresosegresos implements ActionListener{
    Panel_ingresosEgresos ingresosegresos;
    
    Pie_ingresos pingresos;
    Pie_egresos pegresos;

    public Control_pingresosegresos(Panel_ingresosEgresos ingresosegresos) {
        this.ingresosegresos = ingresosegresos;
        
        this.ingresosegresos.pie_btningresos.addActionListener(this);
        this.ingresosegresos.pie_btnegresos.addActionListener(this);
        
         pingresos = new Pie_ingresos();
         pegresos = new Pie_egresos();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == ingresosegresos.pie_btningresos ){
            Cambio_panel.next_panel(ingresosegresos.pnl_ingreegrecontenedor,pingresos );
        }
        if(e.getSource() == ingresosegresos.pie_btnegresos ){
            Cambio_panel.next_panel(ingresosegresos.pnl_ingreegrecontenedor,pegresos );
        }
    }
    
    
}
