/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.friascorp.plaza.store.otras;

import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JTextField;
import org.friascorp.plaza.store.views.Frame_login;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author ntnfr
 */
public class Security_tools {
    
    private static boolean validarContrasena12(JTextField con1,JTextField con2){
        System.out.print("validando contrasenas....");
        if(con1.getText().trim().equals(con2.getText().trim())){
            System.out.println("contraseñas coinciden\n");
            con1.setBorder(null);
            con2.setBorder(null);
            return true;
        }else
            System.out.println("contraseñas no coinciden");
            con1.setBorder(BorderFactory.createLineBorder(Color.RED,2));
            con2.setBorder(BorderFactory.createLineBorder(Color.RED,2));
        return false;
    }
    
    private static boolean validarEmail(JTextField txfield) {
        String email = txfield.getText();
        System.out.print("\nvalidando email...");
        // Patron para validar el email
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(email);
        if(!mather.find()){      
            System.out.println("EMAIL incorrect");
             txfield.setBorder(BorderFactory.createLineBorder(Color.RED,2));
            
           return false;
        }else{    
            System.out.println("EMAIL correcto");
            txfield.setBorder(null);
            return true;
        }
                
        //return mather.find();
    }
    
    
    public static boolean validarcapo(JTextField cj){
        
        if(cj.getText().trim().isEmpty()){
            cj.setBorder(BorderFactory.createLineBorder(Color.RED,2));
            return false;
        }else{
            cj.setBorder(null);
            return true;
        }
        
    }
    
    // encode y decode de contraseñas 
    public static String encode(String password) {
        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());
        return hashedPassword;
    }

    public static boolean decode(String password, String hashedPassword) {
        return BCrypt.checkpw(password, hashedPassword);
    }
}
