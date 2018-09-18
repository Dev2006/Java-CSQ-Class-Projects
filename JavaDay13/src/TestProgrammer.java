public class TestProgrammer {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		System.out.println("Salary: " + emp.salary + "\n");
		
		Programmer pro = new Programmer();
		System.out.println("Bonus: " + pro.bonus);
		pro.salary += pro.bonus;
		System.out.println("Salary: " + pro.salary);
		
	}
}
