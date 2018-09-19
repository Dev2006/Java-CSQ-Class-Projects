import java.util.Arrays;

public class MinAndMaxFinder {

	public static void main(String[] args) {
		
		int[] arr = new int[] {54, 38, -46, 43, 92, -18};
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println("Array: " + Arrays.toString(arr));
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
	}

}
