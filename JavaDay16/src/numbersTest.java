import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class numbersTest {
	
	public static void main(String[] args) {
		int[][] numbers = new int[30][30];
		Scanner rowReader = null;
		Scanner columnReader = null;
		
		//Creating the Scanners
		try {
			
			rowReader = new Scanner(new File("C:\\Users\\Mohit Sharma\\Desktop\\numbers.txt"));
			rowReader.useDelimiter(";");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();;
		}
		
		//Initializing my array with values from text file
		for(int i = 0; rowReader.hasNext(); i++) {
			
			columnReader = new Scanner(rowReader.next());
			columnReader.useDelimiter(",");
			
			for(int j = 0; columnReader.hasNext(); j++) {
				
				numbers[i][j] = columnReader.nextInt();
			}
		}
		
		//Printing out the numbers array
		for(int i = 0; i < 20; i++) {
			
			for(int j = 0; j < 20; j++) {
				
				System.out.print(numbers[i][j] + "	");
			}
			
			System.out.println("");
		}
	}
}
