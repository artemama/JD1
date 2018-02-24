package jakov_fain.unit5GUI;

import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent;
import javax.swing.JButton;

//import com.practicaljava.lesson9.Calculator;

public class CalculatorEngine implements ActionListener {
 
 CalculatorGBL parent; // a reference to the Calculator
                //      new variables 
 double storedNumber , enteredNumber ; 
 String selectedAction ;

 
 
	
 // Constructor stores the reference to the 
 // Calculator window in  the member variable parent
 CalculatorEngine(CalculatorGBL parent){
   this.parent = parent;
 }

 public void actionPerformed(ActionEvent e){
   // Get the source of this action
	         
	 
                JButton clickedButton =  (JButton) e.getSource();
                   
                
                String dispFieldText = parent.getDisplayValue();
                 
                 String clickedButtonLabel = clickedButton.getText();
   	
            
                 	
                     if (clickedButton.getText()  == ("+")  || clickedButton.getText()
                		== ("-")|| clickedButton.getText()  == ("*") ||
                		clickedButton.getText()  == ("/")){
                	
                	     // Fetching figures from calculator and making it decimal
                	      storedNumber = Double.parseDouble(parent.getDisplayValue());
                	      selectedAction = clickedButton.getText();
                	     // Clean a display
                	        parent.setDisplayValue("");
                
                	
                    }
                        else  if ((clickedButton.getText() == ("="))
        				&& (selectedAction != null)) {
                	
             
							 if (selectedAction==("+")) {
        				storedNumber = storedNumber+Double.parseDouble(parent.getDisplayValue());
        				parent.setDisplayValue( "" + storedNumber);
                              }
							 if (selectedAction==("-")) {
			        				storedNumber = storedNumber-Double.parseDouble(parent.getDisplayValue());
			        				parent.setDisplayValue( "" + storedNumber);
							 }
							 if (selectedAction==("/")) {
			        				storedNumber = storedNumber/Double.parseDouble(parent.getDisplayValue());
			        				parent.setDisplayValue( "" + storedNumber);
							 }	
							 if (selectedAction==("*")) {
			        				storedNumber = storedNumber*Double.parseDouble(parent.getDisplayValue());
			        				parent.setDisplayValue( "" + storedNumber);
							 }	
                 
                        
                        }
                 
                
   
   
				   
                        else {      	    

                       
                       parent.setDisplayValue( dispFieldText +clickedButtonLabel);
                     
                     
                     }

 }
 }
