package calculator;
import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in); 
		
		System.out.println("WELCOME TO \nCALCULATOR! \n");
		
		//User Input
		System.out.println("Enter 1 for addition \n" +
		                   "Enter 2 for subtraction \n" +
		                   "Enter 3 for multiplication \n" +
		                   "Enter 4 for division \n" +
		                   "Enter 5 for exponentiation");
		int operation = reader.nextInt();
		
		System.out.println("\nEnter a number a: ");
		float a = reader.nextFloat();
		
		System.out.println("\nEnter a number b: ");
		float b = reader.nextFloat();
		
		reader.close();
		
		//Operation
		System.out.println("\n" + "The answer is ");
		switch(operation) {
			case 1:System.out.println(Arithmetic.add(a, b));
			break;
			
			case 2:System.out.println(Arithmetic.sub(a, b));
			break;
			
			case 3:System.out.println(Arithmetic.mult(a, b));
			break;
			
			case 4:System.out.println(Arithmetic.div(a, b));
			break;
			
			case 5:System.out.println(Arithmetic.exp(a, b));
			break;
			
			default:System.out.println("your operation wasn't recognized");
			break;
		}
		
	}
	
	public static class Arithmetic {
		public static float add(float a, float b) {
			return a + b;
		} 
		
		public static float sub(float a, float b) {
			return a - b;
		}
		
		public static float mult(float a, float b) {
			return a * b;
		}
		
		public static float div(float a, float b) {
			return a / b;
		}
		
		public static float exp(float a, float b) {
			return (float) Math.pow(a, b);
		}
	}
}
