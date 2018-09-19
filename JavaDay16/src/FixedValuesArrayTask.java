import java.util.Scanner;

public class FixedValuesArrayTask {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int[] multiples = new int[5];
		
		System.out.println("Enter values for which are multiples of 5");
		for(int i = 0; i < multiples.length; i++) {
			
			System.out.println("\n" + "Enter value " + (i + 1));
			int tempChoice = reader.nextInt();
			
			if(tempChoice == ((i * 5) + 5)) {
				
				multiples[i] = tempChoice;
			} else {
				
				System.out.println("\n" + "error your value should have been " + ((i * 5) + 5));
				break;
			}
		}
		
		reader.close();
	}
}
