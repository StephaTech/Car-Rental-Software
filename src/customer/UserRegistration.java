package customer;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class UserRegistration extends JFrame {
	private static final long serialVersionUID = 1 ;
	private JPanel contentPane;
	private JTextField driverId;
	private JTextField firstname;
	private JTextField lastname;
	private JTextField email;
	private JTextField username;
	private JTextField mob;
	private JPasswordField passwordField;
	private JPasswordField passwordField2;
	private JButton btnNewButton;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserRegistration frame = new UserRegistration();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
			
public UserRegistration() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(450,190, 1014, 597);
	//setResizable(false);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5,5,5,5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
	
	JLabel lblNewUserRegister = new JLabel("New User Register");
	lblNewUserRegister.setFont(new Font("Times New Roman", Font.PLAIN, 22));
	lblNewUserRegister.setBounds(400,10,325,50);
	contentPane.add(lblNewUserRegister);
	
	JLabel lbldriverid = new JLabel("Driver Number:");
	lbldriverid.setBounds(58,75,99,43);
	contentPane.add(lbldriverid);
	
	JLabel lblName = new JLabel("First Name:");
	lblName.setBounds(58,152,99,43);
	contentPane.add(lblName);
	
	JLabel lblNewLabel = new JLabel("Last Name:");
	lblNewLabel.setBounds(58,243,110,36);
	contentPane.add(lblNewLabel);
	
	JLabel lblEmail = new JLabel("Email:");
	lblEmail.setBounds(58,324,124,36);
	contentPane.add(lblEmail);
	
	driverId = new JTextField();
	driverId.setBounds(214,75,228,50);
	contentPane.add(driverId);
	driverId.setColumns(10);
	
	firstname = new JTextField();
	firstname.setBounds(214,151,228,50);
	contentPane.add(firstname);
	firstname.setColumns(10);
	
	lastname = new JTextField();
	lastname.setBounds(214,235,228,50);
	contentPane.add(lastname);
	lastname.setColumns(10);
	
	email = new JTextField();
	email.setBounds(214,320,228,50);
	contentPane.add(email);
	email.setColumns(10);
	
	mob = new JTextField();
	mob.setBounds(707,75,228,50);
	contentPane.add(mob);
	mob.setColumns(10);
	
	username = new JTextField();
	username.setBounds(707,151,228,50);
	contentPane.add(username);
	username.setColumns(10);
	
	JLabel lblMobileNumber = new JLabel("Mobile number:");
	lblMobileNumber.setBounds(542,75,90,26);
	contentPane.add(lblMobileNumber);
	
	JLabel lblUsername = new JLabel("Username:");
	lblUsername.setBounds(542,159,99,29);
	contentPane.add(lblUsername);
	
	JLabel lblPassword = new JLabel("Create Password:");
	lblPassword.setBounds(542,245,110,24);
	contentPane.add(lblPassword);
	
	JLabel lblPassword2 = new JLabel("Confirm Password:");
	lblPassword2.setBounds(542,329,139,26);
	contentPane.add(lblPassword2);
	
	passwordField = new JPasswordField();
	passwordField.setBounds(707,235,228,50);
	contentPane.add(passwordField);
	
	passwordField2 = new JPasswordField();
	passwordField2.setBounds(707,320,228,50);
	contentPane.add(passwordField2);
	
	btnNewButton = new JButton("Register");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			String driverid = driverId.getText();
			String firstName = firstname.getText();
			String lastName = lastname.getText();
			String Email = email.getText();
			String Username = username.getText();
			String mobileNumber = mob.getText();
			int len = mobileNumber.length();
			String password = passwordField.getText();
			String password2 = passwordField2.getText();
			
			String msg = "" + firstName;
			msg+= " \n";
			if(len != 10) {
				JOptionPane.showMessageDialog(btnNewButton, "Enter a valid mobile number");
			}
			try {
	            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/car_rental_system","root","Java2020Ste");
	            
	            
	            String query = "INSERT INTO account values('" + driverid + "','" + firstName + "','" + lastName + "','" + Username + "','" + 
	            	password + "','" + password2 + "','" + Email + "','" + mobileNumber + "')";
	            
	            Statement sta = connection.createStatement();
	            int x = sta.executeUpdate(query);
	            if (x == 0) {
	            	JOptionPane.showMessageDialog(btnNewButton, "This is already exist");
	            } else {
	            	JOptionPane.showMessageDialog(btnNewButton, 
	            			"Welcome, " + msg + "Your account is sucessfuly created");
	            }
	            connection.close();

			}catch (Exception exception) {
				exception.printStackTrace();
			}
		}
			
	});
	btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
	btnNewButton.setBounds(399,447,259,74);
	contentPane.add(btnNewButton);
		}
}
	

		
	
	
	
	
	
	




