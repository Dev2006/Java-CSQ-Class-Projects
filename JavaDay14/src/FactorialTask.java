import java.util.Scanner;

public class FactorialTask {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter a number to find its factorial");
		int a = reader.nextInt();
		System.out.println("\n" + "The Factorial of " + a + " is " + fact(a));
		
		reader.close();
	}
	
	public static double fact(int a) {
		double factorial = 1;
		
		for(int i = 1; i <= a; i++) {
			
			factorial *= i;
		}
		
		return factorial;
	}
}
