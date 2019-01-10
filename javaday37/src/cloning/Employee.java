package cloning;

public class Employee implements Cloneable{
private int empId;
private String empName;
private int salary;
public Employee(int empId, String empName, int salary) {

	this.empId = empId;
	this.empName = empName;
	this.salary = salary;
}

public Object clone()throws CloneNotSupportedException
{
	return super.clone();
}

public int getEmpId() {
	return empId;
}

public String getEmpName() {
	return empName;
}

public int getSalary() {
	return salary;
}

public void changeSalary(int salary) {
	this.salary = salary;
}

}
