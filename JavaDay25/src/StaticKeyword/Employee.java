package StaticKeyword;

public class Employee {
	int empID;
	String empName;
	static String officeName;
	
	static void changeOffice(String officeName) {
		
		Employee.officeName = officeName;
	}
	
	static void dispOfficeName() {
		
		System.out.println(officeName);
	}
}
