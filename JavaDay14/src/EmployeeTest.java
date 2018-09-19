import java.util.Scanner;

public class EmployeeTest {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Employee e = new Employee();
		
		System.out.println("\n" + "Enter a base monthly salary");
		double baseSalary = reader.nextDouble();
		
		System.out.println("\n" + "Enter a monthly HRA");
		double HRA = reader.nextDouble();
		
		System.out.println("\n" + "Enter a monthly bonus");
		double bonus = reader.nextDouble();
		
		e.setSalary(baseSalary, HRA, bonus);
		System.out.println("\n" + "Your employee's monthly salary is " + e.getSalary());
		
		reader.close();
	}
}
