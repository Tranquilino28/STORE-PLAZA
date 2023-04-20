/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.friascorp.plaza.store.otras;

/**
 *
 * @author B8
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JComponent;
 
public class CircularProgressBar extends JComponent {
 /**
  * Para configurar la barra de progreso, puedes utilizar los métodos 
  * setMinValue, setMaxValue y setValue. Para cambiar el texto que se 
  * muestra en el centro de la barra, utiliza el método setText.
  */
    private int minValue = 0;
    private int maxValue = 100;
    private int value = 0;
    private String text = "";
 
    public void setValue(int value) {
        if (value >= minValue && value <= maxValue) {
            this.value = value;
            repaint();
        }
    }
 
    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }
 
    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }
 
    public void setText(String text) {
        this.text = text;
        repaint();
    }
 
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(100, 100);
    }
 
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
 
        int diameter = Math.min(getWidth(), getHeight());
        double angle = 360.0 * value / (maxValue - minValue);
        int arcAngle = (int) -angle;
 
        g2.setColor(getForeground().darker().darker());
        g2.drawOval(0, 0, diameter, diameter);
 
        g2.setColor(getForeground());
        g2.fillArc(0, 0, diameter, diameter, 90, arcAngle);
 
        g2.setColor(getForeground().darker().darker());
        g2.drawString(text, getWidth() / 2 - g2.getFontMetrics().stringWidth(text) / 2,
                getHeight() / 2 + g2.getFontMetrics().getAscent() / 2 - 5);
    }
}