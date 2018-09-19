import java.util.Scanner;

public class TestStudent {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		Student st1 = new Student();
		
		System.out.println("enter roll number");
		int tempRollNum = reader.nextInt();
		
		System.out.println("enter Name");
		String tempName = reader.next();
		
		System.out.println("enter Stream");
		String tempStream = reader.next();
		
		Student st2 = new Student(tempRollNum, tempName, tempStream);
		
		System.out.println("No-Arg");
		st1.printData();
		
		System.out.println("\n" + "Parameterized");
		st2.printData();
		
		reader.close();
	}

}
