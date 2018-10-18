package StaticKeyword;

public class Student {
	int rollno;
	String name;
	static String institute = "CQS";
	
	public void display() {
		
		System.out.println("Roll No. : " + rollno + ", Name : " + name + ", Institute : " + Student.institute);
	}
}
