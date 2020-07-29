/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import jdk.nashorn.internal.runtime.regexp.joni.Option;
import login.User;

/**
 * This class is going to come up only when the login is successful
 * @author apont
 */

    
   

    	 

 
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JComponent;
 
import java.awt.Toolkit;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
 
public class WelcomeScreen extends JPanel implements ActionListener {
    JButton button1;
    JButton button2;
    //JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    
    public WelcomeScreen(User userLogged){
        
    	javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
       

    public WelcomeScreen() {
        super(new BorderLayout());//like a frame
        button1 = new JButton("Explore current stock of cars");
        button1.setBounds(200, 110, 200, 30);
        super.add(button1);
        button1.addActionListener(this);
        
        button2 = new JButton("Reserve Cars");
        button2.setBounds(200, 110+20+20, 200, 30);
        super.add(button2);
        button2.addActionListener(this);
        
        /*button3 = new JButton("Cancel Reservation");
        button3.setBounds(200, 100+50+40, 200, 30);
        super.add(button3);
        button3.addActionListener(this);*/
        
        button4 = new JButton("Rented Record");
        button4.setBounds(200, 100+80+50, 200, 30);
        super.add(button4);
        button4.addActionListener(this);      
        
        button5 = new JButton("View/Update Profile");
        button5.setBounds(200, 100+110+60, 200, 30);
        super.add(button5);
        button5.addActionListener(this);
        
        button6 = new JButton("Log Out");
        button6.setBounds(200, 100+160+50, 200, 30);
        super.add(button6);
        button6.addActionListener(this);
        
    }
 
    public void actionPerformed(ActionEvent e) {
        Toolkit.getDefaultToolkit().beep();
        if(e.getActionCommand()=="Explore current stock of cars") {
        	Explore exploration = new Explore();
        	//System.out.println("New window Explore current stock of cars");
        }else if(e.getActionCommand()=="Reserve Cars") {
        	Reserve reservation = new Reserve();
        	//System.out.println("New window Reserve Cars");
        }else if(e.getActionCommand()=="Rented Record") {
        	Rentpast renting = new Rentpast();
        	//System.out.println("New window Rented Record");
        }else if(e.getActionCommand()=="View/Update Profile") {
        	Viewup viewupdation = new Viewup();
        	//System.out.println("New window View/Update Profile");
        }else if(e.getActionCommand()=="Log Out") {
        	JOptionPane.showConfirmDialog(null, "Are you sure?", "Select an Option...",JOptionPane.YES_NO_OPTION);
        	System.out.println("You Log Out of the System");
            //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        }}
    
 
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    
    public static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Car Rental System - Customer Dashboard");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Create and set up the content pane.
        JComponent newContentPane = new WelcomeScreen();
        newContentPane.setOpaque(true); //content panes must be opaqueINTERSSANTE
        frame.setContentPane(newContentPane);
 
        
        frame.setBounds(600,0, 600, 600);
        frame.setLayout(null);
        frame.setVisible(true);
        //frame.validate();
        //frame.repaint();
    }
 
    }

 
