import java.util.Arrays;

public class BubbleSorter {
	public static void main(String[] args) {
		int[] arr = new int[] {35, -27, -75, -63, -48, 51, 29, 65};
		
		System.out.println("Original\n" + Arrays.toString(arr) + "\n");
		
		bubbleSort(arr);
		System.out.println("Sorted\n" + Arrays.toString(arr));
	}
	
	public static void bubbleSort(int[] array) {
		boolean swapDone;
		
		do {
			swapDone = false;
			
			for(int i = 0; i < array.length-1; i++) {
				if(array[i] > array[i + 1]) {
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;					
					
					swapDone = true;
				}
			}
		} while(swapDone);
	}
}
