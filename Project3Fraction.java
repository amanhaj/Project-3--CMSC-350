package project3;
/*
 * Author: Amanda Hajati
 * Course: CMSC 350 
 * File name: Project3Fraction.java
 * Date Completed: 2/23/2019
 */
import java.text.DecimalFormat;
import java.text.NumberFormat;


public class Project3Fraction implements Comparable<Project3Fraction> {
	//set variables
    private double numerator;
    private double denominator;
    private double fractionValue;

    
    Project3Fraction(String fraction) throws NumberFormatException {
    	//split fraction to retrieve value
        String[] convert = fraction.split("/");   
        if (convert.length != 2) throw new NumberFormatException(fraction);   
        numerator = Integer.parseInt(convert[0]);   
        denominator = Integer.parseInt(convert[1]);     
        this.fractionValue = numerator / denominator;  
        
    }

    
    private Double getValue() {
    	
        return this.fractionValue;
    }

    //return the fraction as string
    @Override
    
    public String toString() {
    	
            NumberFormat formatter = new DecimalFormat("0");
              return formatter.format(numerator) + "/" + formatter.format(denominator);
          
    }

    //comparable for fraction
    @Override
    public int compareTo(Project3Fraction fraction) {
    	
        if (this.fractionValue == fraction.getValue()) {
        	
            return 0;
        }
        
        return this.fractionValue > fraction.fractionValue ? 1 : -1;
    }
}


