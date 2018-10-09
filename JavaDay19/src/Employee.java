
public class Employee {
	int empID;
	String empName;
	Address address;
	
	public Employee(int empID, String empName, Address address) {
		
		this.empID = empID;
		this.empName = empName;
		this.address = address;
	}
	
	public void displayEmp() {
		
		System.out.println("Employee's ID: " + empID);
		System.out.println("Employee's Name: " + empName);
		System.out.println("Employee's address: ");
		System.out.println("                  city-" + address.city);
		System.out.println("                  pincode-" + address.pincode);
		System.out.println("                  state-" + address.state);
	}
}
