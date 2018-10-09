
public class TestAggregation {
	
	public static void main(String[] args) {
		Address a1 = new Address("Gurgaon", 122002, "Haryana");
		Address a2 = new Address("Dwarka", 110059, "Delhi");
		
		Employee emp = new Employee(0123, "Dev", a1);
		Manager mgr = new Manager(0321, "Aakash", a2);
		
		emp.displayEmp();
		mgr.displayMgr();
	}
}
