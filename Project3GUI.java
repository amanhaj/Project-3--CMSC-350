package project3;
/*
 * Author: Amanda Hajati
 * Course: CMSC 350 
 * File name: Project3GUI.java
 * Date Completed: 2/23/2019
 */
import java.awt.Font;
import javax.swing.*;

public class Project3GUI extends JFrame {
	private static final long serialVersionUID = 1L;
	
	//create the variables for the GUI
	 private JPanel panel;
	 private JPanel sortOptionsPanel;
	 private JPanel numericOptionsPanel;
	 private static JTextField sortedList;
	 private static JTextField originalList;
	 private static JButton button;
	 private JLabel originalListLabel;
	 private JLabel sortedListLabel;
	 private JLabel sortOrder;
	 private static JRadioButton ascending;
	 private static JRadioButton descending;
	 private static JRadioButton integer;
	 private static JRadioButton fraction;
	//create string to store the user input
	 private static String s;
	 
	//design the GUI
	 @SuppressWarnings("rawtypes")
	public Project3GUI() {
	 	
	 	setFont(new Font("Arial", Font.PLAIN, 16));
	 	setTitle("Binary Search Tree Sort");
	 	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 	setBounds(500, 200, 500, 400);
	 	
	 	//initialize components of GUI panel
	     panel = new JPanel();
	     sortOptionsPanel = new JPanel();
	     numericOptionsPanel = new JPanel();
	     panel.setLayout(null);
	     sortOptionsPanel.setLayout(null);
	     numericOptionsPanel.setLayout(null);
	 	 setContentPane(panel);
	 	 originalList = new JTextField("");
	 	 sortedList = new JTextField();
	     button = new JButton("Perform Sort");
	     originalListLabel = new JLabel("Original List");
	     sortedListLabel = new JLabel("Sorted List");
	     sortOrder = new JLabel("Sort Order");
	     ascending = new JRadioButton("Ascending");
	     descending = new JRadioButton ("Descending");
	     integer = new JRadioButton ("Integer");
	     fraction = new JRadioButton ("Fraction");
	     
	     //make groups for radio buttons
	     ButtonGroup sortOrderButtons = new ButtonGroup();
	     sortOrderButtons.add(ascending);
	     sortOrderButtons.add(descending);
	     ButtonGroup numericTypeButtons = new ButtonGroup();
	     numericTypeButtons.add(integer);
	     numericTypeButtons.add(fraction);
	     
	     //set result as uneditable
	     sortedList.setText("");
	     sortedList.setEditable(false);
	     
	     //add components to panel
	     panel.add(originalListLabel);
	     panel.add(originalList);
	     panel.add(button);
	     panel.add(sortedListLabel);
	     panel.add(sortedList);
	     panel.add(sortOrder);
	     
	     //configure sortOptionsPanel
	     panel.add(sortOptionsPanel);
	     sortOptionsPanel.setBounds(10, 250, 230, 100);
	     sortOptionsPanel.setBorder(BorderFactory.createTitledBorder("Sort Order"));
	     sortOptionsPanel.add(ascending);
	     sortOptionsPanel.add(descending);
	     ascending.setFont(new Font("Arial", Font.PLAIN, 12));
	     descending.setFont(new Font("Arial", Font.PLAIN, 12));
	     ascending.setBounds(10, 30, 100, 30); 
	     descending.setBounds(10, 60, 100, 30);
	     
	     //configure numericOptionsPanel
	     panel.add(numericOptionsPanel);
	     numericOptionsPanel.setBounds(250, 250, 230, 100);
	     numericOptionsPanel.setBorder(BorderFactory.createTitledBorder("Numeric Type"));
	     numericOptionsPanel.add(integer);
	     numericOptionsPanel.add(fraction);
	     integer.setFont(new Font("Arial", Font.PLAIN, 12));
	     fraction.setFont(new Font("Arial", Font.PLAIN, 12));
	     integer.setBounds(10, 30, 100, 30);
	     fraction.setBounds(10, 60, 100, 30);
	     
	     //set fonts for panel
	     originalListLabel.setFont(new Font("Arial", Font.BOLD, 12));
	     originalList.setFont(new Font("Arial", Font.PLAIN, 12));
	     button.setFont(new Font("Arial", Font.BOLD, 12));
	     sortedListLabel.setFont(new Font("Arial", Font.BOLD, 12));
	     sortedList.setFont(new Font("Arial", Font.PLAIN, 12));
	     sortOrder.setFont(new Font("Arial", Font.PLAIN, 12));
	     
	     //set layout for each component in panel
	     originalListLabel.setBounds(50, 8, 200, 25);
	     originalList.setBounds(130, 8, 320, 25);
	     button.setBounds(175, 150, 150, 30);
	     sortedListLabel.setBounds(55, 75, 100, 25);
	     sortedList.setBounds(130, 75, 320, 25); 
	    
	     //set columns for textfields
	     originalList.setColumns(20);
	     sortedList.setColumns(20);
	     
	     // Set Default Radio Buttons
	     ascending.setSelected(true);
	     integer.setSelected(true);
	     ascending.doClick();
	     integer.doClick();
	     
	     //add action listeners for evaluate button
	     Project3Main actionHandler = new Project3Main();
	     button.addActionListener(actionHandler);
	     //enable enter button to submit list
	     panel.getRootPane().setDefaultButton(button);
	     
	 }
	 
	 /*
	  * create getters and setters to make variables accessible to other classes
	  */
	 public static JButton getButton() {
	 	return button;
	 	
	 }

	 public static JTextField getSortedList() {
	 	return sortedList;
	 }

	 public static String getOriginalList() {
	 	s = String.valueOf(originalList.getText());
	 	return s;
	 }

	 public static JTextField getOriginalListField() {
	 	return originalList;
	 }

	 public static void setSortedList(String result) {
	 	sortedList.setText(result);
	 }

	 public static void setOriginalList(String input) {
	 	originalList.setText(input);
	 }
	 
	 public static JRadioButton getAscending() {
		 return ascending;
	 }
	 
	 public static JRadioButton getDescending() {
		 return descending;
	 }
	 
	 public static JRadioButton getInteger() {
		 return integer;
	 }
	 
	 public static JRadioButton getFraction() {
		 return fraction;
	 }
	 
	 
}
	 
