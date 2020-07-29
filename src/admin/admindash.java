package admin;


	/*
	 * To change this license header, choose License Headers in Project Properties.
	 * To change this template file, choose Tools | Templates
	 * and open the template in the editor.
	 */

	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPanel;

import customer.Rentpast;
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
	 
	public class admindash extends JPanel implements ActionListener {
	    JButton button1;
	    JButton button2;
	    JButton button4;
	    JButton button5;
	    JButton button6;
	    
	    public admindash(User userLogged){
	        
	    	javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                createAndShowGUI();
	            }
	        });
	    }
	       
	    public admindash() {
	        super(new BorderLayout());//like a frame
	        button1 = new JButton("All Current Cars");
	        button1.setBounds(200, 110, 200, 30);
	        super.add(button1);
	        button1.addActionListener(this);
	        
	        button2 = new JButton("Add/Remove/Update Car");
	        button2.setBounds(200, 110+20+20, 200, 30);
	        super.add(button2);
	        button2.addActionListener(this); 
	        
	        button4 = new JButton("All Bookings");
	        button4.setBounds(200, 100+80+50, 200, 30);
	        super.add(button4);
	        button4.addActionListener(this);
	        
	        button5 = new JButton("Status Bookings");
	        button5.setBounds(200, 100+110+60, 200, 30);
	        super.add(button5);
	        button5.addActionListener(this);
	        
	        button6 = new JButton("Log out");
	        button6.setBounds(200, 100+160+50, 200, 30);
	        super.add(button6);
	        button6.addActionListener(this);
	        
	    }
	 
	    public void actionPerformed(ActionEvent e) {
	        Toolkit.getDefaultToolkit().beep();
	        if(e.getActionCommand()=="All Current Cars") {
	        	Current allcars = new Current();
	        	//System.out.println("New window Explore current stock of cars");
	        }else if(e.getActionCommand()=="Add/Remove/Update Car") {
	        	Addcar addnew = new Addcar();
	        	//System.out.println("New window Reserve Cars")
	        }else if(e.getActionCommand()=="All Bookings") {
	        	Bookingscar bookings = new Bookingscar();
	        	//System.out.println("New window View/Update Profile");
	        }else if(e.getActionCommand()=="Status Bookings") {
	        	Statusbooking statusbook = new Statusbooking();
	            //super.setDefaultCloseOperation(BorderLayout.DISPOSE_ON_CLOSE);
	        }else if(e.getActionCommand()=="Log Out") {
	        	System.out.println("New window Log Out");
	        	//System.out.println("New window Log Out");
	        }}
	    
	 
	    /**
	     * Create the GUI and show it.  For thread safety,
	     * this method should be invoked from the
	     * event-dispatching thread.
	     */
	    
	    public static void createAndShowGUI() {
	        //Create and set up the window.
	        JFrame frame = new JFrame("Administrator Dashboard");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	        //Create and set up the content pane.
	        JComponent newContentPane = new admindash();
	        newContentPane.setOpaque(true); //content panes must be opaque
	        frame.setContentPane(newContentPane);
	 
	        
	        frame.setBounds(600,0, 600, 600);
	        frame.setLayout(null);
	        frame.setVisible(true);
	        
	    }
	    public static void main(String[] args) {
	        //Schedule a job for the event-dispatching thread:
	        //creating and showing this application's GUI.
	        javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                createAndShowGUI();
	            }
	        });
	    }
	    }

	 


