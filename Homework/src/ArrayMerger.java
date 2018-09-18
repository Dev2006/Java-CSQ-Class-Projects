
public class ArrayMerger {
	
	public static void main(String[] args) {
		//Initializing arrays
		int[] x = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] y = new int[] {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
		
		//using mergeArrays method
		int[] z = mergeArrays(x, y);
		
		//Printing
		System.out.println("X Array");
		for(int i : x) {
			System.out.print(i + ", ");
		}
		
		System.out.println("\n\n" + "Y Array");
		for(int i : y) {
			System.out.print(i + ", ");
		}
		
		System.out.println("\n\n" + "Merged Z Array");
		for(int i : z) {
			System.out.print(i + ", ");
		}
	}
	
	public static int[] mergeArrays(int[] a, int[] b) {
		int[] c = new int[(a.length + b.length)];
		
		for(int i = 0; i < a.length; i++) {
			
			c[i] = a[i];
		}
		
		for(int i = 0; i < b.length; i++) {
			
			c[i + a.length] = b[i];
		}
		
		return c;
	}
}
