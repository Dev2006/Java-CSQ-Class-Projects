
public class Task1 {
	
	public static void main(String[] args) {
		
		int x = 5;
		int y = 3;
		
		System.out.println("initial value: " + x + ", " + y);
		
		x = x - y;
		y = y + x;
		x = y - x;
		
		System.out.println("swapped value: " + x + ", " + y);
	}
}
