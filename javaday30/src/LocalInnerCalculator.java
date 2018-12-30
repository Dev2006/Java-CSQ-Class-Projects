import java.util.Scanner;

public class LocalInnerCalculator {
	
	public static void useCal() {
		Scanner sc = new Scanner(System.in);
		class Calculator {
			
			double addition(double num1, double num2) {
				
				return num1 + num2;
			}
			
			double subtraction(double num1, double num2) {
				
				return num1 - num2;
			}
			
			double multiplication(double num1, double num2) {
				
				return num1 * num2;
			}
			
			double division(double num1, double num2) {
				
				return num1 / num2;
			}
		}
		
		System.out.println("Press 1 for addition\n"
				+ "Press 2 for subtraction\n"
				+ "Press 3 for multiplication\n"
				+ "Press 4 for division\n");
		
		Calculator cal = new Calculator();
		
		main:while(true) {
			System.out.println("Enter choice");
			int choice = sc.nextInt();
			
			System.out.println("Enter Number 1");
			double num1 = sc.nextDouble();
			System.out.println("Enter Number 2");
			double num2 = sc.nextDouble();
			
			switch (choice) {
			case 1:
				System.out.println(cal.addition(num1, num2) + "\n\n");
				break;
			case 2:
				System.out.println(cal.subtraction(num1, num2) + "\n\n");
				break;
			case 3:
				System.out.println(cal.multiplication(num1, num2) + "\n\n");
				break;
			case 4:
				System.out.println(cal.division(num1, num2) + "\n\n");
				break;
			default:
				break main;
			}
		}
		
		sc.close();
	}
	
	public static void main(String[] args) {
		useCal();
	}
}
