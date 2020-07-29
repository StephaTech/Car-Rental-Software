package customer;

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



public class Reserve extends JFrame implements ActionListener {
	// Components of the Form 
    private Container c; 
    private JLabel title;
    private JTextField tavailable;
    private JLabel licenceid;
    private JTextField tlicenceid;
    private JLabel cdriver;
    private JTextField tcdriver;
    private JLabel name; 
    private JTextField tname;
    private JLabel lname;
    private JTextField tlname;
    private JLabel jfee;
    private JTextField tfee;
    private JLabel jdate; 
    private JTextField tdate; 
    private JLabel jdue;
    private JTextField tdue;
    //private JLabel gender; 
    //private JRadioButton male; 
    //private JRadioButton female; 
    //private ButtonGroup gengp; 
    //private JLabel dob; 
    private JComboBox date; 
    private JComboBox datedue; 
    private JComboBox month; 
    private JComboBox monthdue;
    private JComboBox year;
    private JComboBox yeardue;
    private JLabel add; 
    private JTextArea tadd; 
    private JCheckBox term; 
    private JButton sub; 
    private JButton reset; 
    private JTextArea tout; 
    private JLabel res; 
    private JTextArea resadd; 
  
    private String dates[] 
        = { "1", "2", "3", "4", "5", 
            "6", "7", "8", "9", "10", 
            "11", "12", "13", "14", "15", 
            "16", "17", "18", "19", "20", 
            "21", "22", "23", "24", "25", 
            "26", "27", "28", "29", "30", 
            "31" }; 
    private String months[] 
        = { "Jan", "feb", "Mar", "Apr", 
            "May", "Jun", "July", "Aug", 
            "Sup", "Oct", "Nov", "Dec" }; 
    
    private String years[] 
        = { "2020", "2021", "2022" }; 
    
    private String dateduess[] 
            = { "1", "2", "3", "4", "5", 
                "6", "7", "8", "9", "10", 
                "11", "12", "13", "14", "15", 
                "16", "17", "18", "19", "20", 
                "21", "22", "23", "24", "25", 
                "26", "27", "28", "29", "30", 
                "31" }; 
    
    private String monthss[] 
            = { "Jan", "feb", "Mar", "Apr", 
                "May", "Jun", "July", "Aug", 
                "Sup", "Oct", "Nov", "Dec" };
    
    private String yearss[] 
            = { "2020", "2021", "2022" }; 
  
    // constructor, to initialize the components 
    // with default values. 
	/**
	 * 
	 */
	public Reserve() {
	setTitle("Car Rental System - Rental Reservation Form"); 
    setBounds(300, 90, 900, 600); 
    //setDefaultCloseOperation(EXIT_ON_CLOSE); 
    setResizable(false); 

    c = getContentPane(); 
    c.setLayout(null); 

    title = new JLabel("Available:"); 
    title.setFont(new Font("Arial", Font.PLAIN, 20)); 
    title.setSize(250, 30); 
    title.setLocation(500, 10); 
    c.add(title);
    
    tavailable = new JTextField(); 
    //tname.setFont(new Font("Arial", Font.PLAIN, 15)); 
    tavailable.setSize(190, 20); 
    tavailable.setLocation(600, 15); 
    c.add(tavailable);
    
    licenceid = new JLabel("Licence car ID:"); 
    //name.setFont(new Font("Arial", Font.PLAIN, 20)); 
    licenceid.setSize(100, 20); 
    licenceid.setLocation(100, 10); 
    c.add(licenceid); 
    
    tlicenceid = new JTextField(); 
    //tname.setFont(new Font("Arial", Font.PLAIN, 15)); 
    tlicenceid.setSize(190, 20); 
    tlicenceid.setLocation(200, 10); 
    c.add(tlicenceid);
    
    cdriver = new JLabel("Driver ID N:"); 
    //name.setFont(new Font("Arial", Font.PLAIN, 20)); 
    cdriver.setSize(100, 20); 
    cdriver.setLocation(100, 50); 
    c.add(cdriver); 

    tcdriver = new JTextField(); 
    //tname.setFont(new Font("Arial", Font.PLAIN, 15)); 
    tcdriver.setSize(190, 20); 
    tcdriver.setLocation(200, 50); 
    c.add(tcdriver);

    name = new JLabel("First Name:"); 
    //name.setFont(new Font("Arial", Font.PLAIN, 20)); 
    name.setSize(100, 20); 
    name.setLocation(100, 100); 
    c.add(name); 

    tname = new JTextField(); 
    //tname.setFont(new Font("Arial", Font.PLAIN, 15)); 
    tname.setSize(190, 20); 
    tname.setLocation(200, 100); 
    c.add(tname);
    
    lname = new JLabel("Last Name:"); 
    //mno.setFont(new Font("Arial", Font.PLAIN, 20)); 
    lname.setSize(100, 20); 
    lname.setLocation(100, 150); 
    c.add(lname); 

    tlname = new JTextField(); 
    //tmno.setFont(new Font("Arial", Font.PLAIN, 15)); 
    tlname.setSize(190, 20); 
    tlname.setLocation(200, 155); 
    c.add(tlname);
    
    jfee = new JLabel("Rental Fee:"); 
    //mno.setFont(new Font("Arial", Font.PLAIN, 20)); 
    jfee.setSize(100, 20); 
    jfee.setLocation(100, 200); 
    c.add(jfee); 

    tfee = new JTextField(); 
    //tmno.setFont(new Font("Arial", Font.PLAIN, 15)); 
    tfee.setSize(190, 20); 
    tfee.setLocation(200, 200); 
    c.add(tfee);

    

    /*gender = new JLabel("Gender"); 
    gender.setFont(new Font("Arial", Font.PLAIN, 20)); 
    gender.setSize(100, 20); 
    gender.setLocation(100, 200); 
    c.add(gender); 

    male = new JRadioButton("Male"); 
    male.setFont(new Font("Arial", Font.PLAIN, 15)); 
    male.setSelected(true); 
    male.setSize(75, 20); 
    male.setLocation(200, 200); 
    c.add(male); 

    female = new JRadioButton("Female"); 
    female.setFont(new Font("Arial", Font.PLAIN, 15)); 
    female.setSelected(false); 
    female.setSize(80, 20); 
    female.setLocation(275, 200); 
    c.add(female); 

    gengp = new ButtonGroup(); 
    gengp.add(male); 
    gengp.add(female); */
    
    jdate = new JLabel("Date:"); 
    //mno.setFont(new Font("Arial", Font.PLAIN, 20)); 
    jdate.setSize(100, 20); 
    jdate.setLocation(100, 250); 
    c.add(jdate); 
     
    
    jdue = new JLabel("Due Date:"); 
    //mno.setFont(new Font("Arial", Font.PLAIN, 20)); 
    jdue.setSize(100, 20); 
    jdue.setLocation(100, 300); 
    c.add(jdue);  

    date = new JComboBox(dates); 
    date.setFont(new Font("Arial", Font.PLAIN, 15)); 
    date.setSize(50, 20); 
    date.setLocation(200, 250); 
    c.add(date); 
    
    month = new JComboBox(months); 
    month.setFont(new Font("Arial", Font.PLAIN, 15)); 
    month.setSize(60, 20); 
    month.setLocation(250, 250); 
    c.add(month);
    
    year = new JComboBox(years); 
    year.setFont(new Font("Arial", Font.PLAIN, 15)); 
    year.setSize(60, 20); 
    year.setLocation(320, 250); 
    c.add(year);
    
    datedue = new JComboBox(dateduess); 
    datedue.setFont(new Font("Arial", Font.PLAIN, 15)); 
    datedue.setSize(50, 20); 
    datedue.setLocation(200, 300); 
    c.add(datedue); 

    monthdue = new JComboBox(monthss); 
    monthdue.setFont(new Font("Arial", Font.PLAIN, 15)); 
    monthdue.setSize(60, 20); 
    monthdue.setLocation(250, 300); 
    c.add(monthdue);     
    
    yeardue = new JComboBox(yearss); 
    yeardue.setFont(new Font("Arial", Font.PLAIN, 15)); 
    yeardue.setSize(60, 20); 
    yeardue.setLocation(320, 300); 
    c.add(yeardue); 

    /*add = new JLabel("Address"); 
    add.setFont(new Font("Arial", Font.PLAIN, 20)); 
    add.setSize(100, 20); 
    add.setLocation(100, 300); 
    c.add(add); 

    tadd = new JTextArea(); 
    tadd.setFont(new Font("Arial", Font.PLAIN, 15)); 
    tadd.setSize(200, 75); 
    tadd.setLocation(200, 300); 
    tadd.setLineWrap(true); 
    c.add(tadd); */

    term = new JCheckBox("Accept Terms And Conditions."); 
    term.setFont(new Font("Arial", Font.PLAIN, 15)); 
    term.setSize(250, 20); 
    term.setLocation(150, 400); 
    c.add(term); 

    sub = new JButton("Ok"); 
    sub.setFont(new Font("Arial", Font.PLAIN, 15)); 
    sub.setSize(100, 20); 
    sub.setLocation(150, 450); 
    sub.addActionListener(this); 
    c.add(sub); 

    reset = new JButton("Cancel"); 
    reset.setFont(new Font("Arial", Font.PLAIN, 15)); 
    reset.setSize(100, 20); 
    reset.setLocation(270, 450); 
    reset.addActionListener(this); 
    c.add(reset); 

    tout = new JTextArea(); 
    tout.setFont(new Font("Arial", Font.PLAIN, 15)); 
    tout.setSize(300, 400); 
    tout.setLocation(500, 100); 
    tout.setLineWrap(true); 
    tout.setEditable(false); 
    c.add(tout); 

    res = new JLabel(""); 
    res.setFont(new Font("Arial", Font.PLAIN, 20)); 
    res.setSize(500, 25); 
    res.setLocation(100, 500); 
    c.add(res); 

    resadd = new JTextArea(); 
    resadd.setFont(new Font("Arial", Font.PLAIN, 15)); 
    resadd.setSize(200, 75); 
    resadd.setLocation(580, 175); 
    resadd.setLineWrap(true); 
    c.add(resadd); 

    setVisible(true); 
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);//will close only this class
	}
	public void actionPerformed(ActionEvent e) 
    { 
        if (e.getSource() == sub) { 
            if (term.isSelected()) { 
                //String data1; 
                String data 
                    = "Driver Number : "
                      + tcdriver.getText() + "\n"
                      + "First Name : "
                      + tlname.getText() + "\n"
                      + "Last Name : "
                      + tlname.getText() + "\n"
                      + "Rental Fee : "
                      + tfee.getText() + "\n"
                      + "Available : "
                      + tavailable.getText() + "\n";
                      /*+ "Due date : "
                      + tdue.getText() + "\n";*/
                /*if (male.isSelected()) 
                    data1 = "Gender : Male"
                            + "\n"; 
                else
                    data1 = "Gender : Female"
                            + "\n"; */
                String data2 
                    = "Date : "
                      + (String)date.getSelectedItem() 
                      + "/" + (String)month.getSelectedItem() 
                      + "/" + (String)year.getSelectedItem() 
                      + "\n";
                String data3 
                = "Due Date : "
                  + (String)datedue.getSelectedItem() 
                  + "/" + (String)monthdue.getSelectedItem() 
                  + "/" + (String)yeardue.getSelectedItem() 
                  + "\n";
  
                //String data3 = "Address : " + tadd.getText(); 
                tout.setText(data + data2 + data3); 
                tout.setEditable(false); 
                res.setText("Registration Successfully.."); 
            } 
            else { 
                tout.setText(""); 
                resadd.setText(""); 
                res.setText("Please accept the"
                            + " terms & conditions.."); 
            } 
        } 
  
        else if (e.getSource() == reset) { 
            String def = ""; 
            tcdriver.setText(def);
            tname.setText(def); 
            tlname.setText(def);
            tfee.setText(def); 
            tdate.setText(def);
            tdue.setText(def); 
            res.setText(def); 
            tout.setText(def); 
            term.setSelected(false); 
            date.setSelectedIndex(0); 
            month.setSelectedIndex(0); 
            year.setSelectedIndex(0); 
            datedue.setSelectedIndex(0); 
            monthdue.setSelectedIndex(0); 
            yeardue.setSelectedIndex(0);
            resadd.setText(def); 
        } 
    } 

  
// Driver Code 
	public static void main(String[] args) throws Exception 
    { 
        Reserve f = new Reserve(); 
    } 
}

