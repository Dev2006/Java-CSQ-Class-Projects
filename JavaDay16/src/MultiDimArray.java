
public class MultiDimArray {
	
	public static void main(String[] args) {
		int size = 4;
		int[][] numbers = new int[size][size];
		
		for(int i = 0; i < size; i++) {
			
			for(int j = 0; j < size; j++) {
				
				numbers[i][j] = (j + 1) + (i * size);
			}
		}
		
		for(int i = 0; i < size; i++) {
			
			for(int j = 0; j < size; j++) {
				
				System.out.print(numbers[i][j] + "	");
			}
			
			System.out.println("");
		}
	}
}
