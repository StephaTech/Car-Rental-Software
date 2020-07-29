package admin;


import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class Addcar extends JFrame implements ActionListener {
	// Components of the Form 
    private Container c; 
    private JLabel title;
    private JLabel licence;
    private JTextField tlicence;
    private JLabel ltype; 
    private JTextField ttype;
    private JLabel lmodel;
    private JTextField tmodel;
    private JLabel lcolour;
    private JTextField tcolour;
    private JLabel lcarfee; 
    private JTextField tcarfee; 
    private JLabel lstatus;
    private JTextField tstatus;
    private JLabel add; 
    private JTextArea tadd; 
    private JCheckBox term; 
    private JButton badd; 
    private JButton bremove; 
    private JButton bupdate; 
    private JTextArea tout; 
    private JLabel res; 
    private JTextArea resadd;
  
    // constructor, to initialize the components 
    // with default values. 
	public Addcar() {
	setTitle("Car Rental System"); 
    setBounds(300, 90, 900, 600); 
    //setDefaultCloseOperation(EXIT_ON_CLOSE); 
    setResizable(false); 

    c = getContentPane(); 
    c.setLayout(null); 

    title = new JLabel("Add/Remove/Update"); 
    title.setFont(new Font("Arial", Font.PLAIN, 20)); 
    title.setSize(200, 30); 
    title.setLocation(400, 10); 
    c.add(title);
    
    licence = new JLabel("Licence Car ID:"); 
    //name.setFont(new Font("Arial", Font.PLAIN, 20)); 
    licence.setSize(100, 20); 
    licence.setLocation(100, 50); 
    c.add(licence); 

    tlicence = new JTextField(); 
    //tname.setFont(new Font("Arial", Font.PLAIN, 15)); 
    tlicence.setSize(190, 20); 
    tlicence.setLocation(200, 50); 
    c.add(tlicence);

    ltype = new JLabel("Car Type:"); 
    //name.setFont(new Font("Arial", Font.PLAIN, 20)); 
    ltype.setSize(100, 20); 
    ltype.setLocation(100, 100); 
    c.add(ltype); 

    ttype = new JTextField(); 
    //tname.setFont(new Font("Arial", Font.PLAIN, 15)); 
    ttype.setSize(190, 20); 
    ttype.setLocation(200, 100); 
    c.add(ttype);
    
    lmodel = new JLabel("Car Model:"); 
    //mno.setFont(new Font("Arial", Font.PLAIN, 20)); 
    lmodel.setSize(100, 20); 
    lmodel.setLocation(100, 150); 
    c.add(lmodel); 

    tmodel = new JTextField(); 
    //tmno.setFont(new Font("Arial", Font.PLAIN, 15)); 
    tmodel.setSize(190, 20); 
    tmodel.setLocation(200, 155); 
    c.add(tmodel);
    
    lcolour = new JLabel("Car Colour:"); 
    //mno.setFont(new Font("Arial", Font.PLAIN, 20)); 
    lcolour.setSize(100, 20); 
    lcolour.setLocation(100, 200); 
    c.add(lcolour); 

    tcolour = new JTextField(); 
    //tmno.setFont(new Font("Arial", Font.PLAIN, 15)); 
    tcolour.setSize(190, 20); 
    tcolour.setLocation(200, 200); 
    c.add(tcolour);

    lcarfee = new JLabel("Car Fee:"); 
    //mno.setFont(new Font("Arial", Font.PLAIN, 20)); 
    lcarfee.setSize(100, 20); 
    lcarfee.setLocation(100, 250); 
    c.add(lcarfee); 

    tcarfee = new JTextField(); 
    //tmno.setFont(new Font("Arial", Font.PLAIN, 15)); 
    tcarfee.setSize(190, 20); 
    tcarfee.setLocation(200, 250); 
    c.add(tcarfee); 
    
    lstatus = new JLabel("Car Status:"); 
    //mno.setFont(new Font("Arial", Font.PLAIN, 20)); 
    lstatus.setSize(100, 20); 
    lstatus.setLocation(100, 300); 
    c.add(lstatus); 

    tstatus = new JTextField(); 
    //tmno.setFont(new Font("Arial", Font.PLAIN, 15)); 
    tstatus.setSize(190, 20); 
    tstatus.setLocation(200, 300); 
    c.add(tstatus);

    term = new JCheckBox("Accept Terms And Conditions."); 
    term.setFont(new Font("Arial", Font.PLAIN, 15)); 
    term.setSize(250, 20); 
    term.setLocation(150, 400); 
    c.add(term); 

    badd = new JButton("Add"); 
    badd.setFont(new Font("Arial", Font.PLAIN, 15)); 
    badd.setSize(100, 20); 
    badd.setLocation(150, 450); 
    badd.addActionListener(this); 
    c.add(badd); 

    bremove = new JButton("Remove"); 
    bremove.setFont(new Font("Arial", Font.PLAIN, 15)); 
    bremove.setSize(100, 20); 
    bremove.setLocation(270, 450); 
    bremove.addActionListener(this); 
    c.add(bremove); 
    
    bupdate = new JButton("Update"); 
    bupdate.setFont(new Font("Arial", Font.PLAIN, 15)); 
    bupdate.setSize(100, 20); 
    bupdate.setLocation(390, 450); 
    bupdate.addActionListener(this); 
    c.add(bupdate);

    tout = new JTextArea(); 
    tout.setFont(new Font("Arial", Font.PLAIN, 15)); 
    tout.setSize(300, 400); 
    tout.setLocation(500, 100); 
    tout.setLineWrap(true); 
    tout.setEditable(false); 
    c.add(tout);    

    setVisible(true); 
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);//will close only this class
	}
	public void actionPerformed(ActionEvent e) 
    { 
        if (e.getSource() == badd) { 
            if (term.isSelected()) { 
                String data1; 
                String data 
                    = "Licence Car ID : "
                      + tlicence.getText() + "\n"
                      + "Car Type : "
                      + ttype.getText() + "\n"
                      + "Car Model: "
                      + tmodel.getText() + "\n"
                      + "Car Colour : "
                      + tcolour.getText() + "\n"
                      + "Car Fee : "
                      + tcarfee.getText() + "\n"
                      + "Car Status : "
                      + tstatus.getText() + "\n";
                
                tout.setText(data); 
                tout.setEditable(false); 
                //res.setText("Registration Successfully.."); 
            } 
            else { 
                tout.setText(""); 
                resadd.setText(""); 
                /*res.setText("Please accept the"
                            + " terms & conditions.."); */
            } 
        } 
  
        else if (e.getSource() == bremove) { 
            String def = ""; 
            tlicence.setText(def); 
            ttype.setText(def);
            tmodel.setText(def); 
            tcolour.setText(def);
            tcarfee.setText(def);  
            tout.setText(def); 
            term.setSelected(false);  
            resadd.setText(def); 
        } 
    } 

  
// Driver Code 
	public static void main(String[] args) throws Exception 
    { 
        Addcar f = new Addcar(); 
    } 
}
