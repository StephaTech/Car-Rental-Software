/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * This is the login window
 * @author apont
 */
public class LoginWindow extends JFrame{
    
    // Text fields must be class members so all methods can access them
    private JTextField tf1;
    private JTextField tf2;
    // This window needs to know who the controller is
    private LoginController controllerInternalRef;
    
    public LoginWindow(LoginController controller){
        
        // Putting the reference of the controller in the local reference
        this.controllerInternalRef = controller;
        
        // We encapsulated the building process of the window
        attributesSetter();
        components();
        validation();
    }
    
    // Setting attributes
    private void attributesSetter(){
        this.setVisible(true);
        this.setSize(350,400);
        this.setTitle("Rental Car System");
    }
    
    // Organising components
    private void components(){
        JPanel p = new JPanel();
        this.add(p);
        
        JLabel label = new JLabel("Username");
        label.setBounds(10,20,80,25);
        p.add(label);
        
        tf1 = new JTextField(20);
        tf1.setBounds(100,20,165,25);//100,20,165,25
        p.add(tf1);
        
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(30, 50, 80, 25);
        p.add(passwordLabel);
        
        
        tf2 = new JTextField(20);//without (20) hiden the password***
        tf2.setBounds(423,13,273,93);
        p.add(tf2);
        
        
        JButton button = new JButton("Login");
        button.addActionListener((ActionListener) controllerInternalRef);
        button.setActionCommand("b");
        
                
        JButton button2 = new JButton("Sign Up");
        button2.addActionListener((ActionListener) controllerInternalRef);
        button2.setActionCommand("b2");
        
        
       
        p.add(button);
        p.add(button2);
        
    }
    
    // Validation and repainting
    private void validation(){
        this.validate();
        this.repaint();
    }
    
    // Getters for username and password
    public String getUsername(){
        return tf1.getText();

    }
    public String getPassword(){
        return tf2.getText();
        
    }

}
