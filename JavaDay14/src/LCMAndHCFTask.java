import java.util.Scanner;

public class LCMAndHCFTask {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter 2 numbers to find their LCM and HCF");
		
		System.out.println("\n" + "Enter the 1st number");
		int a = reader.nextInt();
		
		System.out.println("\n" + "Enter the 2nd number");
		int b = reader.nextInt();
		
		System.out.println("\n" + "Their LCM is " + findLCM(a, b));
		System.out.println("\n" + "Their HCF is " + findHCF(a, b));
		
		reader.close();
	}
	
	public static int findLCM(int a, int b) {
		int LCM = a * b;
		
		for(int i = 1; i < b; i++) {
			
			for(int j = 1; j < a; j++) {
				
				if(a * i == b * j) {
					
					LCM = a * i;
				}
			}
		}
		
		return LCM;
	}
	
	public static int findHCF(int a, int b) {
		int HCF = 1;
		
		for(int i = a - 1; i >= 1; i--) {
			
			for(int j = b - 1; j >= 1; j--) {
				
				if(a / i == b / j) {
					
					HCF = a / i;
				}
			}
		}
		
		return HCF;
	}
}
