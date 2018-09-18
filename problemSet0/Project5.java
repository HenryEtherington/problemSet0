
import javax.swing.*;

public class Project5 {
	public static void main(String[] args) {
		
		String operation = "";
		int number, number2, number3, total;
		
		 operation = JOptionPane.showInputDialog("Please enter a operation:" +
			                                               "\n A (for addition)" +
			                                               "\n S (for subtraction)" +
			                                               "\n M (for multiplication)" +
			                                               "\n D (for division)");
		char o = operation.charAt(0);
		
        switch(o){
            
            case 'A': 
            { 
            String numberAsString = JOptionPane.showInputDialog("Please enter a number");
        	number = Integer.parseInt(numberAsString);
        	String numberAsString2 = JOptionPane.showInputDialog("Please enter another number");
        	number2 = Integer.parseInt(numberAsString2);
        	String numberAsString3 = JOptionPane.showInputDialog("Please enter another number");
        	number3 = Integer.parseInt(numberAsString3);
        	total = number + number2 + number3;
            JOptionPane.showMessageDialog(null,"The output equals (" + number + "+" + number2 + "+" + number3 + ") " + "=" + " " + total);
            System.exit(0);
            
            }
            
            case 'S': 
            {
           
           	String numberAsString = JOptionPane.showInputDialog("Please enter a number");
        	number = Integer.parseInt(numberAsString);
        	String numberAsString2 = JOptionPane.showInputDialog("Please enter another number");
        	number2 = Integer.parseInt(numberAsString2);
        	String numberAsString3 = JOptionPane.showInputDialog("Please enter another number");
        	number3 = Integer.parseInt(numberAsString3);
        	total = number - number2 - number3;
            JOptionPane.showMessageDialog(null,"The output equals (" + number + "-" + number2 + "-" + number3 + ") " + "=" + " " + total);
            System.exit(0);
                 
            }
            
            case 'M':
            
             {
           
           	String numberAsString = JOptionPane.showInputDialog("Please enter a number");
        	number = Integer.parseInt(numberAsString);
        	String numberAsString2 = JOptionPane.showInputDialog("Please enter another number");
        	number2 = Integer.parseInt(numberAsString2);
        	String numberAsString3 = JOptionPane.showInputDialog("Please enter another number");
        	number3 = Integer.parseInt(numberAsString3);
        	total = number * number2 * number3;
            JOptionPane.showMessageDialog(null,"The output equals (" + number + "x" + number2 + "x" + number3 + ") " + "=" + " " + total);
            System.exit(0);
            
            }
            
            case 'D': 
               
             {
           
           	String numberAsString = JOptionPane.showInputDialog("Please enter a number");
        	number = Integer.parseInt(numberAsString);
        	String numberAsString2 = JOptionPane.showInputDialog("Please enter another number");
        	number2 = Integer.parseInt(numberAsString2);
        	String numberAsString3 = JOptionPane.showInputDialog("Please enter another number");
        	number3 = Integer.parseInt(numberAsString3);
        	total = number / number2 / number3;
            JOptionPane.showMessageDialog(null,"The output equals (" + number + "/" + number2 + "/" + number3 + ") " + "=" + " " + total);
            System.exit(0);
            
            }
            
            
            default:;
            {
            JOptionPane.showMessageDialog(null,"Error please try again");
            }
                }
		
	}
}