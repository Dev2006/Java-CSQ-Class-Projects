import java.util.Scanner;

public class TestFood {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		Food f1 = new Food();
		
		System.out.println("Enter food name");
		String fn = reader.nextLine();
		
		System.out.println("Enter food type");
		String ft = reader.nextLine();
		
		System.out.println("Enter food price");
		float p = reader.nextFloat();
		
		Food f2 = new Food(fn, ft, p);
		
		System.out.println("\n \n" + "No Arg");
		f1.displayRecords();
		System.out.println("\n" + "Parameterized");
		f2.displayRecords();
		
		reader.close();
	}
}
