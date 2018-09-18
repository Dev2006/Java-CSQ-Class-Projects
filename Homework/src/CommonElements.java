public class CommonElements {
	
	public static void main(String[] args) {
		int[] x = new int[] {7, 8, 6, 4, 6, 4, 7, 4, 3, 4};
		int[] y = new int[] {3, 9, 7, 3, 7, 6, 2, 5, 8, 7};
		int[] z = new int[] {9, 6, 3, 1, 2, 4, 1, 9, 8, 6};
		
		System.out.println("X Array");
		for(int i : x) {
			
			System.out.print(i + ", ");
		}
		
		System.out.println("\n\n" + "Y Array");
		for(int i : y) {
			
			System.out.print(i + ", ");
		}
		
		System.out.println("\n\n" + "Z Array");
		for(int i : z) {
			
			System.out.print(i + ", ");
		}
		
		int[] common = commonElementsOf(x, y, z);
		
		System.out.println("\n\n" + "Common elements Array");
		for(int i : common) {
			
			if(i != 0)
				System.out.print(i + ", ");
		}
	}
	
	public static int[] commonElementsOf(int[] a, int[] b, int[] c) {
		
		int[] commonElements = new int[a.length + b.length + c.length];
		
		int currentPos = 0;
		
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < b.length; j++) {
				
				for(int k = 0; k < c.length; k++) {
					
					if((a[i] == b[j]) && (b[j] == c[k])) {
						
						commonElements[currentPos] = a[i];
						currentPos++;
						a[i] = 0;
						b[j] = 0;
						c[k] = 0;
					}
				}
			}
		}
		
		return commonElements;
	}
}
