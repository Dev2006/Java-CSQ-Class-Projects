import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		int[] arr = new int[] {2, 2, 34, 23, 2, 5, 23, 5, 5, 2, 34};
		
		
		 
		
		int occurence = 0;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter the value you want to check "
				+ "for occurence");
		int val = reader.nextInt();
		
		for(int i = 0; i < arr.length; i++) {
			if(val == arr[i]) occurence++;
		}
		
		System.out.println("\n" + "The number " + val + " comes in the array "
				+ occurence + " number of times");
	}

}
