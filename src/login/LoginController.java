/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import customer.WelcomeScreen;

/**
 * This is the action listener
 * The controller (brain) of the app
 * @author apont
 */
public class LoginController implements ActionListener {
    
    // This class has to have a reference to all elements of the program
    LoginModel model;
    LoginWindow view;
    WelcomeScreen welcome;
    
    // When the  controller starts, we need a new model and a new view
    public LoginController(){
        view = new LoginWindow(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        // IN THIS CASE, THIS PART OF THE CODE WILL HAPPEN IF ANY OF THE
        // TWO BUTTONS IS CLICKED, SO I CAN PUT IT OUTSIDE OF THE IF
        // STATEMENT SO WE DON'T REPEAT THE CODE. 
        
        // Creating a new connection to the DB
        model = new LoginModel();

        // We get username and password from the view
        String un = view.getUsername();
        String pw = view.getPassword();
        

        // Create an instance of the user class with the data collected
        User userLogged = new User(un, pw);
        
        // AFTER THE USER INFORMATION HAS BEEN GATHERED FROM THE VIEW,
        // NOW WE CAN GO AND DO WHAT EACH BUTTON IS SUPPOSED TO DO
        
        // When the button is clicked...
        if(e.getActionCommand().equals("b")){

            // Ask the model if the user is valid
            boolean login = model.login(userLogged);
            System.out.println(login);
            
            // if the it is valid, show the welcome screen and close the login
            if(login){
                welcome = new WelcomeScreen(userLogged);
                view.dispose();
            }
        }
        // When the button is clicked...
        // IMPORTANT, THIS PART IS FAIRLY INCOMPLETE, YOU SHOULD DOUBLE CHECK
        // FIRST IF THE USER ALREADY EXISTS IN THE DATABASE. 
        // TO DO THIS, YOU CANq CALL THE METHOD ABOVE!!!!!
        else if(e.getActionCommand().equals("b2")){
            
            // Ask the model if the user is valid
            //  we need to update this
           /* boolean register = model.register(userLogged);
            System.out.println(register);
            
            // if the it is valid, show the welcome screen and close the login
            if(register){
                welcome = new WelcomeScreen(userLogged);
                view.dispose();
            }
        }*/
            
        }
    }
    
    
}
