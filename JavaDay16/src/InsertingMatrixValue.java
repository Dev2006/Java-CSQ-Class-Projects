import java.util.Scanner;

public class InsertingMatrixValue {
	
	public static void main(String[] args) {
		int rows;
		int columns;
		int[][] a;
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter number of rows");
		rows = reader.nextInt();
		
		System.out.println("Enter number of columns");
		columns = reader.nextInt();
		
		a = new int[rows][columns];
		
		for(int i = 0; i < rows; i++) {
			
			for(int j = 0; j < columns; j++) {
				
				System.out.println("\n" + "Enter an integer value for row: " + (i + 1) + ", column: " + (j + 1));
				int tempChoice = reader.nextInt();
				a[i][j] = tempChoice;
			}
		}
		
		System.out.println("\n" + "\n");
		
		for(int i = 0; i < rows; i++) {
			
			for(int j = 0; j < columns; j++) {
				
				System.out.print(a[i][j] + "	");
			}
			
			
			System.out.println("");
		}
	}
}
