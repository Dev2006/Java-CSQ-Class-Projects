package exceptionHandling;

import javax.swing.JOptionPane;

public class Test {
	
	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(JOptionPane.showInputDialog("Enter value a"));
			int b = Integer.parseInt(JOptionPane.showInputDialog("Enter value b"));
			
			System.out.println("The quotient is " + (a / b));
		} catch(ArithmeticException e) {
			System.out.println("Error in division");
		} 
		
		try {
			String s = JOptionPane.showInputDialog("Enter a number");
			System.out.println("Your number is " + Double.parseDouble(s));
		} catch(NumberFormatException e) {
			System.out.println("Error in parsing");
		}
		
		
	}
}
