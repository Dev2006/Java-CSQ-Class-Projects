package multiplicationTable;
import java.util.Scanner;

public class MultiplicationTables {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter a number and it's multiplication table will be printed");
		int num = reader.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("\n" + num + " times " + i + " equals to " + (num * i));
		}

	}

}
