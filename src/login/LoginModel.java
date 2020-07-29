/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * The model is the DB connection
 * @author apont
 */
public class LoginModel {
    
    String dbServer = "jdbc:mysql://localhost:3306/car_rental_system";
    String user = "root";
    String password = "Java2020Ste";
    Connection conn = null;
    Statement stmt = null;
    
    // Constructor. This guy is starting the DB connection and 
    // putting everything in the variables declared above
    public LoginModel(){
        
        try{
            // Get a connection to the database
            conn = DriverManager.getConnection(dbServer, user, password) ;

            // Get a statement from the connection
            stmt = conn.createStatement() ;

        }
        catch( SQLException se ){
            System.out.println( "SQL Exception:" ) ;

            // Loop through the SQL Exceptions
            while( se != null ){
                System.out.println( "State  : " + se.getSQLState()  ) ;
                System.out.println( "Message: " + se.getMessage()   ) ;
                System.out.println( "Error  : " + se.getErrorCode() ) ;

                se = se.getNextException() ;
            }
        }
        catch( Exception e ){
                System.out.println( e ) ;
        }
        
    }
    
    // This method is only in charge of asking the DB if a user exists
    // Notice that it is using the variables initialised by the constructor
    public boolean login(User userLogged){
        
        // Variable to define if the login is successful
        boolean login = false;
        try{
            // Building the query
            String query = "SELECT * FROM user WHERE username = '" + userLogged.getUn() + "' AND password = '" + userLogged.getPw() + "';";

            // Sending the query to the database
            ResultSet rs = stmt.executeQuery(query) ;

            // If there is an entry in the database that satisfies
            // the username and password, then the login is successful
            // otherwise it fails
            login = rs.next();

            // Close the result set, statement and the connection
            rs.close() ;

            // Calling the method in charge of closing the connections
            closings();
            
        }
        catch( SQLException se ){
            System.out.println( "SQL Exception:" ) ;

            // Loop through the SQL Exceptions
            while( se != null ){
                System.out.println( "State  : " + se.getSQLState()  ) ;
                System.out.println( "Message: " + se.getMessage()   ) ;
                System.out.println( "Error  : " + se.getErrorCode() ) ;

                se = se.getNextException() ;
            }
        }
        catch( Exception e ){
                System.out.println( e ) ;
        }

        // Returning the login status
        return login;
    }
        
    // This method is only in charge of saving a new user into the the DB
    public void register(User userLogged){
        //INSERT MORE THINGS.....DATA
        try{
            // Building the query 
            String query = "INSERT INTO user (username, password) VALUES ('"+userLogged.getUn()+"', '"+userLogged.getPw()+"');";

            // Execute the query
            stmt.execute(query) ;

            // Calling the method in charge of closing the connections
            closings();
        }
        catch( SQLException se ){
            System.out.println( "SQL Exception:" ) ;

            // Loop through the SQL Exceptions
            while( se != null ){
                System.out.println( "State  : " + se.getSQLState()  ) ;
                System.out.println( "Message: " + se.getMessage()   ) ;
                System.out.println( "Error  : " + se.getErrorCode() ) ;

                se = se.getNextException() ;
            }
        }
        catch( Exception e ){
                System.out.println( e ) ;
        }


    }
    
    // Separeating closing statements for better code structure
    private void closings(){
        try {            
            stmt.close();
            conn.close();
        }
        catch (SQLException ex) {
            Logger.getLogger(LoginModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
}
