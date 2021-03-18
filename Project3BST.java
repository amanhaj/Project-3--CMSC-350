package project3;
/*
 * Author: Amanda Hajati
 * Course: CMSC 350 
 * File name: Project3BST.java
 * Date Completed: 2/23/2019
 */
import java.util.Arrays;
import java.util.Collections;

class Project3BST<T extends Comparable<T>> {
	//variables
    private Node root;
    private String sortedResult = "";
    
    //insert new nodes to tree by recursion
    private void insertTreeNode(T value, Node node) {
    	
        if (value.compareTo(node.value) <= 0) {  
        	
            if (node.left != null) {    
            	
            	insertTreeNode(value, node.left); 
                
            } else {       
            	
                node.left = new Node(value);
                
            }
            
        } else if (value.compareTo(node.value) > 0) { 
        	
            if (node.right !=null) {      
            	
            	insertTreeNode(value, node.right); 
                
            } else {         
            	
                node.right = new Node(value);
            }
        }
    }
    //if there is no current root, current value becomes root
    public void insertNode (T value) {
    	
        if (root == null) {     
        	
            root = new Node(value);      
            return;
            
        }
        
        insertTreeNode(value, root);  
    }
    
    //traverse the tree
    private void traverseTree(Node root) {
    	
        if (root.value != null) {
        	
            if (root.getLeft() != null) traverseTree(root.getLeft()); 
            
            String res = (root.value).toString();                       
            sortedResult += (res);
            sortedResult += " ";
            
            if (root.getRight() != null) traverseTree(root.getRight()); 
        }
    }
    
    //return result of ascending string
    public String getAscending() {
    	
    	traverseTree(root);
     
        return sortedResult.toString();
    }

   //return result of descending string
    public String getDescending() {
        
        String[] numList = getAscending().toString().split(" ");  
        Collections.reverse(Arrays.asList(numList));
        sortedResult = Arrays.toString(numList)
        		.replace(",", "") 
        	    .replace("[", "")  
        	    .replace("]", "");  
         
        return sortedResult.toString();
        
    }

    //create node class
    class Node {

        private T value;
        private Node left, right;

        Node(T value) {
        	
            this.value = value;
            this.left = null;
            this.right = null;
            
        }

        Node getLeft() {
        	
            return left;
        }

        Node getRight() {
        	
            return right;
        }
    }
}
