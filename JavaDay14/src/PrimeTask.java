
public class PrimeTask {
	
	public static void main(String[] args) {
		
		for(int i = 2; i <= 10000; i++) {
			
			if(isPrime(i)) {
				
				System.out.print(i + ", ");
			}
		}
	}
	
	public static boolean isPrime(int a) {
		boolean returnValue = true;
		
		for(int i = 2; i < a; i++) {
			
			if(a%i == 0) {
				
				returnValue = false;
			}
		}
		return returnValue;
	}
}
