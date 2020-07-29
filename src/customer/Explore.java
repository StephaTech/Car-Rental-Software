package customer;
//http://www.java2s.com/Tutorial/Java/0240__Swing/TableRowSorterandFilter.htm
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;



public class Explore extends JFrame implements ActionListener {
	private JFrame frame;
	//private TableModel model;
	private JTable table;
	//private JTableRowSorter;
	private JScrollPane pane;
	private JPanel panel;
	private JLabel label;
	private JTextField filterText;
	private JButton button;	
	private TableRowSorter<TableModel> sorter;
	
    Object rows[][] = { { "", "", "", "", "", "" }, { "", "", "", "", "", "" }, { "", "", "", "", "", "" },
    		{ "", "", "", "", "", "" }, { "", "", "", "", "", "" } };
    String columns[] = { "Licence car ID", "Car Type", "Car Model", "Car Colour", "Car Fee", "Car Status" };
    TableModel model = new DefaultTableModel(rows, columns) {
      public Class getColumnClass(int column) {
        Class returnValue;
        if ((column >= 0) && (column < getColumnCount())) {
          returnValue = getValueAt(0, column).getClass();
        } else {
          returnValue = Object.class;
        }
        return returnValue;
      }
    };
    
    public Explore() {
    frame = new JFrame("Car Rental System - Explore current stock of cars");
    //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//will close only this class


    table = new JTable(model);
    final TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(model);
    table.setRowSorter(sorter);
    pane = new JScrollPane(table);
    frame.add(pane, BorderLayout.CENTER);

    panel = new JPanel(new BorderLayout());
    label = new JLabel("Filter");
    panel.add(label, BorderLayout.WEST);
    filterText = new JTextField("");//start underline at the...
    panel.add(filterText, BorderLayout.CENTER);
    frame.add(panel, BorderLayout.NORTH);
    button = new JButton("Filter");
    button.addActionListener(this);
      
    
    frame.add(button, BorderLayout.SOUTH);
    frame.setBounds(300,90,900,600);
    //frame.setSize(300, 250);
    frame.setVisible(true);
	frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//will close only this class

  }
    public void actionPerformed(ActionEvent e) {
        String text = filterText.getText();
        //if(e.getActionCommand()=="Filter") {
        	//Explore exploration = new Explore();I need to do the cnonnection with DB.
        if (text.length() == 0) {
        	sorter.setRowFilter(null);
        } else {
          sorter.setRowFilter(RowFilter.regexFilter(text));
        }
      }
    
//Driver Code 
	public static void main(String[] args) throws Exception 
   { 
       Explore exploration = new Explore(); 
   } 
}
