public class argsTryOut {
	
	private static int add(int ...nums) {
		
		int sum = 0;
		for (int i : nums) {
			sum += i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		System.out.println(add(1, 6, 7, 16));
	}
}
