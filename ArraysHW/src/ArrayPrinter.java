import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrinter {
	//Declaring an array
	static int[] arr;
	
	public static void main(String[] Args) {
		//Declaring and initializing a scanner
		Scanner reader = new Scanner(System.in);
		
		//getting size for and initializing array
		System.out.println("Enter a size for your array");
		arr = new int[reader.nextInt()];
		
		
		//getting values for the array
		for(int i = 0; i < arr.length; i++) {
			System.out.println("\n" + "Give an integer value for index " + i);
			arr[i] = reader.nextInt();
		}
		
		//Printing
		print();
		
		//Closing a scanner
		reader.close();
	}
	
	public static void print() {
		System.out.println(Arrays.toString(arr));
	}
}
