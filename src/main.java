//source code from: Alex Lee
//Java GUI Tutorial - Make a Login GUI
//youtube: https://www.youtube.com/watch?v=iE8tZ0hn2Ws
//accessed: 06/07/2020
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class main implements ActionListener {
	
	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton button;
	private static JLabel success;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JPanel panel = new JPanel();
		JFrame frame = new JFrame("Demo");
		frame.setSize(350, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		
		userLabel = new JLabel("User");
		userLabel.setBounds(10, 20, 80, 25);
		panel.add(userLabel);
		
		userText = new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);
		
		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 50, 80, 25);
		panel.add(passwordLabel);
		
		frame.setVisible(true);

		passwordText = new JPasswordField();
		passwordText.setBounds(100, 50, 165, 25);
		panel.add(passwordText);
		
		button = new JButton("Login");
		button.setBounds(100,80,80,25);
		button.addActionListener(new main());
		panel.add(button);
		
		success = new JLabel("");
		success.setBounds(10,110,300,25);
		panel.add(success);
		
		System.out.println("Hey");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String user = userText.getText();
		String password = passwordText.getText();
		System.out.println(user + "," + password);
		
		if(user.equals("admin") && password.equals("123")) {
			success.setText("Login succesful");
		}
		
	}

}
