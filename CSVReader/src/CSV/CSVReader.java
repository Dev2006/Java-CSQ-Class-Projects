package CSV;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CSVReader {
	
	public static void main(String[] args) {
		int rows = 5;
		int columns = 10;
		int[][] numbers = null;
		
		Scanner rowReader1 = null;
		Scanner columnReader1 = null;
		Scanner rowReader2 = null;
		Scanner columnReader2 = null;
		
		/**********************************************************************************************/
		
		//Creating the Scanners
		try {
			
			rowReader1 = new Scanner(new File("D:\\Extra Files\\CSV's\\numbers.csv"));
			rowReader2 = new Scanner(new File("D:\\Extra Files\\CSV's\\numbers.csv"));
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();;
		}
		
		/**********************************************************************************************/
		
		//Initializing the array with values from the file
		for(int i = 1; rowReader1.hasNext(); i++) {
			
			rows = i;
			
			columnReader1 = new Scanner(rowReader1.nextLine());
			columnReader1.useDelimiter(",");
			for(int j = 0; columnReader1.hasNext(); columnReader1.next(), j++) {
				
				if(j > columns) {
					
					columns = j;
				}
			}
		}
		numbers = new int[rows][columns];
		
		/**********************************************************************************************/
		
		//Adding values to my array with values from file
		for(int i = 0; rowReader2.hasNext(); i++) {
			
			columnReader2 = new Scanner(rowReader2.nextLine());
			columnReader2.useDelimiter(",");
			
			for(int j = 0; columnReader2.hasNext(); j++) {
				
				numbers[i][j] = columnReader2.nextInt();
			}
		}
		
		/**********************************************************************************************/
		
		//Printing out the numbers array
		for(int i = 0; i < rows; i++) {
			
			for(int j = 0; j < columns; j++) {
				
				System.out.print(numbers[i][j] + "	");
			}
			
			System.out.println();
		}
	}
}
