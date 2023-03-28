/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.friascorp.plaza.store.views.controlframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JPanel;
import org.friascorp.plaza.store.otras.Cambio_panel;
import org.friascorp.plaza.store.views.Frame_work;
import org.friascorp.plaza.store.views.panels.Panel_clientes;
import org.friascorp.plaza.store.views.panels.Panel_dasboard;
import org.friascorp.plaza.store.views.panels.Panel_egresos;
import org.friascorp.plaza.store.views.panels.Panel_empleados;
import org.friascorp.plaza.store.views.panels.Panel_ingresosEgresos;
import org.friascorp.plaza.store.views.panels.Panel_inventario;
import org.friascorp.plaza.store.views.panels.Panel_provedores;
import org.friascorp.plaza.store.views.panels.Panel_ventas;

/**
 *
 * @author ntnfr
 */
public class Control_framework implements ActionListener{
    /**
     * se declaran las variables para asignarle los objetos de las clases que corresponden 
     * para ser maipulados desde esta clase
     */
    Frame_work framework;
    
    Panel_clientes pclientes;
    Panel_dasboard pdasboard;
    Panel_egresos pegresos;
    Panel_empleados pempleados;
    Panel_ingresosEgresos pingresos;
    Panel_inventario pinventario;
    Panel_provedores pprovedores;
    Panel_ventas pventas;

    public Control_framework(Frame_work framework) {
        
       /**
        * se pasan los recursos de frame_owork a control_work para ser controlado desde esta clase
        * ademas se asignan a los botones los oyentes de accion para que ejecuten las ordenes 
        * desde esta clase
        */
        this.framework = framework;
        this.framework.wr_btnclientes.addActionListener(this);
        this.framework.wr_btndasboard.addActionListener(this);
        this.framework.wr_btnempleados.addActionListener(this);
        this.framework.wr_btningresosEgresos.addActionListener(this);
        this.framework.wr_btninventarios.addActionListener(this);
        this.framework.wr_btnventas.addActionListener(this);
        this.framework.wr_btnprovedores.addActionListener(this);
        
        /**
         * se asignan los recursos de los paneles de clases independientes  a las variables de los paneles
         * para ser manipulados desde esta clase
         * 
         */
     pclientes = new Panel_clientes();   
     pdasboard = new Panel_dasboard(); 
     pegresos = new Panel_egresos();
     pempleados = new Panel_empleados();
     pingresos = new Panel_ingresosEgresos(); 
     pinventario = new Panel_inventario();
     pprovedores = new Panel_provedores();
     pventas = new Panel_ventas();
        
     /**
      * se activa la fecha y la hora 
      */
        tiempo();
    }
    /**
     * constructor para mostrar la hora actual del equipo que se ejecute la aplicasion
     * atravez de hilos o threads
     */
    public void tiempo(){
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd-MMMM-yy HH:mm:ss");
        
        ZonedDateTime.now(ZoneId.of("America/Lima"));
                
        Runnable runnable = () -> {
            while (true) {
                try {
                    Thread.sleep(500);
                    framework.wr_lfecha.setText(formateador.format(LocalDateTime.now()));
                } catch (InterruptedException e) {
                }
            }
        };
        Thread hilo = new Thread(runnable);
        hilo.start();
    }
    
    /*void cambiarPanel(JPanel contenedor, JPanel panel){
        //panel.setSize(contenedor.getSize());
        
        panel.setLocation(0, 0);
            
            contenedor.removeAll();
            contenedor.add(panel);
            contenedor.revalidate();
            contenedor.repaint();
        
    }*/
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == framework.wr_btnclientes){
            Cambio_panel.next_panel(framework.wr_framecontenedor,pclientes);
            
        }
        if(e.getSource() == framework.wr_btndasboard){
            Cambio_panel.next_panel(framework.wr_framecontenedor,pdasboard);
        }
        if(e.getSource() == framework.wr_btnempleados){
            Cambio_panel.next_panel(framework.wr_framecontenedor,pempleados);
        }
        if(e.getSource() == framework.wr_btningresosEgresos){
            Cambio_panel.next_panel(framework.wr_framecontenedor,pingresos);
        }
        if(e.getSource() == framework.wr_btninventarios){
            Cambio_panel.next_panel(framework.wr_framecontenedor,pinventario);
        }
        if(e.getSource() == framework.wr_btnventas){
            Cambio_panel.next_panel(framework.wr_framecontenedor,pventas);
        }
        if(e.getSource() == framework.wr_btnprovedores){
            Cambio_panel.next_panel(framework.wr_framecontenedor,pprovedores);
        }
        
    }
    
    
}
