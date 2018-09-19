public class DuplicateVals {
	
	public static void main(String[] args) {
		
		//Initializing an array
		int[] vals = new int[] {4, 5, 3, 8, 9, 8, 4, 2, 5, 6};
		
		//Getting it's unique values
		int[] uniqueVals = uniqueValsOf(vals);
		
		//Printing
		for(int i : vals) {
			System.out.print(i + ", ");
		}
		System.out.println();
		for(int i : uniqueVals) {
			System.out.print(i + ", ");
		}
	}
	
	/*
	 * NOTE: using uniqueValsOf method with an int[] with a 0 is unadvised as unassigned values in returned array are also 0
	 */
	
	public static int[] uniqueValsOf(int[] values) {
		int[] uniqueValues = new int[values.length];
		boolean shouldAddVal;
		
		for(int i = 0, k = 0; i < values.length; i++) {
			
			shouldAddVal = true;
			for(int j = 0; j < uniqueValues.length; j++) {
				
				if(uniqueValues[j] == values[i]) {
					
					shouldAddVal = false;
				}
			}
			
			if(shouldAddVal) {
				uniqueValues[k] = values[i];
				k++;
			}
		}
		
		return uniqueValues;
	}
}
