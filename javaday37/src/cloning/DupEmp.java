package cloning;

public class DupEmp {
public static void main(String[] args) {
	try {
		Employee e1=new Employee(112,"aakash",32233);
		Employee e2=(Employee)e1.clone();
		
		System.out.println("Original====");
		System.out.println(e1.getEmpId()+" "+e1.getEmpName()+" "+e1.getSalary());
	   	
		System.out.println("Duplicate=====");
	   	System.out.println(e2.getEmpId()+" "+e2.getEmpName()+" "+e2.getSalary());
	   	
	   	e1.changeSalary(3333);
	   	
	   	System.out.println("\n\nOriginal====");
		System.out.println(e1.getEmpId()+" "+e1.getEmpName()+" "+e1.getSalary());
	   	
	   	System.out.println("Duplicate=====");
	   	System.out.println(e2.getEmpId()+" "+e2.getEmpName()+" "+e2.getSalary());
	   	
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
