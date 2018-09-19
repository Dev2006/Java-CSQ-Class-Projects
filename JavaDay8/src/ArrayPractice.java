import java.util.Scanner;

public class ArrayPractice {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		//Initializing array
		System.out.println("Enter size of the array");
		int size = reader.nextInt();
		String[] array = new String[size];
		
		//Writing data of the array
		for(int i = 0; i < array.length; i++) {
			System.out.println("\n" + "write data for index " + i);
			String tempData = reader.next();
			array[i] = tempData;
		}
		
		//Printing data
		System.out.println("\n");
		for(int i = 0; i < array.length; i++) {
			System.out.println("index " + i + " is equal to " + array[i]);
		}
		
		//Search data
		System.out.println("What word do you want to search for?");
		String tempString = reader.next();
		String searchWord = tempString;
		
		for(int i = 0; i < array.length; i++) {
			if(searchWord.equals(array[i])) {
				System.out.println("\n" + "The word " + searchWord + " was found at index " + i);
			}
		}
		
		//Closing reader
		reader.close();
	}

}
