/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.friascorp.plaza.store.otras;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author ntnfr
 */
public class Loaderimg_logo {
    public static void loadImages(JLabel label) {
        try {
            Image img = ImageIO.read(new File("sources/remover_producto.png"));
            
                int width = label.getWidth();
                int height = label.getHeight();
                Image scaledImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
                label.setIcon(new ImageIcon(scaledImg));
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

