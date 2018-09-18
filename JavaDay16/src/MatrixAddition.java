
public class MatrixAddition {
	
	public static void main(String[] args) {
		int[][] x = new int[][] {{4, 5, 7}, {6, 2, 0}, {3, 1, 1}};
		int[][] y = new int[][] {{1, 2, 5}, {3, 8, 2}, {9, 8, 6}};
		
		int[][] z = addMatrix(x, y);
		
		//Printing array z
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 3; j++) {
				
				System.out.print(z[i][j] + "	");
			}
			
			System.out.println("");
		}
	}
	
	public static int[][] addMatrix(int[][] a, int[][] b) {
		int[][] c = new int[3][3];
		
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 3; j++) {
				
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
		return c;
	}
}
