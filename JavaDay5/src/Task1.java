
public class Task1 {
	public static void main(String[] args) {
		int[] arr1 = new int[] {6, 18, 12, 8};
		int[] arr2 = new int[] {12, 14, 3, 8};
		int value = 20;
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr2.length; j++) {
				if(arr1[i] + arr2[j] == value) {
					System.out.println("Adding " + arr1[i] + " of arr1"
							+ " and " + arr2[j] + " of arr2 gives " + value);
				}
			}
		}
		
		//System.out.println(isEqual);
	}
}
