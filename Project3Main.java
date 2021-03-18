package project3;
/*
 * Author: Amanda Hajati
 * Course: CMSC 350 
 * File name: Project3BST.java
 * Date Completed: 2/23/2019
 */
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;


public class Project3Main<T> implements ActionListener {
	
	private int count = 0;
	private String value;
	
	//actionhandler
	public void actionPerformed(ActionEvent event) {
	
		if (event.getSource() == Project3GUI.getButton()) {
			
        String inputList = Project3GUI.getOriginalList();

        try {
        	
        	//convert input string to list
            List<String> tokens = new ArrayList<String>(Arrays.asList(inputList.split(" ")));
            String [] inputs = inputList.split(" ");
            
            //conversion for integers
            if (Project3GUI.getInteger().isSelected()) {

                
                Project3BST<Integer> bst = new Project3BST<>();
                int i = 0;
                //insert tokens of list into tree node while theres more tokens.
                while (i <tokens.size()) {
                	int intToken = Integer.valueOf(tokens.get(i));
                    bst.insertNode(intToken);
                    i++;
                }

                
                if (Project3GUI.getAscending().isSelected()) {
                	Project3GUI.setSortedList(bst.getAscending());
                	
                    
                } else if (Project3GUI.getDescending().isSelected()) {
                	
                	Project3GUI.setSortedList(bst.getDescending());
                	
                }
            }

            //conversion for fractions
            if (Project3GUI.getFraction().isSelected()) {

                
                Project3BST<Project3Fraction> bst = new Project3BST<>();

                while (count < inputs.length) {
                    value = inputs[count];
                    Project3Fraction fraction = new Project3Fraction(value);
                    bst.insertNode(fraction);
                    count++;
                }

                if (Project3GUI.getAscending().isSelected()) {
                	Project3GUI.setSortedList(bst.getAscending());
                	count = 0;
                    
                } else if (Project3GUI.getDescending().isSelected()) {
                	Project3GUI.setSortedList(bst.getDescending());
                	count = 0;
                }
            }

        } catch (NumberFormatException g) {
           JOptionPane.showMessageDialog(null, "Non Numeric Input","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        
        
    };

	
	//clear data if user clicks the textbar again after evaluating expression
		Project3GUI.getOriginalListField().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Project3GUI.setOriginalList("");
				Project3GUI.setSortedList("");
				
			    }
		});}
		
//main
public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
		
				try {
					
					Project3GUI frame = new Project3GUI();
					frame.setVisible(true);
					
				} catch (Exception t ) {
					t.printStackTrace();
				
	};
}
	
});}}




